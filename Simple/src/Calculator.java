
public class Calculator{
public double  addition(double a,double b)
{
	return a+b;
}
public double  multiplication(double a,double b)
{
	return a*b;
}
public double  division(double a,double b)
{
	if(b==0) {
		throw new IllegalArgumentException("Denominator can not be Zero");
	}
	else {
		return a/b;
	}
}
}