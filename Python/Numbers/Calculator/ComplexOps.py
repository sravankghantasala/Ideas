'''
Created on 11-Nov-2014

@author: ghantasa
'''
import re

# TODO: How about having only two variables at a time ?
class ComplexOps(object):
    '''
    classdocs
    '''
    complex_regex = re.compile(r'^(\d+)([\+|\-]\d+)(\w)$')
            
    def validate_numbers(self, numbers):
        for number in numbers:
            if not self.complex_regex.match(number):
                return False
        else: return True
            
    def add(self, *numbers):
        res = ''
        if self.validate_numbers(numbers):
            (const, imag_const, imag_var) = re.findall(self.complex_regex, numbers[0])[0]
            const = int(const); imag_const=int(imag_const)
            for number in numbers[1:]:
                (constant, imag_constant, imag_variable) = re.findall(self.complex_regex, number)[0]
                if imag_variable == imag_var:
                    const += int(constant)
                    imag_const += int(imag_constant)
                else:
                    print('invalid imaginary variables found!')
                    exit(1)
            else:
                return self.format_number(const,imag_const, imag_var)
        else:
            print('Incompatible data types found!')
            exit(1)
        
    def sub(self, *numbers):
        res = ''
        if self.validate_numbers(numbers):
            (const, imag_const, imag_var) = re.findall(self.complex_regex, numbers[0])[0]
            const = int(const); imag_const=int(imag_const)
            for number in numbers[1:]:
                (constant, imag_constant, imag_variable) = re.findall(self.complex_regex, number)[0]
                if imag_variable == imag_var:
                    const -= int(constant)
                    imag_const -= int(imag_constant)
                else:
                    print('invalid imaginary variables found!')
                    exit(1)
            else:
                return self.format_number(const,imag_const,imag_var)
        else:
            print('Incompatible data types found!')
            exit(1)
    
    def mul(self, *numbers):   
        if self.validate_numbers(numbers):
            res = ''
            (const,imag_const,imag_var) = re.findall(self.complex_regex,numbers[0])[0]
            const = int(const); imag_const = int(imag_const)
            for number in numbers[1:]:
                (constant,imag_constant,imag_variable) = re.findall(self.complex_regex,number)[0]
                if not number == self.conjugate(self.format_number(const,imag_const,imag_var)):
                    if imag_variable == imag_var:
                        t1 = (const*int(constant) ) + (-1*(imag_const * int(imag_constant)))
                        t2 = (const*int(imag_constant)) + (imag_const * int(constant))
                        const = t1 ; imag_const = t2
                    else:
                        print('Invalid imaginary variables found !')
                else:
                    return  str((const * int(constant)) + ((imag_const * int(imag_constant)) * -1))

            else: return self.format_number(const,imag_const,imag_var)
        else: print("Incompatible data types found!"); exit(1)
        
    def div(self, *numbers):
        if self.validate_numbers(numbers):
            res = ''
            (const,imag_const,imag_var) = re.findall(self.complex_regex,numbers[0])[0]
            const = int(const); imag_const = int(imag_const)
            for number in numbers[1:]:
                if not number == self.format_number(const,imag_const, imag_var):
                    (constant,imag_constant,imag_variable) = re.findall(self.complex_regex,number)[0]
                    if imag_var == imag_variable:
                        conjugate = self.conjugate(number)
                        num = self.format_number(const,imag_const,imag_var)
                        numerator = self.mul(''.join(num),conjugate)
                        denominator = int(self.mul(number,conjugate))
                        nr = re.findall(self.complex_regex,numerator)[0]
                        const = int(nr[0])/denominator
                        imag_const = int(nr[1])/denominator
                    else:
                        print('Invalid Imaginary variables found!')
#                 TODO: Have to find a good method for dealing with continuous division after dividing with same complex number
                else: return '1'
            
            else: return self.format_number(const,imag_const,imag_var)
        else:
            print('Incompatible data types found!')
    
    def format_number(self,*number):
        if len(number) == 3:
            num = list(map(str,number))
            num[1] = '+' + num[1] if float(num[1]) >= 0 else num[1]
            return (''.join(num))
        
    def conjugate(self,number):
        if self.validate_numbers((number,)):
            num = list(re.findall(self.complex_regex,number)[0])
            num[1] = int(num[1]) * -1
            return self.format_number(*num)
        else: print('Not a valid number')
                 
if __name__ == '__main__':
    CO = ComplexOps()
    print(CO.add('8+1i','8-1i'))
    print(CO.sub('8+1i','8-1i'))
    print(CO.mul('8+1i','8-1i'))
    print(CO.div('8+1i','8-1i'))
#     print(CO.format_number('3','1','i'))
#     print(CO.conjugate('3+2i'))
