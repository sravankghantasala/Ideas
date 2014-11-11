'''
Created on 11-Nov-2014

@author: ghantasa
'''

def is_happy(number):
    '''Function that finds the ahppy number recursively.

    Accepts a number for which happy number has to be tested.
    Returns True if the number is a happy number or False if not.
    '''
    try:
        if number != 1: 
            res = 0
            for digit in str(number):
                digit = int(digit)
                res += digit*digit
            return is_happy(res) 
        else:
            return True
    except RuntimeError :
        return False
           
            
if __name__ == '__main__':
    while(True):
        try:
            number = int(input('Please enter a number '))
            break
        except: 
            print('Please enter a valid number')

    if is_happy(number) : print('{0} is a happy number :)'.format(number))
    else: print('{0} is not a happy number :( '.format(number))