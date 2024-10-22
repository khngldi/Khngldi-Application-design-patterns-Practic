public class Main {
    public static void main(String[] args) {
        ReportGenerator pdfReport = new PdfReport();
        pdfReport.generateReport();

        System.out.println();

        ReportGenerator excelReport = new ExcelReport();
        excelReport.generateReport();

        System.out.println();

        ReportGenerator htmlReport = new HtmlReport();
        htmlReport.generateReport();

        System.out.println();

        ReportGenerator csvReport = new CsvReport();
        csvReport.generateReport();
    }
}
