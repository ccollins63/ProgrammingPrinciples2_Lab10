package Exercise3;

public class MaximumElement
{
    public static void main(String[] args)
    {

        Integer[][] list = new Integer[10][10];
        int value = 0;
        for (int i = 0; i < list.length; i++)
        {
            for (int j = 0; j < list[i].length; j++)
            {
                list[i][j] = value++;
            }
        }

        System.out.println("Max = " + max(list));
    }

    public static <E extends Comparable<E>> E max(E[][] list)
    {

        E max = list[0][0];
        for (E[] elements : list)
        {
            for (E element : elements)
            {
                if (element.compareTo(max) > 0)
                {
                    max = element;
                }
            }
        }

        return max;
    }
}
