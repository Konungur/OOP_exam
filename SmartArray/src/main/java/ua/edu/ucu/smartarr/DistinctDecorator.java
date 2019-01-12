package ua.edu.ucu.smartarr;

import java.lang.reflect.Array;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator{


    public DistinctDecorator(SmartArray smartArray){
        super(smartArray);
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

    @Override
    public void setBaseArray(Object[] baseArray) {

    }
}
