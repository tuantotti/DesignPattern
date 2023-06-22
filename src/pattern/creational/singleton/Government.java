package pattern.creational.singleton;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Government {
    private String name;
    private Date birthday;

    private static Government instance;

    private Government() {
    }

    private Government(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public static Government getInstance() {
        if (instance == null) {
            instance = new Government();
        }

        return instance;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat
                = new SimpleDateFormat("MM/dd/yyyy");
        return "Government{" +
                "name='" + name + '\'' +
                ", birthday=" + dateFormat.format(birthday) +
                '}';
    }
}
