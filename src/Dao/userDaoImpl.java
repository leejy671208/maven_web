import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

public class userDaoImpl implements userDao{
    @Override
    public User login(User user){
        JdbcTemplate jdbc=new Template(new ComboPooledDataSource());
    }
}
