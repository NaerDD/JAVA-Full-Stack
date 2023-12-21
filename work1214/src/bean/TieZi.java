package bean;

import java.util.Objects;

public class TieZi {
    private int tNumber;
    private String tType;
    private String tRecoed;
    private int tQueryNumber;
    private String  tManagerName;
    private int  tManagerLevel;
    private String  tManagerGender;

    public TieZi() {
    }

    public TieZi(int tNumber, String tType, String tRecoed, int tQueryNumber, String tManagerName, int tManagerLevel, String tManagerGender) {
        this.tNumber = tNumber;
        this.tType = tType;
        this.tRecoed = tRecoed;
        this.tQueryNumber = tQueryNumber;
        this.tManagerName = tManagerName;
        this.tManagerLevel = tManagerLevel;
        this.tManagerGender = tManagerGender;
    }

    @Override
    public String toString() {
        return "TieZi{" +
                "tNumber='" + tNumber + '\'' +
                ", tType='" + tType + '\'' +
                ", tRecoed='" + tRecoed + '\'' +
                ", tQueryNumber=" + tQueryNumber +
                ", tManagerName='" + tManagerName + '\'' +
                ", tManagerLevel=" + tManagerLevel +
                ", tManagerGender='" + tManagerGender + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TieZi tieZi = (TieZi) o;
        return Objects.equals(tNumber, tieZi.tNumber);
    }

    public int gettNumber() {
        return tNumber;
    }

    public void settNumber(int tNumber) {
        this.tNumber = tNumber;
    }

    public String gettType() {
        return tType;
    }

    public void settType(String tType) {
        this.tType = tType;
    }

    public String gettRecoed() {
        return tRecoed;
    }

    public void settRecoed(String tRecoed) {
        this.tRecoed = tRecoed;
    }

    public int gettQueryNumber() {
        return tQueryNumber;
    }

    public void settQueryNumber(int tQueryNumber) {
        this.tQueryNumber = tQueryNumber;
    }

    public String gettManagerName() {
        return tManagerName;
    }

    public void settManagerName(String tManagerName) {
        this.tManagerName = tManagerName;
    }

    public int gettManagerLevel() {
        return tManagerLevel;
    }

    public void settManagerLevel(int tManagerLevel) {
        this.tManagerLevel = tManagerLevel;
    }

    public String gettManagerGender() {
        return tManagerGender;
    }

    public void settManagerGender(String tManagerGender) {
        this.tManagerGender = tManagerGender;
    }
}
