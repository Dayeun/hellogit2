package kr.ac.ajou.Dayeun.hellogit2;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	} 
	
	public double add(double x, double y){
		//programmer A
				
		
		return x+y;
	}
	
	public double subtract(double x, double y){
		double z=x-y;
		return z;
	}
	
	public double divide(double x, double y){
		if(y==0){
			System.out.println("divide Error!");
			return -1;
		}
		else
			return x/y;//
	}
	
	public double multiply(double x, double y){
		//programmer A
		//hello test
		return x*y;
	}
	
	public int remainder(double x, double y){
		int z=(int)(x%y);
		return z;
	}
	public String toString(){
		//programmer A
		// hallo1
		String tmb;
		
		tmb=("name: Dayeun,kangbada0728,jek90"+"StudentId: 201421171,201220987,201222777"+"Repository URI: https://github.com/Dayeun/hellogit2.git");
		
		
		return tmb;
	}

}
