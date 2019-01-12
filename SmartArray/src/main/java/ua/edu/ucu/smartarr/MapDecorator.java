package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator{

    public MapDecorator(SmartArray smartArray, MyFunction function) {
        super(smartArray);
        Object[] map_array = smartArray.toArray();
        for (int i = 0; i < smartArray.size(); i++) {
            map_array[i] = function.apply(map_array[i]);
        }
        smartArray = new BaseArray(map_array);
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
