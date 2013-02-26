package io

def path="."

new File(path).eachFile { file ->
    println file
}