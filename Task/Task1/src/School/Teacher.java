package School;

public class Teacher extends People implements TeachTo {
    public String subjectToTeach;

    public Teacher(String subjectToTeach, int age, String name) {//Создаем учителя сразу с готовыми данными
        this.setName(name);
        this.setAge(age);
        this.subjectToTeach = subjectToTeach;
    }

    public String getSubjectToTeach() {
        return subjectToTeach;
    }

    public void setSubjectToTeach(String subjectToTeach) {
        this.subjectToTeach = subjectToTeach;
    }

    @Override
    public void teach(Study study) {//Учитель проводит урок
        if (Manager.getIsStartFinish()) {//Если директор объявил о начале занятий, то урок будет идти
            study.setIq(study.getIq() + 10);//Увеличиваем образованность студентов
            System.out.println("IQ ученика выросто, теперь оно равно = " + study.getIq());
        } else {
            System.out.println("Занятия не идут, пусть директор объявит о начале занятий!");
        }
    }
}
