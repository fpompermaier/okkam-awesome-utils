package org.okkam.awesome.utils;

import java.util.Comparator;

public class ComparatorUtils {

  private ComparatorUtils() {
    throw new IllegalStateException("Utility class");
  }

  /**
   * Comparator to sort ascending (or alphabetically for strings).
   * 
   * @return The comparator
   */
  public static <T extends Comparable<T>> Comparator<T> sortAscending() {
    return (T i1, T i2) -> i1.compareTo(i2);
  }

  /**
   * Comparator to sort descending (or reverse alphabetically for strings).
   * 
   * @return The comparator
   */
  public static <T extends Comparable<T>> Comparator<T> sortDescending() {
    return (T i1, T i2) -> i2.compareTo(i1);
  }

}