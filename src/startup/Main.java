package startup;

import controller.Controller;
import dbHandler.DBHandler;
import dbHandler.EASHandler;
import dbHandler.InventoryHandler;
import dbHandler.ItemDTO;
import view.View;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();
        itemList.add(new ItemDTO(1,"Tandkräm", 12, 1.44, "Tandkräm med avsmak av Julafton"));
        itemList.add(new ItemDTO(2,"Toalettpapper", 8.5, 1.02, "Toapapper med högt rivmotstånd -för de hårdaste ändtarmarna"));
        itemList.add(new ItemDTO(3,"Ciggaretter", 20, 10, "Rökning skadar allvarligt din image"));
        itemList.add(new ItemDTO(4,"Matbröd", 15, 1.8, "......"));
        itemList.add(new ItemDTO(5,"Plastkasse", 1.75, 0.44, "....."));
        itemList.add(new ItemDTO(6,"Mjölk", 6.5, 0.78, "....."));

        EASHandler easHandlerHandler = new EASHandler();
        InventoryHandler invHandler = new InventoryHandler(itemList);
        DBHandler dbHandler = new DBHandler(easHandlerHandler, invHandler);

        Controller contr = new Controller(dbHandler);
        View view = new View(contr);

    }

}
