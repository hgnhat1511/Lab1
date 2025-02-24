import java.util.Scanner;
public class b2{
public static void main(String[] args){
    double dai;
    double rong;

    Scanner kb = new Scanner(System.in);
  
    System.out.println("nhap chieu dai:");
    dai = kb.nextDouble();
    System.out.println("nhap chieu rong:");
    rong = kb.nextDouble();
    double s=dai*rong;
    System.out.print("dientich hcn la: "+ s );
    kb.close();

}
}
