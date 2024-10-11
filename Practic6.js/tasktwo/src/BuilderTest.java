public class BuilderTest {
    public static void main(String[] args) {
        ReportDirector director = new ReportDirector();

        IReportBuilder textBuilder = new TextReportBuilder();
        ReportStyle textStyle = new ReportStyle("#FFFFFF", "#000000", 12);
        director.constructReport(textBuilder, textStyle);
        Report textReport = textBuilder.getReport();
        textReport.export("text");

        IReportBuilder htmlBuilder = new HtmlReportBuilder();
        ReportStyle htmlStyle = new ReportStyle("#F0F0F0", "#333333", 14);
        director.constructReport(htmlBuilder, htmlStyle);
        Report htmlReport = htmlBuilder.getReport();
        htmlReport.export("html");

        IReportBuilder pdfBuilder = new PdfReportBuilder();
        ReportStyle pdfStyle = new ReportStyle("#FFFFFF", "#000000", 12);
        director.constructReport(pdfBuilder, pdfStyle);
        Report pdfReport = pdfBuilder.getReport();
        pdfReport.export("pdf");

        IReportBuilder jsonBuilder = new JsonReportBuilder();
        ReportStyle jsonStyle = new ReportStyle("#FFFFFF", "#000000", 12); // Стиль может быть полезен для структурированных данных
        director.constructReport(jsonBuilder, jsonStyle);
        Report jsonReport = jsonBuilder.getReport();
        jsonReport.export("json");
    }
}
