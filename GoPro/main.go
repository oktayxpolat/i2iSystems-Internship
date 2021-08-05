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
	newFile, err := os.Create("data.txt")
	if err != nil {
		log.Fatal(err)
	}
	defer newFile.Close()
	sum := 0
	total := 0
	for i := 0; i < len(txtlines); i++ {
		text := strings.Split(txtlines[i], "\t")
		for j := 0; j < len(text)-1; j++ {
			num, err := strconv.Atoi(text[j])
			if err != nil {
				log.Fatalf("couldn^t convert to int: %s", err)
			}
			sum += num
		}
		total += sum
		data := sum / (len(text) - 1)
		newFile.WriteString(fmt.Sprintf("%d. Line: %d\n", i+1, data))
		sum = 0
	}
	newFile.WriteString(fmt.Sprintf("\nTotal: %d", total/len(txtlines)))
}
