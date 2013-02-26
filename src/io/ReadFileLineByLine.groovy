package io

def path = "a.txt"

new File(path).eachLine {line ->
    println line
}