import java.util.ArrayList;

public class test{
            public static int aMethod(int i) throws Exception   {
                try{
                    return i/10;
                }catch(Exception ex){
                    throw new Exception ("exception in a aMothod");
                }finally{
                    System.out.print("finally");
                }
            }

            public static void main(String [] args){
                try{
                    aMethod(0);
                }catch(Exception ex){
                    System.out.print("exception in main");
                }
                System.out.print("finished");
                ArrayList list = new ArrayList<>();
                list.add(0,111);
                list.add(1,111);
                list.add(2,111);
                list.forEach(o -> System.out.println(o));
            }




 }