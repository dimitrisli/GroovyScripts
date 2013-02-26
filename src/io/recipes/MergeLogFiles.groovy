package io.recipes

def path = "."
File logDir = new File(path)
File mergedFile = new File("path/to/merged.log")
mergedFile << ""

logDir.eachFile {file ->
    if (file.isFile() && file.name.endsWith(".log")){
        mergedFile << file.text
    }
}