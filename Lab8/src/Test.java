public class Test {


    public static void main(String a[]) {

	new Test().process();
	System.out.println("finishing main");

    }


    public void process() {
        try{
            test1();
            System.out.println("finishing process");
        }
        catch(JerException e){
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public void test1() throws JerException {

           throw new JerException(17);
    }
}
