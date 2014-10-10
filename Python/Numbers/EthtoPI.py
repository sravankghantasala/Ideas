'''
Created on 10 Oct 2014

@author: sraone
'''

from decimal import *

# Hard limit where the program execution stops
LIMIT = 20 


def get_EthtoPI (limit = LIMIT ):
    '''
        Returns the value of given fraction to n decimals
        Max limit is 20
        Returns the value as Decimal
    '''
    if limit > LIMIT : limit = LIMIT
    
    # Making precescion limit to hard limit as float doesnt support more than 17 charecters.
    getcontext().prec = limit
    
    numerator = input('Enter the numerator ... ')
    denominator = input ('Enter the denominator ... ')
    
    return (Decimal(numerator) / Decimal (denominator))
    

if __name__ == '__main__':
    print (get_EthtoPI(10))
    