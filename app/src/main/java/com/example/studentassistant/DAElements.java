package com.example.studentassistant;

import java.util.ArrayList;

public class DAElements {

    private final ArrayList<Elements> elements = new ArrayList<>();

    public DAElements() {
        elements.add(new Elements("1", "Hydrogen", "H", "Hydrogen is the lightest element. At standard conditions hydrogen is a gas of diatomic molecules having the formula H 2. It is colorless, odorless, tasteless, non-toxic, and highly combustible"));
        elements.add(new Elements("2", "Helium", "He", "Hydrogen is the lightest element. At standard conditions hydrogen is a gas of diatomic molecules having the formula H 2. It is colorless, odorless, tasteless, non-toxic, and highly combustible"));
        elements.add(new Elements("3", "Lithium", "Li", "It is a soft, silvery-white alkali metal. Under standard conditions, it is the least dense metal and the least dense solid element"));
        elements.add(new Elements("4", "Beryllium", "Be", "Beryllium is a silvery-white metal. It is relatively soft and has a low density. Uses. Beryllium is used in alloys with copper or nickel to make gyroscopes, springs, electrical contacts, spot-welding electrodes and non-sparking tools"));
        elements.add(new Elements("5", "Boron", "B", "Boron is a trace element that is naturally present in many foods and available as a dietary supplement. It is a structural component of plant cell walls and is required for plant growth, pollination, and seed formation"));
        elements.add(new Elements("6", "Carbon", "C", "nonmetallic chemical element in Group 14 (IVa) of the periodic table. Although widely distributed in nature, carbon is not particularly plentiful—it makes up only about 0.025 percent of Earth's crust—yet it forms more compounds than all the other elements combined"));
    }

    public ArrayList<Elements> getElements() {
        return elements;
    }

    public Elements getElement(String name) {
        for(Elements e : elements) {
            if(e.getName().equals(name)) {
                return e;
            }
        }

        return null;
    }

    public ArrayList<String> getElementsName() {
        ArrayList<String> names = new ArrayList<>();

        for(Elements e : elements) {
            names.add(e.getName());
        }

        return names;
    }

}
