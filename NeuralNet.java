//Building this class presupposing the logit activation function (sigmoid). 
public class NeuralNet {
	
	//at a later date, will add option to change the activation function.
	//int neurons denotes number of neurons at a hidden layer.
	//int layer denotes number of layers, where a layer refers to a set of neurons. 
	public void fit (double[][] X, double[] y, int neurons, int layers)
	{
		//2d array recording inputs for each layer 
		double [][] inputs = new double[layers][neurons];
		//iterate for each (X,y) pair 
		for (int row = 0; row < X.length; row++)
		{
			//3d array recording weights for the X,y pair. 
			double[][][] weights = new double[layers][neurons][neurons];
			//propogate values forward through each layer.
			for (int lay = 0; lay < layers; lay++)
			{
				//iterate for each neuron at a specific layer
				for (int neur = 0; neur < neurons; neur++)
				{
					//handle a case for the first layer with the intial inputs.
					if(lay ==0)
					{
						inputs[lay][neur] = X[lay][neur];
					}
					else
					{
						double [] rand = randWeights(neurons);
						weights[lay][neur] = rand;//left off here. Need to figure out the weights. 
						double val = 0;
						double bias = Math.random();
						val = LinAlgebra.oneDimMult(inputs[lay -1], rand, bias);
						inputs[lay][neur] = logit(val);
					}
				}
			}
			//ok, pick up here next time. It looks like you did the forward propogation.
			//Next need to do backwards prop to fit. Might be nice to do these as separate methods rather than get
			//all this code slapped out there.
			
			
		}
	}
	
	//several things to pick up on next time. One, figure out a way to define an arbitrary number of weights
	//for an arbitrary number of layers. Next is doing gradient descent and back propogation. I'll think you'll need to make two methods.
	//One where you can do arbitrary weights; another where you manually put in the weights so you can test it against python and 
	//see if it works. I think you might also just need to make an accuracy chart for this one.
	
	//use logistic (sigmoid) activation function
	public double logit(double x)
	{
		return 1 / (1 + (1 / (Math.exp(x))));
	}
	
	//define derivative of activation function
	public double derLogit(double x)
	{
		return (logit(x)) * (1 - logit(x));
	}
	
	//generate a random matrix of weights.
	public double [] randWeights(int size)
	{
		double [] weights = new double[size];
		for (int i = 0; i < size; i++)
		{
			weights[i] = Math.random();
		}
		return weights;	
	}
	
}


/*//num of weights in network
			int num = X[0].length * neurons * layers;
			//2d array where rows denote layer and columns denote weights at that layer 
			// associated with input value
			double [][] weights = new double[layers][X[0].length];
			//generate random matrix of weights.
			for (int wrow = 0; wrow < weights.length; wrow++)
			{
				for (int wcol = 0; wcol < weights[0].length; wcol++)
				{
					//note that the weights will be between 0 and 1. Can change the range at a later 
					// date. 
					weights[wrow][wcol] = Math.random();
				}
			}*/
