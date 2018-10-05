public class practicum2{
public static void main(String[] args) {
    int willekeurig =(int) Math.ceil( Math.random() * 10);

    System.out.println(willekeurig);

    if (willekeurig >= 8){
      System.out.println("Getal is 8 of hoger.");
    }
    else{
      System.out.println("Het is een ander getal.");
    }

    System.out.println("Einde programma");

  }
}
