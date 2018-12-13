package edu.wctc.eligrow.samplebigo;

public class Main {
    public static void main(String[] args) {

        String[] strings = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

        System.out.println(IsFirstElementNull(strings));

        System.out.println(ContainsValue(strings, "i"));

        System.out.println(ContainsDuplicates(strings));

        System.out.println(Fibonacci(6));


    }

    private static boolean IsFirstElementNull(String[] elements)
    {
        return elements[0] == null;
    }

    private static boolean ContainsValue(String[] elements, String value)
    {
        for (String element: elements)
        {
            if (element == value) return true;
        }

        return false;
    }

    private static boolean ContainsDuplicates(String[] elements)
    {
        for (var outer = 0; outer < elements.length; outer++)
        {
            for (var inner = 0; inner < elements.length; inner++)
            {
                // Don't compare with self
                if (outer == inner) continue;

                if (elements[outer] == elements[inner]) return true;
            }
        }

        return false;
    }

    private static int Fibonacci(int number)
    {
        if (number <= 1) return number;

        return Fibonacci(number - 2) + Fibonacci(number - 1);
    }
}
