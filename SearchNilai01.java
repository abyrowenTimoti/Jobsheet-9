import java.util.Scanner;
public class SearchNilai01 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int hasil=0;

    System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
    int banyakNilai=sc.nextInt();
    int arrNilai[]=new int[banyakNilai];
    for(int i=0;i<arrNilai.length; i++){
      System.out.print("Masukkan nilai Mahasiswa ke-"+(i+1)+" : ");
    arrNilai[i]=sc.nextInt();
    }
    System.out.print("Masukkan nilai yang ingin dicari: ");
    int key=sc.nextInt();
    for(int i=0; i<arrNilai.length;i++){
      if(key==arrNilai[i]){
        hasil=(i+1);
        System.out.println();
        System.out.println("nilai "+key+ " ketemu merupakan nilai mahasiswa ke-"+hasil);
        break;
      }
    }
    if (key!=arrNilai[(hasil)]) {
      System.out.println("Nilai yang dicari tidak ditemukan");
    }
  }
}
