public class Dress {
    int price;
    String name;
    int quantity;
    int image;

    public Dress(int price,String name,int image){
        this.price=price;
        this.name=name;
        this.image=image;
    }



    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void decreaseQuantity(int amount) {
        if (quantity >= amount) {
            quantity -= amount;
        }
    }

    public boolean isAvailable() {
        return quantity > 0;
    }
}
