'''
Prime Factorization - Have the user enter a number and find all Prime Factors (if there are any) and display them.

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

def get_primefactors ():
    number = int (input('Enter the number ... '))
    pf = list()
    for i in get_factors(number):
        if (is_prime(i)): 
            pf.append(i)
    return pf

if __name__ == '__main__':
    print(get_primefactors())
    