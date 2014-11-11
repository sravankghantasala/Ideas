'''
Created on 11-Oct-2014

@author: ghantasa
'''
def get_input (unit, metrics):
    value = float(input('Please enter the ' + unit + ' ... '))
    while (True):
        metric = input ('Please select the metric [ ' + ','.join(metrics) + ' ] ... ').upper()
        if metric in metrics : break
        else : print('There is not such metric! ')
    
    while (True):
        print_conversions(metrics, metric)
        target = input ('Please enter a target metric for conversion ... ').upper()
        if target in metrics : break
        else : print('There is no such metric! ')
        
    return  (value, metric, target)
     
def print_conversions (metrics, current_metric):
    for i in metrics:
        if not i == current_metric.upper() : print ("\t" + current_metric.upper() + ' --> ' + i)
        
def print_output (value, metric, result, target):
    print (str(value) +" " + metric + " is equal to " + str(result) + ' ' + target + '\n')