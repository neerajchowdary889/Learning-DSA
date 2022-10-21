array = [0,3, 9, 2, 1, 4, 5, 6, 7]
class newNode():
    def __init__(self,data):
        self.left = None
        self.right = None
        self.data = data
# def heap(root, i):
#     print(array)
#     temp = []
#     temp.append(root)
#     while (i < len(array)):
#         root = temp[0]
#         temp.pop(0)
#         print(temp)
#         if(root.left == None and root.right == None):
#             continue
#         if i == 0:
#             root = newNode(array[i])
#             root.left = array[1]
#             root.right = array[2]
#             print(root.left, root.right)
#         else:
#             root = newNode(array[i])
#             root.left = array[2*i]
#             root.right = array[2*i+1]
#         i = i+1
#         print(i)
#     return True


def inorder(temp):
    if (not temp):
        return

    inorder(temp.left)
    print(temp.key, end=" ")
    inorder(temp.right)


root = array[1]
i = 1


temp = []
temp.append(root)
i = 1
for i in range(len(array)):
    root = temp[0]
    print(temp)
    temp.pop(0)

    try:
        if (2 * i < len(array)+1):
            print(i)
            root = newNode(array[i])
            if (array[2*i+1] == None):
                print("inloop")
                root.left = newNode(array[2*i])
                root.right = newNode(None)
                print(temp[0])
                print(root.left, root.right)
            else:
                print("In LOOP")
                root.left = newNode(array[2 * i])
                root.right = newNode(array[2 * i + 1])
                print(temp[0])
                print(root)
                print(root.left, root.right)
        else:
            continue
    except Exception as e:
        print("",end='')
    temp.append(root.left)
    temp.append(root.right)
    i = i + 1
    print()

print(temp)

