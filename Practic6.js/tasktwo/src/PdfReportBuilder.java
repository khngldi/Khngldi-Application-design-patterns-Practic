public class PdfReportBuilder implements IReportBuilder {
    private Report report;

    public PdfReportBuilder() {
        this.report = new Report();
    }

    @Override
    public void setHeader(String header) {
        report.setHeader(header);
    }

    @Override
    public void setContent(String content) {
        report.setContent(content);
    }

    @Override
    public void setFooter(String footer) {
        report.setFooter(footer);
    }

    @Override
    public void addSection(String sectionName, String sectionContent) {
        report.addSection(sectionName, sectionContent);
    }

    @Override
    public void setStyle(ReportStyle style) {
        report.setStyle(style);
    }

    @Override
    public Report getReport() {
        return this.report;
    }
}
