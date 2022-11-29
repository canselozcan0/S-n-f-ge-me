import java.util.Scanner;

public class driver {
public static void main(String[] args) {
	int mat,fizik,turkce,kimya,muzik;
	
	Scanner input = new Scanner(System.in);
	System.out.println("Mat notu : ");
	mat = input.nextInt();
	if (mat<0 || mat>100) {
		mat = 0;
	}
	
	System.out.println("Fizik notu: ");
	fizik = input.nextInt();
	if(fizik<0 || fizik>100) {
		fizik = 0;
	}
	System.out.println("Türkçe notu :" );
	turkce = input.nextInt();
	if(turkce<0 || turkce>100) {
		turkce =0;
	}
	System.out.println("Kimya notu: ");
	kimya = input.nextInt();
	if(kimya<0 || kimya >100) {
		kimya = 0;
	}
	
	System.out.println("Muzik notu : ");
	muzik = input.nextInt();
	if(muzik<0 || muzik>100) {
		muzik = 0;
	}
	
	double average =(mat + kimya+ muzik + turkce + fizik)/5;
	
	if (average <= 55) {
		System.out.println("Sınıfta kaldınız!");
	}else {
		System.out.println("Tebrikler! Sınıfı geçtiniz");
	}
	System.out.println("Ortalamnız: " + average);
	}
}

