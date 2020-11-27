public class LongesIncreasingSubsequence{

    public static void main(String[] args) {
        Integer arr1[]={43,1,2,3,4,5,6,7,8,9,10,11,12,13,14,8,4,6,7,22,99,98,202,203,204,209,222,223,224,225,199,11,14,19,45,23,99,6};
        LIS(arr1,arr1.length-1,1,0);
    }


    public static void LIS(Integer[] arr1,int len,int cntv,int cntmaxv){
        int maxcnt=cntmaxv;
        int cnt=cntv;
        int i=len;
        //String seq="";

        if(i==0){
            System.out.println("Max Cnt: "+maxcnt);
            return;
        }
        
        if(i-1>=0 && (arr1[i-1]<arr1[i])){
            cnt++;
            if(cnt>maxcnt){
                maxcnt=cnt;
            }
            LIS(arr1,i-1,cnt,maxcnt);
        }
        else{
            LIS(arr1,i-1,1,maxcnt);
        }

    }

    
}