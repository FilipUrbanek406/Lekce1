import com.engeto.invoice.Invoice;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Invoice invoice1 = new Invoice();
        Invoice invoice2 = new Invoice();
        Invoice invoice3 = new Invoice();

        invoice1.setInvoiceNumber(20250002);
        System.out.println("Číslo faktury " + invoice1.getInvoiceNumber());

//        customerName = "Karel Dvořák";
//        packageWeight = 128;
//        double totalWeigh = packageWeight + 2;
//
//        System.out.println("Číslo faktury: " + invoice1.invoiceNumber);
//        System.out.println("Jméno zákazníka: " + customerName);
//        System.out.println("Datum vystavení faktury: " + invoiceDate);
//        System.out.println("Celková částka: " + totalAmount);

    }
}



