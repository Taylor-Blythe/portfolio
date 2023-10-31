#---import statements
import turtle as t
import random as r


#---game configurations--- (global variables)
wn=t.Screen()
fontSetup=("Times New Roman",30,"normal")
interval=1000
score=0
timer=15
#---initialize turtles--- (initialize objects)
bob = t.Turtle()
bob.shape("turtle")
bob.shapesize(2)
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
    print("bob was clicked")
    print(x,y)  #mouse x and y
    moveBob()
    
def moveBob():
    #randomly moving bob
    
    newX=r.randint(-300,300)
    newY=r.randint(-300,300)
    bob.goto(newX,newY)
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
    else:
        timer-=1
        timeKeeper.write(f"Timer: {timer}",font=fontSetup)
        #we need to recursively run this function
        #timerKeeper gets the screens ontimer and in theory resets time and interval
        timeKeeper.getscreen().ontimer(updatetimer,interval)
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