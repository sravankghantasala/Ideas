'''
Created on 11-Oct-2014

@author: ghantasa
'''

from Temperature import Temperature

if __name__ == '__main__':
    while (True):
        choice = input ('Available conversions ... \n' +
                    '1. Temperature\n' +
                    '2. Distance\n' +
                    '3. Memory\n' +
                    '4. Weight\n' +
                    '5. Exit\n' +
                    'Please enter your choice ... ' )
        if choice == '1' :
            t = Temperature()
            t.convert()
        elif choice == '2' :
            convertDistance ()
        elif choice == '3':
            convertMemoory()
        elif choice == '4' :
            convertWeight()
        else:
            print('Exiting now ... Bye!')
            break
    