public class HtmlReport extends ReportGenerator {

    @Override
    protected void formatData() {
        System.out.println("Форматирование данных для HTML...");
    }

    @Override
    protected void generateHeader() {
        System.out.println("Создание заголовка HTML...");
    }

    @Override
    protected void generateBody() {
        System.out.println("Создание тела HTML...");
    }

    @Override
    protected void generateFooter() {
        System.out.println("Создание нижнего колонтитула HTML...");
    }
}
