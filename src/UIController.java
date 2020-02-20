import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import java.util.Vector;

public class UIController implements Initializable {

    public RadioButton OneClassButton;
    public RadioButton TwoClassButton;
    public HBox StudentInfoInputContainer;
    public TextField StudentIDInputField;
    public TextField StudentNameInputField;
    public Button AddStudentButton;
    public Label AdvancedJavaInputLabel;
    public HBox AdvancedJavaInputContainer;
    public TextField InputFieldAJ1;
    public TextField InputFieldAJ2;
    public TextField InputFieldAJ3;
    public TextField InputFieldAJ4;
    public Label WebTechnologyInputLabel;
    public HBox WebTechnologyInputContainer;
    public TextField InputFieldWT1;
    public TextField InputFieldWT2;
    public TextField InputFieldWT3;
    public TextField InputFieldWT4;
    public ToggleGroup Classes;
    public ListView<Student> StudentListView;
    public Label StudentIDOut;
    public Label StudentNameOut;
    public Label AdvancedJavaOutputLabel;
    public HBox AdvancedJavaOutputContainer;
    public Label OutputFieldAJ1;
    public Label OutputFieldAJ2;
    public Label OutputFieldAJ3;
    public Label WebTechnologyOutputLabel;
    public HBox WebTechnologyOutputContainer;
    public Label OutputFieldWT1;
    public Label OutputFieldWT2;
    public Label OutputFieldWT3;

    private Vector<StudentOneSub> s1subs = new Vector<>();
    private Vector<StudentTwoSub> s2subs = new Vector<>();

    private static DecimalFormat df = new DecimalFormat("0.00");

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initValues();
    }

    private void initValues() {
        StudentListView.getItems().addAll(s1subs);
        StudentListView.getItems().addAll(s2subs);
        StudentListView.setCellFactory(new StudentCellFactory());
        StudentListView.getSelectionModel().selectedItemProperty().addListener((ov, oldvalue, newvalue) -> {
            if (!(newvalue==null)) {
                String wn = newvalue.name;
                StudentIDOut.setText("");
                StudentNameOut.setText("");
                OutputFieldAJ1.setText("");
                OutputFieldAJ2.setText("");
                OutputFieldAJ3.setText("");
                OutputFieldWT1.setText("");
                OutputFieldWT2.setText("");
                OutputFieldWT3.setText("");
                for (StudentOneSub s : s1subs) {
                    if (s.getName().equals(wn)) {
                        WebTechnologyOutputLabel.setVisible(false);
                        WebTechnologyOutputContainer.setVisible(false);
                        StudentIDOut.setText(String.valueOf(s.getPSID()));
                        StudentNameOut.setText(s.getName());
                        OutputFieldAJ1.setText(String.valueOf(s.getSub1().getSubjectCode()));
                        OutputFieldAJ2.setText(String.valueOf(df.format(s.getSub1().computeFinalGrade())));
                        OutputFieldAJ3.setText(String.valueOf(s.getSub1().computeLetterGrade()));
                    }
                }
                for (StudentTwoSub s : s2subs) {
                    if (s.getName().equals(wn)) {
                        WebTechnologyOutputLabel.setVisible(true);
                        WebTechnologyOutputContainer.setVisible(true);
                        StudentIDOut.setText(String.valueOf(s.getPSID()));
                        StudentNameOut.setText(s.getName());
                        OutputFieldAJ1.setText(String.valueOf(s.getSub1().getSubjectCode()));
                        OutputFieldAJ2.setText(String.valueOf(df.format(s.getSub1().computeFinalGrade())));
                        OutputFieldAJ3.setText(String.valueOf(s.getSub1().computeLetterGrade()));
                        OutputFieldWT1.setText(String.valueOf(s.getSub2().getSubjectCode()));
                        OutputFieldWT2.setText(String.valueOf(df.format(s.getSub2().computeFinalGrade())));
                        OutputFieldWT3.setText(String.valueOf(s.getSub2().computeLetterGrade()));
                    }
                }
            }
        });

        /*
          Test Values
          */
        s1subs.add(new StudentOneSub(1234567, "George Washington",
                new AdvancedJava(1337, 84.5, 72.1, 99)));
        s2subs.add(new StudentTwoSub(9876543, "Alexander Hamilton",
                new AdvancedJava(1337, 88.2, 94.3, 71.2),
                new WebTechnology(2338, 92.3, 96.2, 83.7)));
        refreshListView();
    }

    public void refreshListView(){
        StudentListView.getItems().clear();
        StudentListView.getItems().addAll(s1subs);
        StudentListView.getItems().addAll(s2subs);
    }

    public void switchToOneSub(){
        WebTechnologyInputLabel.setVisible(false);
        WebTechnologyInputContainer.setVisible(false);
    }

    public void switchToTwoSub(){
        WebTechnologyInputLabel.setVisible(true);
        WebTechnologyInputContainer.setVisible(true);
    }

    public void addStudent(){
        if (OneClassButton.isSelected()){
            s1subs.add(new StudentOneSub(Integer.parseInt(StudentIDInputField.getText()), StudentNameInputField.getText(),
                    new AdvancedJava(Integer.parseInt(InputFieldAJ1.getText()), Double.parseDouble(InputFieldAJ2.getText()), Double.parseDouble(InputFieldAJ3.getText()), Double.parseDouble(InputFieldAJ4.getText()))));
        } else if (TwoClassButton.isSelected()){
            s2subs.add(new StudentTwoSub(Integer.parseInt(StudentIDInputField.getText()), StudentNameInputField.getText(),
                    new AdvancedJava(Integer.parseInt(InputFieldAJ1.getText()), Double.parseDouble(InputFieldAJ2.getText()), Double.parseDouble(InputFieldAJ3.getText()), Double.parseDouble(InputFieldAJ4.getText())),
                    new WebTechnology(Integer.parseInt(InputFieldWT1.getText()), Double.parseDouble(InputFieldWT2.getText()), Double.parseDouble(InputFieldWT3.getText()), Double.parseDouble(InputFieldWT4.getText()))));
        }
        refreshListView();
        resetInputs();
    }

    private void resetInputs() {
        StudentIDInputField.setText("");
        StudentNameInputField.setText("");
        InputFieldAJ1.setText("");
        InputFieldAJ2.setText("");
        InputFieldAJ3.setText("");
        InputFieldAJ4.setText("");
        InputFieldWT1.setText("");
        InputFieldWT2.setText("");
        InputFieldWT3.setText("");
        InputFieldWT4.setText("");
    }

}