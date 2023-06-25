package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.IOException;
import java.util.List;
import java.io.FileWriter;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class FilmWriter {

        public void writeToFile(List<Film> films) {
            try (FileWriter writer = new FileWriter("films.csv")) {
                for (Film film : films) {
                    writer.write(film.toCSV() + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }




