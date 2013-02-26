package io

def path = "a.txt"

File file = new File(path)
println  "${new File(path).newReader().iterator().inject(0) { num, l -> ++num }} lines"

file.append("\nanother line\n")
file << "yet another line thru operator overloading"
println  "${new File(path).newReader().iterator().inject(0) { num, l -> ++num }} lines"