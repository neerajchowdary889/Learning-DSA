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


def isHeightBalanced(root, isBalanced=True):
    if root is None or not isBalanced:
        return 0, isBalanced
    left_height, isBalanced = isHeightBalanced(root.left, isBalanced)
    right_height, isBalanced = isHeightBalanced(root.right, isBalanced)
    if abs(left_height - right_height) > 1:
        isBalanced = False
    return max(left_height, right_height) + 1, isBalanced


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

if isHeightBalanced(root):
    print('\nBinary tree is balanced')
else:
    print('Binary tree is not balanced')