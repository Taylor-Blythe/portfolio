#---import statements
import turtle as t
import random as r
import leaderboard as lb

#---game configurations--- (global variables)
wn=t.Screen()
fontSetup=("Times New Roman",30,"normal")
interval=1000
score=0
timer=15
shrinkSize=0
size=2
clicks=0


  
# registering the image
# as a new shape
 
# setting the image as cursor
FILENAME='Database.txt'             #constant variable, don't change it
#---initialize turtles--- (initialize objects)
bob = t.Turtle()

bob.shape("turtle")
bob.shapesize(size)
bob.fillcolor("purple")
bob.speed(0)
bob.penup()
start = t.Turtle()
start.shape("square")
start.shapesize(size)
start.fillcolor("green")
scoreKeeper=t.Turtle()
scoreKeeper.penup()
scoreKeeper.hideturtle()
scoreKeeper.goto(280,300)
scoreKeeper.pendown()
scoreKeeper.speed(0)
timeKeeper=t.Turtle()
timeKeeper.penup()
timeKeeper.hideturtle()
timeKeeper.goto(-100,200)
timeKeeper.pendown()
timeKeeper.speed(0)
clickKeeper=t.Turtle()
clickKeeper.penup()
clickKeeper.hideturtle()
clickKeeper.goto(-50,100)
clickKeeper.pendown()
clickKeeper.speed(0)
#---functions---
#the command to run when there is an event
#when you use onClick event, you MUST give the function the x,y



def totalClick(x,y):
    global clicks
    clicks+=1



def bobClicked(x,y):
    global shrinkSize
    global size
    print("bob was clicked")
    print(x,y)  #mouse x and y
    
    if shrinkSize!=3:
        bob.shapesize(.25*size)
        shrinkSize+=1
    else:
        bob.shapesize(2)
        size=2
        shrinkSize=0
    bob.color("red","white")
    bob.stamp()
    bob.fillcolor("purple")
    moveBob()
    

def moveBob():
    #randomly moving bob
    t.Screen().bgcolor("red")
    newX=r.randint(-300,280)
    newY=r.randint(-300,280)
    bob.goto(newX,newY)
    t.Screen().bgcolor("white")
    

        
def updateScore(x,y):
    #global is to let this function know to go look at a global variable
    global score
    score+=1
    scoreKeeper.clear()
    #object.write("message",options)
    scoreKeeper.write(f"Score: {score}",font=("Times New Roman",30,"normal"))
    
def updatetimer():
    #global is to let this function know to go look at a global variable
    global timer
    timeKeeper.clear()
    if timer<=0:
        timeKeeper.write("Times Up!",font=fontSetup)
        
        bob.hideturtle()
        manageLeaderboard()
    else:
        timer-=1
        timeKeeper.write(f"Timer: {timer}",font=fontSetup)
        #we need to recursively run this function
        #timerKeeper gets the screens ontimer and in theory resets time and interval
        timeKeeper.getscreen().ontimer(updatetimer,interval)

def manageLeaderboard():
    #get the data from the text file
    namesList=lb.getNames(FILENAME)
    scoresList=lb.getScores(FILENAME)
    #check to see if you made the leaderboard

    #update the leaderboard
    if(len(scoresList)<5 or score>=int(scoresList[-1])):
        name=input("Congrats, you're on the board! \n\tName Please: ")
        lb.updateLeaderboard(FILENAME, namesList, scoresList, name, score)
    else:
        print("you did not make it on the leaderboard")
    #display the leaderboard
    lb.draw_leaderboard(False, namesList, scoresList, scoreKeeper, 10)
    scoreKeeper.clear()
    scoreKeeper.write(f"Score: {score}\nacc: {score/clicks*100:.2f}%",font=("Times New Roman",30,"normal"))


def gameStart(x,y):
    bob.onclick(bobClicked)
    wn.ontimer(updatetimer,interval)
    t.Screen().onscreenclick(totalClick)
    bob.onrelease(updateScore)
    start.hideturtle()

#---events---
#object.onClick event(command) -> we can reset this anytime we want
start.onclick(gameStart)



#---main loop ---- (running code)
wn.mainloop()

'''
    1. click the turtle
    2. move the turtle
    3. update score
    4. countdown
'''