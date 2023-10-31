#   a115_robot_maze.py
import turtle as trtl

#----- maze and turtle config variables
screen_h = 400
screen_w = 420
startx = -100
starty = -100
turtle_scale = 1.5

#------ robot commands
def move():
  robot.dot(10)
  robot.fd(50)

def turn_left():
  robot.speed(0)
  robot.lt(90)
  robot.speed(2)

def turn_right():
  robot.speed(0)
  robot.lt(270)
  robot.speed(2)

def moveUp():
  robot.setheading(90)
  robot.fd(50)
  robot.dot(10)

def moveDown():
  robot.setheading(270)
  robot.fd(50)
  robot.dot(10)
  
  
def moveLeft():
  robot.setheading(180)
  robot.fd(50)
  robot.dot(10)

def moveRight():
  robot.setheading(0)
  robot.fd(50)
  robot.dot(10)
  

#----- init screen
wn = trtl.Screen()
wn.setup(width=screen_w, height=screen_h)
robot_image = "robot.gif"
wn.addshape(robot_image)

#----- init robot
robot = trtl.Turtle(shape=robot_image)
robot.hideturtle()
robot.color("darkorchid")
robot.pencolor("darkorchid")
robot.penup()
robot.setheading(90)
robot.turtlesize(turtle_scale, turtle_scale)
robot.goto(startx, starty)
robot.speed(2)
robot.showturtle()

wn.bgpic("maze1.png")

ui=input("w,a,s,d")
#check for user input
actions={"w":moveUp(),
         "a":moveLeft(),
         "s":moveDown(),
         "d":moveRight()
}



# def corCheck(maze,endCor):
#     global level
#     if(round(robot.xcor()),round(robot.ycor()))==endCor:
#         wn.bgpic(maze)
#         robot.clear()
#         robot.goto(startx,starty)
#         level+=1
# level=1

def corCheck(endCor,maze):
  global level
  if (round(robot.xcor()),round(robot.ycor()))==endCor:
    wn.bgpic(maze)
    robot.clear()
    robot.goto(-100,-100)
    level+=1
level=1



def blackSquare(blackSquaresList):
    if (round(robot.xcor()),round(robot.ycor())) in blackSquaresList:
        robot.clear()
        wn.bgpic("maze1.png")
        robot.goto(startx,starty)


#importing w a s and d as inputs
#got the wasd inputs from alex
while True:
  ui=input("w,a,s,d ")
  actions[ui]
  if ui=="w":
    moveUp()
  elif ui=="a":
    moveLeft()
  elif ui=="s":
    moveDown()
  elif ui=="d":
    moveRight()
  if level==1:
    corCheck((100,100),"maze2.png")
  elif level==2:
    corCheck((0,50),"maze3.png")
    blackSquaresList=[(-50,-50),(-50,0),(0,0),(0,-50),(100,-50),(100,-100),(100,100),(0,100),(-50,100),(-100,100)]
    blackSquare(blackSquaresList)

  elif level==3:
    corCheck((100,100),"2.png")
    blackSquaresList2=[(-100,0),(-100,50),(-50,100),(0,100),(0,-100),(50,-100),(100,-50),(100,0)]
    blackSquare(blackSquaresList2)
  elif level==4:
    corCheck((100,100),"maze1.png")
    blackSquaresList2=[(-50,-100),(-50,-50),(-50,0),(-50,50),(50,100),(50,50),(50,0),(50,-50)]
    blackSquare(blackSquaresList2)
    

wn.mainloop()


