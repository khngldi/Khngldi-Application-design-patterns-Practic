package Practic5.js;

public class Main {
    public static void main(String[] args){
        IDocument report = GetDocument(DocType.Report);
        report.open();
        IDocument resume = GetDocument(DocType.Invoice);
        resume.open();
        IDocument letter = GetDocument(DocType.Invoice);
        letter.open();
        IDocument invoice = GetDocument(DocType.Invoice);
        invoice.open();
    }
    public static IDocument GetDocument(DocType docType){
        DocumentCreator creator = null;
        IDocument document = null;

        switch (docType){
            case DocType.Report:
                creator = new ReportCreator();
            break;
            case DocType.Letter:
                creator = new LetterCreator();
                break;
            case DocType.Resume:
                creator = new ResumeCreator();
                break;
            case DocType.Invoice:
                creator = new InvoiceCreator();
                break;
            default:
                System.out.println("Документ не найден!");
        }
        if (creator != null){
            document = creator.CreateDocument();
        }
        return document;
    }
}
