public class PdfReport extends ReportGenerator {

    @Override
    protected void formatData() {
        System.out.println("Форматирование данных для PDF...");
    }

    @Override
    protected void generateHeader() {
        System.out.println("Создание заголовка PDF...");
    }

    @Override
    protected void generateBody() {
        System.out.println("Создание тела PDF...");
    }

    @Override
    protected void generateFooter() {
        System.out.println("Создание нижнего колонтитула PDF...");
    }
}
