package entities;

public class ImportedProduct extends Product{
    
    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        double total = getPrice() + customsFee;
        return getName() + " " + total + " (Customs fee: $ " + customsFee + " )" ;
    }

    public Double totalPrice(){
        return getPrice() + customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

}
