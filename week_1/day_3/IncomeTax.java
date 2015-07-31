import java.io.Console;
class Employee{
	private String name;
	private boolean gender;
	private double taxableIncome;
	private double taxAmount;

	Employee(){
		Console cons= System.console();
		System.out.println("Employee Details");		
		this.name=cons.readLine("Enter the name: ");
		this.gender= (cons.readLine("Gender(m/f): ").charAt(0) == 'm') ? true: false;
		this.taxableIncome=Double.parseDouble(cons.readLine("Enter taxable income: "));
	}

	void setTaxableIncome(double val){
		taxableIncome=val;
	}
	void setTaxAmount(double val){
		taxAmount=val;
	}
	String getName(){
		return name;
	}
	boolean getGender(){
		return gender;
	}
	double getTaxAmount(){
		return taxAmount;
	}
	double getTaxableIncome(){
		return taxableIncome;
	}
	void display(){
		System.out.println("["+getName()+"] | ["+ (getGender() ? "male":"female")+"] | ["+getTaxableIncome()+"] | ["+getTaxAmount()+"]");
	}
}

public class IncomeTax{
	private static Employee calculateTax(Employee emp){
		int tax;
		double taxValue;
		tax =emp.getGender() == true ? 20:15;
		taxValue= ((double) (tax) * emp.getTaxableIncome())/100.0d;
		emp.setTaxAmount(taxValue);
		return emp;
	}
	
	public static void main(String[] args) throws Exception{
		int n;
		Console cons= System.console();
		n=Integer.valueOf(cons.readLine("Enter the number of employees: "));
		Employee[] emp= new Employee[n];
		int i;
		System.out.println("Enter details of 3 employees");
		for(i=0; i< n; i++){
			Employee tempemp= new Employee();
			emp[i]=  calculateTax(tempemp);
			System.out.println();
		}
		
		
		System.out.println("\nPrinting all employees");
		
		System.out.println("[name] [gender] [taxableIncome] [taxAmount]");
		for(i=0; i<emp.length; i++){
			emp[i].display();
		}
	}
}
