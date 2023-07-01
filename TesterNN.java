import java.util.Arrays;

public class TesterNN {
	public static void main(String[] args) {
		
		/*double [][] input = {{1,2,3},{4,5,6}};
		double [][] weights = {{2,2,2},{2,2,2}};
		double [] bias = {1,1};
		
		double[] test = LinAlgebra.pairWiseMult(input, weights, bias);
		System.out.println(Arrays.toString(test));*/
		
		double [] X= {1,2,3,4,5};
		double [] weights = {2,2,2,2,2};
		double bias = 1;
		double test = LinAlgebra.oneDimMult(X, weights, bias);
		System.out.println(test);
		

	}
}
