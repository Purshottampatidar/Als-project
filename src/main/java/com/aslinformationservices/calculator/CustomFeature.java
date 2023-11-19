package com.aslinformationservices.calculator;

public class CustomFeature {

    public double calculateMean(double... numbers) throws illegalArgumentException {
    	// TODO: Implement custom feature logic
        if(numbers.length==0){
           throw new IllegalArgumentException();
        }
        double mean=0;
        for(int i=0; i<numbers.length; i++){
            mean+=numbers[i];
        }
        return mean/numbers.length;
    }
}