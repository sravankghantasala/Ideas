'''
Created on 12 Nov 2014

@author: sraone
'''
from collections import OrderedDict

class CountVowels(object):
    '''
    classdocs
    '''
    
    def count(self,word):
        vowelcount = OrderedDict()
        for vowel in ['a','e','i','o','u']:
            vowelcount[vowel] = word.count(vowel)
        else: return vowelcount
        

if __name__ == '__main__':
    CV = CountVowels()
    vc = CV.count('banana')
    for k,v in vc.items():
        print(k + ': ' + str(v))
        
    print('----')
    print('Total : ',sum(vc.values()))
        