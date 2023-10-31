#import
import turtle as t
import time
import random
#game config globals
bodyParts=[]
delay=0.05
#object creation
wn =t.Screen()
wn.bgcolor("gray")
wn.setup(width=600,height=600)

head = t.Turtle(shape="circle")
head.speed(3)
head.penup()
head.direction = "stop"


head2 = t.Turtle(shape="circle")
head2.speed(3)
head2.penup()
head2.direction = "stop"

food = t.Turtle()
food.speed(0)
food.shape("circle")
food.shapesize(.5,.5)       #scales the turle object by 50%
food.color("red")
food.penup()
food.goto(100,100)

#functions
def up():
    #in maze runner we used setHeading
    if head.direction != "down":
        head.direction = "up"
def left():
    #in maze runner we used setHeading
    if head.direction != "right":
        head.direction = "left"
def right():
    #in maze runner we used setHeading
    if head.direction != "left":
        head.direction = "right"
        
def down():
    #in maze runner we used setHeading
    if head.direction != "up":
        head.direction = "down"

def move():
    if head.direction == "up":
        head.sety(head.ycor()+20)
    elif head.direction == "down":
        head.sety(head.ycor()-20)
    elif head.direction == "right":
        head.setx(head.xcor()+20)
    elif head.direction == "left":
        head.setx(head.xcor()-20)
    
def up2():
    #in maze runner we used setHeading
    if head.direction != "down":
        head.direction = "up"
def left2():
    #in maze runner we used setHeading
    if head.direction != "right":
        head.direction = "left"
def right2():
    #in maze runner we used setHeading
    if head.direction != "left":
        head.direction = "right"
        
def down2():
    #in maze runner we used setHeading
    if head.direction != "up":
        head.direction = "down"

def move2():
    if head.direction == "up":
        head.sety(head.ycor()+20)
    elif head.direction == "down":
        head.sety(head.ycor()-20)
    elif head.direction == "right":
        head.setx(head.xcor()+20)
    elif head.direction == "left":
        head.setx(head.xcor()-20)
    

    
def hideTheBodyParts():
    global bodyParts
    head.goto(0,0)
    head.direction="stop"
    for eachPart in bodyParts:
        eachPart.goto(1000,1000)
    bodyParts=[]
#events
wn.onkeypress(up,"w")
wn.onkeypress(left,"a")
wn.onkeypress(right,"d")
wn.onkeypress(down,"s")
wn.listen()


#mainloop
while True:
    wn.update()     #updates or refreshes the screen

    #TODO border collision?
    if head.xcor()>290 or head.xcor()<-290 or head.ycor()>290 or head.ycor()<-290:
        head.goto(0,0)
        head.direction="stop"
        for eachPart in bodyParts:
            eachPart.goto(1000,1000)
        bodyParts=[]
    
    
    
    
        
    #TODO: collide with the food
    if head.distance(food) < 20:                #returns the distance between the objects
        #food moves
        food.goto(random.randint(-290,290),random.randint(-290,290))
    #grow a body part
        part = t.Turtle(shape="square")
        part.speed(0)
        part.penup()
        bodyParts.append(part)
        
    
    #move the body parts
    
    #move the butt to the neck
    for i in range(len(bodyParts)-1,0,-1):
        x=bodyParts[i-1].xcor()
        y=bodyParts[i-1].ycor()
        bodyParts[i].goto(x,y)
    
    #move neck to head
    if len(bodyParts)>0:
        x=head.xcor()
        y=head.ycor()
        bodyParts[0].goto(x,y)


   
    move()

    #TODO: did we hit ourselves? or did we hit our body parts
    for part in bodyParts:
        if part.distance(head)<10:
            hideTheBodyParts()
    
    
    time.sleep(delay)
    
    
    
    
    