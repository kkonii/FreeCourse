package util;

public enum InputLimit {
    LENGTH(3), RANGE_MIN(1), RANGE_MAX(9);

    private final Integer value;
    private InputLimit(Integer value){
        this.value = value;
    }

    public Integer getValue(){
        return this.value;
    }

}
