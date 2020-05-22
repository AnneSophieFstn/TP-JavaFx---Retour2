package org.sio2.model;

import javafx.beans.Observable;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.util.Callback;

import java.util.Objects;

public class Person
{

    //StringProperty = Classe de base abstraite pour toute propriété de type chaîne de modifiable.
    //SimpleStringProperty = C'est l'implémentation concrète.

    //StringProperty sera afficher dans l'API qu'on met à disposition des utilisateurs.
    //SimpleStringProperty est utiliser comme classe contrète d'implémentation dans le code.


    private final StringProperty prenom = new SimpleStringProperty( this, "");
    private final StringProperty nom = new SimpleStringProperty(this, "");
    private final StringProperty notes = new SimpleStringProperty(this, "");

    public Person(String prenom, String nom, String notes)
    {
        this.prenom.set(prenom);
        this.nom.set(nom);
        this.notes.set(notes);
    }

    public String getPrenom() {
        return prenom.get();
    }

    public StringProperty prenomProperty() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom.set(prenom);
    }

    public String getNom() {
        return nom.get();
    }

    public StringProperty nomProperty() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom.set(nom);
    }

    public String getNotes() {
        return notes.get();
    }

    public StringProperty notesProperty() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes.set(notes);
    }

    @Override
    public String toString() {
        return "Person{" +
                "prenom=" + prenom +
                ", nom=" + nom +
                ", notes=" + notes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return prenom.equals(person.prenom) &&
                nom.equals(person.nom) &&
                notes.equals(person.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prenom, nom, notes);
    }


    //Extrait, pour affecter dans une liste des elmts à observer(personList)
    // Une liste de personnes qui correspondra à la def d'une personne telle que précisée..
    //.. dans la table 'Person' et limitée au nom et prenom.
    public static Callback<Person, Observable[]> extractor = person -> new Observable[]
    {
            person.nomProperty(), person.prenomProperty()
    };

}
