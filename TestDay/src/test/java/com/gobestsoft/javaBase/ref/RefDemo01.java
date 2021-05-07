package com.gobestsoft.javaBase.ref;

/**
 * RefDemo01
 *
 * @author liuzhen
 * @version 1.0.0 2021/5/7 20:20
 */
public class RefDemo01 {

    /**
     * 参数类型：
     *    形参：方法被调用时需要传递进来的参数，如：func(in a) 中的a，它只有在func被调用的期间a才有意义，也就是会被分配内存空间，
     *       在方法func执行完成后，a就会被销毁释放空间，也就是不存在了。
     *    实参：方法被调用时是传入的是实际值，它在方法被调用前就已经被初始化并且在方法被调用时传入。
     *
     * 值传递与引用传递：
     *    值传递：在方法被调用时，实参通过形参把他的内容副本传入方法内部，此时形参接受到的内容是实参值的一个拷贝，因此在方法内对形参的任何操作，都仅仅
     *       是对这个副本的操作，不影响原始值的内容。值传递传递的是真实内容的一个副本，对副本的操作不影响原内容，也就是形参怎么变化，不会影响实参对应的内容。
     *    引用传递：“引用”也就是指向真实内容的地址值，在方法调用时，实参的地址通过方法调用被传递给相应的形参，在方法体内，形参和实参执行同样一块内存地址，
     *       对形参的操作会影响到真实内容。（Java中只有值传递！！！）
     *
     * 通俗的讲：
     *    值传递：在调用另外一个方法的时候，将实际参数传入到该方法中，该方法中会有一个形参与之对应，并且这个形参会接受实际参数的值（拷贝了一个副本去接受这个实参的值）
     *       无论怎么修改形参的值，都不会影响实参
     *    引用传递：在调用另外一个方法的时候，将实际参数传入到该方法中，该方法中会有一个形参与之对应，这个时候就不是拷贝的副本，而是形参和实参他们俩指向的是同一个地址的值，
     *       你修改了形参的值之后，那么实参的值也会发生改变
     *
     * Java中不存在引用传递，只有值传递！！！
     */

    /**
     * Java中都是值传递（包含传递引用和传递值）
     *    传递引用（引用数据类型：类、数组、接口、Lambda）：Object类型，除了这种不可变的类以外，你传到另外一个方法中去修改其里面的属性时，原有的对象中值也会发生，
     *       原因是形参拷贝了实参的地址值作为副本，他们俩公用一个地址，所有会改掉堆中的那个对象中的属性值。eg: Person
     *    传递值：当我们用这种基本数据类型（byte、short、int、long...）、不可变类型（String，Integer，Long）之类的做，他们的值不会改变。（注：String是引用类型）
     */

    public static void main(String[] args) {
        // 实际的参数：实参
        int x = 10;
        call(x);
        System.out.println("x最终的值是：" + x);
    }

    // 在方法体重参数是指形参
    public static void call(int i) {
        // 这个 i 是实参的一个内容拷贝，也就是说此时的 i 不是真正的 x 那个值，而是拷贝的 x 的值
        i = 20;
        System.out.println("改变后的值：" + i);
    }

}
