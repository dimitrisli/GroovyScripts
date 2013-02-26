package io

// cp using file text as string
File src = new File("src.txt")
new File("dest.txt").write(src.text)

// cp binary files
new File("dest.dat").withOutputStream { out ->
    out.write src.readBytes()
}

// cp from Unix OS
File dest = new File("dest.txt")
"cp ${src.name} ${dest.name}".execute()

// cp by adding method on File
File.metaClass.copy = { String destName ->
    if (delegate.isFile()){
        new File(destName).withOutputStream { out ->
            out.write delegate.readBytes()
        }
    }
}
new File("src.txt").copy("dest.txt")