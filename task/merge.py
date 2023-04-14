if __name__ == '__main__':
    list1 = [1, 3, 4, 5]
    list2 = [2, 6, 7, 8]
    numbers = list1 + list2
    for i in range(len(numbers)):
        for j in range(i+1, len(numbers)):
            if numbers[i] > numbers[j]:
                numbers[i], numbers[j], = numbers[j], numbers[i]
    print(numbers)