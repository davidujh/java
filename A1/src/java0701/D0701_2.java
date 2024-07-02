package java0701;

import java.util.Arrays;

public class D0701_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//많은 양의 데이터를 다룰때는 배열을 사용한다
		//상황에 따라서는 배열을 쓰면 안되는 경우도 있지만
		//보통은 배열의 구조에 데이터를 저장한다
		
		//동적배열 만들기!
		//기본의 배열 크기를 늘리거나 줄여서 사용하는 배열
		
//		int[] a =new int[5];
//		
//		a[0]=10; a[1]=20; a[4]=40;
//		a[5]=100;
		
		
		
		int[] num = new int[] {10,20,30,40,50};
		System.out.println("크기증가 전 : "+Arrays.toString(num));
		
		// 데이터를 추가로 더 저장하려면 배열의 크기를 늘려야한다.
		int size =num.length;//기존배열의 크기
		
		int[] temp =new int[size+1];
		for(int i=0; i<size; i++) {
			temp[i] = num[i];
		}
		
		num = temp;
		num[5]=60;
		System.out.println("크기 증가 후 : " + Arrays.toString(num));

	}

}
