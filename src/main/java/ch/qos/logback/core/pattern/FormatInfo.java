package ch.qos.logback.core.pattern;

/* JADX INFO: loaded from: classes3.dex */
public class FormatInfo {
    private boolean leftPad;
    private boolean leftTruncate;
    private int max;
    private int min;

    public FormatInfo() {
        this.min = Integer.MIN_VALUE;
        this.max = Integer.MAX_VALUE;
        this.leftPad = true;
        this.leftTruncate = true;
    }

    public static FormatInfo valueOf(String str) {
        String strSubstring;
        if (str == null) {
            throw new NullPointerException("Argument cannot be null");
        }
        FormatInfo formatInfo = new FormatInfo();
        int iIndexOf = str.indexOf(46);
        if (iIndexOf != -1) {
            String strSubstring2 = str.substring(0, iIndexOf);
            int i11 = iIndexOf + 1;
            if (i11 == str.length()) {
                throw new IllegalArgumentException("Formatting string [" + str + "] should not end with '.'");
            }
            strSubstring = str.substring(i11);
            str = strSubstring2;
        } else {
            strSubstring = null;
        }
        if (str != null && str.length() > 0) {
            int i12 = Integer.parseInt(str);
            if (i12 >= 0) {
                formatInfo.min = i12;
            } else {
                formatInfo.min = -i12;
                formatInfo.leftPad = false;
            }
        }
        if (strSubstring != null && strSubstring.length() > 0) {
            int i13 = Integer.parseInt(strSubstring);
            if (i13 >= 0) {
                formatInfo.max = i13;
                return formatInfo;
            }
            formatInfo.max = -i13;
            formatInfo.leftTruncate = false;
        }
        return formatInfo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormatInfo)) {
            return false;
        }
        FormatInfo formatInfo = (FormatInfo) obj;
        return this.min == formatInfo.min && this.max == formatInfo.max && this.leftPad == formatInfo.leftPad && this.leftTruncate == formatInfo.leftTruncate;
    }

    public int getMax() {
        return this.max;
    }

    public int getMin() {
        return this.min;
    }

    public int hashCode() {
        return (((((this.min * 31) + this.max) * 31) + (this.leftPad ? 1 : 0)) * 31) + (this.leftTruncate ? 1 : 0);
    }

    public boolean isLeftPad() {
        return this.leftPad;
    }

    public boolean isLeftTruncate() {
        return this.leftTruncate;
    }

    public void setLeftPad(boolean z11) {
        this.leftPad = z11;
    }

    public void setLeftTruncate(boolean z11) {
        this.leftTruncate = z11;
    }

    public void setMax(int i11) {
        this.max = i11;
    }

    public void setMin(int i11) {
        this.min = i11;
    }

    public String toString() {
        return "FormatInfo(" + this.min + ", " + this.max + ", " + this.leftPad + ", " + this.leftTruncate + ")";
    }

    public FormatInfo(int i11, int i12) {
        this.leftPad = true;
        this.leftTruncate = true;
        this.min = i11;
        this.max = i12;
    }

    public FormatInfo(int i11, int i12, boolean z11, boolean z12) {
        this.min = i11;
        this.max = i12;
        this.leftPad = z11;
        this.leftTruncate = z12;
    }
}
