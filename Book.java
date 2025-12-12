public class Book {
    String title;
    String author;
    double price;
    double discount;

    public Book() {
        this("unknown", "unknown", (double)100.0F, (double)0.0F);
    }

    public Book(String title, String author, double price, double discount) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.discount = discount;
    }

    public void displayDetails() {
        System.out.println("--------------------------");
        System.out.println("Title: " + this.title);
        System.out.println("Aurhor: " + this.author);
        System.out.println("Price: " + this.price);
        System.out.println("------------------");
        this.applyDiscount(this.discount);
    }

    public void applyDiscount(double discount) {
        if (!(discount <= (double)0.0F) && !(discount >= (double)100.0F)) {
            System.out.println("Discount applied: " + discount + "%");
            this.price -= this.price * discount / (double)100.0F;
            System.out.println("------------------");
            System.out.println("NewPrice: " + this.price);
        } else {
            System.out.println("Error! Please enter a discount greater  than 0 and less than 100.");
            System.out.println("------------------");
        }

    }

    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }
}
