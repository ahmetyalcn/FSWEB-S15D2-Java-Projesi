package com.workintech.sets.main;

import com.workintech.sets.entity.Priority;
import com.workintech.sets.entity.Status;
import com.workintech.sets.entity.Task;
import com.workintech.sets.entity.TaskData;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Task task1 = new Task("proje-bir", "description1", "ann", Priority.HIGH, Status.IN_QUEUE);
        Task task2 = new Task("proje-iki", "description2", "bob", Priority.MED, Status.ASSIGNED);
        Task task3 = new Task("proje-üç", "description3", "carol", Priority.LOW, Status.IN_PROGRESS);
        Task task4 = new Task("proje-dört", "description4", "bob", Priority.HIGH, Status.IN_QUEUE);
        Task task5 = new Task("proje-beş", "description5", "ann", Priority.HIGH, Status.IN_QUEUE);
        Task task6 = new Task("proje-altı", "description6", "", Priority.MED, Status.IN_QUEUE);
        Task task7 = new Task("proje-yedi", "description5", "ann", Priority.MED, Status.IN_QUEUE);

        Set<Task> totalTasks = new HashSet<>();
        totalTasks.add(task1);
        totalTasks.add(task2);
        totalTasks.add(task3);
        totalTasks.add(task4);
        totalTasks.add(task5);
        totalTasks.add(task6);

        Set<Task> annTasks = new LinkedHashSet<>();
        annTasks.add(task1);
        annTasks.add(task5);

        Set<Task> bobsTasks = new LinkedHashSet<>();
        bobsTasks.add(task2);
        bobsTasks.add(task4);


        Set<Task> carolsTasks = new LinkedHashSet<>();
        carolsTasks.add(task3);
        carolsTasks.add(task7);

        TaskData taskData = new TaskData(annTasks, bobsTasks, carolsTasks);

        System.out.println(taskData.getTasks("all"));
        System.out.println(taskData.getTasks("ann"));


        System.out.println(taskData.getDifference(totalTasks, taskData.getTasks("all")));

        System.out.println("ann+carol" + taskData.getIntersect(annTasks, carolsTasks));

    }
    }
