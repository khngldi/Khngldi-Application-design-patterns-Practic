package Practic5.js;

public class InvoiceCreator extends DocumentCreator{
    public IDocument CreateDocument(){
        return new Invoice();
    }
}