Task1
 Class {@code Florist} contains a method which calculates
  a price of flowers based on the regular price and
  the given month according to the following table:
  <pre>
  | Month    | Price modifier |
  |:-------- |:-------------- |
  | January  | base *  50%    |
  | February | base * 200%    |
  | March    | base * 150%    |
  | May      | base * 200%    |
  | June     | base * 200%    |
  | October  | base *  50%    |
  | November | base * 300%    |
  | Other    | base           |
  </pre>
  <br>
  Introduce changes to the {@code Month} enum to reflect
  the price modifiers in the table above.
 
 Task2
  Implement a class {@code Season} so that it replicates
  the behavior of the one generated by the compiler
  for the following Java code:
  <pre>
  enum Season {
      SPRING, SUMMER, AUTUMN, WINTER
  }
  </pre>
  <p>
  Recreate the functionality of the methods:
   </p>
   <pre> 
   public String name()
   public int ordinal()
   public String toString()
   public Season[] values()
   public static Season valueOf(String name)
   public int compareTo(Season other)
   </pre>
   Try to make the class as similar to enum as you can.
 