'''
Created on 11-Oct-2014

@author: ghantasa
'''

from Operations import MathOps

if __name__ == '__main__':
    mo = MathOps();
    while ( True ):
        choice = input ('\n\nAvailable Operations ...\n' + 
                        '1. Addition\n' +
                        '2. Subtraction\n' +
                        '3. Multiplication\n' +
                        '4. Division\n' + 
                        '5. Power\n' +
                        '6. Root\n' +
                        '7. Exit\n' +
                        'Please select the Operation ... ')
        if choice == '1' :
            print('Result : ',mo.add(input('Please enter the first number '), input('Please enter the second number ')))
        elif choice == '2' :
            print('Result : ',mo.sub(input('Please enter the first number '), input('Please enter the second number ')))
        elif choice == '3' :
            print('Result : ',mo.mul(input('Please enter the first number '), input('Please enter the second number ')))
        elif choice == '4' :
            print('Result : ',mo.div(input('Please enter the first number '), input('Please enter the second number ')))
        elif choice == '5' :
            print('Result : ',mo.pow(input('Please enter the number '), input('Please enter the exponent ')))
        elif choice == '6' :
            print('Result : ',mo.root(input('Please enter the number '), input('Please enter the exponent ')))
        elif choice == '7' :
            print('Exiting Now .. Bye!')
            break
        else :
            print ('Invalid input')