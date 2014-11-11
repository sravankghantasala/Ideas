'''
Created on 11-Nov-2014

@author: ghantasa
'''
import re
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
            imag_var = ''; const = 0; imag_const = 0
            for number in numbers:
                (constant, imag_constant, imag_variable) = re.findall(self.complex_regex, number)[0]
                if imag_variable == imag_var or imag_var == '':
                    const += int(constant)
                    imag_const += int(imag_constant)
                    imag_var = imag_variable
            res = str(const) 
            res += '+' if imag_const > 0 else '' 
            res += str(imag_const) + imag_var
            
        return res
        
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
                    
            res = str(const) 
            res += '+' if imag_const > 0 else '' 
            res += str(imag_const) + imag_var
            
        return res
    
    def mul(self, *numbers):   
        if self.validate_numbers(numbers):
            res = ''
            (const,imag_const,imag_var) = re.findall(self.complex_regex,numbers[0])[0]
            const = int(const); imag_const = int(imag_const)
            for number in numbers[1:]:
                (constant,imag_constant,imag_variable) = re.findall(self.complex_regex,number)[0]
                if imag_variable == imag_var:
                    t1 = (const*int(constant) ) + abs((imag_const * int(imag_constant)))
                    t2 = (const*int(imag_constant)) + (imag_const * int(constant))
                    const = t1 ; imag_const = t2
            res += str(const)
            res += '+' if imag_const > 0 else ''
            res += str(imag_const) + imag_var
            
            return res
        else: print("Incompatible data types"); exit(1)
        
    def div(self, *numbers):
        pass
    
if __name__ == '__main__':
    CO = ComplexOps()
    print(CO.mul('4-1i','3+1i'))
