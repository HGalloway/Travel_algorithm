import java.util.Scanner;
class main{
	public static void main(String[] args){
		//Init variables
		double tbgn,DF,NF,taxifare,busfare,trainfare;
		int K = 0;
		tbgn = 0.70;
		DF = 0.79;
		NF = 0.90;
		taxifare = 0.00;
		busfare = 0.00;
		trainfare = 0.00;
		//Create scanner class
		Scanner Scan = new Scanner(System.in);
		//Ask the user how far they are traveling and what time of the day
		System.out.print("How many kilometers do you want to travel? : ");
		K = Integer.parseInt(Scan.nextLine());
		System.out.println("Do you want to travel during the day or night? : ");
		String DON = Scan.nextLine();
		//Does the math for the taxi fare
		if(DON.contains("Night")){taxifare = K*NF+tbgn;}
		if(DON.contains("Day")){taxifare = K*DF+tbgn;}
		//If the distance is more than 20 kilometers then calculate the busfare
		if(K > 20){
			busfare = K*0.09;
			//Compares prices between bus and taxi
			}
			if(K > 100){
				trainfare = K*.06;
				if((taxifare < busfare) && (taxifare < trainfare)){
					System.out.println("Taxi is cheaper " + taxifare);}
				if((busfare < taxifare) && (busfare < trainfare)){
					System.out.println("Bus is cheaper " + busfare);}
				if((trainfare < taxifare) && (trainfare < busfare)){
					System.out.println("Train is cheaper " + trainfare);}}
		//If the travel is less than 100 but greater than 20, then compare prices between bus and taxi.
		if(K < 100 && K > 20){
			if(taxifare < busfare){
                                System.out.println("Taxi is cheaper " + taxifare);}
                        if(busfare < taxifare){
                        	System.out.println("Bus is cheaper " + busfare);}}
		//If travel is less than 20 then just print the taxi price.
		if(K < 20){System.out.println("Taxi is the only option " + taxifare);}
	}
}
