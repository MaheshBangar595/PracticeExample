package Conditions;

public class IfElse2 {

	public static void main(String[] args) {
		String city = "Agra";
		if(city=="Meerut") { //execute when city is meerut
			System.out.println("city is meerut");
		}else if(city=="Noida") {//execute when city is Noida
			System.out.println("city is Noida");
		}else if(city =="Agra") {
			System.out.println("city is agra");
		}else {
			System.out.println(city);
		}
	}
	
}
