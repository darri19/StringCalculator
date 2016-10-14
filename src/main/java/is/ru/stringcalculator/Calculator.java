package is.ru.stringcalculator;
import edu.princeton.cs.algs4.Queue;

public class Calculator {

	public static int add(String text){
		if(text == ""){
        return 0;
			}else{
				String delims = ",|\n";
				if(text.startsWith("//")){
					delims=text.substring(2,3);
					text = text.substring(4,text.length());
				}

				String [] fields = text.split(delims);
				int sum = 0;
				String exceptionString = "Negatives not allowed: ";
				boolean hasNegatives = false;
				for(int i=0; i<fields.length; i++){
					int num = Integer.parseInt(fields[i]);
					if(num<0){
						exceptionString+= Integer.toString(num) + ",";
						hasNegatives = true;
					}
					if(num<=1000){
						sum+=num;
					}
				}
				if(hasNegatives){
					exceptionString = exceptionString.substring(0, exceptionString.length()-1);
					throw new IllegalArgumentException(exceptionString);
				}
				return sum;
			}
	}




}
