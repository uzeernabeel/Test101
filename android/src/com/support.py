'''
This is the python file to create a support document
'''

def greeting (name):
    print("Hello", name)
    print("Be the change that you wish to see in the world. (Mahatma Gandhi)")

print("\n\n")

n=5;
for i in range(n):
    for j in range(i):
        print ('* ', end="")
    print('')

print("\n\n")

for i in range(n,0,-1):
    for j in range(i):
        print('* ', end="")
    print('')
	
print("\n\n")

rows = 6
for num in range(rows):
    for i in range(num):
        print(num, end=" ")  # print number
    # line after each row to display pattern correctly
    print(" ")

print("\n\n")

rows = 5
for row in range(1, rows+1):
    for column in range(1, row + 1):
        print(column, end=' ')
    print("")

print("\n\n")

greeting("")

print("done with the program!!!")
print("done with the program!!!")





