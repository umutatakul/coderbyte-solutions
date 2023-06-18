# -*- coding: utf-8 -*-
"""
Created on Sun Jun 18 08:05:25 2023

@author: pc
"""

def FirstReverse(strParam):
  reverseParam = ""
  
  for a in range(len(strParam)):
    
    reverseParam = reverseParam + strParam[-1 - a]
    

  # code goes here
  return reverseParam

# keep this function call here 
print(FirstReverse(input()))