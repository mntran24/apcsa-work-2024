data = open('input.txt').read().split(', ')
data = [(d[:1],int(d[1:])) for d in data]
 
'''
steps:
    y+1
x-1 pos x+1
    y-1
 
facing:
North: 0
East:  1
South: 2
West:  3
'''
 
steps = [ (0, 1), (1, 0), (0, -1), (-1, 0) ] # Up, Right, Down, Left
facing = 0
pos = (0,0)
 
for turn, step in data:
    facing += 1 if turn == 'R' else -1
    facing %= 4
    while step > 0:
        pos = pos[0] + steps[facing][0], pos[1] + steps[facing][1]
        step -= 1
print (abs(pos[0]) + abs(pos[1]))