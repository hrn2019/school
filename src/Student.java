//Student neye sahiptir? = kalem,kağıt,kitap
//Student ne yapar? = okur,yazar,ders,sınava girer,dersi dinler,
//fieldlar:name,last name,class,
//Student neyi bilir? = öğretmenin ona öğrettiği şeyi


import java.util.List;

public class Student {

    String firstName;

    String lastName;

    String room;

    long schoolNumber;

    List<String> learnedLessons;

    int presentDayNumber;


    public List<String> study(String lesson){
        learnedLessons.add(lesson);
        return learnedLessons;
    }

    public int goToSchool(){
        presentDayNumber = presentDayNumber + 1;
        return presentDayNumber;
    }

}