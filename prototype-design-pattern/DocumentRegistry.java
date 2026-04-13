public class DocumentRegistry {
    private PdfDocument pdfPrototype;
    private TextDocument textDocumentPrototype;
    private SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        System.out.println("Creating a PDF Document prototype.");
        pdfPrototype = new PdfDocument("default.pdf", "Acme Corp", 0);

        System.out.println("Creating a Text Document prototype.");
        textDocumentPrototype = new TextDocument("default.txt", "UTF-8", 0);

        System.out.println("Creating a Spreadsheet Document prototype.");
        spreadsheetPrototype = new SpreadsheetDocument("default.xlsx", 0, 0);
    }

    public PdfDocument createPdf(String fileName, String author, int pageCount) {
        PdfDocument pdfDocument = (PdfDocument) pdfPrototype.clone();
        pdfDocument.setFileName(fileName);
        pdfDocument.setAuthor(author);
        pdfDocument.setPageCount(pageCount);
        return pdfDocument;
    }

    public TextDocument createText(String filePath, String encoding, int wordCount) {
        TextDocument textDocument = (TextDocument) textDocumentPrototype.clone();
        textDocument.setFilePath(filePath);
        textDocument.setEncoding(encoding);
        textDocument.setWordCount(wordCount);
        return textDocument;
    }

    public SpreadsheetDocument createSpreadsheet(String spreadsheetName, int rowCount, int columnCount) {
        SpreadsheetDocument spreadsheetDocument = (SpreadsheetDocument) spreadsheetPrototype.clone();
        spreadsheetDocument.setSpreadsheetName(spreadsheetName);
        spreadsheetDocument.setRowCount(rowCount);
        spreadsheetDocument.setColumnCount(columnCount);
        return spreadsheetDocument;
    }
}