package org.example;

import java.util.ArrayList;
import java.util.List;

public class MyRestService {
    List<Cat> catList = new ArrayList<Cat>();

    public MyRestService() {
        catList.add(new Cat("Kicia","dachowiec"));
        catList.add(new Cat("Karl","dachowiec"));
        catList.add(new Cat("Carlos","dachowiec"));
    }
    public List<Cat> getCatList() {
        return catList;
    }

    public Cat getCatById(int id) {
        if(catList.size()>id && id>=0) {
            return catList.get(id);
        }
        return null;
    }
    public void addCat(Cat cat) {
        this.catList.add(cat);
    }

    public void deleteCat(String name) {
        this.catList.removeIf(cat->cat.getName().equals(name));
    }

    public void updateCat(int id,Cat updatedcat) {
        Cat cat=getCatById(id);
        if(cat!=null){
            cat.setName(updatedcat.getName());
            cat.setBreed(updatedcat.getBreed());
        }
    }
}
