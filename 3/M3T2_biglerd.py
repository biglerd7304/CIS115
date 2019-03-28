# CIS 115
# biglerd
# M3T2
# 10/3/18

#turtle Python example 2

import turtle

def main():
    alex = turtle.Turtle()
    bob = turtle.Turtle()
    christine = turtle.Turtle()
    
    sides = int(input("Number of sides? "))
    size = int(input("Size of polygon? "))

    #space the turtles
    alex.penup()
    bob.penup()
    christine.penup()
    alex.forward(-size*2)
    bob.forward(0)
    christine.forward(size*2)

    #customize the turtles
    alex.pensize(3)
    bob.pensize(4)
    christine.pensize(2)
    alex.pencolor("red")
    bob.pencolor("green")
    christine.pencolor("blue")

    # draw shapes
    drawPolygon(alex, sides, size)
    drawPolygon(bob, sides, size)
    drawPolygon(christine, sides, size)


def drawPolygon(t, sides ,size):
    """
    uses turtle to draw a n sided polygon.
    input: t - a turtle
            sides - number of sides
            size - length of one side
            
    """
    t.pendown()
    for side in range(sides):
        t.forward(size)
        t.right(360/sides) #angle dependes on polygon


# run program
main()
