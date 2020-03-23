package School;

import java.security.PublicKey;

public class Study extends People implements BeTeaching {
    private int iq;
    public String subject;

    public Study(int iq, String subject, int age, String name) {//Конструктор, чтоб обязателдьно каждому ученику внесли имя уровень знаний и т.д.
        this.setName(name);
        this.setAge(age);
        this.iq = iq;
        this.subject = subject;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Study{" +
                "iq=" + iq +
                ", subject='" + subject + '\'' +
                '}';
    }

    @Override
    public void beTeach() {//Интерфейс, учит этого студента и увеличивает его знания
        if (Manager.getIsStartFinish()) {//Если занятие идет
            this.iq += 10;//Увеличиваем уровень знаний
            System.out.println("IQ ученика выросто, теперь оно равно = " + getIq());
        }System.out.println("Занятия не идут, пусть директор объявит о начале занятий!");
    }
}
