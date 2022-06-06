package model;

import dbHandler.DBHandler;
import dbHandler.EASHandler;
import dbHandler.InventoryHandler;
import dbHandler.ItemDTO;

import java.util.ArrayList;


public class SaleTest {
    @org.junit.Test
    public void getTotal() throws Exception {
    }

    @org.junit.Test
    public void getGoods() throws Exception {
    }

    @org.junit.Test
    public void inputItem() throws Exception {
        ArrayList<ItemDTO> itemList = new ArrayList<>();
        itemList.add(new ItemDTO(1,"Tandkräm", 12, 1.44, "Tandkräm"));
        itemList.add(new ItemDTO(2,"Toalettpapper", 8.5, 1.02, "Toapapper"));
        InventoryHandler inv = new InventoryHandler(itemList);
        EASHandler easHandler = new EASHandler();

        DBHandler dbh = new DBHandler(easHandler, inv);
        Sale sale = new Sale(dbh);

        /**
         * Test if inputItem(1) gives first item in itemList
         */
        assert(inv.getInventory().get(0)==sale.inputItem(1));
        /**
         * Test if inputItem(0) gives a empty response.
         */
        assert(null==sale.inputItem(0));
        /**
         * Test if inputItem(3) gives a empty response.
         */
        assert(null==sale.inputItem(3));
    }

    @org.junit.Test
    public void payment() throws Exception {
        ArrayList<ItemDTO> itemList = new ArrayList<>();
        itemList.add(new ItemDTO(1,"Tandkräm", 12, 1.44, "Tandkräm"));
        itemList.add(new ItemDTO(2,"Toalettpapper", 8.5, 1.02, "Toapapper"));
        InventoryHandler inv = new InventoryHandler(itemList);
        EASHandler easHandler = new EASHandler();
        DBHandler dbh = new DBHandler(easHandler, inv);
        Sale sale = new Sale(dbh);

        /**
         * Expected value of change if goods is empty and payed amount is 100 kr.
         */
        assert(100 == sale.Payment(100));
        /**
         * Expected value of change if goods is only item 1 and payed amount is 100 kr.
         */
        sale.inputItem(1);
        assert(86.56 == sale.Payment(100));
        /**
         * Expected value of change if goods is more expensive than the payment. Goods cost 13.44 kr, payment=1 kr
         */
        assert(-12.44 == sale.Payment(1));
    }
}
