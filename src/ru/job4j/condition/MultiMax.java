package ru.job4j.condition;

public class MultiMax {
    @SuppressWarnings("checkstyle:NeedBraces")
    public static int max(int first, int second, int third) {
        if(first == second && second == third)
            return first;
        if (first > second)
            {
                if (first > third)
                    return first;
                else
                  {
                    return third;
                  }
            }
        else
            {
             if(second > third)
                return second;
             else
               {
                return third;
               }
            }
    }
}
