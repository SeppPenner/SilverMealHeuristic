package silvermeal;

import java.util.HashMap;

public class SilverMeal {
    public double calculate(int startPeriod, int endPeriod, double preproductionCosts,
            double storageCostsPerPartAndPeriod, HashMap<Integer, Integer> demands){
        int n = endPeriod - startPeriod;
        checkPeriodsValid(n);
        double factory = 1/((double)n+1);
        double sum = preproductionCosts + getStorageCosts(startPeriod, n,
                storageCostsPerPartAndPeriod, demands);
        return factory * sum;
    }
    
    private double getStorageCosts(int startPeriod, int n, double storageCostsPerPartAndPeriod,
            HashMap<Integer, Integer> demands){
        double storageCosts = 0;
        for(int k = 0; k <= n; k++){
            storageCosts += k*storageCostsPerPartAndPeriod*demands.get(startPeriod + k);
        }
        return storageCosts;
    }
    
    private void checkPeriodsValid(int n){
        if(n<0){
            throw new IllegalArgumentException("n is less than 0");
        }
    }
}