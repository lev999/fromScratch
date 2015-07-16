package home.lev.playwithbeans;

/**
 * Created by pc-users on 7/9/2015.
 */
public class ClassSetterBased {
    private String name;
    private String address;

    private Bar bar;

    public Bar getBar() {
        return bar;
    }

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
