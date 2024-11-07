import java.time.LocalDate;
public class DateFilterDecorator extends ReportDecorator {
    private LocalDate startDate;
    private LocalDate endDate;
    public DateFilterDecorator(IReport report, LocalDate startDate, LocalDate endDate) {
        super(report);
        this.startDate = startDate;
        this.endDate = endDate;
    }
    @Override
    public String Generate() {
        return report.Generate();
    }
}