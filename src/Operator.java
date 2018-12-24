public class Operator {
    public static void main(String[] args) {
        /*
         * a:+号在java中有三种作用,代表正号,做加法运算,字符串的连接符
         * b:整数相除只能得到整数。如果想得到小数，必须把数据变化为浮点数类型
         * c:/获取的是除法操作的商，%获取的是除法操作的余数
         * %运算符
         * 当左边的绝对值小于右边绝对值时,结果是左边
         * 当左边的绝对值等于右边或是右边的倍数时,结果是0
         * 当左边的绝对值大于右边绝对值时,结果是余数
         * %运算符结果的符号只和左边有关系,与右边无关
         * 任何一个正整数%2结果不是0就是1可以用来当作切换条件
         */

        System.out.println(10 / 3);				//整数相除结果只能是整数
        System.out.println(10 / 3.0);			//如果想得到小数,把其中一个数变成小数,另一个数在运算的时候会自动类型提升
        System.out.println(-5 % 5);
        System.out.println(13 % -5);

        /*
         * a:单独使用：
         * 放在操作数的前面和后面效果一样。(这种用法是我们比较常见的)
         * b:参与运算使用：
         * 放在操作数的前面，先自增或者自减，然后再参与运算。
         * 放在操作数的后面，先参与运算，再自增或者自减。
         */

        //单独使用
		int x = 3;
		//x++;						//x = x + 1;
		++x;						//x = x + 1;
		System.out.println("x = " + x);

        //参与运算使用
        int a = 3;
        int b;

        //b = a++;					//当++在变量后面的时候,会先将变量中的值取出做赋值操作,然后再自身加1
        b = ++a;					//当++在变量前面的时候,会先自身加1,然后在将结果赋值
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //赋值运算符
        int z = 3;							//把右边的常量值赋值给左边的变量,左边必须是变量

        z += 4;								//z = z + 4;
        //z = z + 4;
        System.out.println(z);

        //关系运算符
        //==,!=,>,>=,<,<=
        System.out.println(4 == 3);
        System.out.println(4 != 3);
        System.out.println(4 > 4);
        System.out.println(4 >= 4);
        System.out.println(4 < 3);
        System.out.println(4 <= 3);

        /*
         * &,|,^,~ 的用法
         * &:有0则0
         * |:有1则1
         * ^:相同则0，不同则1
         * ~:按位取反
         */
        System.out.println(6 & 3);				//2
        System.out.println(6 | 3);				//7
        System.out.println(6 ^ 3);				//5
        System.out.println(~6);					//-7?
    }
}
