package liczbyZespolone;

public class Zespolona {
	private double Re;
	private double Im;

	public Zespolona() {}
	
	public Zespolona(double re, double im) {
		this.Re=re;
		this.Im=im;
	}
	
	public void print() {
		System.out.print(Re);
		if(Im>0) {
			System.out.print("+");
		}
		System.out.println(Im+"i");
	}
	
	public Zespolona suma(Zespolona z1, Zespolona z2) {
		Zespolona z=new Zespolona();
		z.Re=z1.Re+z2.Re;
		z.Im=z1.Im+z2.Im;
		return z;
	}
	
	public Zespolona roznica(Zespolona z1, Zespolona z2) {
		Zespolona z=new Zespolona();
		z.Re=z1.Re-z2.Re;
		z.Im=z1.Im-z2.Im;
		return z;
	}
	
	public Zespolona iloczyn(Zespolona z1, Zespolona z2) {
		Zespolona z=new Zespolona();
		z.Re=z1.Re*z2.Re;
		z.Im=z1.Re*z2.Im+z1.Im*z2.Re;
		z.Re-=(z1.Im*z2.Im);
		return z;
	}
	
	public Zespolona iloraz(Zespolona z1, Zespolona z2) {
		Zespolona z=new Zespolona();
		Zespolona z2Sprzezone = z2;
		z2Sprzezone.Im*=(-1);
		
		Zespolona licznik=iloczyn(z1,z2Sprzezone);
		double mianownik=z2.Re*z2.Re+(z2.Im*z2.Im);

		z=licznik;
		z.Re/=mianownik;
		z.Im/=mianownik;
		return z;
	}
	
	public double modul() {
		return Math.sqrt(this.Re*this.Re+this.Im*this.Im);
	}
	
	public double argument() {
		return Math.asin(this.Im/this.modul());
	}
}







