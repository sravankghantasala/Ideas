'''
Next Prime Number - Have the program find prime numbers until the user chooses to stop asking for the next one.

Created on 10 Oct 2014

@author: sraone
'''
def get_factors (num):
    temp = list()
    for i in range(2,num) :
        if num%i == 0:
            temp.append(i)
    return temp

def is_prime (number):
    if not get_factors(number): return True
    else: False
    
def get_next_prime(num):
    while(True):
        num+=1;
        if (is_prime (num)): return num
        
if __name__ == '__main__':
    i = 1
    print('First prime number : 1')
    if (input('Do you want to see next prime number ? [y/n]') == 'y'):
        Continue = True
        while(Continue):
            i = get_next_prime(i)
            print('Next prime number ... ' + str(i))
            if (input('Do you want to see next prime number ? [y/n]') == 'n'): Continue = False
            
            
            
            