package Session3.Week3;

public class Calculators 
{
	public static void main(String[] args) 
	{
		CalculatorModels model = new CalculatorModels();
		CalculatorViews view = new CalculatorViews();
		new CalculatorControllers(model,view);
	}
}
