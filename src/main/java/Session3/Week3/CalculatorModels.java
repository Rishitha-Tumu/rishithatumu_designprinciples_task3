package Session3.Week3;

import javax.swing.JButton;
import javax.swing.JTextField;

public class CalculatorModels 
{
	private int sum;
	private int number;
	private char opt;
 
	public CalculatorModels()
	{
		sum = 0;
		number = 0;
	}
 
	public void set(JButton idenifier, JTextField number)
	{
		opt = idenifier.getText().charAt(0);
		this.number = Integer.parseInt(number.getText());
 
		calculate(opt);
	}
 
	public void setNumber(int number)
	{
		this.number = number;
	}
 
	public int getSum() 
	{
		return sum;
	}
 
	private void setSum(int sum) 
	{
		this.sum = sum;
	}
 
	void calculate(char sign)
	{
		switch(sign)
		{
			case '+':
				sum += number; 
				setSum(sum);
				break;
			case '-':
				sum -= number;
				setSum(sum);
				break;
	 
			case '/':
				sum/= number;
				setSum(sum);
				break;
	 
			case '*':
				sum *= number;
				setSum(sum);
				break;
	 
			case '=':
				setSum(sum);
				break;
				
			case 'C':
				opt = 0;
				number = 0;
				sum = 0;
				setSum(sum);
				break;
				
			default: 
		}
	}
}
