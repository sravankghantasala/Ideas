'''
Created on 11-Nov-2014

@author: ghantasa
'''
from math import floor

denominations = [1000,500,100,50,10,5,1,0.5,0.25,0.1,0.01]

def get_me_denominations(change):
    '''Returns the denominations and their numbers in a dictionary.
    
    Accepts the amount for which the change needs to calculated.
    prepares a dict for every denomination with number of bills of that denomination
    needs to be given.
    Piase is the least conisdered denomination and 1000s are the max denomniations.
    '''
    change_dict = dict()
    for denom in denominations:
        if change > denom:
            change_dict[denom] = floor(change/denom)
            change = change-(change_dict[denom]*denom)

    return change_dict

if __name__ == '__main__':
#     Get inputs
    cost=float(input('Please enter the total cost ... '))
    amount=float(input('Please enter the amount tendered ... '))
#     Get the difference need to be given
    change = amount-cost
    
    if change > 0:
#         If change has to be given

#         Get the change in dict
        change_dict = get_me_denominations(amount-cost)
        
        print('Change to be given ... ')
        
#         For every denomination
        for denom in denominations: # Using denominations instead of dict.keys() for an ordered output
            denom_change = change_dict.get(denom)
            if denom_change: #if the change for the denomination has to be given
                print('\t{0:>10} x {1} = {2}'.format(denom,denom_change,denom*denom_change))
        
        # Print total
        print('\t-------------------------------')
        print('\t\t Total = {0}'.format(change))
        
#     If no change has to be given
    elif change == 0: print('Thanks for giving the exact change :) ')
    
#     If amount given is less thant the cost.
    else: print('Please give amount more than {0}'.format(cost))
    
        