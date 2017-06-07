package com.kermit.others;

public class SystemDemo {

	public static void main(String[] args) {
		
//		new Demo();
//		System.gc();	// 垃圾回收
		
//		System.exit(0);	// 退出java虚拟机，!0状态是异常终止
//		System.out.println("退出 java test");
		
		System.out.println(System.currentTimeMillis());		// 当前时间的毫秒值
		
		int[] src = {11,22,33,44,55};
		int[] dest = new int[8];
		System.arraycopy(src, 0, dest, 0, src.length);		// 拷贝数组
		for (int i = 0; i < dest.length; i++) {
			System.out.println(dest[i]);
		}
	}

}

class Demo {

	@Override
	public void finalize() {
		System.out.println("垃圾被♻了");
	}
	
}
