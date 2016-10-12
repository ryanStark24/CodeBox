package ECUtils;
public interface ECConst {
	String DB_NAME ="FSystemDB";
	String DB_HOST="localhost";
	String DB_USER="root";
	String DB_PASS ="";
	String SQLS[] = 
	{
   "CREATE TABLE IF NOT EXISTS `students` ( `id` int(11) NOT NULL AUTO_INCREMENT, `Name` varchar(25) NOT NULL, `Userid` varchar(25) NOT NULL, `Password` varchar(25) NOT NULL, `Submit` tinyint(1) NOT NULL, PRIMARY KEY (`id`) ) ENGINE=InnoDB",
	"CREATE TABLE IF NOT EXISTS `FSystemDB`.`FSystem` ( `id` INT NOT NULL AUTO_INCREMENT , `Teacher` VARCHAR(30) NOT NULL , `Unit1` INT NOT NULL , `Unit2` INT NOT NULL , `Unit3` INT NOT NULL , `Unit4` INT NOT NULL , `Unit5` INT NOT NULL , PRIMARY KEY (`id`)) ENGINE = InnoDB"		
	


        };
}
