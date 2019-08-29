def print_triangle_type():
    side_or_quit = input(
        "*********************************\n请输入第一个边长(退出请输入 q)：")
    if side_or_quit == 'q':
        return
    try:
        side1 = int(side_or_quit)
        side2 = int(input("请输入第二个边长:"))
        side3 = int(input("请输入第三个边长:"))
    except ValueError:
        print('抱歉，输入的不是有效的整数')
        print_triangle_type()
        return

    if (side1 <= 0 or side2 <= 0 or side3 <= 0):
        print('抱歉，请输入正整数')
        print_triangle_type()
        return
    if side1 >= (side2 + side3) or side2 >= (side1 + side3) or side3 >= (side1 + side2):
        print('抱歉，输入的三边不能组成一个有效的三角形')
        print_triangle_type()
        return
    if (side1 == side2 and side1 == side3):
        print('恭喜，您输入的是一个等边三角形')
        print_triangle_type()
    elif (side1 == side2 or side1 == side3 or side2 == side3):
        print('恭喜，您输入的是一个等腰三角形')
        print_triangle_type()
    else:
        print('恭喜，您输入的是一个不规则三角形')
        print_triangle_type()


if __name__ == '__main__':
    print_triangle_type()
