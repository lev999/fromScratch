package home.lev;


public class ClassStaticBuilder {
    private String one;
    private ClassStaticBuilder(String one) {
        this.one=one;
    }

    public static ClassStaticBuilder createMe(String one){
        return new ClassStaticBuilder(one);
    }
}
