package assignment9;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class DateFindOrder {
    public TextField txtDay;
    public TextField txtMonth;
    public TextField txtYear;
    public TextArea txtResult;

    public void submit() {
        int day = Integer.parseInt(txtDay.getText());
        String sDay = txtDay.getText();
        int month = Integer.parseInt(txtMonth.getText());
        String sMonth = txtMonth.getText();
        int year = Integer.parseInt(txtYear.getText());
        if (day < 1 || day > 30) {
            txtResult.setText("Day should be from 1 to 30 only.");
            return;
        }
        if (month < 1 || month > 12) {
            txtResult.setText("Month should be from 1 to 12.");
            return;
        }
        if (year < 1) {
            txtResult.setText("Year should be more than 0.");
            return;
        }
        if (day <= 9) {
            sDay = "0" + sDay;
        }
        if (month <= 9) {
            sMonth = "0" + sMonth;
        }
        LocalDate date = LocalDate.parse(txtYear.getText() + "-" + sMonth + "-" + sDay);
//        LocalDate date = LocalDate.parse("2019-05-17");
        txtResult.setText("Day in Week: " + date.getDayOfWeek() + ". Day in Month: " + date.getDayOfMonth() + ". Day in Year: " + date.getDayOfYear());
    }
}
