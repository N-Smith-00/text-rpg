package src.main.java;

import java.util.TreeMap;

import src.main.java.Person.Stat;

public class Job {
    private String name;
    private Stat primaryStat;
    // minimum stat to spec into the job
    private int minStat;
    // store abilities by stat level needed to unlock
    private TreeMap<Integer, Ability> abilities;
}
