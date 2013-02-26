package io

def path="."

new File(path).eachFile { file ->
    if(file.isFile()){
        println file
    }
}