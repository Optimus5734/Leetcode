/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result =new ArrayList();
        Queue<TreeNode> queue=new LinkedList();
        
        if(root==null) return result;
        queue.add(root);
        
        while(queue.size()>0){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode current_node =queue.poll();
                
                if(i==0) result.add(current_node.val);
                if(current_node.right!=null) queue.add(current_node.right);
                if(current_node.left!=null)queue.add(current_node.left);
                    
            }   
        }
        return result;
    }
}
