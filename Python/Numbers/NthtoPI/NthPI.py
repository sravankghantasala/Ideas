'''
Created on 10 Oct 2014

@author: sraone
'''
from decimal import *

# Hard limit where the program execution stops
LIMIT = 20 

# Making precescion limit to hard limit as float doesnt support more than 17 charecters.
getcontext().prec = LIMIT

def get_NthPI(limit=LIMIT):
    '''
        Returns the value of PI to n decimals
        Max limit is 20
        Returns the value as string
    '''
    pi=(Decimal(22)/Decimal(7))
    return (str(pi)[:limit])

if __name__ == '__main__':
    print (get_NthPI(10))