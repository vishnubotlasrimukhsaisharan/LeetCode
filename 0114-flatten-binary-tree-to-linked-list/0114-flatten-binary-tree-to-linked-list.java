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
    public void flatten(TreeNode root) {
        if(root==null) return;
        List<Integer> l = new ArrayList<>();
        pre(root,l);
        System.out.println(l);
        root.right = null;
        root.left = null;
        TreeNode tail = root;
        for(int i=1;i<l.size();i++){
            tail.right = new TreeNode(l.get(i));
            tail = tail.right;
            
        }
        root = root.right;

    }
 void pre(TreeNode root,List<Integer> l){
        if(root == null) return;
        l.add(root.val);
        pre(root.left,l);
        pre(root.right,l);
    }
}