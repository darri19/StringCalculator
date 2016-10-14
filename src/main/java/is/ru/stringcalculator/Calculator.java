package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text == ""){
        return 0;
			}else if(text.contains(",")){
				String [] fields = text.split(",");
				int sum = 0;
				for(int i=0; i<fields.length; i++){
					sum+=Integer.parseInt(fields[i]);
				}
				return sum;
			}else{
				return Integer.parseInt(text);
			}
	}




}
