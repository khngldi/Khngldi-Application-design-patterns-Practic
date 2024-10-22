public class CsvReport extends ReportGenerator {

    @Override
    protected void formatData() {
        System.out.println("Форматирование данных для CSV...");
    }

    @Override
    protected void generateHeader() {
        System.out.println("Создание заголовка CSV...");
    }

    @Override
    protected void generateBody() {
        System.out.println("Создание тела CSV...");
    }

    @Override
    protected void generateFooter() {
        System.out.println("Создание нижнего колонтитула CSV...");
    }

    @Override
    protected void saveReport() {
        System.out.println("Сохранение CSV файла...");
    }
}
