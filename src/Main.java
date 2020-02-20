import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    private static void commandLineTest(){
        StudentOneSub s1 = new StudentOneSub(1234567, "George Washington",
                new AdvancedJava(1337, 84.5, 72.1, 99));
        StudentTwoSub s2 = new StudentTwoSub(9876543, "Alexander Hamilton",
                new AdvancedJava(1337, 88.2, 94.3, 71.2),
                new WebTechnology(2338, 92.3, 96.2, 83.7));
        s1.displayOS();
        System.out.println();
        s2.displayTS();

    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("studentio.fxml"));
        stage.setTitle("Student Input/Output Frame");
        stage.setScene(new Scene(root, 600, 500));
        stage.show();
    }

    public static void main(String[] args){
        commandLineTest();
        launch(args);
    }
}
