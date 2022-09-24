package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();

	}
	
	

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacaksayi = 9;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacaksayi) {
				varMi = true;
				break;
			}
			
		}
		
		String mesaj="";
		if (varMi) {
			mesaj="Sayı mevcuttur: " + aranacaksayi;
			mesajVer(mesaj);
		} else {
			mesaj="Sayı mevcut değil : " + aranacaksayi;
			mesajVer(mesaj);
		}
	}
	
	

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
