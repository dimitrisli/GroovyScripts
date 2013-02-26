package io

// cp using AntBuilder
def ant = new AntBuilder()
ant.copy(file:"a.txt", tofile:"b.txt")

// cp to directory
ant.copy(file:"src.txt", todir:"../logs")

// cp to directory force overwrite
ant.copy(file:"src.txt", todir:"../logs", overwrite:true)

// cp a dir
ant.copy(todir:"logBackup"){
    fileset(dir:"logs")
}

// cp dir selectively with subdirectories
ant.copy(todir:"backupLogs", overwrite:true){
    fileset(dir:"logs"){
        include(name:"**/*.java")
        exclude(name:"**/*.sql")
    }
}