package day3;

public class Code1 {

	public static void main(String[] args) {
		// 了解数组类型与基本类型的区别
		int number = 100;//栈区
//		[]放在赋值符号前面，只是一个标示，代表后面的是数组
//		不能放int前，规定第一个单词是数据类型，可以在变量名的前后
//		{}表示一块连续的内存空间，便于用下标索引取值
//		{}数据类型由[]前面的类型确定
//		{}数组下标从0开始.放堆内存中就叫实例
//		数组大小在  创建数组"实例(instance)"时确定，而不是定义数组"变量时"
//		数组大小由 = 后面决定  int[10] arr
		
		int[] numberArr = {100,10};//堆区
		
//		如何定义数组
		String[] arr1;
		byte arr2[];
		
//		如何制定数组长度,为了在内存中分配好空间
		arr1 = new String[10];//new 关键字，JVM可以在堆内存中分配空间
		
//		如何给数组空间中赋值
		arr2 = new byte[]{3,2,4,1}; //java风格
	}

}
