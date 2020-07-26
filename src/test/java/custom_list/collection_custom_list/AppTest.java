package custom_list.collection_custom_list;



public class AppTest
{
    public static void main(String[] args) 
    {
    	CustomArrayList<Integer> list = new CustomArrayList<>();
 
        //Add elements
        list.add(1);
        list.add(2);
        list.add(3);
        for(int i = 0;i<list.getSize();i++)
        {
        	System.out.println(list.get(i)+" ");
        }
         
        //Remove elements from index
        list.remove(2);
        System.out.println("After Deletion: ");
        for(int i = 0;i<list.getSize();i++)
        {
        	System.out.println(list.get(i)+" ");
        }
         
        //Get element with index
        System.out.println("Checking random access: ");
        System.out.println( list.get(0) );
        System.out.println( list.get(1) );
 
        //List Size
        System.out.println("Size:" +list.getSize());
        
        /*
         *Run one at a time
         *System.out.println("Checkin for exceptions: ");
         *CustomArrayList<Integer> list = new CustomArrayList<>(-3);
         *System.out.println( list.get(10) );
         *System.out.println( list.get(-1) );
         *list.remove(-1);
		*/
    }
}

