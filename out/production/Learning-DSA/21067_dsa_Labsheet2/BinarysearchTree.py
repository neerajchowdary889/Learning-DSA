class Node:
	def __init__(self, key):
		self.left = None
		self.right = None
		self.key = key

def insert(root, key):
	if root is None:
		return Node(key)

	if root.key == key:
		return root
	elif root.key < key:
		root.right = insert(root.right, key)
	else:
		root.left = insert(root.left, key)
	return root

def inorder(temp):
    if (not temp):
        return

    inorder(temp.left)
    print(temp.key, end=" ")
    inorder(temp.right)

root = Node(50)
root = insert(root, 30)
root = insert(root, 25)
root = insert(root, 90)
root = insert(root, 10)
root = insert(root, 20)
root = insert(root, 40)
root = insert(root, 70)
root = insert(root, 60)
root = insert(root, 80)

inorder(root)
