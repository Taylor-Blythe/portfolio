import turtle as t
fontSetup=("Times New Roman",30,"normal")
interval=1000
wn=t.Screen()
timer=15

timeKeeper=t.Turtle()
timeKeeper.penup()
timeKeeper.hideturtle()
timeKeeper.goto(-100,200)
timeKeeper.pendown()
timeKeeper.speed(0)

#functions
def updatetimer():
    #global is to let this function know to go look at a global variable
    global timer
    timeKeeper.clear()
    if timer<=0:
        timeKeeper.write("Times Up!",font=fontSetup)
    else:
        timer-=1
        timeKeeper.write(f"Timer: {timer}",font=fontSetup)
        #we need to recursively run this function
        #timerKeeper gets the screens ontimer and in theory resets time and interval
        timeKeeper.getscreen().ontimer(updatetimer,interval)

#events
wn.ontimer(updatetimer,interval)
wn.mainloop()