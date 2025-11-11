import java.util.Scanner;
public class arrayAbsen01Soal01 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int total=0;
    int tertinggi=0;
    int terendah=100;
    double rata;

    System.out.print("Masukkan banyak nilai yang mau diinput : ");
    int banyakNilai=sc.nextInt();
    int nilai[]=new int[banyakNilai];

    int i=0;
    do {
      System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
      nilai[(i)]=sc.nextInt();
      total+=nilai[i];
      if (tertinggi<nilai[i]) {
        tertinggi=nilai[i];
      }
      if (terendah>nilai[i]) {
        terendah=nilai[i];
      }
      i++;
    } while (i<nilai.length);
    System.out.println();
    i=0;
    do {
      System.out.println("Nilai mahasiswa ke-"+(i+1)+" adalah "+ nilai[i]);
      i++;
    } while (i<nilai.length);
    System.out.println("____________________________________________");
    rata=total/banyakNilai;
    System.out.println("Nilai tertinggi adalah: "+ tertinggi);
    System.out.println("Nilai terendah adalah: "+ terendah);
    System.out.println("Rata-rata nya adalah: "+ rata);
  }
}
