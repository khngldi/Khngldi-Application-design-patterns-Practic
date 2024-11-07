public class CsvExportDecorator extends ReportDecorator {
    public CsvExportDecorator(IReport report) {
        super(report);
    }
    @Override
    public String Generate() {
        return report.Generate();
    }
}