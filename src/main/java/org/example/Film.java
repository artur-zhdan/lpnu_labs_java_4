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
@ToString (of = {"title", "director", "year", "rating", "marks"})
public class Film extends VideoManager {
    private String title;
    private String director;
    private int year;
    private int rating;
    private int marks;

    public double getCurrentRating() {
        if (marks == 0) {
            return 0;
        }
        return (double) rating / marks;
    }
    public String toCSV() {
        return title;

    }
    public String getHeaders() {
        return "title";
    }

}