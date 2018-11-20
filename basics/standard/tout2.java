
 public class tout2 {
        static String str = "s";
        
        public static void main()
        {
            new tout2().method1();
            System.out.println(str);
        }
        
        void method1()
        {
            try
            {
                method2();           
            }
            catch (Exception e)
            {
                str += "e";
            }
            finally
            {
                str += "c";
            }
        }
        
        void method2() throws Exception
        {
            try
            {
                method3();
                str += "c";
            }
            catch(Exception e)
            {
                throw e;
            }
            finally
            {
                str += "j";
            }
            
            method3();
            str += "d";
        }
        
        void method3() throws Exception
        {
            throw new Exception();
        }
}
