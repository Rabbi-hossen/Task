public class passkel {
    public static void main(String[] args) {
        int arr1[]={1,2,2,1};
        int arr2[]={1,2,2,1};
        int count=0;
        /*for (int i=0;arr1.length>i;i++){
            if(arr1[i] != arr2[i]) {

                System.out.println("not passke rule ");
                break;
            }
            else  count++;
        }
        if (count==arr1.length) System.out.println("passkel");*/
//-----------------------------------------
       /*     //1 2 3 4--l4
            //0 1 2 3---index(count);
        for (int i=0;arr1.length>i;i++){
            if(arr1[i] != arr2[i]) {

                System.out.println("not passke rule ");
                break;
            }
            else if (i==arr1.length-1) System.out.println("passkel");
            System.out.println(arr1.length);
        }
*/


// --------------------------------
        //int arr3[]={4,5,5,7};
        String s="r a t t t  t a r";
          //      01234567
        int st=0;
       // int end=arr3.length-1;
        int end=s.length()-1;
        while (st<=end){
            //if (arr3[st]!=arr3[end]){
            if (s.charAt(st)!=s.charAt(end)){

                System.out.println("not palindrome");
                break;
            }
           st++;
            end--;
        }
        if (st>end) {
            System.out.println("palindrome");
        }
        }
    }

