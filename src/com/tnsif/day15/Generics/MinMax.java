package com.tnsif.day15.Generics;

public interface MinMax<T extends Comparable<T>> {

	T min();

	T max();
}
