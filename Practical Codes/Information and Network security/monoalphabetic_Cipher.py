keys={'a':'z','b':'y','c':'x','d':'w','e':'v','f':'u','g':'t','h':'s','i':'r','j':'q','k':'p','l':'o','m':'n'}
reverse_keys={}
for key,value in keys.items():
    reverse_keys[value]=key

def encrypt(text):
    text=str(text)
    encrypting=[]
    for l in text:
        encrypting.append(keys.get(l,l))
    print(''.join(encrypting))

def decipher(text):
    text=str(text)
    decrypted=[]
    for l in text:
        decrypted.append(reverse_keys.get(l,l))
    print(''.join(decrypted))


strToEncrypt=input("enter a string to encrypt: ")
print(encrypt(strToEncrypt))
print(decipher(encrypt(strToEncrypt)))