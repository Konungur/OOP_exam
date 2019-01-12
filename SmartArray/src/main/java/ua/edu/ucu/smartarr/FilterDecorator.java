package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {

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

    private Object[] filter_arr;

    public int hf(SmartArray var1, MyPredicate var2) {
        int i = 0;
        for (Object element : var1.toArray()){
            if(var2.test(element)){
                i = i + 1; }
        }
        return i;
    }


    public FilterDecorator(SmartArray var1, MyPredicate var2){
        super(var1);
        filter_arr = new Object[hf(var1, var2)];
        //array
        int j = 0;
        for (Object element : var1.toArray()){
            if(var2.test(element)){
                filter_arr[j++] = element;
            }
        }
        smartArray = new BaseArray(filter_arr);
    }

}
