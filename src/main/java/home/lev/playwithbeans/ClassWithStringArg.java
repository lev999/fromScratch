package home.lev.playwithbeans;

/**
 * Created by pc-users on 7/9/2015.
 */
public class ClassWithStringArg {
    private String first;
    private String second;
    private int number;

    public ClassWithStringArg(String first,String second, int number){
        this.first=first;
        this.second = second;
        this.number = number;
    }

    public String getFirst() {
        return first;
    }

    public int getNumber() {
        return number;
    }

    public String getSecond() {
        return second;
    }
}
