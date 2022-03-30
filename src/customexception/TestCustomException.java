package customexception;

public class TestCustomException {
public static void main(String[] args) {
	try {
		System.out.println(IsvalidWeight(40));
	}
	catch(WeightIsNotValidException e) {
		e.printStackTrace();
	}
}
static boolean IsvalidWeight(int weight ) throws WeightIsNotValidException {
	if (weight>=45)
		return true;
	else {
		throw new WeightIsNotValidException( "Weight Is Valid For Blood Donation");
	}
}
}
