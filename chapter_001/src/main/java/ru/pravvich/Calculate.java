packege ru.pravvich;
/**
 * Implements calculator. Supports repeated using previous calculation.
*/
public class Calculate {

	public static void main(String[] args) {
	double result;
	
	}
	

        /**
        *  The addition operations.
	*/ @param first - first argument, second - second argument

	public void add(double first, double second) {
	this.resoult = first + second;
	
	}


        /**
        *  Substraction operation.
	*/ @param first - first argument, second - second argument

	public void substract(double first, double second) {
	this.resoult = first - second;
	
	}


        /**
        *  Division operation.
	*/ @param first - first argument, second - second argument

	public void mult(double first, double second) {
	this.resoult = first * second;
	
	}


        /**
        *  Division operation.
	*/ @param first - first argument, second - second argument

	public void div(double first, double second) {
	
	if (second != 0) {
	this.resoult = first / second;
	} else {
		System.out.println("Делить на ноль нельз¤!");
	}
	
	}

//The and...

}



