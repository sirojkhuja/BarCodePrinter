package main;

import com.github.anastaciocintra.escpos.EscPos;
import com.github.anastaciocintra.output.PrinterOutputStream;

import javax.print.PrintService;
import java.io.IOException;

public class PrintBarcode {
    public static void main(String[] args) throws IOException {
        PrintService printService = PrinterOutputStream.getPrintServiceByName("xprinter");
        PrinterOutputStream printerOutputStream = new PrinterOutputStream(printService);
        EscPos escpos = new EscPos(printerOutputStream);
        escpos.writeLF("Hello Wold");
        escpos.feed(5);
//        escpos.cut(EscPos.CutMode.FULL);
        escpos.close();
    }
}
