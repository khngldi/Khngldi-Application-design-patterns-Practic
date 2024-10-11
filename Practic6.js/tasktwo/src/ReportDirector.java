public class ReportDirector {
    public void constructReport(IReportBuilder builder, ReportStyle style) {
        builder.setHeader("");
        builder.setContent("");
        builder.addSection("", "");
        builder.addSection("", "");
        builder.setFooter("");
        builder.setStyle(style);
    }
}
