import java.util.LinkedHashMap;
import java.util.Map;

public class Report {
    private String header;
    private String content;
    private String footer;
    private Map<String, String> sections = new LinkedHashMap<>();
    private ReportStyle style;

    public void setHeader(String header) {
        this.header = header;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public void addSection(String name, String content) {
        sections.put(name, content);
    }

    public void setStyle(ReportStyle style) {
        this.style = style;
    }

    public String getHeader() {
        return header;
    }

    public String getContent() {
        return content;
    }

    public String getFooter() {
        return footer;
    }

    public Map<String, String> getSections() {
        return sections;
    }

    public ReportStyle getStyle() {
        return style;
    }

    @Override
    public String toString() {
        return "Report{" +
                "header='" + header + '\'' +
                ", content='" + content + '\'' +
                ", footer='" + footer + '\'' +
                ", sections=" + sections +
                ", style=" + style +
                '}';
    }

    public void export(String format) {
        switch (format.toLowerCase()) {
            case "text":
                exportText();
                break;
            case "html":
                exportHtml();
                break;
            case "pdf":
                exportPdf();
                break;
            case "json":
                exportJson();
            default:
                System.out.println("Неподдерживаемый формат: " + format);
        }
    }

    private void exportText() {
        System.out.println("Отчет экспортирован в report.txt");
    }
    private void exportHtml() {
        System.out.println("Отчет экспортирован в report.html");
    }
    private void exportPdf() { System.out.println("Отчет экспортирован в report.pdf"); }
    private void exportJson() { System.out.println("Отчет экспортирован в report.json"); }
}