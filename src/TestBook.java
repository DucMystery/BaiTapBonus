import java.util.Scanner;

public class TestBook {
    public static void display(Book book){
        if (book instanceof ProgrammingBook){
            book = (ProgrammingBook) book;
            System.out.println(book.toString());
        }
        if (book instanceof FictionBook) {
            book = (FictionBook) book;
            System.out.println(book.toString());
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Book []books = new Book[10];
        books[0] =new ProgrammingBook("CV01","Java cơ bản",200,"Nguyễn Văn Khoa","Java");
        books[1] = new ProgrammingBook("CV02","Tự học java 6 trong ngày 21",400,"Lưu Nguyễn Tấn Đạt","Java");
        books[2] =new ProgrammingBook("CV03","Tự học thiết kế web bằng js",300,"Đậu Quang Tuấn","JavaScript");
        books[3] = new ProgrammingBook("CV04","Lets Us C",600,"Yashavant Kanetka","C");
        books[4] = new ProgrammingBook("CV05","C: The Complete Reference",900,"Herbert Schildt","C");
        books[5] = new FictionBook("CV06","Harry Potter",1000,"J.K. Rowling","Tiểu Thuyết");
        books[6] = new FictionBook("CV07","The Lord of the Rings",1000,"J.R.R. Tolkien","Tiểu Thuyết");
        books[6] = new FictionBook("CV07","The Lord of the Rings",1000,"J.R.R. Tolkien","Tiểu Thuyết");
        books[7] = new FictionBook("CV08","The Kingkiller Chronicles",2000," Patrick Rothfuss","Tiểu Thuyết");
        books[8] = new FictionBook("CV09","His Dark Materials",1500," Philip Pullma","Tiểu Thuyết");
        books[9] = new FictionBook("CV10","TheWheelOfTime",520," Robert Jordan","Tiểu Thuyết");
        System.out.println(Book.sumPrice(books));
        int pick=1;
        while (pick!=0){
            System.out.println("1. Tìm mã cuốn sách.");
            System.out.println("2. Tìm tên cuốn sách");
            System.out.println("3. Tìm theo tác giả");
            System.out.println("4. Tìm theo giá sách.");
            System.out.println("0. Exit.");
             pick = scanner.nextInt();
             switch (pick){
                 case 1:
                     System.out.println("Mời nhập mã:");
                     String code =scanner.next();
                     boolean flag1 =false;
                     for (int i=0;i<books.length;i++){
                         if (books[i].getBookCode().contains(code)){
                             display(books[i]);
                             flag1 =true;
                         }
                     }
                     if (flag1==false){
                         System.out.println("Không có mã bạn vừa nhập!");
                     }
                         break;
                 case 2:
                     System.out.println(" Mời nhập vào tên cuốn sách:");
                     scanner.nextLine();
                     String nameBook =scanner.nextLine();
                     boolean flag =false;

                     for (int i =0;i<books.length;i++) {
                         if (books[i].getName().contains(nameBook)) {
                             display(books[i]);
                             flag =true;
                         }
                     }
                     if (flag ==false){
                         System.out.println("Không có tên sách trong thư viện!");
                     }
                     break;
                 case 3:
                     System.out.println("Mời nhập vào tên tác giả:");
                     scanner.nextLine();
                     String author = scanner.nextLine();
                     boolean flag2 =false;

                     for (int i=0;i<books.length;i++){
                         if (books[i].getAuthor().contains(author)){
                             display(books[i]);
                             flag2 =true;
                         }
                     }
                     if (flag2==false){
                         System.out.println("Tác giả bạn điển không có trong thư viện");
                     }
                     break;
                 case 4:
                     System.out.println("Mời nhập vào giá sach cần mua:");
                     double price =scanner.nextDouble();
                     boolean flag3 = false;

                     for (int i=0;i< books.length;i++){
                         if (books[i].getPrice()==price){
                             display(books[i]);
                             flag3 =true;
                         }
                     }
                     if (flag3==false){
                         System.out.println("Giá sách của bạn không có bán trong thư viện!");
                     }
                     break;
                 case 0:
                     System.exit(0);
             }
        }
    }
}
