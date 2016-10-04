package kr.ac.ajou.Dayeun.hellogit2;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	public double add(double x, double y){
		return 0;
	}
	
	public double subtract(double x, double y){
		double z=x-y;
		return z;
	}
	
	public double divide(double x, double y){
		if(y==0)
			System.out.println("divide Error!");
		else
			double z=x/y;
		return z;//
	}
	
	public double multiply(double x, double y){
		return 0;
	}
	
	public int remainder(double x, double y){
		double z=x%y;
		return z;
	}
	public String toString(){
		
		return null;
	}

}
