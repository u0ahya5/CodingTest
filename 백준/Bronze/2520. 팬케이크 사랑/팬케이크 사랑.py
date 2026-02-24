T = int(input())

for i in range(T):
    input()

    arr = list(map(int, input().split()))
    arr1 = list(map(int, input().split()))

    count = min(
        arr[0] / 8,
        arr[1] / 8,
        arr[2] / 4,
        arr[3] / 1,
        arr[4] / 9
    )

    cake = int(count * 16)

    topping = ( 
        arr1[0] +
        arr1[1] // 30 +
        arr1[2] // 25 +
        arr1[3] // 10
    )

    print(min(cake, topping))