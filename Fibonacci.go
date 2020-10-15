package main

import "fmt"

func Fibo(n int) int {
	if n <= 1 {
		return n
	}
	return Fibo(n-1) + Fibo(n-2)
}

func main() {
	var n int
	var i int
	fmt.Print("Enter the value of n: ")
	fmt.Scanln(&n)
	for i = 0; i < n; i++ {
		fmt.Print(Fibo(i), " ")
	}
}
