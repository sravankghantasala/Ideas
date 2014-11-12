'''
Created on 11-Nov-2014

@author: ghantasa
'''

def format_binary(number):
    number = number[2:].rjust(16,'0')
    t = ' '
    for cursor in range(0,len(number),4):
        t += str(number[cursor:cursor+4]) + ' '
    return t.lstrip()

def convert_to_dec(number, base):
    try:
        if base == 'bin':
            return int(number, 2)
        elif base == 'dec':
            return int(number)
        elif base == 'oct':
            return int(number, 8)
        elif base == 'hex':
            return int(number, 16)
    except: 
        print('{0} is not a valid "{1}" base number!'.format(number, base))
        exit(1)

def convert_to_binary(number, base):
    try:
        return format_binary(bin(convert_to_dec(number,base)))
    except: 
        print('{0} is not a valid "{1}" base number!'.format(number, base))
        exit(1)
    
def convert_to_oct(number, base):
    try:
        return oct(convert_to_dec(number,base))[2:]
    except: 
        print('{0} is not a valid "{1}" base number!'.format(number, base))
        exit(1)

def convert_to_hex(number, base):
    try:
        return hex(convert_to_dec(number,base))[2:]
    except: 
        print('{0} is not a valid "{1}" base number!'.format(number, base))
        exit(1)
    
if __name__ == '__main__':
#     Accept a number
    number = input('please input a number ... ')
    
#     Checking for the validity of the number...
    try:
        int(number)
    except:
        print('{0} is not a valid integer!'.format(number))
        exit(1)
    
    while(True):
        base = input('Please enter the base of the number [bin/dec/oct/hex] ... ').lower()
        if base in ['bin','dec','oct','hex']: break
        else: print('Please choose the base from the menu ... ')
        
    while(True):
        target_base = input('Please enter the base you want to convert to [bin/dec/oct/hex] ... ').lower()
        if target_base in ['bin','dec','oct','hex']: break
        else: print('Please choose the base from the menu ... ')
    
    if target_base == 'bin':
            print(convert_to_binary(number, base))
    
    elif target_base == 'dec':
#             If number is decimal
#             convert to the binary
        print(convert_to_dec(number,base))
        
    elif target_base == 'oct':
        print(convert_to_oct(number, base))
        
    elif target_base == 'hex':
        print(convert_to_hex(number, base))
    
    else : print('No such conversion available ... ')
     
    