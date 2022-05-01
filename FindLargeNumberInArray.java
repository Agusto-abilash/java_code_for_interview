import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindLargeNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] Value = {1,3,7,18,21,25};
		int ArraySize = Value.length;
		//System.out.println(ArraySize);
		System.out.println(Value[0]+","+Value[1]+","+Value[2]+","+Value[3]+","+Value[4]+","+Value[5]);
		
		int [] Difference = new int[ArraySize-1];
		
		for (int i=0; i<ArraySize-1; i++) {
			Difference [i] = Value[i+1] - Value[i+0];
			//System.out.println(Difference[i]);			
			}
		Arrays.sort(Difference);      
		System.out.println(Difference[0]+","+Difference[1]+","+Difference[2]+","+Difference[3]+","+Difference[4]);
	    int FinalSize = Difference.length; 
		//System.out.println(FinalSize);
		System.out.println(Difference[FinalSize-1]);
		}
}


//List <Integer> arrayList = new ArrayList <Integer>();	
//List Convert = Arrays.asList(Value);	
//System.out.println(Convert);
//Integer list = IntStream.of(Difference).boxed().collect(Collectors.toList());
//List<Integer> list = Arrays.asList(Difference);    
//List Convert = Arrays.asList(Difference);	
		//Collections.sort(Convert);
		//System.out.println(Convert);
		//System.out.println(Convert.get(0));