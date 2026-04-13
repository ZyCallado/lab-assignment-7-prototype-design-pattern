public class PdfDocument implements Document {
    private String fileName;
    private String author;
    private int pageCount;

    public PdfDocument(String fileName, String author, int pageCount) {
        this.fileName = fileName;
        this.author = author;
        this.pageCount = pageCount;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName; 
    }

    public void setAuthor(String author) {
        this.author = author; 
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public Document clone() {
        PdfDocument clonedDocument = new PdfDocument(this.fileName, this.author, this.pageCount);
        return clonedDocument;
    }

    @Override
    public void open() {
        System.out.println("Opening PDF Document: " + fileName + " by " + author + " (" + pageCount + " pages)");
    }

    @Override
    public String getType() {
        return "PDF";
    }

    @Override
    public String toString() {
        return "Type: " + getType() + ", File: " + fileName + ", Author: " + author + ", Pages: " + pageCount;
    }
}