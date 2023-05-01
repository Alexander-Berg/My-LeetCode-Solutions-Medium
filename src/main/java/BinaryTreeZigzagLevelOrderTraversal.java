public class BinaryTreeZigzagLevelOrderTraversal {
    class Solution {
        public int numDecodings(String s) {
            int n =s.length();
            int ans[] = new int[n+1];
            ans[0]=1;
            ans[1]=s.charAt(0)-'0'==0?0:1;
            for(int i=2;i<=n;i++)
            {
                int current= s.charAt(i-1)-'0';
                int prev = s.charAt(i-2)-'0';
                int twoDigitNo = 10*prev+current;
                if(current>=1 && current<=9)
                {
                    ans[i]+=ans[i-1];
                }
                if(twoDigitNo>=10 && twoDigitNo<=26)
                {
                    ans[i]+=ans[i-2];
                }
            }
            return ans[n];
        }
    }

//<!-- Recursion with memoization -->
// class Solution {
//     int ans[];
//     public int numDecodings(String s) {
//        ans=new int[s.length()+1];
//        Arrays.fill(ans,-1);
//         return rec(s,0,s.length());
//     }

// int rec(String s, int i, int n )
//     {
//         if(i==n) return 1;
//         if(i>n) return 0;
//         if(ans[i]!=-1) return ans[i];
//         int no =s.charAt(i)-'0';
//         if(no==0){ ans[i]= 0;
//             return ans[i];}
//         int no2= -1;
//         if(i<=n-2)  no2 = no*10+s.charAt(i+1)-'0';

//         if(i<=n-2 && no2<=26 && no2>=1 && no<=26 &&  no>=1 )
//         {
//             ans[i]= rec(s,i+1,n)+rec(s,i+2,n);
//         }
//         else
//             ans[i]= rec(s,i+1,n);
//             return ans[i];
//     }

// }
}
