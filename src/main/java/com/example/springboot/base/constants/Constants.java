package com.example.springboot.base.constants;

/**
 * 系统常量定义接口
 *
 * @author qi.ma
 * @since 2018/12/18
 */
public interface Constants {

    /**
     * 根PID
     */
    String ROOT_PID = "-1";
    /**
     * zuul转发请求的区域编码
     */
    String ZUUL_REQ_HEADER_AREA_CODE = "AreaCode";
    /**
     * zuul转发请求的用户ID
     */
    String ZUUL_REQ_HEADER_USER_ID = "UserId";

    /**
     * 系统默认userId
     */
    String SYSTEM_USER_ID = "system";
    /**
     * UTF-8编码
     */
    String ENCODE_UTF8 = "UTF-8";
    /**
     * GBK编码
     */
    String ENCODE_GBK = "GBK";
    /**
     * GB2312编码
     */
    String ENCODE_GB2312 = "GB2312";

    /**
     * 北京时区
     */
    String TIMEZONE_GMT8 = "GMT+8";

    /**
     * 管理员账户名称
     */
    String ADMIN_NAME = "管理员";


    /**
     * FastDFS 默认group
     */
    String DEFAULT_GROUP = "group1";

    /** 默认日期时间格式 */
    String DEFAULT_DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm";
    /** 默认日期格式 */
    String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";
    /** 默认时间格式 */
    String DEFAULT_TIME_FORMAT = "HH:mm:ss";
    /**
     * 升序
     */
    String ASCENDING= "ascending";
    String ASC = "asc";
    /**
     * 降序
     */
    String DESCENDING= "descending";
    String DESC = "desc";

    /**
     * OK
     */
    String OK = "ok";

    interface Browser {
        String CHROME = "Chrome";
        String EDGE = "Edge";
        String IE = "IE";
        String FIREFOX = "firefox";

    }

    String OTHER = "other";

    String OTHER_CN = "其他";

    String TOTAL = "total";

    String DETAIL = "detail";

    /**
     * 03格式Excel文件扩展名
     */
    String EXCEL_EXTENSION_NAME_03 = ".xls";
    /**
     * 07格式Excel文件扩展名
     */
    String EXCEL_EXTENSION_NAME_07 = ".xlsx";
    /**
     * 03格式Word文件扩展名
     */
    String WORD_EXTENSION_NAME_03 = ".doc";
    /**
     * 07格式Word文件扩展名
     */
    String WORD_EXTENSION_NAME_07 = ".docx";

    /**
     * 案号
     */
    String CN_CASE_NO = "案号";
    /**
     * 系列案首案案号
     */
    String CN_SERIES_CASE_NO = "系列案首案案号";
    /**
     * 案件属性
     */
    String CN_CASE_PROPERTY = "案件属性";

    String SUCCESS = "success";

    String FAILED = "failed";

    /**
     * 字符串0-9
     */
    String STRING_ZERO = "0";
    String STRING_ONE = "1";
    String STRING_TWO = "2";
    String STRING_THREE = "3";
    String STRING_FOUR = "4";
    String STRING_FIVE = "5";
    String STRING_SIX = "6";
    String STRING_SEVEN = "7";
    String STRING_EIGHT = "8";
    String STRING_NINE = "9";

    /**
     * 英文1
     */
    String ONE = "one";

    String DEPART = "depart";

    String BLOCK_TYPE = "block-type";

    String RESULT = "result";

    String PUBLIC = "public";

    String BROWSER_FIREFOX = "firefox";
    String BROWSER_CHROME = "chrome";

    String OPERATION_NOT_ALLOW_AT_STATUS = "当前状态不允许此操作";

    /**
     * 默认文件下载文件名
     */
    String DEFAULT_DOWNLOAD_FILE_NAME = "Download";

    /**
     * 办文类型
     */
    String DOC_TYPE = "doc";
    /**
     * 办文类型-发文
     */
    String DOC_TYPE_SEND = "send";
    /**
     * 办文类型-收文
     */
    String DOC_TYPE_REC = "rec";
    /**
     * 办文类型-个人
     */
    String PERSON = "person";

    /**
     * 年
     */
    String YEAR = "year";
    /**
     * 月
     */
    String MONTH = "month";
    /**
     * 日
     */
    String DAY = "day";
    /**
     * 简易
     */
    String SIMPLE = "simple";
    /**
     * 复杂
     */
    String COMPLEX = "complex";
    /**
     * 合计（中文）
     */
    String TOTAL_CHINESE = "合计";
    /**
     * 其他（中文）
     */
    String OTHER_CHINESE = "其他";
    /**
     * 案由(权重模型)
     */
    String CASE_REASON = "summary";
    /**
     * 自定义（权重模型）
     */
    String USER_DEFINED = "userDefined";

    /**
     * 名称
     */
    String NAME = "name";
    /**
     * 是
     */
    String YES = "yes";
    /**
     * 否
     */
    String NO = "no";

    /**
     * sys_dim_code 人员类型 parent_id
     */
    String STAFF_TYPE_PID = "k10003";
    /**
     * sys_dim_code 法律职务 parent_id
     */
    String LEGAL_POSITION_PID = "k10009";
    /**
     * sys_dim_code 法律职务 审判员
     */
    String TRIOR = "k10009-06";
    /**
     * sys_dim_code 法官等级 parent_id
     */
    String JUDGE_LEVEL_PID = "k10011";
    /**
     * 干部任免表下载照片宽度
     */
    String ACTIVE = "active";
    String INACTIVE = "inactive";

    /**
     * 干部任免表下载照片宽度
     */
    Integer APPOINTMENT_DOWNLOAD_IMAGE_WIDTH = 130;
    /**
     * 干部任免表下载照片宽度
     */
    Integer APPOINTMENT_DOWNLOAD_IMAGE_HEIGHT = 168;
    /**
     * 奖惩情况长度
     */
    Integer APPOINTMENT_REWARD_LENGTH = 145;

    /**
     * AVERAGE
     */
    String AVERAGE = "AVERAGE";

    /**
     * 个人
     */
    String PERSONAL = "personal";

    /**
     * 项目名称
     */
    String PROJECT_CODE = "fd-kpi";
    /**
     * 移动端
     */
    String MOBILE = "mobile";
    /**
     * 是否加密
     */
    String IS_ENCRYPT = "isEncrypt";
    /**
     * 移动端个人中心默认用户ID
     */
    String H5_DEFAULT_ID_KEY = "mobile-default-key";

    /**
     *案件权重模型指标-指标规则-案由
     */
    String RULE_ID_CASE_REASON="k10025-01";
    /**
     *案件权重模型指标-指标规则-行政管理范围
     */
    String RULE_ID_ADMIN_RANGE="k10025-02";
}
