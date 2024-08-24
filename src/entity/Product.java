
package entity;

/**
 *
 * @author ABDUL MOIZ
 */
public class Product {
    private int pId;
    private String pNme;
    private String catgory;
    private int contity;
    private long price;
    private long wsPrice;
public Product(){
    this(0,"","",0,0,0);
}
    public Product(int pId, String pNme, String catgory, int contity, long price, long wsPrice) {
        this.pId = pId;
        this.pNme = pNme;
        this.catgory = catgory;
        this.contity = contity;
        this.price = price;
        this.wsPrice = wsPrice;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public void setpNme(String pNme) {
        this.pNme = pNme;
    }

    public void setCatgory(String catgory) {
        this.catgory = catgory;
    }

    public void setContity(int contity) {
        this.contity = contity;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setWsPrice(long wsPrice) {
        this.wsPrice = wsPrice;
    }
    

    public int getpId() {
        return pId;
    }

    public String getpNme() {
        return pNme;
    }

    public String getCatgory() {
        return catgory;
    }

    public int getContity() {
        return contity;
    }

    public long getPrice() {
        return price;
    }

    public long getWsPrice() {
        return wsPrice;
    }
    
    
    
    
    
}
