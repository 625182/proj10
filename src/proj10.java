import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class proj10 {
    final private static String driverName = "oracle.jdbc.driver.OracleDriver";
    private static String url;
    final private static String server = "localhost";
    final private static String port = "1521";
    final private static String sid = "alamdvlp";
    final private static String username = "vasilev";
    final private static String password = "va86";
    private static Connection connection;
    private static boolean isConnected = false;

    private static boolean connect() {
        try {
            url = "jdbc:oracle:thin:@" + server + ":" + port + ":" + sid;
            System.out.println(url);
            Class.forName(driverName);
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("connecting: " + url);
            if(connection.equals(null))
                isConnected = false;
            else
                isConnected = true;
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
            isConnected = false;
        } catch (SQLException e) {
            System.out.println("SQLException\n" + e.getMessage());
            isConnected = false;
        }
        return isConnected;
    }

    public static void main(String[] args)
    {
        System.out.println("Starting work");
        // Person_P
        Person_P person = new Person_P();
        person.setFirstName("Павел");
        person.setLastName("Васильев");
        person.setGender(true);

        SimpleDateFormat birthday = new SimpleDateFormat("dd.MM.yyyy");
        String birthdayInString = "08.06.1984";
        Date birthdayInDate = new Date();
        try {
            birthdayInDate = birthday.parse(birthdayInString);
        }
        catch (java.text.ParseException e){
            System.out.println("Birthday parse error");
        }
        person.setBirthday(birthdayInDate);

        System.out.printf("ФИО: %s, дата рождения: %2$tm %2$te %2$tY, возраст: %3$d лет.%n", person.getFullName(), person.getBirthday(), 30);
        System.out.printf("%n");

        // Person_J
        Person_J person_j = new Person_J();
        person_j.setFirstName("Кукушка");
        person_j.setOrgFormShort("ООО");
        person_j.setOrgFormFull("Общество с ограниченной ответственностью");

        //System.out.printf("Наименование юридического лица: %s%n", person_j.getFullName());
/*
        Date tmp = new Date();
        SimpleDateFormat stmp = new SimpleDateFormat();
        System.out.println(tmp.toString());
        System.out.println(stmp.format(tmp));
*/
        String test0 = "s";
        String test1 = "one two;three four;five six;seven";
        String[] ar_test = test1.split(";");
        //ar_test[] = ar_test[];
        for (String s : ar_test) {
            if (s.indexOf(test0) > -1)
                System.out.println(s);
        }

/*
        if (connect())
            System.out.println("connected");
        else
            System.out.println("not connected");
*/
        System.out.println("Ending work");
    }
}
