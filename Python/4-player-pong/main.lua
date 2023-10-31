--[[
    Love2D looks for mail functions
        it has a certain order that the program HAS TO run
]]

push = require 'push'       --import
Class = require 'class'
require 'ball'
require 'Paddle'


--screen rate 16:9.........remember this
WINDOW_WIDTH = 720
WINDOW_HEIGHT = 720
--vurtual window size:  your coordinates will be based on this system
VIRTUAL_WIDTH = 300
VIRTUAL_HEIGHT = 300

PADDLE_SPEED = 200


--runs when the game first starts up, only once....... only once
function love.load()

    -- nearest-nearest filtering on upscaling and downscaling to prevent blurring of text and graphics
    love.graphics.setDefaultFilter('nearest','nearest')


    love.window.setTitle('Pong')
    --set the seed or the "randomness" of the serve
    --if we set randomness based on time, in theory it is the most random
    math.randomseed(os.time())


    --more retro looking font we need to load it in
    smallFont = love.graphics.newFont('font.ttf',8)
    scoreFont = love.graphics.newFont('font.ttf',35)
    largeFont = love.graphics.newFont('font.ttf',16)

    love.graphics.setFont(smallFont)

    sounds = {
        ['paddle_hit'] = love.audio.newSource('sounds/paddle_hit.wav','static'),
        ['score'] = love.audio.newSource('sounds/score.wav','static'),
        ['wall_hit'] = love.audio.newSource('sounds/wall_hit.wav','static')
    }
    
    
    push:setupScreen(VIRTUAL_WIDTH,VIRTUAL_HEIGHT,WINDOW_WIDTH,WINDOW_HEIGHT,{
    fullscreen=false,
    resizable=false,
    vsync=true
   })
   --set up score
    player1Score = 7
    player2Score = 7
    player3Score = 7
    player4Score = 7

    --create paddle
    player1 = Paddle(10,30,5,20)
    player2 = Paddle(VIRTUAL_WIDTH-10,VIRTUAL_HEIGHT-30,5,20)
    player3 = Paddle(VIRTUAL_WIDTH/2,VIRTUAL_HEIGHT/2-145,20,5)
    player4 = Paddle(VIRTUAL_WIDTH/2,VIRTUAL_HEIGHT-10,20,5)

    --create a ball
    ball = Ball(VIRTUAL_WIDTH/2-2,VIRTUAL_HEIGHT/2-2,4,4)

    gameState = 'start'
