package liczbyZespolone;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zespolona z1=new Zespolona(19,3);
		Zespolona z2=new Zespolona(-3,4);
		
		z1.print();
		z2.print();
		Zespolona z3=new Zespolona();
		z3=z3.iloraz(z1,z2);
		z3.print();
		System.out.println("Modul z2="+z2.modul()+" argument z2="+z2.argument());
	}

}
