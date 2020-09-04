package bootcamp.processor;

import bootcamp.data.Summary;

import java.util.Arrays;

public class Processor {

    double[] ar;

    public Processor(double[] ar) {
        this.ar = ar;
    }

    private double findCount() {
        return ar.length;
    }

    private double findMin() {
        Arrays.sort(ar);
        return ar[0];
    }

    private double findMax() {
        Arrays.sort(ar);
        int maxIndex = (int) (findCount() - 1);
        return ar[maxIndex];
    }

    private double calculateSum() {
        double sum = 0;
        for (int i = 0; i < findCount(); i++) {
            sum += ar[i];
        }
        return sum;
    }

    private double calculateAverage() {
        return calculateSum() / findCount();
    }

    public Summary process() {
        Summary summary;
        
        if (ar.length > 0) {
        summary = new Summary(findMin(), findMax(), calculateSum(), findCount(), calculateAverage());
        } else {summary = new Summary(Double.NaN, Double.NaN, 0, 0, Double.NaN);}
        return summary;
    }

    public double getValue(int index) throws ArrayIndexOutOfBoundsException {
        if (index < findCount()) {
        double valueAtIndex = 9;
        return valueAtIndex;} else {
            throw new ArrayIndexOutOfBoundsException("No value at specified index");
        }
    }

}
