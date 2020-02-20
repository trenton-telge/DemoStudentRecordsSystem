import javafx.scene.control.ListCell;

public class StudentCell  extends ListCell<Student>
{
    @Override
    public void updateItem(Student item, boolean empty)
    {
        super.updateItem(item, empty);
        String name = "";
        if (item != null && !empty) {
            name = item.getName();
        }
        this.setText(name);
    }
}