import turtle as t

wn=t.Screen()
score=0

scoreKeeper=t.Turtle()
scoreKeeper.penup()
scoreKeeper.hideturtle()
scoreKeeper.goto(100,200)
scoreKeeper.pendown()
scoreKeeper.speed(0)

#functions
def updateScore(x,y):
    #global is to let this function know to go look at a global variable
    global score
    score+=1
    scoreKeeper.clear()
    #object.write("message",options)
    scoreKeeper.write(f"Score: {score}",font=("Times New Roman",30,"normal"))

#events
wn.onscreenclick(updateScore)
wn.ontimer(updatetimer,interval)
wn.mainloop()