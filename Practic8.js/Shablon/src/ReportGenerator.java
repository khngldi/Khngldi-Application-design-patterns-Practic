import java.util.Scanner;
import java.util.logging.Logger;

public abstract class ReportGenerator {

    private static final Logger logger = Logger.getLogger(ReportGenerator.class.getName());

    public final void generateReport() {
        fetchData();
        formatData();
        generateHeader();
        generateBody();
        generateFooter();
        if (customerWantsSaveOrEmail().equals("save")) {
            saveReport();
        } else if (customerWantsSaveOrEmail().equals("email")) {
            sendReportByEmail();
        }
    }

    protected void fetchData() {
        logger.info("Получение данных...");
        System.out.println("Получение данных...");
    }

    protected abstract void formatData();
    protected abstract void generateHeader();
    protected abstract void generateBody();
    protected abstract void generateFooter();

    protected String customerWantsSaveOrEmail() {
        System.out.println("Вы хотите сохранить отчет или отправить по email? (save/email)");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        while (!input.equals("save") && !input.equals("email")) {
            System.out.println("Некорректный ввод. Пожалуйста, введите 'save' или 'email'.");
            input = scanner.nextLine().toLowerCase();
        }
        return input;
    }


    protected void saveReport() {
        logger.info("Сохранение отчета...");
        System.out.println("Сохранение отчета...");
    }

    protected void sendReportByEmail() {
        logger.info("Отправка отчета по электронной почте...");
        System.out.println("Отправка отчета по электронной почте...");
    }
}
