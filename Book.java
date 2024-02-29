public class Book {

    public class Persegi {
        private double sisi;
        private double luas;
        private double keliling;
    
        public Persegi(double sisi) {
            this.sisi = sisi;
            System.out.println("sisi perseginya adalah:" + sisi);
        }
    
        public void setSisi(double sisi) {
            this.sisi = sisi;
            System.out.println("sisi adalah:" + sisi);
        }
    
        public double getKeliling() {
            keliling = sisi * 4;
            return keliling;
        }
    
        public double getLuas() {
            luas = sisi * sisi;
            return luas;
        }
    }
    
    public class BOOK {
        private String author;
        private String title;
        private int price;
        private int quantity;
    
        public BOOK(String author, String title, int price, int quantity) {
            this.author = author;
            this.title = title;
            this.price = price;
            this.quantity = quantity;
        }
    
        public int buyBook(int quantity) {
            return price * quantity;
        }
    }
    
    public class App {
        public static void main(String[] args) {
            Persegi persegi1 = new Persegi(15);
            double kelilingPersegiBefore = persegi1.getKeliling();
            System.out.println("keliling persegi:" + kelilingPersegiBefore);
            double luasPersegiBefore = persegi1.getLuas();
            System.out.println("luas persegi:" + luasPersegiBefore + "\n");
    
            persegi1.setSisi(10);
            double kelilingPersegiAfter = persegi1.getKeliling();
            System.out.println("keliling persegi:" + kelilingPersegiAfter);
            double luasPersegiAfter = persegi1.getLuas();
            System.out.println("luas persegi:" + luasPersegiAfter + "\n");
    
            BOOK BOOK1 = new BOOK("Ilhan", "Artificial Intelligence", 20008, 1);
            BOOK BOOK2 = new BOOK("Junaidi", "Machine Learning", 10000, 2);
    
            double totalPrice = BOOK1.buyBook(2) + BOOK2.buyBook(3);
            System.out.println("\n" + "Total Harga yang harus dibayar Rp." + totalPrice);
        }
    }
//     String author;
//     String title;
//     int price;
//     int publisher_number; 
//     int totalPrice; 
//     int numbersOfBookBuy;

//     public Book(String author, String title, int price, int publisher_number) {
//         this. author = author;
//         this.title = title;
//         this.price = price;
//         this.publisher_number = publisher_number;
//     }

//     public double buyBook(int numbers0fBookBuy) {
//         this. totalPrice = numbersOfBookBuy * price;
//         System.out.println("Membell buku" + title +  " Sebanyak " + numbersOfBookBuy); return totalPrice;
//     }
}
