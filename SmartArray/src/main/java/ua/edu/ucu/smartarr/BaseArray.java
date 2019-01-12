package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray{

    private Object[] array = {};

    public BaseArray(Object[] main_array)
    {
        array = main_array;
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