'''
Created on 12 Oct 2014

@author: sraone
'''

import utilities as u

class Weight(object):
    weight = ''
    metric = ''
    target = ''
    
    Metrics = ['MILLIGRAMS','GRAMS','KILOGRAMS','LBS','TONNES','POUNDS']
    
    def __init__(self):
        (self.weight, self.metric, self.target) = u.get_input('weight', self.Metrics) 
 
    def convert (self):
        value = self.conv_weight(self.weight, self.metric, self.target)
        u.print_output(self.weight, self.metric, value, self.target)
        return value;
    
    def conv_weight (self, weight, metric, target):
        return (self.mg_to(self.to_mg(weight,metric), target))
    
    def mg_to (self, value, metric):
        if metric == "MILLIGRAMS":
            return value
        elif metric == "GRAMS":
            return (value/1000)
        elif metric == "KILOGRAMS":
            return (self.mg_to(value,"GRAMS")/1000)
        elif metric == "LBS":
            return (value/453592.37)
        elif metric == "TONNES":
            return (self.mg_to(value,'KILOGRAMS') / 1000 )
        elif metric == "POUNDS":
            return (self.mg_to(value,'LBS'))
                
    def to_mg (self, value, target):
        if target == "MILLIGRAMS":
            return value
        elif target == "GRAMS":
            return (value * 1000)
        elif target == "KILOGRAMS":
            return (self.to_mg(value,"GRAMS") *1000)
        elif target == "LBS":
            return (value * 453592.37)
        elif target == "TONNES" :
            return (self.to_mg(value,'KILOGRAMS') * 1000)
        elif target == "POUNDS" :
            return ( self.to_mg(value, 'LBS'))
        
    
        