package _gui.entity;

public class ProductEntity {

    private String productNum;
    private String productName;
    private int stockNum;
    private int unitprice;
    private String manufacturer;

    public String getProductNum() {
        return productNum;
    }

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getStockNum() {
        return stockNum;
    }
    public void setStockNum(int stockNum) {
        this.stockNum = stockNum;
    }

    public int getUnitprice() {
        return unitprice;
    }
    public void setUnitprice(int unitprice) {
        this.unitprice = unitprice;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
