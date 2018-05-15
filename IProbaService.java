package com.boraji.tutorial.spring.service;

import com.boraji.tutorial.spring.model.Proba;
import com.boraji.tutorial.spring.model.Proba;

import java.util.List;

public interface IProbaService {
    long save(Proba proba);
    Proba get(String probaName);
    List<Proba> list();
    void update(int id, Proba proba);
    void deleter(int id);
}
