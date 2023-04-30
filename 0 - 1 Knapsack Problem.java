// Poblem:- 0 - 1 Knapsack Problem

// DESCPRITON:- 
// You are given weights and values of N items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack. Note that we have only one quantity of each item.
// In other words, given two integer arrays val[0..N-1] and wt[0..N-1] which represent values and weights associated with N items respectively. Also given an integer W which represents knapsack capacity, find out the maximum value subset of val[] such that sum of the weights of this subset is smaller than or equal to W. You cannot break an item, either pick the complete item or dont pick it (0-1 property).

// code...


// 1.MEMOIZATION
class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int sol(int index,int weight,int wt[],int val[],int dp[][]){
        if(index==0)
          {
            if(weight>=wt[0]) return dp[index][weight]=val[0];
            else return 0;
          }
         if(dp[index][weight]!=-1) return dp[index][weight];
         
       int not_take=sol(index-1,weight,wt,val,dp);
       int take=Integer.MIN_VALUE;
        if(weight>=wt[index]) take=val[index]+sol(index-1,weight-wt[index],wt,val,dp);
        
        return dp[index][weight]=Math.max(not_take,take);
    }
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here
         int dp[][]=new int[n][W+1];
         for(int i = 0 ; i < n ;i++){
             Arrays.fill(dp[i],-1);
         }
         
         return sol(n-1,W,wt,val,dp);
    } 
}



//Tabulation
class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.

    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here
         int dp[][]=new int[n][W+1];
        //base case
        for(int i = wt[0]; i<=W;i++) dp[0][i]=val[0];
         
         for(int index=1;index<n;index++){
             for(int weight=0;weight<=W;weight++){
                int not_take=0+dp[index-1][weight];
                
                int take=Integer.MIN_VALUE;
                
                if(weight>=wt[index]) take=val[index]+dp[index-1][weight-wt[index]];
        
                dp[index][weight]=Math.max(not_take,take);
                 
             }
         }
         return dp[n-1][W];
    } 
}


