package Practic5.js;

public class ReportCreator extends DocumentCreator{
    public IDocument CreateDocument(){
        return new Report();
    }
}
