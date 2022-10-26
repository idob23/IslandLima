package com.javarush.island.dobrov;

import com.javarush.island.dobrov.Field.Field;

import com.javarush.island.dobrov.services.MainWorker;

public class Runner {


    public static void main(String[] args) {

        Field field = new Field();
       MainWorker worker = new MainWorker(field);
        worker.go();

    }
}