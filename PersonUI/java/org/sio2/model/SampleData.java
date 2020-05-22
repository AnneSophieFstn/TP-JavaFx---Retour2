package org.sio2.model;

import javafx.collections.ObservableList;

public class SampleData
{
    public static void fillSampleData(ObservableList<Person> backingList)
    {
        backingList.add(new Person("Kobe", "Bryant", "Première note"));
        backingList.add(new Person("James", "Lebron", "Deuxième note"));
        backingList.add(new Person("Michael", "Jordan", "Troisième note"));
        backingList.add(new Person("Kyrie", "Irving", "Quatrième note"));
        backingList.add(new Person("Devin", "Booker", "Cinquième note"));
        backingList.add(new Person("Derrick", "Rose", "Sixième note"));
        backingList.add(new Person("Celine", "Dumerc", "Septième note"));
        backingList.add(new Person("Olivia", "Epoupa", "Huitième note"));
        backingList.add(new Person("Marine", "Joanes", "Neuvième note"));
        backingList.add(new Person("Sandrine", "Gruda", "Dixième note"));
    }
}

