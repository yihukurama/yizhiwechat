package iecheck.yizhiwechat.framework.entity;

public class ScanInfo extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scan_info.id
     *
     * @mbggenerated Tue Oct 04 19:31:57 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scan_info.time
     *
     * @mbggenerated Tue Oct 04 19:31:57 CST 2016
     */
    private String time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scan_info.addr
     *
     * @mbggenerated Tue Oct 04 19:31:57 CST 2016
     */
    private String addr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scan_info.openid
     *
     * @mbggenerated Tue Oct 04 19:31:57 CST 2016
     */
    private String openid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scan_info.type
     *
     * @mbggenerated Tue Oct 04 19:31:57 CST 2016
     */
    private Integer type;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scan_info.id
     *
     * @return the value of scan_info.id
     *
     * @mbggenerated Tue Oct 04 19:31:57 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scan_info.id
     *
     * @param id the value for scan_info.id
     *
     * @mbggenerated Tue Oct 04 19:31:57 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scan_info.time
     *
     * @return the value of scan_info.time
     *
     * @mbggenerated Tue Oct 04 19:31:57 CST 2016
     */
    public String getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scan_info.time
     *
     * @param time the value for scan_info.time
     *
     * @mbggenerated Tue Oct 04 19:31:57 CST 2016
     */
    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scan_info.addr
     *
     * @return the value of scan_info.addr
     *
     * @mbggenerated Tue Oct 04 19:31:57 CST 2016
     */
    public String getAddr() {
        return addr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scan_info.addr
     *
     * @param addr the value for scan_info.addr
     *
     * @mbggenerated Tue Oct 04 19:31:57 CST 2016
     */
    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scan_info.openid
     *
     * @return the value of scan_info.openid
     *
     * @mbggenerated Tue Oct 04 19:31:57 CST 2016
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scan_info.openid
     *
     * @param openid the value for scan_info.openid
     *
     * @mbggenerated Tue Oct 04 19:31:57 CST 2016
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scan_info.type
     *
     * @return the value of scan_info.type
     *
     * @mbggenerated Tue Oct 04 19:31:57 CST 2016
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scan_info.type
     *
     * @param type the value for scan_info.type
     *
     * @mbggenerated Tue Oct 04 19:31:57 CST 2016
     */
    public void setType(Integer type) {
        this.type = type;
    }
}