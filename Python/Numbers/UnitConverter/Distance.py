'''
Created on 11-Oct-2014

@author: ghantasa
'''
import utilities as u
class Distance(object):
    distance = ''
    metric = ''
    target = ''
    
    Metrics = ['MILLIMETERS','CENTIMETERS','METERS','KILOMETERS','MILES','INCHES','FOOT']
    def __init__(self):
        (self.distance, self.metric, self.target) = u.get_input('temperature', self.Metrics) 
 
    def convert (self):
        value = self.conv_dist(self.distance, self.metric, self.target)
        u.print_output(self.distance, self.metric, value, self.target)
        return value;
    
    def conv_dist (self, distance, metric, target):
        pass
    
    def to_mm (self, value, metric):
        if metric.upper() == "MILLIMETER":
            return value
        elif metric.upper() == "CENTIMETER":
            return (value/10)
        elif metric.upper() == "METER":
            return (self.to_mm(value,"CENTIMETER")/100)
        elif metric.upper() == "KILOMETER":
            return (self.to_mm(value,"METER")/1000)
        elif metric.upper() == "MILE":
            return (self.to_mm(value/10)
        elif metric.upper() == "INCH":
            return (value/10)
        elif metric.upper() == "FOOT":
            return (value/10)
        
            