end
--update runs every time the screen refreshes
function love.update(dt)
    if love.keyboard.isDown('w') then
        player1.dy=-PADDLE_SPEED
    elseif love.keyboard.isDown('s') then
        player1.dy=PADDLE_SPEED
    else
        player1.dy=0
    end

    if love.keyboard.isDown('up') then
        player2.dy=-PADDLE_SPEED
    elseif love.keyboard.isDown('down') then
        player2.dy=PADDLE_SPEED
    else
        player2.dy=0
    end

    if love.keyboard.isDown('d') then
        player3.dx=PADDLE_SPEED
    elseif love.keyboard.isDown('a') then
        player3.dx=-PADDLE_SPEED
    else
        player3.dx=0
    end

    if love.keyboard.isDown('left') then
        player4.dx=-PADDLE_SPEED
    elseif love.keyboard.isDown('right') then
        player4.dx=PADDLE_SPEED
    else
        player4.dx=0
    end

    if ball.x < 0 then
        player1Score = player1Score - 1
        servingPlayer = 2
        if player1Score ==0 then
             winningPlayer=1
             gameState='done'
        else
             gameState = 'serve'
        end
        ball:reset()
        sounds['score']:play()
    end
    if ball.y < 0 then
            player3Score = player3Score - 1
            servingPlayer = 2
            if player3Score ==0 then
                winningPlayer=3
                gameState='done'
            else
                gameState = 'serve'
            end
            ball:reset()
            sounds['score']:play()
    end
    if ball.x > VIRTUAL_WIDTH then
            player2Score = player2Score - 1
            servingPlayer = 1
            if player2Score ==0 then
                winningPlayer=2
                gameState='done'
            else
                gameState = 'serve'
            end
            ball:reset()
            sounds['score']:play()
    end
    if ball.y > VIRTUAL_HEIGHT then
        player4Score = player4Score - 1
        servingPlayer = 1
        if player4Score ==0 then
            winningPlayer=4
            gameState='done'
        else
            gameState = 'serve'
        end
        ball:reset()
        sounds['score']:play()
    end
    if gameState == 'serve' then
        if servingPlayer == 1 then
             ball.dx = -math.random(140,200)
             ball.dy = math.random(50,-50)
        elseif servingPlayer == 2 then
             ball.dx = math.random(140,200)
             ball.dy = math.random(50,-50)
        elseif servingPlayer == 3 then
             ball.dy = -math.random(140,200)
             ball.dx = math.random(-50,50)
        else
             ball.dy = math.random(140,200)
             ball.dx = math.random(-50,50)
        end
    elseif gameState == 'play' then
        if ball:collides(player1) then
             ball.dx = -ball.dx * 1.03
             ball.x = player1.x+5
             if ball.dy<0 then
                  ball.dy= -math.random(10,150)
             else
                  ball.dy= math.random(10,150)
             end
             sounds['paddle_hit']:play()
        end
        if ball:collides(player2) then
             ball.dx = -ball.dx * 1.03
             ball.x = player2.x-5
             if ball.dy<0 then
                  ball.dy= -math.random(10,150)
             else
                  ball.dy= math.random(10,150)
             end
             sounds['paddle_hit']:play()
        end
        if ball:collides(player3) then
             ball.dy = -ball.dy * 1.03
             ball.y = player3.y+5
             if ball.dx<0 then
                  ball.dx= -math.random(10,150)
             else
                  ball.dx= math.random(10,150)
             end
             sounds['paddle_hit']:play()
        end
        if ball:collides(player4) then
             ball.dy = -ball.dy * 1.03
             ball.y = player4.y-5
             if ball.dx<0 then
                  ball.dx= -math.random(10,150)
             else
                  ball.dx= math.random(10,150)
             end
             sounds['paddle_hit']:play()
        end
        -- if ball.y<=0 then
        --      ball.y=0
        --      ball.dy= -ball.dy
        --      sounds['wall_hit']:play()
        -- end
        -- if ball.y>= VIRTUAL_HEIGHT-4 then
        --      ball.y = VIRTUAL_HEIGHT-4
        --      ball.dy = -ball.dy
        --      sounds['wall_hit']:play()
        -- end
        ball:update(dt)
    end
        

    --if the ball reaches the left edge of the screen,
    --reset the ball update score
    
    if ball.x < 0 then
        player1Score = player1Score - 1
        servingPlayer = 1
        if player1Score ==0 then
                winningPlayer=1
                gameState='done'
        else
                gameState = 'serve'
        end
        ball:reset()
        sounds['score']:play()
    end
    if ball.y < 0 then
        player3Score = player3Score - 1
        servingPlayer = 3
        if player3Score ==0 then
                winningPlayer=3
                gameState='done'
        else
                gameState = 'serve'
        end
        ball:reset()
        sounds['score']:play()
    end
    if ball.x > VIRTUAL_WIDTH then
        player2Score = player2Score - 1
        servingPlayer = 2
        if player2Score ==0 then
                winningPlayer=2
                gameState='done'
        else
                gameState = 'serve'
        end
        ball:reset()
        sounds['score']:play()
    end
    if ball.y > VIRTUAL_HEIGHT then
        player4Score = player4Score - 1
        servingPlayer = 4
        if player4Score ==0 then
                winningPlayer=4
                gameState='done'
        else
                gameState = 'serve'
        end
        ball:reset()
        sounds['score']:play()
    end
        
    
    --if the ball reaches the right edge of the screen.
    -- reset the ball and update the score
    if ball.x > VIRTUAL_WIDTH then
        player1Score = player1Score + 1
        servingPlayer = 1
        sounds['score']:play()
        if player1Score==50 then
            winningPlayer=1
            gameState='done'
        else
            gameState = 'serve'
            ball:reset()
        end

        ball:update(dt)
     end   
    player1:update(dt,1)
    player2:update(dt,2)
    player3:update(dt,3)
    player4:update(dt,4)

        --pos = init pos + vector*time  kinematics
