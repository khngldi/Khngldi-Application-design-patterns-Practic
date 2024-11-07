public class PdfExportDecorator extends ReportDecorator {
    public PdfExportDecorator(IReport report) {
        super(report);
    }
    @Override
    public String Generate() {
        return report.Generate();
    }
}