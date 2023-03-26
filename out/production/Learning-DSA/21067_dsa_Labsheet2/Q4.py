class Node:
	def __init__(self, key):
		self.left = None
		self.right = None
		self.key = key

def insert(root, value):
	if root is None:
		return Node(value)

	if root.key == value:
		return root
	elif root.key < value:
		root.right = insert(root.right, value)
	else:
		root.left = insert(root.left, value)
	return root

def inorder(temp):
    if (not temp):
        return

    inorder(temp.left)
    print(temp.key, end=" ")
    inorder(temp.right)


def minValueNode(node):
    current = node

    while (current.left is not None):
        current = current.left
    print ("\nMinimum Value is :",current.key)

root = Node(60)
root = insert(root, 12)
root = insert(root, 90)
root = insert(root, 4)
root = insert(root, 41)
root = insert(root, 1)
root = insert(root, 29)
root = insert(root, 23)
root = insert(root, 37)
root = insert(root, 100)
root = insert(root, 71)
root = insert(root, 84)

inorder(root)
minValueNode(root)
