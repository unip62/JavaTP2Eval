package com.persistence.uow;

/**
 * Created by baptiste on 20/11/16.
 * Hi
 */
public interface Observable {
    void add(Observateur o);
    void notifier();
}
