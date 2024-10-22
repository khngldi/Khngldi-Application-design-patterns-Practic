import java.util.Scanner;

public class ExcelReport extends ReportGenerator {

    @Override
    protected void formatData() {
        System.out.println("Форматирование данных для Excel...");
    }

    @Override
    protected void generateHeader() {
        System.out.println("Создание заголовка Excel...");
    }

    @Override
    protected void generateBody() {
        System.out.println("Создание тела Excel...");
    }

    @Override
    protected void generateFooter() {
        System.out.println("Создание нижнего колонтитула Excel...");
    }

    @Override
    protected boolean customerWantsSave() {
        System.out.println("Хотите сохранить отчет? (да/нет)");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        return input.equals("да");
    }

    @Override
    protected void saveReport() {
        System.out.println("Сохранение Excel файла...");
    }
}
