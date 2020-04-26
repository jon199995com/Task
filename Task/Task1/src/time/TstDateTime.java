package time;

public class TstDateTime {
    public static void main(String[] args) {
        // DateTime API - работа с датой и времеем java 8
        // Классы для работы с датой и временем находятся в пакете java.time:
        // LocalDate –  дата без времени и временных зон;
        // LocalTime – время без даты и временных зон;
        // LocalDateTime – дата и время без временных зон;
        // ZonedDateTime – дата и время с временной зоной;
        // DateTimeFormatter – форматирует даты в строки и наоборот, только для классов java.time;
        // Instant – колличество секунд с Unix epoch time (полночь 1 января 1970);
        // Duration – продолжительность в секундах и наносекундах;
        // Period – период времени в годах, месяцах и днях;
        // TemporalAdjuster – корректировщик дат (к примеру, может получить дату следующего понедельника);

        // Использование классов LocalDate, LocalTime и LocalDateTime очень схожи!

        // работа с датой LocalDate (примеры):
        DateExample.getLocalDateDescription();

        // работа со временем LocalTime (примеры):
//        TimeExample.getLocalTimeDescription(); // TODO: раскомментируйте для вызова

        // работа с датой и временем LocalDateTime (примеры):
//        DateTimeExample.getLocalDateTimeDescription(); // TODO: раскомментируйте для вызова

        // работа с временными зонами ZonedDateTime (примеры):
//        ZonedDateTimeExample.getZonedDescription(); // TODO: раскомментируйте для вызова

    }
}