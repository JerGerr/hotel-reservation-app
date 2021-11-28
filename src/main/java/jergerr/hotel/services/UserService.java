package jergerr.hotel.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import jergerr.hotel.entity.User;
import jergerr.hotel.temp.CurrentUser;

//Service Pattern for User
public interface UserService extends UserDetailsService {

	public User findUserByEmail(String email);

	public void saveUser(CurrentUser currentUser);

	public int getLoggedUserId();
}
