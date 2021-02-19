/**
 *
 * Student name:Ciaran
 * Student number:2940836
 *
 */
import java.util.*;
public class Assignment7_2017{
	public static void main(String args[]){
	 //Test Q1 =======================================
	 Person per1 = new Person("2209474", "John", "02/12/1997");
	 Person per2 = new Person("3499034", "Beth", "10/04/2000");
	 //hashCode test
	 System.out.println();
	 System.out.println(per1.hashCode());
	 System.out.println(per2.hashCode());
	 //equals test
	 System.out.println();
	 System.out.println(per1.equals(per2));
	 System.out.println(per2.equals(per1));
	 //compareTo test
	 System.out.println();
	 System.out.println(per1.compareTo(per2));
	 if(per1.compareTo(per2) <= 0)
    		System.out.println(per1+" "+ per2);
     else
    		System.out.println(per2+" "+per1);
    		
	 //Array and toString test
	 System.out.println();
	 Person pers[] = {per1, per2};
	 Arrays.sort(pers);
	 System.out.println(Arrays.toString(pers));
	 
	 //Test Q2 =======================================
	 Vector vec1 = new Vector(2.5, 4.3);
	 Vector vec2 = new Vector(10.4, 7.2);
	 
	 //hashCode test
	 System.out.println();
	 System.out.println(vec1.hashCode());
	 System.out.println(vec2.hashCode());
	 //equals test
	 System.out.println();
	 System.out.println(vec1.equals(vec2));
	 System.out.println(vec2.equals(vec1));
	 //compareTo test
	 System.out.println();
	 System.out.println(vec1.compareTo(vec2));
	 if(vec1.compareTo(vec2) == 0)
    		System.out.println("Equal");
     else
    		System.out.println("Not equal");
    		
	 //Array and toString test
	 System.out.println();
	 Vector vec [] = {vec1, vec2};
	 Arrays.sort(vec);
	 System.out.println(Arrays.toString(vec));
	 
	}
}
//Q1  =============================================
//Add classes for Q1 here =========================
final class Person implements Comparable<Person>{
	private final String prsi;
	private final String name;
	private final String dob;
	Person(String p, String n, String d){
		prsi = p; name = n; dob = d;
	}
	public String prsi(){
		return prsi;
	}
	public String name(){
		return name;
	}
	public String dob(){
		return dob;
	}
	public String toString(){
		return new String ("PRSI: " + prsi + "\nName: " + name + "\nDOB: " + dob);
	}
	public boolean equals(Object ob){
		if(ob == this){
			return true;
		}
		if(!(ob instanceof Person)){
			return false;
		}
		//Not right
		Person p = (Person)ob;
		while (p != null) {
			Node lst1 = this.data();
   			if (lst1.data() != p.data()) {
        		return false;
    		}
    		p = p.next();
    		lst1 = lst1.next();
		}
		return true;
	}
	public int compareTo(Person p) throws ClassCastException{
		if(p == null){
			return -1;
		}
		else{
			return (prsi.compareTo(p.prsi));
		}
	}
	public int hashCode(){
		return prsi.hashCode();
	}
}


//Q2 ===============================================
final class Vector implements Comparable<Vector>{
	final private double a;
	final private double b;
	
	Vector(double a0, double b0){
		a = a0; 
		b = b0;
	}
	
	public double a(){
		return a;
	}
	
	public double b(){
		return b;
	}
	
	public String toString(){
		return "("+a+","+b+")";
	}
	public boolean equals(Object ob){
		if(ob == this) return true;
		if(!(ob instanceof Vector)) return false;
		Vector v = (Vector)ob;
		if(a == v.a() && b == v.b()){
			return true;
		}
		else{
			return false;
		}
	}
	public int hashCode(){
		Double a0 = a; 
		Double b0 = b;
		return a0.hashCode() + b0.hashCode();
	}
	public int compareTo(Vector v) throws ClassCastException{
		if(v == null) return -1;
		else{
			Double a0 = a; 
			Double b0 = b;
		  	Double v0 = v.a();
		  	Double v1 = v.b();
		  	if(!a0.equals(v0))
		  		if(a0.compareTo(v0) == 0){
		  			return b0.compareTo(v1);
		  		}
		 }
		return -1;
	}
}

//end =============================

