package home.lev.playwithbeans;

import java.beans.ConstructorProperties;

/**
 * Created by pc-users on 7/9/2015.
 */
public class ClassRefersNamesInBean {
    private String one;
    private String two;

    @ConstructorProperties({"one","two"})
    public ClassRefersNamesInBean(String one, String two) {
        this.one = one;
        this.two = two;
    }
}
