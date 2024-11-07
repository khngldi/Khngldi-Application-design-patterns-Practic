public class SortingDecorator extends ReportDecorator {
    private String criterion;
    public SortingDecorator(IReport report, String criterion) {
        super(report);
        this.criterion = criterion;
    }
    @Override
    public String Generate() {
        return report.Generate();
    }
}