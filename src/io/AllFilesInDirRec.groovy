package io

def path="."

new File(path).eachFileRecurse { file ->
    if(file.isFile()){
        println file
    }
}