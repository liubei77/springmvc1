package cap.model;

public class BlogInfoWithBLOBs extends BlogInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_info.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_info.annoucement
     *
     * @mbg.generated
     */
    private String annoucement;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_info.description
     *
     * @return the value of blog_info.description
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_info.description
     *
     * @param description the value for blog_info.description
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_info.annoucement
     *
     * @return the value of blog_info.annoucement
     * @mbg.generated
     */
    public String getAnnoucement() {
        return annoucement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_info.annoucement
     *
     * @param annoucement the value for blog_info.annoucement
     * @mbg.generated
     */
    public void setAnnoucement(String annoucement) {
        this.annoucement = annoucement == null ? null : annoucement.trim();
    }
}