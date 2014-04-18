package edu.berkeley.ischool.aep;

/**
 * Created by sonali on 3/13/14.
 */
public interface Bestable<T> {
    T better(T other);
}