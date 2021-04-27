package com.company.demo;

import java.util.ArrayList;

public class TaskScheduler {
    public void scheduleTask(ArrayList<Task> tasks)
    {
       sortByStartTime(tasks);

        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            for (int j = i+1; j < tasks.size(); j++) {
                Task task1 = tasks.get(j);
                if (task.getEndTime() < task1.getStartTime())
                {
                    tasks.remove(task);
                }
            }

        }

        System.out.println("Number of workers needed "+ tasks.size());

    }

    public void sortByStartTime(ArrayList<Task> tasks)
    {
        tasks.sort((s,t)->s.getStartTime()-t.getStartTime());
       // System.out.println(Arrays.toString(tasks.toArray()));
    }





}

class Task{
    private int startTime;
    private int endTime;

    public Task(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Task{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}