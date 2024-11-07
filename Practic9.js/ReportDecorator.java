public abstract class ReportDecorator implements IReport {
    protected IReport report;
    public ReportDecorator(IReport report) {
        this.report = report;
    }
    @Override
    public String Generate() {
        return report.Generate();
    }
}