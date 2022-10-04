class binarytree :
    def __int__(self,data):
        self.data = data
        self.left = None
        self.right = None
    def AddChild(self, data):
        if data == self.data:
            return # Checking if it is duplicate.
        if data < self.data:
            if self.left:
                self.left.AddChild(data)
            else:
                self.left = binarytree(data)
        else:
            if self.right:
                self.right.AddChild(data)
            else:
                self.right = binarytree(data)
    def InOrder(self):
        elements = []

        # visit left tree
        if self.left:
            elements += self.left.InOrder()

        # visit base node
        elements.append(self.data)

        # visit right tree
        if self.right:
            elements += self.right.InOrder()

        return elements

def Tree(elements):
    root = binarytree(elements[0])

    for i in range(1,len(elements)):
        root.AddChild(elements[i])

    return root
if __name__ == '__main__':
    tree = Tree([6,8,9,2,4,19,12,12,9,6,0])
    print(tree.InOrder())