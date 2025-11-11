import java.util.Scanner;
public class arrayAbsen01Soal02 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.print("jumlah pesanan : ");
    int pesanan=sc.nextInt();
    int total=0;
    String namaPesanan[]=new String[pesanan];
    int hargaPesanan[]=new int [pesanan];
    int i=0;
    do {
      sc.nextLine();
      System.out.print("pesanan "+ (i+1)+" : ");
      namaPesanan[i]=sc.nextLine();
      System.out.print("Masukkan harga : ");
      hargaPesanan[i]=sc.nextInt();
      total+=hargaPesanan[i];
      i++;
    } while (i<pesanan);
    i=0;
    System.out.print("pesanan : ");
    do {
      System.out.print(" "+namaPesanan[i]);
      i++;
    } while (i<pesanan);
    System.out.println("\nTotal harga adalah : "+ total);
  }
}
