from random import randint
#reads in to the text file. then, if it finds a /n at the end of the line, it sets it to only go from 0:-1 to hide its visability
def loadPuzzle(path='Book1.csv'):
    with open(path, 'r') as puzzle:
        lines = puzzle.readlines()
    puzzle = []
    for line in lines:
        if "\n" in line[-1]:
            line = line[:-1]
        puzzle.append(line.split(","))

    return puzzle

def validatePuzzle(puzzle):
    rowLength = len(puzzle[0])
    for row in puzzle:
        if len(row) != rowLength:
            return False
    return True


puzzle=loadPuzzle()
if validatePuzzle(puzzle):
    someWords = ["matplotlib","Binary","Computer Science","Decimal","Hexadecimal","Jupyter","Notebook","Octal","Pandas","Powershell"]
    #for words in somewords
    for word in someWords:
        for x in range(len(puzzle)):
            #for the vertical in length range of puzzle
            for y in range(len(puzzle[x])):
                #for the vertical length range of puzzle
                if puzzle[x][y].upper() == word[0].upper():
                    #if the puzzle coordinates in the first letter are equal to the word's first letter
                    #check horizontal forward
                    #constrains the puzzle so that the check doesnt run off of the puzzle.
                    if len(puzzle[x]) - y >= len(word):
                        found = True
                        coordinates = (x+1,y+1)
                        #print(puzzle[x][y])
                        #print(coordinates)
                        #for characters in range length of word
                        #if the the found letter and the letter next to it do not equal the words correct characters, it breaks out of the loop and finds the next starting letter
                        #this part of the code is pretty much the same for the rest with different constraints so that it finds the right words in the right directions.
                        for c in range(len(word)):
                            if puzzle[x][y+c].upper() != word[c].upper():
                                found = False
                                break
                        if found:    
                            print(f"Found {word} at {coordinates} in the forward horizontal")
                    
                    #check horizontal reverse
                    if y >= len(word):
                        found = True
                        coordinates = (x+1,y+1)
                        #print(puzzle[x][y])
                        #print(coordinates)
                        for c in range(len(word)):
                            #print(puzzle[x][y-c],word[c].upper())
                            if puzzle[x][y-c].upper() != word[c].upper():
                                found = False
                                break
                        if found:    
                            print(f"Found {word} at {coordinates} in the reverse horizontal")
                    
                    #check vertical down
                    if len(puzzle) - x >= len(word):
                        found = True
                        coordinates = (x+1,y+1)
                        #print(puzzle[x][y])
                        #print(coordinates)
                        for c in range(len(word)):
                            if puzzle[x+c][y].upper() != word[c].upper():
                                found = False
                                break
                        if found:    
                            print(f"Found {word} at {coordinates} in the down vertical")

                    #check vertical up
                    if x >= len(word):
                        found = True
                        coordinates = (x+1,y+1)
                        #print(puzzle[x][y])
                        #print(coordinates)
                        for c in range(len(word)):
                            if puzzle[x-c][y].upper() != word[c].upper():
                                found = False
                                break
                        if found:    
                            print(f"Found {word} at {coordinates} in the up vertical")
                    
                    #check diagonal down left
                    if len(puzzle) - x >= len(word) and y >= len(word):
                        found = True
                        coordinates = (x+1,y+1)
                        #print(puzzle[x][y])
                        #print(coordinates)
                        for c in range(len(word)):
                            if puzzle[x+c][y-c].upper() != word[c].upper():
                                found = False
                                break
                        if found:    
                            print(f"Found {word} at {coordinates} in the down diagonal left")
                    
                    #check diagonal down right
                    if len(puzzle) - x >= len(word) and len(puzzle[x]) - y >= len(word):
                        found = True
                        coordinates = (x+1,y+1)
                        #print(puzzle[x][y])
                        #print(coordinates)
                        for c in range(len(word)):
                            if puzzle[x+c][y+c].upper() != word[c].upper():
                                found = False
                                break
                        if found:    
                            print(f"Found {word} at {coordinates} in the down diagonal right")
                    
                    #check diagonal up left
                    if len(puzzle) - x >= len(word) and y >= len(word):
                        found = True
                        coordinates = (x+1,y+1)
                        #print(puzzle[x][y])
                        #print(coordinates)
                        for c in range(len(word)):
                            if puzzle[x-c][y-c].upper() != word[c].upper():
                                found = False
                                break
                        if found:    
                            print(f"Found {word} at {coordinates} in the up diagonal left")
                    
                    #check diagonal up right
                    if len(puzzle) - x >= len(word) and len(puzzle[x]) - y >= len(word):
                        found = True
                        coordinates = (x+1,y+1)
                        #print(puzzle[x][y])
                        #print(coordinates)
                        for c in range(len(word)):
                            if puzzle[x-c][y+c].upper() != word[c].upper():
                                found = False
                                break
                        if found:    
                            print(f"Found {word} at {coordinates} in the up diagonal right")
