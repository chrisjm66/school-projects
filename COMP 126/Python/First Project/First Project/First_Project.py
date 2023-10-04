import random

sentence = (input( 'what do u want repeated by some random number \n'))
print( sentence * random.randint(0,9))
if sentence == 'Hello': 
 print( 'good job' )
else:
 print( 'you didnt guess the secret word' )