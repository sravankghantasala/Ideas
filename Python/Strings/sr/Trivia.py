'''Does some trivial operations on strings.

Reverse a String - Enter a string and the program will reverse it and print it out.

Check if Palindrome - Checks if the string entered by the user is a palindrome. That is that it reads the same forwards as backwards like “racecar”

Pig Latin - Pig Latin is a game of alterations played on the English language game. To create the Pig Latin form of an English word the initial consonant sound is transposed to the end of the word and an ay is affixed (Ex.: "banana" would yield anana-bay). Read Wikipedia for more information on rules.

Count Vowels - Enter a string and the program counts the number of vowels in the text. For added complexity have it report a sum of each vowel found.

Created on 14-Nov-2014

@author: ghantasa
'''
from collections import OrderedDict

class Trivia(object):
    
    def __init__(self,param):
        if len(param.split()) == 1: # accept only one word at a time.
            self.word = param
        else : print('Only one word is accepted!'); exit(1)
        
    def reverse(self):
        return self.word[::-1]
    
    def palindrome(self):
        return True if self.word == self.reverse() else False
    
    def countVowels(self):
        vowelcount = OrderedDict()
        for vowel in ['a','e','i','o','u']:
            vowelcount[vowel] = self.word.lower().count(vowel)
        else: return vowelcount
        
    def piglatin(self):
        for letter in self.word:
            if letter in ['a','e','i','o','u','A','E','I','O','U']:
                break 
        print(letter)
        index = self.word.index(letter)
        return (self.word[index:] + self.word[:index] + 'ay').lower()
    
    
if __name__ == '__main__':
    t = Trivia('MADAM')
    print(t.reverse())
    print(t.palindrome())
    print(t.piglatin())
    for k,v in t.countVowels().items():
        print(k,': ',v,end = ', ')