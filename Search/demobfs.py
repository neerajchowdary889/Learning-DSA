graph = {
  '5' : ['3','7'],
  '3' : ['2', '4'],
  '7' : ['8'],
  '2' : [],
  '4' : ['8'],
  '8' : []
}

visited = []
queue = []

def bfs(node):
    visited.append(node)
    queue.append(node)

    while(queue):
        temp = queue.pop(0)
        print(temp, end=" --> ")

        for neighbour in graph[temp]:
            if neighbour not in visited:
                visited.append(neighbour)
                queue.append(neighbour)

print("Print out:")
bfs('5')
print("end")
