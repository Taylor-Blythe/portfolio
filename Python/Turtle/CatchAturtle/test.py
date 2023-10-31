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
FILENAME='Database.txt'             #constant variable, don't change it
#---initialize turtles--- (initialize objects)
bob = t.Turtle()
bob.shape("turtle")
bob.shapesize(size)
bob.fillcolor("purple")
bob.speed(0)
bob.penup()
scoreKeeper=t.Turtle()
scoreKeeper.penup()
scoreKeeper.hideturtle()
scoreKeeper.goto(100,200)
scoreKeeper.pendown()
scoreKeeper.speed(0)
timeKeeper=t.Turtle()
timeKeeper.penup()
timeKeeper.hideturtle()
timeKeeper.goto(-100,200)
timeKeeper.pendown()
timeKeeper.speed(0)
#---functions---
#the command to run when there is an event
#when you use onClick event, you MUST give the function the x,y
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
    newX=r.randint(-300,300)
    newY=r.randint(-300,300)
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

#---events---
#object.onClick event(command) -> we can reset this anytime we want
bob.onclick(bobClicked)
bob.onrelease(updateScore)
wn.ontimer(updatetimer,interval)



#---main loop ---- (running code)
wn.mainloop()

'''
    1. click the turtle
    2. move the turtle
    3. update score
    4. countdown
'''