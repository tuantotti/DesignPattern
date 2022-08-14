package test;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        RandomXS128 generator = new RandomXS128(System.currentTimeMillis());
        double totalProbability = (1D / 7D) + (1D / 7D) + (1D / 7D) + (1D / 7D) + (1D / 7D) + (1D / 7D) + (1D / 7D);
        double random = generator.nextDouble() * totalProbability;
        System.out.println(random);
        Map<Integer, Double> integerDoubleMap = new HashMap<>();
        for (int i = 1; i <= 7; i++) {
            integerDoubleMap.put(i, 1D / 7D);
        }
//        for (Integer key : integerDoubleMap.keySet()) {
//            random -= integerDoubleMap.get(key);
//            if (random < 0D) {
//                return;
//            }
//        }
        double b = (1D / 7D);
    }
}
