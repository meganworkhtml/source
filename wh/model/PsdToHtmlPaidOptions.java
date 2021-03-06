package wh.model;
// Generated May 2, 2015 9:19:20 PM by Hibernate Tools 3.2.1.GA



/**
 * PsdToHtmlPaidOptions generated by hbm2java
 */
public class PsdToHtmlPaidOptions  implements java.io.Serializable {


     private Long paidAddonId;
     private Boolean isResponsiveLayout;
     private Boolean mobileCompatability;
     private Boolean isPrintedCss;
     private Boolean isWcag508;
     private String cssOption;
     private Boolean customFontElements;
     private Boolean tabs;
     private Boolean formValidation;
     private Boolean animatedFilters;
     private Boolean slider;
     private Boolean customScroll;

    public PsdToHtmlPaidOptions() {
    }

    public PsdToHtmlPaidOptions(Boolean isResponsiveLayout, Boolean mobileCompatability, Boolean isPrintedCss, Boolean isWcag508, String cssOption, Boolean customFontElements, Boolean tabs, Boolean formValidation, Boolean animatedFilters, Boolean slider, Boolean customScroll) {
       this.isResponsiveLayout = isResponsiveLayout;
       this.mobileCompatability = mobileCompatability;
       this.isPrintedCss = isPrintedCss;
       this.isWcag508 = isWcag508;
       this.cssOption = cssOption;
       this.customFontElements = customFontElements;
       this.tabs = tabs;
       this.formValidation = formValidation;
       this.animatedFilters = animatedFilters;
       this.slider = slider;
       this.customScroll = customScroll;
    }
   
    public Long getPaidAddonId() {
        return this.paidAddonId;
    }
    
    public void setPaidAddonId(Long paidAddonId) {
        this.paidAddonId = paidAddonId;
    }
    public Boolean getIsResponsiveLayout() {
        return this.isResponsiveLayout;
    }
    
    public void setIsResponsiveLayout(Boolean isResponsiveLayout) {
        this.isResponsiveLayout = isResponsiveLayout;
    }
    public Boolean getMobileCompatability() {
        return this.mobileCompatability;
    }
    
    public void setMobileCompatability(Boolean mobileCompatability) {
        this.mobileCompatability = mobileCompatability;
    }
    public Boolean getIsPrintedCss() {
        return this.isPrintedCss;
    }
    
    public void setIsPrintedCss(Boolean isPrintedCss) {
        this.isPrintedCss = isPrintedCss;
    }
    public Boolean getIsWcag508() {
        return this.isWcag508;
    }
    
    public void setIsWcag508(Boolean isWcag508) {
        this.isWcag508 = isWcag508;
    }
    public String getCssOption() {
        return this.cssOption;
    }
    
    public void setCssOption(String cssOption) {
        this.cssOption = cssOption;
    }
    public Boolean getCustomFontElements() {
        return this.customFontElements;
    }
    
    public void setCustomFontElements(Boolean customFontElements) {
        this.customFontElements = customFontElements;
    }
    public Boolean getTabs() {
        return this.tabs;
    }
    
    public void setTabs(Boolean tabs) {
        this.tabs = tabs;
    }
    public Boolean getFormValidation() {
        return this.formValidation;
    }
    
    public void setFormValidation(Boolean formValidation) {
        this.formValidation = formValidation;
    }
    public Boolean getAnimatedFilters() {
        return this.animatedFilters;
    }
    
    public void setAnimatedFilters(Boolean animatedFilters) {
        this.animatedFilters = animatedFilters;
    }
    public Boolean getSlider() {
        return this.slider;
    }
    
    public void setSlider(Boolean slider) {
        this.slider = slider;
    }
    public Boolean getCustomScroll() {
        return this.customScroll;
    }
    
    public void setCustomScroll(Boolean customScroll) {
        this.customScroll = customScroll;
    }




}


