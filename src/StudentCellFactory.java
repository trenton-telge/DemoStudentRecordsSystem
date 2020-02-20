import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class StudentCellFactory implements Callback<ListView<Student>, ListCell<Student>>
{
    @Override
    public ListCell<Student> call(ListView<Student> listview)
    {
        return new StudentCell();
    }
}