package db

//Download ojdbc5.jar (JDK 1.5) or ojdbc6.jar (JDK 1.6) for Oracle 11gR2 from:
//http://www.oracle.com/technetwork/database/enterprise-edition/jdbc-112010-090769.html
//Add to classpath

import groovy.sql.Sql
def sql = Sql.newInstance("jdbc:oracle:thin:@//DBAPP:1521/DBAPP_STR",
        "username","pass","oracle.jdbc.pool.OracleDataSource")

def tuples = "select 1 from dual"

sql.eachRow(tuples){
    print "${it."1"}"
}