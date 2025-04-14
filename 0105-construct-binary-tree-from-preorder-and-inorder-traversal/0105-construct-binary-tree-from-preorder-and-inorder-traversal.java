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

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return makeSubTree(preorder, inorder, 0, inorder.length - 1);
    }

    private TreeNode makeSubTree(int[] preorder, int[] inorder, int inorderStart, int inorderEnd) {
        if (inorderStart > inorderEnd) return null;

        TreeNode node = new TreeNode(preorder[idx]);

        for (int i = inorderStart; i <= inorderEnd; i++) {
            if (preorder[idx] == inorder[i]) {
                idx++;

                node.left = makeSubTree(preorder, inorder, inorderStart, i - 1);
                node.right = makeSubTree(preorder, inorder, i + 1, inorderEnd);
                break;
            }
        }
        return node;
    }
}