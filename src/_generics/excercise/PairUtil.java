package _generics.excercise;


public class PairUtil {

  public static <S, T> Pair<S, T> swap(Pair<T, S> pair){
    return new Pair<S, T>(pair.getSecond(), pair.getFirst());
  }
  
  public static <T extends Measurable> Pair<T, T> minmax(T[] array){
    T min = null;
    T max = null;
    
    for(T elem : array){
      if(min == null) min = elem;
      else if(elem.getMeasure() < min.getMeasure()) min = elem;
      
      if(max == null) max = elem;
      else if(elem.getMeasure() > max.getMeasure()) max = elem;
    }
    
    return new Pair<T, T>(min, max);
  } 
}
