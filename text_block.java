public class text_block {
    public static void main(String[] args){
        String data= """
                //+package java10;
                
                public class infrence {
                    // var i=10; undefined
                    public static void main(String[] args){
                        int a=10;
                        int b=20;
                        //var name="kiet";
                        var value=10.52;
                        var c=0.0;
                        c=67.99;
                
                        String name =new String("THIS IS STRING");
                        var name1 =new String("this is string with var");
                        int arr[]={1,2,3,4,5};
                        for( var z: arr){
                            System.out.println(z);
                        }
                
                
                    }
                
                }
                
                """;
        System.out.println(data);
    };

}
