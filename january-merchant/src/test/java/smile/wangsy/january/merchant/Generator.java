package smile.wangsy.january.merchant;


import wang.smile.common.util.PropertiesFileUtil;
import wang.smile.generator.util.MybatisGeneratorUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangsy
 * @Date 2018/5/25.
 */
public class Generator {
    /**
     * 模块名称
     */
    private static String MODULE = "january-merchant";
    /**
     * 数据库名称
     */
    private static String DATABASE = "january";
    /**
     * 表前缀
     */
    private static String TABLE_PREFIX = "";
    /**
     * 包名
     */
    private static String PACKAGE_NAME = "smile.wangsy.january.merchant";

    private static String JDBC_DRIVER = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.driver");
    private static String JDBC_URL = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.url");
    private static String JDBC_USERNAME = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.username");
    private static String JDBC_PASSWORD = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.password");
    /**
     * Service模板路径
     */
    private static String service_vm = "/template/Service.vm";
    /**
     * ServiceMock模板路径
     */
    private static String serviceMock_vm = "/template/ServiceMock.vm";
    /**
     * ServiceImpl模板路径
     */
    private static String serviceImpl_vm = "/template/ServiceImpl.vm";
    /**
     * generatorConfig模板路径
     */
    private static String generatorConfig_vm = "/template/generatorConfig.vm";
    /**
     * 自动代码生成
     * @param args
     */
    public static void main(String[] args) throws Exception {
        /**
         * 需要insert后返回主键的表配置，key:表名, value:主键名
         */
        Map<String, String> map = new HashMap<>();
        map.put("merchant", "id");
        MybatisGeneratorUtil.generator(
                JDBC_DRIVER,
                JDBC_URL,
                JDBC_USERNAME,
                JDBC_PASSWORD,
                MODULE,
                DATABASE,
                TABLE_PREFIX,
                PACKAGE_NAME,
                generatorConfig_vm,
                service_vm,
                serviceMock_vm,
                serviceImpl_vm,
                map
        );
    }

}
