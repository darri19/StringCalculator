package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text == ""){
        return 0;
			}else if(text.contains(",")){
				String [] fields = text.split(",");
				return Integer.parseInt(fields[0])+Integer.parseInt(fields[1]);
			}else{
				return Integer.parseInt(text);
			}
	}




}
