package ru.yandex.practicum.gym;

import java.util.*;

public class Timetable {

    private /* как это хранить??? */ timetable;

    public void addNewTrainingSession(TrainingSession trainingSession) {
        //сохраняем занятие в расписании
        DayOfWeek dayOfWeek = trainingSession.getDayOfWeek();
        TimeOfDay timeOfDay = trainingSession.getTimeOfDay();

        TreeMap<TimeOfDay, List<TrainingSession>> dayListTreeMap = timetable.get(dayOfWeek);
        if (dayListTreeMap == null) {
            dayListTreeMap = new TreeMap<>();
            timetable.put(dayOfWeek, dayListTreeMap);
        }

        List<TrainingSession> trainingSessionList = dayListTreeMap.get(timeOfDay);
        if (trainingSessionList == null) {
            trainingSessionList = new ArrayList<>();
            dayListTreeMap.put(timeOfDay, trainingSessionList);
        }

        trainingSessionList.add(trainingSession);
    }

    public /* непонятно, что возвращать */ getTrainingSessionsForDay(DayOfWeek dayOfWeek) {
        //как реализовать, тоже непонятно, но сложность должна быть О(1)
    }

    public /* непонятно, что возвращать */ getTrainingSessionsForDayAndTime(DayOfWeek dayOfWeek, TimeOfDay timeOfDay) {
        //как реализовать, тоже непонятно, но сложность должна быть О(1)
    }
}
