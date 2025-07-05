package main.java;

import java.util.ArrayList;
import java.util.List;

/** Incomplete Task Scheduler
        Context:
        You’re building a system to schedule background tasks (like sending reports, syncing data).
        Tasks:
        Fix the bug: scheduler should run tasks on scheduled time .
        Add support for recurring tasks. **/

class Task {
    public String name;
    public long executionTime;

    public Task(String name, long delayInMillis) {
        this.name = name;
        this.executionTime = System.currentTimeMillis() + delayInMillis;
    }
}

public class TaskScheduler {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void runScheduler() {
        for (Task task : tasks) {
            if (System.currentTimeMillis() >= task.executionTime) {
                System.out.println("Running task: " + task.name);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTask(new Task("task1", 2000));
        scheduler.runScheduler(); // doesn't wait
    }
}

