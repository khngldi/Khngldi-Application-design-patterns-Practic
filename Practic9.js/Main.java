import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        IReport report = new SalesReport();

        report = new DateFilterDecorator(report, LocalDate.of(2023, 1, 1), LocalDate.of(2023, 12, 31));
        report = new SortingDecorator(report, "сумма продажи");
        report = new CsvExportDecorator(report);

        System.out.println(report.Generate());

        IReport userReport = new UserReport();
        userReport = new PdfExportDecorator(userReport);

        System.out.println(userReport.Generate());
    }
}
