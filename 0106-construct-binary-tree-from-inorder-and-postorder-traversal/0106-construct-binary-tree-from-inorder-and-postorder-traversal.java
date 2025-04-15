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
    int idx = 0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        idx = postorder.length - 1;
        return makeSubTree(inorder, postorder, 0, inorder.length - 1);
    }

    private TreeNode makeSubTree(int[] inorder, int[] postorder, int start, int end) {
        if (start > end) return null;

        TreeNode node = new TreeNode(postorder[idx]);

        for (int i = start; i <= end; i++) {
            if (postorder[idx] == inorder[i]) {
                idx--;

                node.right = makeSubTree(inorder, postorder, i + 1, end);
                node.left = makeSubTree(inorder, postorder, start, i - 1);
                break;
            }
        }
        return node;
    }
}