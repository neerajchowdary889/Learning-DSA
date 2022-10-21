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


def isFullBinaryTree(root):
    if (root is None):
        return True
    temp = []
    temp.append(root)
    while (not len(temp)):
        node = temp[0]
        temp.pop(0)
        if (node.left == None and
                node.right == None):
            continue
        if (node.left == None or
                node.right == None):
            return False
        temp.append(node.left)
        temp.append(node.right)
    return True


root = newNode(1)
root.left = newNode(2)
root.left.left = newNode(4)
root.right = newNode(3)
root.left.right = newNode(5)
root.left.right.left = newNode(6)
root.left.right.right = newNode(7)

print("BinaryTree is: ",end="")
inorder(root)

if(isFullBinaryTree(root)):
    print("\nIt is Full BinaryTree")
else:
    print("\nNot a Full BinaryTree")