package io

def path="."

new File(path).eachFileRecurse { file ->
    if(file.name.endsWith(".java")){
        println file
    }
}