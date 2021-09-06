//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.17 at 02:06:27 PM TRT 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EMPLOYEE"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="EMPLOYEE_ID" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *                   &lt;element name="FIRST_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="LAST_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="PHONE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="HIRE_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="JOB_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="SALARY" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *                   &lt;element name="COMMISSION_PCT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="MANAGER_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="DEPARTMENT_ID" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DEPARTMENT"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DEPARTMENT_ID" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *                   &lt;element name="DEPARTMENT_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="DEPARTMENT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "employee",
    "department"
})
@XmlRootElement(name = "EMPLOYEES")
public class EMPLOYEES {

    @XmlElement(name = "EMPLOYEE", required = true)
    protected EMPLOYEES.EMPLOYEE employee;
    @XmlElement(name = "DEPARTMENT", required = true)
    protected EMPLOYEES.DEPARTMENT department;

    /**
     * Gets the value of the employee property.
     * 
     * @return
     *     possible object is
     *     {@link EMPLOYEES.EMPLOYEE }
     *     
     */
    public EMPLOYEES.EMPLOYEE getEMPLOYEE() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMPLOYEES.EMPLOYEE }
     *     
     */
    public void setEMPLOYEE(EMPLOYEES.EMPLOYEE value) {
        this.employee = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link EMPLOYEES.DEPARTMENT }
     *     
     */
    public EMPLOYEES.DEPARTMENT getDEPARTMENT() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMPLOYEES.DEPARTMENT }
     *     
     */
    public void setDEPARTMENT(EMPLOYEES.DEPARTMENT value) {
        this.department = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="DEPARTMENT_ID" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
     *         &lt;element name="DEPARTMENT_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="DEPARTMENT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "departmentid",
        "departmentname",
        "department"
    })
    public static class DEPARTMENT {

        @XmlElement(name = "DEPARTMENT_ID")
        protected byte departmentid;
        @XmlElement(name = "DEPARTMENT_NAME", required = true)
        protected String departmentname;
        @XmlElement(name = "DEPARTMENT", required = true)
        protected String department;

        /**
         * Gets the value of the departmentid property.
         * 
         */
        public byte getDEPARTMENTID() {
            return departmentid;
        }

        /**
         * Sets the value of the departmentid property.
         * 
         */
        public void setDEPARTMENTID(byte value) {
            this.departmentid = value;
        }

        /**
         * Gets the value of the departmentname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEPARTMENTNAME() {
            return departmentname;
        }

        /**
         * Sets the value of the departmentname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEPARTMENTNAME(String value) {
            this.departmentname = value;
        }

        /**
         * Gets the value of the department property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEPARTMENT() {
            return department;
        }

        /**
         * Sets the value of the department property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEPARTMENT(String value) {
            this.department = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="EMPLOYEE_ID" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
     *         &lt;element name="FIRST_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="LAST_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="PHONE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="HIRE_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="JOB_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="SALARY" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
     *         &lt;element name="COMMISSION_PCT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="MANAGER_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="DEPARTMENT_ID" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "employeeid",
        "firstname",
        "lastname",
        "email",
        "phonenumber",
        "hiredate",
        "jobid",
        "salary",
        "commissionpct",
        "managerid",
        "departmentid"
    })
    public static class EMPLOYEE {

        @XmlElement(name = "EMPLOYEE_ID")
        protected byte employeeid;
        @XmlElement(name = "FIRST_NAME", required = true)
        protected String firstname;
        @XmlElement(name = "LAST_NAME", required = true)
        protected String lastname;
        @XmlElement(name = "EMAIL", required = true)
        protected String email;
        @XmlElement(name = "PHONE_NUMBER", required = true)
        protected String phonenumber;
        @XmlElement(name = "HIRE_DATE", required = true)
        protected String hiredate;
        @XmlElement(name = "JOB_ID", required = true)
        protected String jobid;
        @XmlElement(name = "SALARY")
        protected short salary;
        @XmlElement(name = "COMMISSION_PCT", required = true)
        protected String commissionpct;
        @XmlElement(name = "MANAGER_ID", required = true)
        protected String managerid;
        @XmlElement(name = "DEPARTMENT_ID")
        protected byte departmentid;

        /**
         * Gets the value of the employeeid property.
         * 
         */
        public byte getEMPLOYEEID() {
            return employeeid;
        }

        /**
         * Sets the value of the employeeid property.
         * 
         */
        public void setEMPLOYEEID(byte value) {
            this.employeeid = value;
        }

        /**
         * Gets the value of the firstname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFIRSTNAME() {
            return firstname;
        }

        /**
         * Sets the value of the firstname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFIRSTNAME(String value) {
            this.firstname = value;
        }

        /**
         * Gets the value of the lastname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLASTNAME() {
            return lastname;
        }

        /**
         * Sets the value of the lastname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLASTNAME(String value) {
            this.lastname = value;
        }

        /**
         * Gets the value of the email property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEMAIL() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEMAIL(String value) {
            this.email = value;
        }

        /**
         * Gets the value of the phonenumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPHONENUMBER() {
            return phonenumber;
        }

        /**
         * Sets the value of the phonenumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPHONENUMBER(String value) {
            this.phonenumber = value;
        }

        /**
         * Gets the value of the hiredate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHIREDATE() {
            return hiredate;
        }

        /**
         * Sets the value of the hiredate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHIREDATE(String value) {
            this.hiredate = value;
        }

        /**
         * Gets the value of the jobid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJOBID() {
            return jobid;
        }

        /**
         * Sets the value of the jobid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJOBID(String value) {
            this.jobid = value;
        }

        /**
         * Gets the value of the salary property.
         * 
         */
        public short getSALARY() {
            return salary;
        }

        /**
         * Sets the value of the salary property.
         * 
         */
        public void setSALARY(short value) {
            this.salary = value;
        }

        /**
         * Gets the value of the commissionpct property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMMISSIONPCT() {
            return commissionpct;
        }

        /**
         * Sets the value of the commissionpct property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMMISSIONPCT(String value) {
            this.commissionpct = value;
        }

        /**
         * Gets the value of the managerid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMANAGERID() {
            return managerid;
        }

        /**
         * Sets the value of the managerid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMANAGERID(String value) {
            this.managerid = value;
        }

        /**
         * Gets the value of the departmentid property.
         * 
         */
        public byte getDEPARTMENTID() {
            return departmentid;
        }

        /**
         * Sets the value of the departmentid property.
         * 
         */
        public void setDEPARTMENTID(byte value) {
            this.departmentid = value;
        }

    }

}
