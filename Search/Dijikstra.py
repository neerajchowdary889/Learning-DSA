import heapq


graph = {'A': {'B': 2, 'C': 3},
         'B': {'A': 2, 'C': 4, 'D': 2},
         'C': {'A': 3, 'B': 4, 'D': 3, 'E': 2},
         'D': {'B': 2, 'C': 3, 'E': 3},
         'E': {'C': 2, 'D': 3}}

def dij(start):
    distances = {vertex: float('infinity') for vertex in graph}
    distances[start] = 0
    priority_q = [(0, start)]
    while priority_q:
        current_d, current_v = heapq.heappop(priority_q)

        for neighbour, weight in graph[current_v].items():
            distance = current_d+weight
            if distance < distances[neighbour]:
                distances[neighbour] = distance
                heapq.heappush(priority_q,(distance,neighbour))
    return distances
temp = dij('A')
print(temp)