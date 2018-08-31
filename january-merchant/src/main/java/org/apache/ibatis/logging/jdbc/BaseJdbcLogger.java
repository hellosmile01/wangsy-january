//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.apache.ibatis.logging.jdbc;

import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.logging.Log;

import java.util.*;

public abstract class BaseJdbcLogger {
    protected static final Set<String> SET_METHODS = new HashSet();
    protected static final Set<String> EXECUTE_METHODS = new HashSet();
    private Map<Object, Object> columnMap = new HashMap();
    private List<Object> columnNames = new ArrayList();
    private List<Object> columnValues = new ArrayList();
    private Log statementLog;

    public BaseJdbcLogger(Log log) {
        this.statementLog = log;
    }

    protected void setColumn(Object key, Object value) {
        this.columnMap.put(key, value);
        this.columnNames.add(key);
        this.columnValues.add(value);
    }

    protected Object getColumn(Object key) {
        return this.columnMap.get(key);
    }

    protected String getParameterValueString() {
        List<Object> typeList = new ArrayList(this.columnValues.size());
        Iterator i$ = this.columnValues.iterator();

        while(i$.hasNext()) {
            Object value = i$.next();
            if(value == null) {
                typeList.add("null");
            } else {
                typeList.add(value + "(" + value.getClass().getSimpleName() + ")");
            }
        }

        String parameters = typeList.toString();
        return parameters.substring(1, parameters.length() - 1);
    }

    protected String getColumnString() {
        return this.columnNames.toString();
    }

    protected void clearColumnInfo() {
        this.columnMap.clear();
        this.columnNames.clear();
        this.columnValues.clear();
    }

    protected String removeBreakingWhitespace(String original) {
        StringTokenizer whitespaceStripper = new StringTokenizer(original);
        StringBuilder builder = new StringBuilder();

        while(whitespaceStripper.hasMoreTokens()) {
            builder.append(whitespaceStripper.nextToken());
            builder.append(" ");
        }

        return builder.toString();
    }

    protected boolean isDebugEnabled() {
        return this.statementLog.isDebugEnabled();
    }

    protected boolean isTraceEnabled() {
        return this.statementLog.isTraceEnabled();
    }

    private static String sql = "";
    protected void debug(String text) {
//        if(this.statementLog.isDebugEnabled()) {
//            this.statementLog.debug(text);
//        }
        text = text.trim();
        if (statementLog.isDebugEnabled()) {
            if (text.startsWith("==>  Preparing:")) {
                sql = text.substring(text.indexOf(":") + 1);
                return;
            }
            if (text.startsWith("==> Parameters:")) {
                String temp = text.substring(text.indexOf(":") + 1);
                String[] split = temp.split(",");
                if (split != null & split.length > 0) {
                    for (String string2 : split) {
                        String s = string2.trim();
                        if(StringUtils.isNotEmpty(s) && s.indexOf("(")>0) {
                            sql = sql.replaceFirst("\\?", s.substring(0, s.indexOf("(")));
                        }
                    }
                }
                text = "Preparing:" + sql;
                sql = "";
            }
            statementLog.debug(text);
        }
    }
    protected void trace(String text) {
//        if(this.statementLog.isTraceEnabled()) {
//            this.statementLog.trace(text);
//        }
        text = text.trim();
        if (statementLog.isDebugEnabled()) {
            if (text.startsWith("==>  Preparing:")) {
                sql = text.substring(text.indexOf(":") + 1);
                return;
            }
            if (text.startsWith("==> Parameters:")) {
                String temp = text.substring(text.indexOf(":") + 1);
                String[] split = temp.split(",");
                if (split != null & split.length > 0) {
                    for (String string2 : split) {
                        String s = string2.trim();
                        sql = sql.replaceFirst("\\?", s.substring(0, s.indexOf("(")));
                    }
                }
                text = "Preparing:" + sql;
                sql = "";
            }
            statementLog.debug(text);
        }
    }

    public Log getStatementLog() {
        return this.statementLog;
    }

    static {
        SET_METHODS.add("setString");
        SET_METHODS.add("setInt");
        SET_METHODS.add("setByte");
        SET_METHODS.add("setShort");
        SET_METHODS.add("setLong");
        SET_METHODS.add("setDouble");
        SET_METHODS.add("setFloat");
        SET_METHODS.add("setTimestamp");
        SET_METHODS.add("setDate");
        SET_METHODS.add("setTime");
        SET_METHODS.add("setArray");
        SET_METHODS.add("setBigDecimal");
        SET_METHODS.add("setAsciiStream");
        SET_METHODS.add("setBinaryStream");
        SET_METHODS.add("setBlob");
        SET_METHODS.add("setBoolean");
        SET_METHODS.add("setBytes");
        SET_METHODS.add("setCharacterStream");
        SET_METHODS.add("setClob");
        SET_METHODS.add("setObject");
        SET_METHODS.add("setNull");
        EXECUTE_METHODS.add("execute");
        EXECUTE_METHODS.add("executeUpdate");
        EXECUTE_METHODS.add("executeQuery");
        EXECUTE_METHODS.add("addBatch");
    }
}
