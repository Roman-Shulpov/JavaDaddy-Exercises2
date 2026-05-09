package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic2_Exceptions.task3_FileNotFoundException;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileReaderDemo {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("/home/victor/IdeaProjects/JavaDaddy-Exercises2/src/main/java/mentorship/roadmap/Java_Core/step5_AdvancedBase/topic2_Exceptions/task3_FileNotFoundException/aaa.txt");
            System.out.println("Файл успешно открыт!");
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: Файл не найден! " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом: " + e.getMessage());
        }
    }
}