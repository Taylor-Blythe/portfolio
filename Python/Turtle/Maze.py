# import section
import turtle as t
import random as r
#global variables
wn=t.Screen()

numberOfWalls = 25
pathWidth=15
timeKeeper = t.Turtle()
timeKeeper.penup()
timeKeeper.goto(-100-pathWidth*2,275)
timeKeeper.hideturtle()
bob = t.Turtle()
bob.hideturtle()
fontSetup=("Times New Roman",30,"normal")
interval=1000
timer = 0

#initialize objects or turtles
mazeDrawer = t.Turtle()
mazeDrawer.pensize(5)
mazeDrawer.pencolor("blue")
mazeDrawer.speed(0)

mazeRunner = t.Turtle()
mazeRunner.color("red")
mazeRunner.penup()
mazeRunner.goto(-pathWidth*2,pathWidth*2)
mazeRunner.pendown()


#functions
def drawDoor(pos):
    #pos is the distance we need to travel before placing a door
    mazeDrawer.fd(pos)
    mazeDrawer.penup()
    mazeDrawer.fd(pathWidth*2)
    mazeDrawer.pendown()

def drawBarrier(pos):
    mazeDrawer.fd(pos)
    mazeDrawer.left(90)
    mazeDrawer.fd(pathWidth*2)
    mazeDrawer.bk(pathWidth*2)
    mazeDrawer.right(90)


def drawMaze():
    wallLength = 15
    for w in range(numberOfWalls):
        wallLength += pathWidth
        if w > 4:
            mazeDrawer.left(90)
            # where do we draw the doors and barriers inside of a wall length
            doorSpot = r.randint(pathWidth*2,(wallLength-pathWidth*2))
            barrierSpot = r.randint(pathWidth*2,(wallLength-pathWidth*2))
            # check to make sure a door and barrier do not render on top each other
            while abs(doorSpot-barrierSpot) < pathWidth:
                doorSpot = r.randint(pathWidth*2,(wallLength-pathWidth*2))
            #draw a wall
            #"randomly" assigning which object we draw first
            if (doorSpot<barrierSpot):
                drawDoor(doorSpot)
                drawBarrier(barrierSpot-doorSpot-pathWidth*2)
                mazeDrawer.fd(wallLength-barrierSpot)
            else:
                drawDoor(doorSpot-barrierSpot)
                drawBarrier(barrierSpot)
                mazeDrawer.fd(wallLength-doorSpot-pathWidth*2)
        mazeDrawer.hideturtle()
    for i in range(3):
        mazeDrawer.left(90)
        mazeDrawer.fd(wallLength)
def goUp():
    mazeRunner.setheading(90)
def goleft():
    mazeRunner.setheading(180)
def godown():
    mazeRunner.setheading(270)
def goright():
    mazeRunner.setheading(0)
def go():
    
    #pacman movement, so no going through walls
    mazeRunner.fd(1)
    
    
    #determine if it hits wall
    canvas = wn.getcanvas()
    x,y=mazeRunner.pos()
    items = canvas.find_overlapping(x+1,-y+1,x-1,-y-1)
    
    #if the items variable has overlap
    if(len(items)>0):   #stack of what is overlapping
        canvasColor = canvas.itemcget(items[0], "fill")
        if canvasColor=="blue": #we knw we have hit a wall
            mazeRunner.color("gray")
            #wn.onkeypress(None,"Return") #disabling movement
            mazeRunner.goto(-pathWidth*2,pathWidth*2)
            return                      #shortcut to stop the movement
            
    wn.ontimer(go,15)

def updatetimer():
    #global is to let this function know to go look at a global variable

    global timer
    timeKeeper.clear()
    if timer>=0:
        timer+=1
        timeKeeper.write(f"Timer: {timer}",font=fontSetup)
        #we need to recursively run this function
        #timerKeeper gets the screens ontimer and in theory resets time and interval
        timeKeeper.getscreen().ontimer(updatetimer,interval)



#events
drawMaze()
wn.onkeypress(goUp,"w")
wn.onkeypress(goleft,"a")
wn.onkeypress(godown,"s")
wn.onkeypress(goright,"d")
wn.onkeypress(go,"Return")
wn.listen()
wn.ontimer(updatetimer,interval)
#mainloop or game loop or running code


wn.mainloop()
        
        #draw the rest of the wall
<<<<<<< HEAD
=======



    
    
    


    






>>>>>>> 176dbe0a7d6f769b6d6575f7af903ee970ef1f6f
