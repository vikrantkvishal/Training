myTodo = []

def add_todo(todo):
    myTodo.append(todo)
    print(myTodo)


def remove_todo(i):
    myTodo.pop(i)
    print(myTodo)

def get_all_todos():
    print(myTodo)


while True:
    c = int(input("Enter 1 to Add ToDo\nEnter 2 to Remove ToDo\nEnter 3 to Get all Todos\nEnter 4 to Exit\n"))
    if c == 1:
        todo = input("Enter the task")
        add_todo(todo)
    elif c==2:
        i = int(input("Enter the index"))
        remove_todo(i)
    elif c==3:
        get_all_todos()
    elif c==4:
        break
    else:
        print("Enter a valid choice")