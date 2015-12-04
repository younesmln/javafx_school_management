package sample.helper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TableEdit {
    private String attr;

    public TableEdit(String attr){
        this.attr = attr;
    }
            /*studentsTable.setRowFactory( tv -> {
            TableRow<StudentModel> row = new TableRow<>();
            row.setOnMouseClicked(event -> {
                if (event.getClickCount() == 2 && (! row.isEmpty()) ) {
                    StudentModel rowData = row.getItem();
                    System.out.println(rowData);
                }
            });
            return row ;
        });*/

    public static LocalDate formater(String to){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(to, format);
    }

}
