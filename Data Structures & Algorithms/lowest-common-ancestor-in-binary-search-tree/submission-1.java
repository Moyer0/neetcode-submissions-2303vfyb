
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        // Mientras no lleguemos a null
        while (root != null) {
            
            // Si ambos están a la izquierda
            if (p.val < root.val && q.val < root.val) {
                root = root.left;
            }
            // Si ambos están a la derecha
            else if (p.val > root.val && q.val > root.val) {
                root = root.right;
            }
            // Si están en lados diferentes o uno es el root
            else {
                return root;
            }
        }
        
        return null;
    }
}
