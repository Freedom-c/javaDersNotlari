package inheritanceExample;

public class Main {

	public static void main(String[] args) {
		insan ali= new insan();
		engineer veli= new engineer();
		
		veli.height=179;
		System.out.println(veli.height);
		
		veli.weight=90;
		veli.food();
		System.out.println(veli.weight);
		veli.salary=10000;
		veli.zam();
		System.out.println(veli.salary);
		
		veli.food();
		System.out.println(veli.weight);
		
		
	}

}
