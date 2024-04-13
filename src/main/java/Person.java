package src.main.java;

import java.util.ArrayList;
import java.util.TreeMap;

public class Person {
    private String name;

    // Stats
    enum Stat {
        STRENGTH, DEXTERITY, INTELEGENCE, CONSTITUTION, WISDOM, CHARISMA
    }
    TreeMap<Stat, Integer> stats;

    private int health;
    private int level;
    private int weightLimit;
    
    private TreeMap<String, Job> jobs;
    private ArrayList<Item> inventory;
    private ArrayList<Effect> effects;

    public Person(String name){
        this.name = name;
        // initialize stat map (values initialized in race subclasses)
        this.stats = new TreeMap<Stat, Integer>();
        this.health = 100;
        this.level = 1;
        this.weightLimit = 20;
        this.jobs = new TreeMap<String, Job>();
        this.inventory = new ArrayList<Item>();
        this.effects = new ArrayList<Effect>();
    }

}
