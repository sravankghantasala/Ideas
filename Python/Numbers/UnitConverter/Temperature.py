'''
Created on 11-Oct-2014

@author: ghantasa
'''

import utilities as u
class Temperature(object):
 
    temperature = ''
    metric = ''
    target = ''
    
    Metrics = ['FAHRENHEIT','CELSIUS']
    def __init__(self):
        (self.temperature, self.metric, self.target) = u.get_input('temperature', self.Metrics) 
        
    def conv_temp (self, temp, metric, target ):
        temp = float(temp)
        if metric.upper() == 'FAHRENHEIT':
            value = temp - 32
            value *= (5.0/9.0)
            return round(value,2)
        else:
            value = (temp * (9.0/5.0))
            value += 32;
            return round(value,2)
        
    def convert (self):
        value = self.conv_temp(self.temperature, self.metric, self.target)
        u.print_output(self.temperature, self.metric, value, self.target)
        return value;
    
    
            