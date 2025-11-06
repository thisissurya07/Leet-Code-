package dummy;

import java.util.Arrays;

public class MomentsOnRobots {
	
	public static int ismoments(int[]nums,String s,int d) {
		int n=nums.length;
		long [] res=new long[n];
		long mod=1000000007L;
		
		for(int i=0;i<n;i++) {
			char l=s.charAt(i);
			if(l=='R') {
				res[i]=nums[i]+d;
			}else {
				res[i]=nums[i]-d;
			}
			
		}
		Arrays.sort(res);
		System.out.println(Arrays.toString(res));
		
		long ans=0;
		
		for(int i=0;i<res.length;i++) {
			for(int j=i+1;j<res.length;j++) {
				ans+=Math.abs(res[i]-res[j]);
				ans%=mod;
			}
		}
		
		return(int)ans;
	}
	
	 public static void main(String[] args) {
		int[]a= {-2,0,2};
		String s="RLL";
		int d=3;
		System.out.println("Input : [-2,0,2]");
		System.out.println("Output : "+ismoments(a, s, d));
		
		 
	}

}
