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

NumberofElements = int(input("Number of Nodes should be in one tree: "))

Bst1 = []
Bst2 = []

print("\n For Tree 1: ")
for i in range(NumberofElements):
	temp = int(input("Enter Value: "))
	Bst1.append(temp)

print("\n For Tree 2: ")
for i in range(NumberofElements):
	temp = int(input("Enter Value: "))
	Bst2.append(temp)

for i in range(len(Bst1)):
	if i == 0:
		root = Node(Bst1[i])
	else:
		root = insert(root, Bst1[i])
print("\nInorder of 1st Tree is: ")
inorder(root)

print(" ")

for i in range(len(Bst2)):
	if i == 0:
		root = Node(Bst2[i])
	else:
		root = insert(root, Bst2[i])
print("Inorder of 2nd Tree is: ")
inorder(root)

print(" ")

Bst = Bst1+Bst2
# print(Bst)

for i in range(len(Bst)):
	if i == 0:
		root = Node(Bst[i])
	else:
		root = insert(root, Bst[i])
print("\nInorder of Merged Tree is: ")
inorder(root)