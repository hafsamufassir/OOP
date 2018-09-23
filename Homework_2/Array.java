public class Array {
	public int[] newArray(int[] a){
		int b[] = new int[a.length*2];
		int index = 0;
		
		for(int i = 0; i < a.length; i++){
			b[index] = a[i];
			index++;
			b[index] = a[i];
			index++;
		}
		return b;
	}

	public static void main(String[] args){
		Array a  = new Array();
		
		int[] array = {1, 2 ,3};
		int[] result = a.newArray(array);
		
		for(int i = 0; i < result.length; i++){
			System.out.print(result[i]);
		}
		
	}
}