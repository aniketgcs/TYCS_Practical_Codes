p=23
g=9
print("the value of p is",p)
print("the value of g is",g)

a=4
print("the secret number for alice is: ",a)
x=int(pow(g,a,p))

b=6
print("the secret number for bob is: ",b)
y=int(pow(g,b,p))

ka=int(pow(y,a,p))
kb=int(pow(x,b,p))

print("the secert key for alica is: ",ka)
print("the secert key for bob is: ",kb)

