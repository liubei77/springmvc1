package cap.model;

public class UcommentWithBLOBs extends Ucomment {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ucomment.acontent
     *
     * @mbg.generated
     */
    private String acontent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ucomment.summary
     *
     * @mbg.generated
     */
    private String summary;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ucomment.acontent
     *
     * @return the value of ucomment.acontent
     * @mbg.generated
     */
    public String getAcontent() {
        return acontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ucomment.acontent
     *
     * @param acontent the value for ucomment.acontent
     * @mbg.generated
     */
    public void setAcontent(String acontent) {
        this.acontent = acontent == null ? null : acontent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ucomment.summary
     *
     * @return the value of ucomment.summary
     * @mbg.generated
     */
    public String getSummary() {
        return summary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ucomment.summary
     *
     * @param summary the value for ucomment.summary
     * @mbg.generated
     */
    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }
}