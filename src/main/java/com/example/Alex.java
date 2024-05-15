package com.example;
import java.util.ArrayList;
public class Alex extends Lion {
    public Alex(Feline faline) throws Exception {
        super("Самец",faline);
    }
    public ArrayList<String > getFriends(){
        ArrayList<String> friends = new ArrayList<String>();
        friends.add("zebra Marty");
        friends.add("hippopotamus Glory");
        friends.add("giraffe Melman");
     return friends;
    }
    public String getPlaceOfLiving(){
        return "New York zoo";
    }
    @Override
    public int getKittens(){
    return 0;
    }
}
