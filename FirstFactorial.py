# -*- coding: utf-8 -*-
"""
Created on Sun Jun 18 08:35:48 2023

@author: pc
"""

def FirstFactorial(num):

  sonuc = 1
  for a in range (1,num+1):
    sonuc = sonuc * a
  # code goes here
  return sonuc

# keep this function call here 
print(FirstFactorial(input()))