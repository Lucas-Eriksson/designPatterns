package SOLID.ISP;

//Multifunctional printer implemets all interfaces
public class MultiFunctionalPrinter implements Printer, Scanner, FaxMachine {
    @Override
    public void print(Document document) {
        //Print implementation
    }

    @Override
    public void scan(Document document) {
        //Scanner implementation
    }

    @Override
    public void fax(Document document) {
        //Fax implementation
    }
}
