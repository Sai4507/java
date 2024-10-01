import random
import string

def generate_password(length):
    characters = string.ascii_letters + string.digits + string.punctuation
    password = ''.join(random.choice(characters) for i in range(length))

    return password


password_length = input("Enter a number: ")
generated_password = generate_password(password_length)
print("Generated password:", generated_password)
