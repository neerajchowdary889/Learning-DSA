class newNode():
    def __init__(self, data):
        self.key = data
        self.left = None
        self.right = None

def inorder(temp):
    if (not temp):
        return

    inorder(temp.left)
    print(temp.key, end=" ")
    inorder(temp.right)

def isPerfectBinaryTree(root, leaf = 0):
    if (root is None):
        return True
    if (root.left == None and root.right == None):
        return (leaf+1)
    if(root.left == None or root.right == None):
        return False
    return (isPerfectBinaryTree(root.left,leaf) and isPerfectBinaryTree(root.right,leaf))

def perfect(root):
    return isPerfectBinaryTree(root)

root = newNode(1)
root.left = newNode(12)
root.left.left = newNode(5)
root.left.right = newNode(6)
root.right = newNode(9)
root.right.left = newNode(8)
root.right.right = newNode(16)

print("BinaryTree is: ",end="")
inorder(root)

if(perfect(root)):
    print("\nPerfect BinaryTree")
else:
    print("\nNot a Perfect BinaryTree")