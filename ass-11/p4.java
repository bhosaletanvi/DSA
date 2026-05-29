import java.util.*;
class demo{
	public static void main(String [] args){
		ArrayList <Integer> al = new ArrayList <>();
		int [] nums1={1,2,3};
		int [] nums2={2,4,6};
		boolean flag= true;
		for(int i=0;i<nums1.length;i++){
			flag=true;
			for(int j=i+1;j<nums1.length;j++){
				if(nums1[i]==nums2[j]){
					flag=false;
					break;
				}
			}
			if(flag){
				for(int l=0;l<nums2.length;l++){
					if(nums1[i]==nums2[l]){
						flag=false;
					}
				}
			}
			if(flag){
				al.add(nums1[i]);
			}
		}

		for(int t=0;t<nums2.length;t++){
			flag=true;
			for(int u=t+1;u<nums2.length;u++){
				if(nums2[t]==nums1[u]){
					flag=false;
					break;
				}
			}
			if(flag){
				for(int s=0;s<nums1.length;s++){
					if(nums2[t]==nums1[s]){
						flag=false;
					}
				}
			}
			if(flag){
				al.add(nums2[t]);
			}
		}

		for(int k=0;k<al.size();k++){
			System.out.print(al.get(k)+" ");
		}
	}
}