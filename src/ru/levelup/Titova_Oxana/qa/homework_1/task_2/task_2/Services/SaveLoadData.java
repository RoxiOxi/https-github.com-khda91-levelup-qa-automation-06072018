package ru.levelup.Titova_Oxana.qa.homework_1.task_2.task_2.Services;

import java.io.FileNotFoundException;

public interface SaveLoadData { //2 метода

    void saveData(String path);
    void loadData(String path) throws FileNotFoundException;


}
