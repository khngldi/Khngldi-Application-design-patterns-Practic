package Practic5.js;

public class LetterCreator extends DocumentCreator{
    public IDocument CreateDocument(){
        return new Letter();
        }
    }