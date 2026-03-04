public interface intr {

    default String sum()
    {
     System.out.println(1+2);
        return m1();
    }

    private String  m1()
    {
        return "private calles";
    }
}
class Test implements intr
{
   public String sum()
   {
    return    intr.super.sum();
   }

    public static void main(String[] args) {
        Test t= new Test();
        System.out.println(t.sum());
    }
}