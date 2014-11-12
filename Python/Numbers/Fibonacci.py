'''
Fibonacci Sequence - Enter a number and have the program generate the Fibonacci sequence to that number or to the Nth number.

Created on 10 Oct 2014

@author: sraone
'''

def fibonacci(input):
    print('0 1 1', end = " ")
    a,b = 1,1
#     num_int=int(num-2)
    for i in range (input-3):
        a,b=b,a+b
        print (b, end = " ")

if __name__ == '__main__':
#     TODO: Have to accept value only greater than three 
    fibonacci(int(input('Please enter the number of fibonacci numbers you want ... '))) 
    