end

function love.keypressed(key)
    --keys can be accessed by a string name
    if key =='escape' then
        love.event.quit()
    elseif key=='enter' or key=='return' then
        if gameState == 'start' then
            gameState = 'serve'
        elseif gameState == 'serve' then
            gameState = 'play'
        elseif gameState == 'done' then
            gameState='serve'
            ball:reset()
            player1Score=7
            player2Score=7
            player3Score=7
            player4Score=7

            if winningPlayer == 1 then
                servingPlayer=2
            elseif winningPlayer == 3 then
                servingPlayer=4
            else
                servingPlayer=1
            end
        end
    end
end
--Called after update function by love#D, this draws what is on your screen
function love.draw()

    push:apply('start')
    
    --clear the screen and set the background color
    love.graphics.clear(40,45,52,255)
    love.graphics.setFont(smallFont)
    if gameState == 'start' then
        love.graphics.setFont(smallFont)
        love.graphics.printf('Welcome to Pong!', 0, 10, VIRTUAL_WIDTH, 'center')
        love.graphics.printf('Press Enter to begin!', 0, 20, VIRTUAL_WIDTH, 'center')
    elseif gameState == 'serve' then
        love.graphics.setFont(smallFont)
        love.graphics.printf('Player ' .. tostring(servingPlayer) .. "'s serve!", 
            0, 10, VIRTUAL_WIDTH, 'center')
        love.graphics.printf('Press Enter to serve!', 0, 20, VIRTUAL_WIDTH, 'center')
    elseif gameState == 'play' then
        -- no UI messages to display in play
    elseif gameState == 'done' then
        love.graphics.setFont(largeFont)
        love.graphics.printf('Player ' .. tostring(winningPlayer) .. ' losses!',
            0, 10, VIRTUAL_WIDTH, 'center')
        love.graphics.setFont(smallFont)
        love.graphics.printf('Press Enter to restart!', 0, 30, VIRTUAL_WIDTH, 'center')
    end
    love.graphics.setFont(scoreFont)
    love.graphics.setColor(255,0,0)
    love.graphics.print(tostring(player1Score), VIRTUAL_WIDTH / 2 - 50, VIRTUAL_HEIGHT / 3)
    love.graphics.setColor(0,255,0)
    love.graphics.print(tostring(player2Score), VIRTUAL_WIDTH / 2 + 30, VIRTUAL_HEIGHT / 3)
    love.graphics.setColor(125,18,255)
    love.graphics.print(tostring(player3Score), VIRTUAL_WIDTH / 2 - 50, VIRTUAL_HEIGHT / 3+50)
    love.graphics.setColor(255,255,0)
    love.graphics.print(tostring(player4Score), VIRTUAL_WIDTH / 2 + 30, VIRTUAL_HEIGHT / 3+50)

    love.graphics.setColor(255,0,0)
     player1:render()
     love.graphics.setColor(0,255,0)
     player2:render()
     love.graphics.setColor(125,18,255)
     player3:render()
     love.graphics.setColor(255,255,0)
     player4:render()
    --ball
    ball:render()
    displayFPS()

    --end rendering of virtual res
    push:apply('end')

end

function displayFPS()
    -- simple FPS display across all states
    love.graphics.setFont(smallFont)
    love.graphics.setColor(0, 255, 0, 255)
    love.graphics.print('FPS: ' .. tostring(love.timer.getFPS()), 10, 10)
    end


