package SOLID.ISP;

//Client class using a printer
public class Client {
    private Printer printer;

    public Client(Printer printer) {
        this.printer = printer;
    }

    public void printDocument(Document document) {
        printer.print(document);
    }
    
}
