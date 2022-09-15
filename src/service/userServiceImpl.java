public class userServiceImpl implements userService{
    @Override
    public boolean login(User user){
        if(us.login(user)!=null){
            return true;
        }
        return false;
    }
}
