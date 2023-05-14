public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
       
        int[] a = new int[2];
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(h.containsKey(A[i])){
                a[0]=A[i];
                break;
            }else{
                h.put(A[i],i);
            }
        }
        int os=0;
        int rs=0;
        for(int i=1;i<=A.length;i++){
            os=os+i;
        }
        for(int i=0;i<A.length;i++){
            rs=rs+A[i];
        }
        int rsu =rs-a[0];
        a[1]=os-rsu;  
        return a;
    }
}
