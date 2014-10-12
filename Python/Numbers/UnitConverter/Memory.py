'''
Created on 12 Oct 2014

@author: sraone
'''

import utilities as u

class Memory(object):
    size = ''
    metric = ''
    target = ''
    
    Metrics = ['BYTES','KILOBYTES','MEGABYTES','GIGABYTES','TERABYTES']
    
    def __init__(self):
        (self.size, self.metric, self.target) = u.get_input('size', self.Metrics)
        
    def convert(self):
        value = self.conv_mem(self.size, self.metric, self.target)
        u.print_output(self.size, self.metric, value, self.target)
        return value;
    
    def conv_mem(self, size, metric, target):
        return (self.bytes_to(self.to_bytes(size,metric), target))
    
    def bytes_to(self,value,target):
        if target == 'BYTES':
            return value
        elif target == 'KILOBYTES':
            return ( value / 1024 )
        elif target == 'MEGABYTES' :
            return ( self.bytes_to (value,'KILOBYTES') / 1024 )
        elif target == 'GIGABYTES' :
            return ( self.bytes_to(value, 'MEGABYTES') / 1024 )
        elif target == 'TERABYTES' :
            return ( self.bytes_to (value, 'GIGABYTES') / 1024 )
        
    def to_bytes (self,value, metric):
        if metric == 'BYTES' :
            return value
        elif metric == 'KILOBYTES' :
            return (value / 1024)
        elif metric == 'MEGABYTES' :
            return ( self.to_bytes(value, 'KILOBYTES') * 1024 )
        elif metric == 'GIGABYTES' :
            return ( self.to_bytes(value, 'MEGABYTES') * 1024 )
        elif metric == 'TERABYTES' :
            return ( self.to_bytes ( value, 'GIGABYTES') * 1024 )
        
        
        
        
        