

public class Tree_BieLai {
    public void main(String[] args) {
        BinaryNode root0 = new BinaryNode<Integer>();
        root0.data = 1;
//        root0.left = new TreeNode();
        root0.left = new BinaryNode();
        root0.left.data = 2;
        root0.right = new BinaryNode();
        root0.right.data = 3;

        BinaryNode root1 = new BinaryNode<Integer>();
        root1.data = 1;
//        root0.left = new TreeNode();
        root1.left = new BinaryNode();
        root1.left.data = 2;
        root1.right = new BinaryNode();
        root1.right.data = 3;

        BinaryNode root2 = new BinaryNode<Integer>();
        root2.data = 1;
//        root0.left = new TreeNode();
        root2.left = new BinaryNode();
        root2.left.data = 3;
        root2.right = new BinaryNode();
        root2.right.data = 3;

        boolean result01 = root0.equals(root1);
        boolean result02 = root0.equals(root2);
        System.out.println(result01);
        System.out.println(result02);
    }

    public class BinaryNode<T>                //二叉树的三叉链表结点类，T指定结点的元素类型
    {
        public T data;                                //数据域，存储数据元素
        public BinaryNode<T> parent, left, right;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BinaryNode<?>)) {
                return false;
            }
            BinaryNode other=(BinaryNode) obj;//强制类型转换。将传入的Object类局部变量转换为BinaryNode类局部变量。
//            if (this.data==other.data){
            //到了这里才真正的有了两颗二叉树局部变量，才能进行比较。
                return (this.data==other.data&&this.left.data==other.left.data&&this.right.data==other.right.data);
//            }
            //可以加一个循环，遍历比较每个结点的值。
//            return this.data == other.data && this.left.equals(other.left) && this.right.equals(other.right);
        }//链，分别指向父母结点、左和右孩子结点
    }


}


