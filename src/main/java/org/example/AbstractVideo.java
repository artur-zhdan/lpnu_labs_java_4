package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@ToString(of = {"title", "director", "year"})
public abstract class AbstractVideo extends Film {
    protected String title;
    protected String director;
    protected int year;

    public abstract double getCurrentRating();

    @Override
    public String toString() {
        return "Title: " + title + "\nDirector: " + director + "\nYear: " + year;
    }
}



