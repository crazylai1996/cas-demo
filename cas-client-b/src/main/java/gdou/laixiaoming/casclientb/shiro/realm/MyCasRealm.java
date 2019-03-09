package gdou.laixiaoming.casclientb.shiro.realm;

import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.cas.CasRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class MyCasRealm extends CasRealm{

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //获取用户名
        String username = (String)principals.getPrimaryPrincipal();

        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
//        authorizationInfo.setRoles(new HashSet<>(Arrays.asList("admin")));
//        authorizationInfo.setStringPermissions(new HashSet<>(Arrays.asList("admin")));

        return authorizationInfo;
    }
}
