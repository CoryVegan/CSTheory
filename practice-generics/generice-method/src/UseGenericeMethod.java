


public class UseGenericeMethod {



    // <T> 声明此方法为一个泛型方法
    public static <T> int getRandomNum ( T t ){

        System.out.println( "传入的参数T是 : " + t );

        return (int)( Math.random() * 1000 ) ;
    }



    public static <T,U,V,W,X> String getMsg( T t , U u , V v , W w , X x ){

        System.out.println( "传入的参数T是 : " + t );
        System.out.println( "传入的参数U是 : " + u );
        System.out.println( "传入的参数V是 : " + v );
        System.out.println( "传入的参数W是 : " + w );
        System.out.println( "传入的参数X是 : " + x );

        return "Hello World" ;
    }


    public static void main( String[] args ){

        System.out.println( "获取到的随机数为 : " + UseGenericeMethod.getRandomNum( 2323 ) );

        System.out.println( "获取到的 Msg 为 : " + UseGenericeMethod.getMsg( 2323 , 3 , 2.3 , "12" , "we" ) );

    }

}




