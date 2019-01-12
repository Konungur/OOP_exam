package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;
import ua.edu.ucu.functions.MyPredicate;

import java.util.Arrays;
import java.lang.reflect.Array;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {

    public SortDecorator(SmartArray smartArray, MyComparator comparator) {
        super(smartArray);
        Object [] Array = smartArray.toArray();
        Arrays.sort(Array, comparator);
    }

    @Override
    public void setBaseArray(Object[] baseArray) {
        this.smartArray.setBaseArray(baseArray);
    }


    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public String operationDescription() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
