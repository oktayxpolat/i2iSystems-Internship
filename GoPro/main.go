package main

import (
	"bufio"
	"fmt"
	"log"
	"os"
	"strconv"
	"strings"
)

func main() {
	file, err := os.Open("Numbers.txt")

	if err != nil {
		log.Fatalf("failed opening file: %s", err)
	}

	scanner := bufio.NewScanner(file)
	scanner.Split(bufio.ScanLines)
	var txtlines []string

	for scanner.Scan() {
		txtlines = append(txtlines, scanner.Text())
	}

	file.Close()

	sum := 0
	for i := 0; i < len(txtlines); i++ {
		text := strings.Split(txtlines[i], "\t")
		for j := 0; j < len(text)-1; j++ {
			num, err := strconv.Atoi(text[j])
			if err != nil {
				log.Fatalf("couldn^t convert to int: %s", err)
			}
			sum += num
		}
		fmt.Printf("%d. Line %d\n", i+1, sum/(len(text)-1))
	}
}
