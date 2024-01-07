public enum Season {
    SPRING("春",3,5,"第一季度"),
    SUMMER("夏",6,8,"第二季度"),
    AUTUMN("秋",9,11,"第三季度"),
    WINTER("冬",12,2,"第四季度");

    private final String seasonName;
    private final int startMonth;
    private final int endMonth;
    private final String quarter;

    Season(String seasonName, int startMonth, int endMonth, String quarter) {
        this.seasonName = seasonName;
        this.startMonth = startMonth;
        this.endMonth = endMonth;
        this.quarter = quarter;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public int getStartMonth() {
        return startMonth;
    }

    public int getEndMonth() {
        return endMonth;
    }

    public String getQuarter() {
        return quarter;
    }
}
