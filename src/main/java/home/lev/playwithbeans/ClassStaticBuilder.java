package home.lev.playwithbeans;


public class ClassStaticBuilder {
    private String one;
    private ClassStaticBuilder(String one) {
        this.one=one;
    }

    public static ClassStaticBuilder createMe(String one){
        return new ClassStaticBuilder(one);
    }
}
