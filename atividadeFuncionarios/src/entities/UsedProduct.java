package entities;

import java.util.Date;
import java.text.SimpleDateFormat;

public class UsedProduct extends Product {
    
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    private Date manufactureDate;
    

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        // TODO Auto-generated method stub
        return getName() + " (used) " + getPrice() + " (Manufacture Date: " + formato.format(manufactureDate) + ")";
    }

    
    
}
