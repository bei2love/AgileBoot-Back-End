package com.agileboot.infrastructure.aspectj;

/**
 * 数据过滤处理
 *
 * @author ruoyi
 */
//@Aspect
//@Component
public class DataScopeAspect {

    /**
//     * 全部数据权限
//     */
//    public static final String DATA_SCOPE_ALL = "1";
//
//    /**
//     * 自定数据权限
//     */
//    public static final String DATA_SCOPE_CUSTOM = "2";
//
//    /**
//     * 部门数据权限
//     */
//    public static final String DATA_SCOPE_DEPT = "3";
//
//    /**
//     * 部门及以下数据权限
//     */
//    public static final String DATA_SCOPE_DEPT_AND_CHILD = "4";
//
//    /**
//     * 仅本人数据权限
//     */
//    public static final String DATA_SCOPE_SELF = "5";
//
//    /**
//     * 数据权限过滤关键字
//     */
//    public static final String DATA_SCOPE = "dataScope";
//
//    @Before("@annotation(controllerDataPermissionScope)")
//    public void doBefore(JoinPoint point, DataPermissionScope controllerDataPermissionScope) throws Throwable {
//        clearDataScope(point);
//        handleDataScope(point, controllerDataPermissionScope);
//    }
//
//    protected void handleDataScope(final JoinPoint joinPoint, DataPermissionScope controllerDataPermissionScope) {
//        // 获取当前的用户
//        LoginUser loginUser = AuthenticationUtils.getLoginUser();
//        if (loginUser != null) {
//            SysUser currentUser = loginUser.getUser();
//            // 如果是超级管理员，则不过滤数据
//            if (currentUser != null && !currentUser.isAdmin()) {
//                dataScopeFilter(joinPoint, currentUser, controllerDataPermissionScope.deptAlias(),
//                    controllerDataPermissionScope.userAlias());
//            }
//        }
//    }
//
//    /**
//     * 数据范围过滤
//     *
//     * @param joinPoint 切点
//     * @param user 用户
//     * @param userAlias 别名
//     */
//    public static void dataScopeFilter(JoinPoint joinPoint, SysUser user, String deptAlias, String userAlias) {
//        StringBuilder sqlString = new StringBuilder();
//
//        for (SysRole role : user.getRoles()) {
//            String dataScope = role.getDataScope();
//            if (DATA_SCOPE_ALL.equals(dataScope)) {
//                sqlString = new StringBuilder();
//                break;
//            } else if (DATA_SCOPE_CUSTOM.equals(dataScope)) {
//                sqlString.append(StrUtil.format(
//                    " OR {}.dept_id IN ( SELECT dept_id FROM sys_role_dept WHERE role_id = {} ) ", deptAlias,
//                    role.getRoleId()));
//            } else if (DATA_SCOPE_DEPT.equals(dataScope)) {
//                sqlString.append(StrUtil.format(" OR {}.dept_id = {} ", deptAlias, user.getDeptId()));
//            } else if (DATA_SCOPE_DEPT_AND_CHILD.equals(dataScope)) {
//                sqlString.append(StrUtil.format(
//                    " OR {}.dept_id IN ( SELECT dept_id FROM sys_dept WHERE dept_id = {} or find_in_set( {} , ancestors ) )",
//                    deptAlias, user.getDeptId(), user.getDeptId()));
//            } else if (DATA_SCOPE_SELF.equals(dataScope)) {
//                if (StrUtil.isNotBlank(userAlias)) {
//                    sqlString.append(StrUtil.format(" OR {}.user_id = {} ", userAlias, user.getUserId()));
//                } else {
//                    // 数据权限为仅本人且没有userAlias别名不查询任何数据
//                    sqlString.append(" OR 1=0 ");
//                }
//            }
//        }
//
//        if (StrUtil.isNotBlank(sqlString.toString())) {
//            Object params = joinPoint.getArgs()[0];
//            if (params != null && params instanceof BaseEntity) {
//                BaseEntity baseEntity = (BaseEntity) params;
//                baseEntity.getParams().put(DATA_SCOPE, " AND (" + sqlString.substring(4) + ")");
//            }
//        }
//    }
//
//    /**
//     * 拼接权限sql前先清空params.dataScope参数防止注入
//     */
//    private void clearDataScope(final JoinPoint joinPoint) {
//        Object params = joinPoint.getArgs()[0];
//        if (params != null && params instanceof BaseEntity) {
//            BaseEntity baseEntity = (BaseEntity) params;
//            baseEntity.getParams().put(DATA_SCOPE, "");
//        }
//    }
}
