package newProject;


import java.util.ArrayList;
import java.util.Scanner;

public class ArabaDeneme {

	public static void main(String[] args) {
		
		ArrayList<Araba> arabalar=new ArrayList<Araba>();
		Scanner sc=new Scanner(System.in);
		
		
		//String marka, String model, int uretimYili, String uretildigiUlke, boolean otomatikVitesmi
		for (int i = 0; i < 2; i++) {
			System.out.println("Araba degerleri isteniyor!");
			System.out.println("Githubdan git'e...);
			System.out.println("Githubdan git'e...");
			System.out.println("Arabanin markasini giriniz : ");
			String marka=sc.next();
			System.out.println("Arabanin modelini giriniz : ");
			String model=sc.next();
			System.out.println("Arabanin uretim yilini giriniz : ");
			int uretimYili=sc.nextInt();
			System.out.println("Araba otomatik vites mi? evet/hayir : ");
			boolean otomatikVitesmi=sc.nextBoolean();
			
			arabalar.add(new Araba(marka,model,uretimYili,otomatikVitesmi));
			System.out.println("-----------------------------------------");
		}
			
		for (int i = 0; i < arabalar.size(); i++) {
			System.out.println("Araba markasi : " + arabalar.get(i).getMarka());
			System.out.println("Araba modeli : " + arabalar.get(i).getModel());
			System.out.println("Araba uretim yili : " + arabalar.get(i).getUretimYili());
			System.out.println("Otomatik Vites mi : ? " + arabalar.get(i).isOtomatikVitesmi());
			System.out.println("------------------------------------------");
			
			
		}
	}

}
