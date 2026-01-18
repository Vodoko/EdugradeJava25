package PolymorfismUppgifter;

public class ColorPrinter extends Printer{
    @Override
    public void print (String text){
        System.out.println("Printing text: '" + text + "', now in color!");
    }
}
