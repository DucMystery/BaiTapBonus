public class ProgrammingBook extends Book {

    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }



    public ProgrammingBook(){}

    public ProgrammingBook(String language){
        this.language =language;
    }

    public ProgrammingBook(String bookCode, String name, double price, String author, String language){
        super(bookCode, name, price, author);
        this.language =language;
    }

    public static int dem(ProgrammingBook arr[]){
        int count =0;
        for (int i=0;i<arr.length;i++){
            if (arr[i].getLanguage().equals("Java")){
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "  a bookCode =" + getBookCode() + " , name = " + getName() + ", price = " + getPrice() + " , author is " + getAuthor() + " and lannguage is " + getLanguage();
    }

}
