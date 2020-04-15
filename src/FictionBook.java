public class FictionBook extends Book {

    private String cateGory;

    public String getCateGory() {
        return cateGory;
    }

    public void setCateGory(String cateGory) {
        this.cateGory = cateGory;
    }

    public FictionBook() {
    }

    public FictionBook(String cateGory) {
        this.cateGory = cateGory;
    }

    public FictionBook(String bookCode, String name, double price, String author, String cateGory) {
        super(bookCode, name, price, author);
        this.cateGory = cateGory;
    }

    @Override
    public String toString() {
        return "  a bookCode =" + getBookCode() + " , name = " + getName() + ", price = " + getPrice() + " , author is " + getAuthor() + " and cate gory is " + getCateGory();
    }
}
