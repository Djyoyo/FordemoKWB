package com.rdave.kamwaliapplication.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetEmpPostedJob {


    @Expose
    @SerializedName("Status")
    private int Status;
    @Expose
    @SerializedName("Data")
    private List<Data> Data;
    @Expose
    @SerializedName("Message")
    private String Message;
    @Expose
    @SerializedName("Success")
    private boolean Success;

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }

    public List<Data> getData() {
        return Data;
    }

    public void setData(List<Data> Data) {
        this.Data = Data;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public boolean getSuccess() {
        return Success;
    }

    public void setSuccess(boolean Success) {
        this.Success = Success;
    }

    public static class Data {
        @Expose
        @SerializedName("Status")
        private String Status;
        @Expose
        @SerializedName("Logo")
        private String Logo;
        @Expose
        @SerializedName("PostedDate")
        private String PostedDate;
        @Expose
        @SerializedName("Description")
        private String Description;
        @Expose
        @SerializedName("GivenSalary")
        private int GivenSalary;
        @Expose
        @SerializedName("LanguageName")
        private String LanguageName;
        @Expose
        @SerializedName("Language")
        private String Language;
        @Expose
        @SerializedName("Education")
        private String Education;
        @Expose
        @SerializedName("JobTime")
        private String JobTime;
        @Expose
        @SerializedName("JobLocation")
        private String JobLocation;
        @Expose
        @SerializedName("JobCity")
        private String JobCity;
        @Expose
        @SerializedName("JobState")
        private String JobState;
        @Expose
        @SerializedName("JobId1")
        private int JobId1;
        @Expose
        @SerializedName("SubcategoryName")
        private String SubcategoryName;
        @Expose
        @SerializedName("CategoryName")
        private String CategoryName;
        @Expose
        @SerializedName("Subcategory")
        private String Subcategory;
        @Expose
        @SerializedName("Category")
        private String Category;
        @Expose
        @SerializedName("EmplrId")
        private String EmplrId;
        @Expose
        @SerializedName("JobId")
        private int JobId;

        public String getStatus() {
            return Status;
        }

        public void setStatus(String Status) {
            this.Status = Status;
        }

        public String getLogo() {
            return Logo;
        }

        public void setLogo(String Logo) {
            this.Logo = Logo;
        }

        public String getPostedDate() {
            return PostedDate;
        }

        public void setPostedDate(String PostedDate) {
            this.PostedDate = PostedDate;
        }

        public String getDescription() {
            return Description;
        }

        public void setDescription(String Description) {
            this.Description = Description;
        }

        public int getGivenSalary() {
            return GivenSalary;
        }

        public void setGivenSalary(int GivenSalary) {
            this.GivenSalary = GivenSalary;
        }

        public String getLanguageName() {
            return LanguageName;
        }

        public void setLanguageName(String LanguageName) {
            this.LanguageName = LanguageName;
        }

        public String getLanguage() {
            return Language;
        }

        public void setLanguage(String Language) {
            this.Language = Language;
        }

        public String getEducation() {
            return Education;
        }

        public void setEducation(String Education) {
            this.Education = Education;
        }

        public String getJobTime() {
            return JobTime;
        }

        public void setJobTime(String JobTime) {
            this.JobTime = JobTime;
        }

        public String getJobLocation() {
            return JobLocation;
        }

        public void setJobLocation(String JobLocation) {
            this.JobLocation = JobLocation;
        }

        public String getJobCity() {
            return JobCity;
        }

        public void setJobCity(String JobCity) {
            this.JobCity = JobCity;
        }

        public String getJobState() {
            return JobState;
        }

        public void setJobState(String JobState) {
            this.JobState = JobState;
        }

        public int getJobId1() {
            return JobId1;
        }

        public void setJobId1(int JobId1) {
            this.JobId1 = JobId1;
        }

        public String getSubcategoryName() {
            return SubcategoryName;
        }

        public void setSubcategoryName(String SubcategoryName) {
            this.SubcategoryName = SubcategoryName;
        }

        public String getCategoryName() {
            return CategoryName;
        }

        public void setCategoryName(String CategoryName) {
            this.CategoryName = CategoryName;
        }

        public String getSubcategory() {
            return Subcategory;
        }

        public void setSubcategory(String Subcategory) {
            this.Subcategory = Subcategory;
        }

        public String getCategory() {
            return Category;
        }

        public void setCategory(String Category) {
            this.Category = Category;
        }

        public String getEmplrId() {
            return EmplrId;
        }

        public void setEmplrId(String EmplrId) {
            this.EmplrId = EmplrId;
        }

        public int getJobId() {
            return JobId;
        }

        public void setJobId(int JobId) {
            this.JobId = JobId;
        }
    }
}
