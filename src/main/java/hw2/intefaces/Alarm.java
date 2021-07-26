package hw2.intefaces;

public interface Alarm {
    default String turnAlarmOn(){
        return "Alarm was turning on!";
    }

    default String turnAlarmOff(){
        return "Alarm was turning off!";
    }
}
