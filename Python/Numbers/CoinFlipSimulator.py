'''
Created on 12 Nov 2014

@author: sraone
'''
from random import randint
import time
tosses = {'Head':0,'Tail':0}

def FlipCoin(iters):
    for i in range(1,iters+1):
        print('Flipping Coin for {0} time ... '.format(i), end = ' ')
        time.sleep(1)
        toss = randint(1,2)
        if toss == 1 : toss = 'Head' 
        else : toss = 'Tail'
        print (toss)
        tosses[toss] += 1
        
    else : 
        print('\n----------------------------------------')
        print('Result : {0}\nHeads : {1}\nTails : {2}'.format(toss,tosses.get('Head'),tosses.get('Tail')))
        
    
if __name__ == '__main__':
    while (True) :
        iterations = input('Please enter the times you want to flip the coin ... ')
        if not iterations.isdigit():
            print('Please enter a valid number ... ')
        else : break
    FlipCoin(int(iterations))