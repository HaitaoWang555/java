package DataType;

public class Demo3_DataTypeConversion {
    public static void main(String[] args) {
        //数据类型转换之隐式转换
		int a = 3;
		byte b = 4;
		a = a + b;
		System.out.println(a);

        //数据类型转换之强制转换
		int x = 3;
		byte y = 4;
		y = (byte)(x + y);
		System.out.println(y);

        byte b1 = (byte)(126 + 4);
        System.out.println(b1);
        byte b2 = (byte)300;
        System.out.println(b2);

        System.out.println('a' + 1);			//98,因为有ASCII码表,a字符对应的是int类型的97
        System.out.println((char)('a' + 1));

        System.out.println("hello"+'a'+1);		//任何数据类型用+与字符串相连接都会产生新的字符串
        System.out.println('a'+1+"hello");

        System.out.println(" 5 + 5 = " + (5 + 5));
    }
}
