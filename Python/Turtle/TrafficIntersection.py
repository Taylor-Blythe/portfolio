#help from blake
import turtle as t



wn = t.Screen()
draw = t.Turtle()
car1 = t.Turtle()
car2 = t.Turtle()
car3 = t.Turtle()
car4 = t.Turtle()
car1.shape("square")
car2.shape("square")
car3.shape("square")
car4.shape("square")
car1.speed(3)
car2.speed(3)
car3.speed(3)
car4.speed(3)
draw.speed(0)
draw.color("grey")
draw.goto
draw.penup()
draw.goto(110,-75)
draw.pendown(
    
)
draw.begin_fill()
draw.forward(230)
draw.left(90)
draw.forward(150)
draw.left(90)
draw.forward(230)
draw.right(90)
draw.forward(230)
draw.left(90)
draw.forward(150)
draw.left(90)
draw.forward(230)
draw.right(90)
draw.forward(230)
draw.left(90)
draw.forward(150)
draw.left(90)
draw.forward(230)
draw.right(90)
draw.forward(230)
draw.left(90)
draw.forward(150)
draw.left(90)
draw.forward(230)
draw.end_fill()
draw.penup()
draw.goto(100,0)
draw.right(90)
def yellow():
    draw.color("yellow")
    draw.pendown()
    draw.forward(200)
    draw.right(90)
    draw.penup()
    draw.forward(10)
    draw.right(90)
    draw.pendown()
    draw.forward(200)
    draw.penup()
yellow()
draw.goto(-50,-10)
yellow()
draw.left(90)
draw.goto(25,80)
yellow()
draw.goto(35,-80)
yellow()
def whitelines():
    for i in range(14):
        draw.speed(0)
        draw.pendown()
        draw.color("white")
        draw.forward(5)
        draw.penup()
        draw.forward(5)
        draw.pendown()
        draw.forward(5)
        draw.penup()
    
draw.right(90)
draw.goto(100,30)
whitelines()
draw.goto(100,-35)
whitelines()
draw.right(90)
draw.goto(-5,-80)
whitelines()
draw.goto(80,-80)
whitelines()
draw.right(90)
draw.goto(-60,-35)
whitelines()
draw.goto(-60,30)
whitelines()
draw.right(90)
draw.goto(-10,80)
whitelines()
draw.goto(75,80)
whitelines()

horizontalTurts = []
verticalTurts = []
# use interesting shapes and colors
turtleShapes = ["arrow", "turtle", "circle", "square"]
horizColors = ["red", "blue", "green", "orange"]
vertColors = ["darkred", "darkblue", "lime", "salmon"]
hCollided = []
vCollided = []
spacing=50
for shape in turtleShapes:
    ht = t.Turtle(shape=shape)
    horizontalTurts.append(ht)
    ht.penup()
    ht.fillcolor(horizColors.pop())
    ht.setheading(0)
    vt = t.Turtle(shape=shape)
    verticalTurts.append(vt)
    vt.penup()
    vt.fillcolor(vertColors.pop())
    vt.setheading(270)
    spacing+=25
    ht.speed(0)
    vt.speed(0)
horizontalTurts[0].goto(-250,50)
horizontalTurts[1].goto(-250,20)
horizontalTurts[2].goto(-250,-20)
horizontalTurts[3].goto(-250,-50)
verticalTurts[0].goto(-20,250)
verticalTurts[1].goto(0,250)
verticalTurts[2].goto(90,250)
verticalTurts[3].goto(60,250)

def checkCollison():
    for h in horizontalTurts:
        for v in verticalTurts:
            if (abs(h.xcor() - v.xcor()) < collisionDistance) and (abs(h.ycor()-v.ycor())<collisionDistance):
                h.fillcolor("gray")
                v.fillcolor("gray")
                hCollided.append(h)
                vCollided.append(v)
                #horizontalTurts.remove(h)       #remove from the list stop stop them moving, cant move something not in the list
                #verticalTurts.remove(v)    


#moving the turtles
distanceToMove=2
collisionDistance=15
#'zips' two lists together, then reads from two lists at the same time
for step in range(3000000000000000000):
    for h, v in zip(horizontalTurts,verticalTurts):
        if h not in hCollided:
            h.fd(distanceToMove)
        if v not in vCollided:
            v.fd(distanceToMove)
        #check if at end of road
        if horizontalTurts[0].xcor()>=300:
            horizontalTurts[0].goto(-250,50)
        if horizontalTurts[1].xcor()>=300:
            horizontalTurts[1].goto(-250,20)
        if horizontalTurts[2].xcor()>=300:
            horizontalTurts[2].goto(-250,-20)
        if horizontalTurts[3].xcor()>=300:
            horizontalTurts[3].goto(-250,-50)
        if verticalTurts[0].ycor()<=-300:
            verticalTurts[0].goto(-20,250)
        if verticalTurts[1].ycor()<=-300:
            verticalTurts[1].goto(0,250)
        if verticalTurts[2].ycor()<=-300:
            verticalTurts[2].goto(90,250)
        if verticalTurts[3].ycor()<=-300:
            verticalTurts[3].goto(60,250)
        #check for collision
        checkCollison()