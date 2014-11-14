'''
Created on 14-Nov-2014

@author: ghantasa
'''
import os
import re

class CountWords(object):
    
    def __init__(self,params): 
        if os.path.isfile(params):
            self.words = ' '.join([ x.decode('utf-8').strip('"\' \n\r') for x in open(params,'rb').readlines() if (x and not x.isspace()) ])
        elif isinstance(params,str):
            self.words = params
        else:
            print('Invalid type!')
            exit(1)
        
    def get_count(self):
        summary = dict()
        for word in self.words.split():
            if word.isalnum():
                summary[word.lower()] = summary.get(word.lower(),0) + 1
        return summary
    
    def summary(self):
        summ = self.get_count()
        for (k,v) in summ.items():
            print ('{0} : {1}'.format(k,v))
            
        print('-----------------------')
        print('Total Words = {0}'.format(sum(summ.values())))
        

if __name__ == '__main__':
    CW = CountWords('')
    CW.summary()