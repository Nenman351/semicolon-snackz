if __name__ == "__main__":
    birthday = 28
    while True:
        guess = int(input("Enter my birthday: "))
        if guess == birthday:
            print("Correct Guess!!!")
            break
        elif guess != birthday:
            print("Incorrect Guess!!!")















# from random import random


#
#
# def guessing_game():
#     number = 28
#     counter = 0
#     guess_number = int(input("Guess a number between 1 and 30: "))
#     while counter < 5:
#         if guess_number == number:
#             print("Correct Guess!")
#             break
#         elif guess_number < number:
#             print("Too low, Try again.")
#             counter += 1
#         elif guess_number < number:
#             print("Too low, Try again.")
#             counter += 1
#
#
# if __name__ == '__main__':
#     guessing_game()
