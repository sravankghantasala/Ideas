'''
Created on 11-Oct-2014

@author: ghantasa
'''

class MathOps(object):
    '''
    classdocs
    '''    
    def add (self,a=0,b=0):
        return (float(a) + float(b))
    
    def sub (self,a=0,b=0):
        return (float(a) - float(b))
    
    def mul (self,a=0,b=0):
        return (float(a) * float(b))
    
    def div (self,a=0,b=0):
        return (float(a) / float(b))
    
    def pow (self,a=0,b=0):
        return (float(a) ** float(b))
    
    def root (self,a=0,b=0):
        return (float(a) ** (1.0/float(b)))
    