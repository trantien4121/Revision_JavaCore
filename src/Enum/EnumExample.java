package Enum;

public class EnumExample {
    public enum DateOfWeek{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public enum PageInfo{
        Page_01("Pag01", "HomePage", "/home"),
        Page_02("Pag02", "LoginPage", "/login"),
        Page_03("Pag03", "RegisterPage", "/register");

        private String pageId;
        private String pageTitle;
        private String pageURL;

        PageInfo(String pageId, String pageTitle, String pageURL) {
            this.pageId = pageId;
            this.pageTitle = pageTitle;
            this.pageURL = pageURL;
        }

        public String getPageId() {
            return pageId;
        }

        public void setPageId(String pageId) {
            this.pageId = pageId;
        }

        public String getPageTitle() {
            return pageTitle;
        }

        public void setPageTitle(String pageTitle) {
            this.pageTitle = pageTitle;
        }

        public String getPageURL() {
            return pageURL;
        }

        public void setPageURL(String pageURL) {
            this.pageURL = pageURL;
        }
    }

    public static void main(String[] args) {
        DateOfWeek d = DateOfWeek.THURSDAY;
        System.out.println("Today is: " + d);

        System.out.println("---------------");

        for(DateOfWeek da : DateOfWeek.values()){
            System.out.println(da);
        }

        System.out.println("----------------");

        System.out.println("HomePage Info: Id(" + PageInfo.Page_01.pageId + ")" + "-Title("
        + PageInfo.Page_01.pageTitle + ")" + "-URL(" + PageInfo.Page_01.pageURL + ")");

        System.out.println("----------------");
        System.out.println("Information Of Pages:");
        for(PageInfo p: PageInfo.values()){
            System.out.println(p.pageTitle +  " Info: Id(" + p.pageId + ")" + "-Title("
                    + p.pageTitle + ")" + "-URL(" + p.pageURL + ")");
        }
    }
}
