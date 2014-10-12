'''
Created on 11-Oct-2014

@author: ghantasa
'''
import utilities as u

class Distance(object):
    distance = ''
    metric = ''
    target = ''
    
    Metrics = ['MILLIMETERS','CENTIMETERS','METERS','KILOMETERS','MILES','INCHES','FOOTS']
    def __init__(self):
        (self.distance, self.metric, self.target) = u.get_input('distance', self.Metrics) 
 
    def convert (self):
        value = self.conv_dist(self.distance, self.metric, self.target)
        u.print_output(self.distance, self.metric, value, self.target)
        return value;
    
    def conv_dist (self, distance, metric, target):
        return (self.mm_to(self.to_mm(distance,metric), target))
    
    def mm_to (self, value, metric):
        if metric == "MILLIMETER":
            return value
        elif metric == "CENTIMETER":
            return (value/10)
        elif metric == "METER":
            return (self.mm_to(value,"CENTIMETER")/100)
        elif metric == "KILOMETER":
            return (self.mm_to(value,"METER")/1000)
        elif metric == "MILE":
            return (value/1609344)
        elif metric == "INCH":
            return (value/24.5)
        elif metric == "FOOT":
            return (value/304.8)
        
    def to_mm (self, value, target):
        if target == "MILLIMETER":
            return value
        elif target == "CENTIMETER":
            return (value * 10)
        elif target == "METER":
            return (self.to_mm(value,"CENTIMETER") *100)
        elif target == "KILOMETER":
            return (self.to_mm(value, "METER") * 1000)
        elif target == "MILE" :
            return (value * 1609344)
        elif target == "INCH" :
            return ( value * 24.5 )
        elif target == "FOOT":
            return ( value * 304.8 )
            
        
        
        
        
        
        
        
            