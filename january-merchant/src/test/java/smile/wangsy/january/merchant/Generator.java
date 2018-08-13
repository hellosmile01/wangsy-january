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
     * 包名
     */
    private static String PACKAGE_NAME = "smile.wangsy.january.merchant";

    private static String JDBC_DRIVER = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.driver");
    private static String JDBC_URL = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.url");
    private static String JDBC_USERNAME = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.username");
    private static String JDBC_PASSWORD = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.password");

    private static String PROJECT_PATH = System.getProperty("user.dir");
    /**
     * 模板路径
     */
    private static String TEMPLATE_FILE_PATH = PROJECT_PATH + "/" + MODULE + "/src/test/resources/template";

    /**
     * 自动代码生成
     * @param args
     */
    public static void main(String[] args) {
        MybatisGeneratorUtil.generator(JDBC_DRIVER, JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD, PROJECT_PATH,
                MODULE, PACKAGE_NAME, null, "merchant", TEMPLATE_FILE_PATH
        );
    }

}
