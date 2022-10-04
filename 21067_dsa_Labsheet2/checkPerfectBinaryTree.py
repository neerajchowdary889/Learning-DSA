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

def findADepth(node):
    d = 0
    while (node != None):
        d += 1
        node = node.left
    return d
def isPerfectBinaryTree(root, leafnode):
    if (root is None):
        return True
    if (root.left == None and root.right == None):
         leafnode = leafnode+1
    if(root.left == None or root.right == None):
        return False
    print(leafnode)
    return (isPerfectBinaryTree(root.left) and isPerfectBinaryTree(root.right), leafnode)

root = newNode(1)
root.left = newNode(12)
root.left.left = newNode(5)
root.left.right = newNode(6)
root.right = newNode(9)
root.right.left = newNode(8)
root.right.right = newNode(16)


if(isPerfectBinaryTree(root)):
    print("Perfect")
else:
    print("Fuck")