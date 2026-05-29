import java.util.*;
class demo{
	public static void main(String [] args){
		ArrayList <Integer> al = new ArrayList <>();
		HashMap <Integer,Integer> hm = new HashMap <>();

		int [] arr1={1,2,3};
		int [] arr2={2,4,6};
		for(int i=0;i<arr1.length;i++){
			hm.put(arr1[i],hm.getOrDefault(arr1[i],0)+1);
		}

		for(int j=0;j<arr1.length;j++){
			hm.put(arr2[j],hm.getOrDefault(arr2[j],0)+1);
		}
		for(Integer key : hm.keySet()){
			if(hm.get(key)==1){
				System.out.print(key+" ");
			}
		}		
	}
}