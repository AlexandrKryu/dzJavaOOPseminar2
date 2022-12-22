package app;
import java.util.ArrayList;
import java.util.List;

import model.Human;

public class Main {

    public static void main(String[] args) {
        Human mainParent = new Human("Mian");
        List<Human> children = new ArrayList<Human>();
        children.add(new Human("Dad"));
        children.add(new Human("Mom"));

        mainParent.AddMoreChildren(children);
        Human tmpParent = mainParent.GetChild(1);
        tmpParent.AddOneChild(new Human("Son"));

        System.out.println(mainParent.GetAllChildren(mainParent));
    }
}