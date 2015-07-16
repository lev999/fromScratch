package home.lev.playwithbeans;

import java.util.List;
import java.util.Map;

/**
 * Created by pc-users on 7/12/2015.
 */

public class ExampleWithList {
    public List<String> myList;
    public Map<String,Integer> myint;

    public Map<String, Integer> getMyint() {
        return myint;
    }

    public void setMyint(Map<String, Integer> myint) {
        this.myint = myint;
    }

    public List<String> getMyList() {
        return myList;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }
}

