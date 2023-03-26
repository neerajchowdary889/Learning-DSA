# graph = {
#   '5' : ['3','7'],
#   '3' : ['2', '4'],
#   '7' : ['8'],
#   '2' : [],
#   '4' : ['8'],
#   '8' : []
# }
graph = {
    "A": ["B", "C"],
    "B": ["A", "C"],
    "C": ["C", "B"],
    "D": ["A"],
    "E": ["D"],
}
tempgraph = {}
queue = []

def AppendToList(): 
    min_key = min(tempgraph, key=tempgraph.get) 

    for key, values in graph.items():
        values[:] = [value for value in values if value != min_key]

    queue.append(min_key)

    del tempgraph[min_key]
    del graph[min_key]
    givecount()

def givecount():
    temp = list(graph.keys())
    
    for i in range(len(temp)): 

        count = 0
        k = temp[i]

        for values in graph.values():
            count += values.count(k)
        tempgraph[k] = int(count)
    if len(tempgraph) >=1:
        AppendToList()


givecount()

print("Topological Sort: ",queue)