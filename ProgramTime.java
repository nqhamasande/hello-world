import java.lang.*;
import java.text.SimpleDateFormat;
import java.util.*;
public class ProgramTime{
	private void myDate(){
		long myDate=System.currentTimeMillis();
		System.out.println("System.currentTimeMillis = "+myDate);
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-WW-MM-yyyy");
		
		Date n=new Date();
		System.out.println("Date Format Time = "+dateFormat.format(n));

		

	}
	private void palindrome(){
		int mod,sum=0,temp; 

		Scanner num=new Scanner(System.in);
		System.out.print("Enter Integer : ");
		int number=num.nextInt();
		  
		temp=number;    
		while(number>0){    
		   mod=number%10;   
		   sum=(sum*10)+mod;    
		   number=number/10;    
		}    
		if(temp==sum){    
		 	System.out.println(temp+" is palindrome number "); 
		}   
		else{  
		   System.out.println(temp+" is not palindrome");    
		}
	}
	private void mathLearnTool(){
		int val1=(int)(Math.random() * 101);
		int val2=(int)(Math.random() * 101);
		int opr=(int)(Math.random() * 4);//0=+,1=-,2=/,3=x
		System.out.println(opr);
		if(opr==0){
			Scanner ques=new Scanner(System.in);
			System.out.print(val1+" + "+val2+" = ");
			int answ=ques.nextInt();
			if(answ==(val2+val1)){
				System.out.println("True");
			}
			else{
				System.out.println("False");
			}
		}
		else if(opr==1){
			Scanner ques=new Scanner(System.in);
			System.out.print(val2+" - "+val1+" = ");
			int answ=ques.nextInt();
			if(answ==(val2-val1)){
				System.out.println("True");
			}
			else{
				System.out.println("False");
			}
		}
		else if(opr==2){
			Scanner ques=new Scanner(System.in);
			System.out.print(val1+" / "+val2+" = ");
			int answ=ques.nextInt();
			int asn=(val1/val2);
			if(answ==asn){
				System.out.println("True");
			}
			else{
				System.out.println("False");
			}
		}
		else if(opr==3){
			Scanner ques=new Scanner(System.in);
			System.out.print(val1+" x "+val2+" = ");
			int answ=ques.nextInt();
			int asn=(val2*val1);
			if(answ==asn){
				System.out.println("True");
			}
			else{
				System.out.println("False");
			}
		}
		Scanner n=new Scanner(System.in);
		System.out.println("Would you like to try again? {y/n}");
		String nn=n.nextLine();
		if(nn.equalsIgnoreCase("y")||nn.equalsIgnoreCase("yes")||nn.equalsIgnoreCase("yeah")||nn.equalsIgnoreCase("yep")){
			mathLearnTool();
		}
		else{
			System.out.println("Goodbye");
		}
	}
	public static void main(String[] args) {
		ProgramTime begin=new ProgramTime();
		begin.myDate();
		begin.palindrome();
		begin.mathLearnTool();
	}
}