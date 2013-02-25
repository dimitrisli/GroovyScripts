package io

def path="."

new File(path).eachFileMatch(~/.*\.java/) { file ->
    if(file.name.endsWith(".java")){
        println file
    }
}