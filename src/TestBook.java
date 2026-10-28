public class TestBook {
    public static void main(String[] args) {
        Author anAuthor = new Author("Tan Ah Teck" , "ahteck@gmail.com", 'm');
        Book[] books = new Book[5];
        for (int i = 0; i < books.length ; i++ ){
            Book book = new Book("Under the water "+ (i+1)  , anAuthor, (i * 14.5 + 15), (i  * 49 + 15));
            System.out.println(book);
            System.out.println("price = "+ book.getPrice());
            System.out.println("Quantity = "+ book.getQtyInStock());
        }
    }
}
