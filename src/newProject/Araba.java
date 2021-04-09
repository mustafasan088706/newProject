package newProject;

public class Araba {

	private String marka;
	private String model;
	private int uretimYili;
	private boolean otomatikVitesmi;
	

	public Araba() {
		
	}
	
	public Araba(String marka, String model, int uretimYili, boolean otomatikVitesmi) {
		
		this.marka = marka;
		this.model = model;
		this.uretimYili = uretimYili;
		this.otomatikVitesmi = otomatikVitesmi;
	}
	


	public String getMarka() {
		return marka;
	}


	public void setMarka(String marka) {
		this.marka = marka;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getUretimYili() {
		return uretimYili;
	}


	public void setUretimYili(int uretimYili) {
		this.uretimYili = uretimYili;
	}
	


	public String isOtomatikVitesmi() {
		String str=" ";
			if(otomatikVitesmi) {
				str="evet";
			}
			
			else {
				str="hayir";
			}
			return str;
	}
		

	public void setOtomatikVitesmi(String otomatikVitesmi) {
		if("evet".equals(otomatikVitesmi)) {
			this.otomatikVitesmi=true;
			
		}else
		
		this.otomatikVitesmi = false;
	}


	
	

}
