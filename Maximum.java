package maximum;
public class Maximum 
{
//    public static int maxima(int [] array)
//    {
//        int m = 0;
//        int i=1;
//        while ( i < array.length)
//        {
//            if (array[i] > array[m])
//            {
//                m = i;
//            } 
//            i++;
//        }
//        return m;
//    }
//    public static int maximum(int [] array)
//    {
//        int temmaximum = array[0];
//        int i=1;
//        while ( i < array.length)
//        {
//            if (array[i] > temmaximum)
//               temmaximum = array[i];
//            i++;
//        }
//         
//        return temmaximum;
//    }
//    // test driver
//    public static int minima(int [] array)
//    {
//        int m = 0;
//        int i=1;
//        while ( i < array.length)
//        {
//            if (array[i] < array[m])
//            {
//                m = i;
//            } 
//            i++;
//        }
//        return m ;
//    }
//    public static int minimum(int [] array)
//    {
//        int temmaximum = array[0];
//        int i=1;
//        while ( i < array.length)
//        {
//            if (array[i] < temmaximum)
//               temmaximum = array[i];
//            i++;
//        }
//         
//        return temmaximum;
//    }
    static int count = 0;
    static boolean compare(int x, int y)
    {   
        count++;
        return x > y;
    }
    static int stringcompre(String x, String y) 
    {
        count++;
        return x.compareTo(y); // compareTo already provides the desired functionality.
    }
    public static int [] extremal(int [] array)
    {
        if (array.length == 0)
        {return null;}
        else
        {
            int max = array[0];
            int min = array[0];
            for(int i =1;i<array.length;i++)
            {
                if(compare(array[i], max))
                {
                    max = array[i];
                }
                else if(!compare(array[i], min))
                {
                    min = array[i];
                }
            }
            return new int[]{min, max};
            
        }
    }
    
    static String[] extremal(String[] names) {
    if (names == null || names.length == 0) {
        return new String[0]; // Return an empty array if input is null or empty.
    }

    String smallest = names[0];
    String largest = names[0];

    for (String name : names) {
        if (stringcompre(name, smallest) < 0) {
            smallest = name; // name is smaller than smallest.
        }
        if (stringcompre(name, largest) > 0) {
            largest = name; // name is larger than largest.
        }
    }

    return new String[]{smallest, largest}; // Return an array containing the smallest and largest strings.
}

    
    public static void main(String[] args) 
    {
       int [] arr = new int[]{342,34,233,456};
       int[] extrema = extremal(arr);
       System.out.println("Minimum: " + extrema[0] + ", Maximum: " + extrema[1]);
       System.out.println("count:" + count);
       String [] twoends = extremal(new String[]{"Zhang", "Li", "Chao","1",
"%", "*", "@"});
System.out.println("min=" + twoends[0] + ", and max=" + twoends[1]
+ ", #comparisons=" + count);
//       System.out.println(maximum(arr));
//       System.out.println(maxima(arr));
//       System.out.println(minima(arr));
//       System.out.println(minimum(arr));
    }
}