package HW7_Collections.BookShop;

public class Book {


    private  double price;
    private  String title;
    private  String coverType;
    private  int quantityOfPages;

    public Book(double price, String title,
                String coverType, int quantityOfPages) {


        setPrice(price);
        setTitle(title);
        setCoverType(coverType);
        setQuantityOfPages(quantityOfPages);

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public int getQuantityOfPages() {
        return quantityOfPages;
    }

    public void setQuantityOfPages(int quantityOfPages) {
        this.quantityOfPages = quantityOfPages;
    }

    public String toString(){

        return title;
    }


}
