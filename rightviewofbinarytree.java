class Solution {
    public List<Integer> rightSideView(TreeNode root) {
// this is striver solution using recursion same u can do for left view of binary tree just comment right and do for left
  List<Integer> result =  new ArrayList<Integer>();
      rightView(root,result,0);
      return result;
    }
public void rightView(TreeNode curr ,List<Integer> result, int currDepth){
    if(curr == null){
        return;
    }
    if(currDepth == result.size()){
        result.add(curr.val);
    }
    rightView(curr.right, result,currDepth + 1);
    //rightView(curr.left, result,currDepth + 1);
  }
}
