import java.util.Scanner;
public class ArrayRataNilai01 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int totalLulus=0;
    int totalTakLulus=0;
    int lulus=0;
    int gaLulus=0;
    double rataLulus;
    double rataTakLulus;
    System.out.print("Masukkkan juumlah mahasiswa ");
    int jmlMhs=sc.nextInt();
    int nilaiMhs[]= new int[jmlMhs];

    for(int i=0; i<nilaiMhs.length; i++){
      System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
      nilaiMhs[i]=sc.nextInt();
      if (nilaiMhs[i]>70) {
        totalLulus+=nilaiMhs[i];
        lulus++;
      }else if (nilaiMhs[i]<=70) {
        totalTakLulus+=nilaiMhs[i];
        gaLulus++;
      }
    }
    rataLulus=totalLulus/lulus;
    rataTakLulus=totalTakLulus/gaLulus;
    System.out.println("Rata-rata nilai lulus = "+ rataLulus);
    System.out.println("Rata-rata nilai tidak lulus = "+ rataTakLulus);
  }
}
