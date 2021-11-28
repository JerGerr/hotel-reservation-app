package jergerr.hotel.dao;

import jergerr.hotel.entity.Role;

//DAO Pattern for Role
public interface RoleDao {

	public Role findRoleByName(String roleName);
	
}
