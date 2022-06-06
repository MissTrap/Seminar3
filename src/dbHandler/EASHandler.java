package dbHandler;

import model.Sale;

import java.sql.Timestamp;

/**
 * The <code>EASHandler</code> class handles the communication with the external accounting system.
 */
public class EASHandler {

    /**
     * Constructs a <code>EASHandler</code> object.
     */
    public EASHandler() {
    }

    /**
     * Gets timestamp, fetch total from sale and would have sent this to the external accounting system.
     * @param sale Represent the current sale object.
     */
    public void logEAS(Sale sale){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        sale.getTotal();
    }
}
