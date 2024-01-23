package creational.builder;
// This is the builder pattern implementation with no flied duplication
public class Database {

    private String port;
    private String userName;
    private String pass;
    private String databasetype;

    public static DatabaseBuilder builder(){
        return new DatabaseBuilder();
    }

    public String toString(){
        return "port: "+port+" username : "+ userName +" pass : "+pass;
    }
    public static class DatabaseBuilder{

        private Database database;

        public DatabaseBuilder(){
            database = new Database();
        }

        public DatabaseBuilder userName(String name){
          this.database.userName = name;
          return this;
        }

        public DatabaseBuilder port(String port){
            this.database.port = port;
            return this;
        }

        public DatabaseBuilder databaseType(String type){
            this.database.databasetype = type;
            return this;
        }
        public DatabaseBuilder pass(String pass){
            this.database.pass = pass;
            return this;
        }

        public Database build(){
            Database dataBaseObj = new Database();
            dataBaseObj.port  = database.port;
            dataBaseObj.userName  = database.userName;
            dataBaseObj.pass  = database.pass;
            dataBaseObj.databasetype  = database.databasetype;
            return dataBaseObj;
        }
    }

}
