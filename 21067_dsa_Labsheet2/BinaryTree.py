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

def postorder(temp):
    if (not temp):
        return
    postorder(temp.left)
    postorder(temp.right)
    print(temp.key, end=" ")

def preorder(temp):
    if (not temp):
        return
    print(temp.key, end=" ")
    preorder(temp.left)
    preorder(temp.right)


root = newNode(1)
root.left = newNode(2)
root.left.left = newNode(4)
root.right = newNode(3)
root.left.right = newNode(5)
root.right.left = newNode(6)
root.right.right = newNode(7)
print("Inorder traversal:", end=" ")
inorder(root)
print()
print("Postorder traversal:", end=" ")
postorder(root)
print()
print("Preorder traversal:", end=" ")
preorder(root)