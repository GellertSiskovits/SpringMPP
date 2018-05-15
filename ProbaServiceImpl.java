package com.boraji.tutorial.spring.service;


import com.boraji.tutorial.spring.dao.IProbaDao;
import com.boraji.tutorial.spring.model.Proba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional(readOnly = true)
public class ProbaServiceImpl implements IProbaService{
    @Autowired
    private IProbaDao probaDao;

    @Transactional
    @Override
    public long save(Proba proba) {
        return probaDao.save(proba);
    }

    @Override
    public Proba get(String probaName) {
        return probaDao.get(probaName);
    }

    @Override
    public List<Proba> list() {
        return probaDao.list();
    }

    @Override
    public void update(int id, Proba proba) {
        probaDao.update(id,proba);
    }

    @Override
    public void deleter(int id) {
        probaDao.deleter(id);
    }
}
