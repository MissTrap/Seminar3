package view;

import controller.Controller;

/**
 * The <code>View</code> class represent the user interface.
 * */
public class View {
    /**
     * Constructs a <code>View</code> object with hard-coded commands.
     * @param contr represents an instance of the class controller.
     */
    public View(Controller contr){

        double change;

        System.out.println("New sale.");
        contr.startSale();
        contr.addItem(1);
        System.out.println("Total: "+contr.getTotal());
        contr.addItem(2);
        System.out.println("Total: "+contr.getTotal());
        contr.addItem(3);
        System.out.println("Total: "+contr.getTotal());
        contr.addItem(4);
        System.out.println("Total: "+contr.getTotal());
        contr.addItem(5);
        System.out.println("Total: "+contr.getTotal());
        System.out.println("Enter payment.");
        change = contr.enterPayment(100);
        System.out.println("change: "+change+"\n\n");

        System.out.println("New sale.");
        contr.startSale();
        contr.addItem(2);
        System.out.println("Total: "+contr.getTotal());
        contr.addItem(4);
        System.out.println("Total: "+contr.getTotal());
        contr.addItem(6);
        System.out.println("Total: "+contr.getTotal());
        System.out.println("Enter payment.");
        change = contr.enterPayment(100);
        System.out.println("change: "+change+"\n\n");

    }
}
