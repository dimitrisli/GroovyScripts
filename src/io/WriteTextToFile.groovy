package io

def path = "a.txt"

file = new File(path)
file.write("Hello\n")
println file.text