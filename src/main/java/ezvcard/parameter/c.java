package ezvcard.parameter;

/* JADX INFO: loaded from: classes8.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f63621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f63622b;

    public c(Integer num, Integer num2) {
        if (num == null) {
            throw new NullPointerException("Local ID must not be null.");
        }
        this.f63621a = num;
        this.f63622b = num2;
    }

    public static c a(String str) {
        String strSubstring;
        int iIndexOf = str.indexOf(46);
        if (iIndexOf < 0) {
            strSubstring = null;
        } else {
            String strSubstring2 = str.substring(0, iIndexOf);
            strSubstring = iIndexOf == str.length() + (-1) ? null : str.substring(iIndexOf + 1);
            str = strSubstring2;
        }
        return new c(Integer.valueOf(str), strSubstring != null ? Integer.valueOf(strSubstring) : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        Integer num = this.f63622b;
        if (num == null) {
            if (cVar.f63622b != null) {
                return false;
            }
        } else if (!num.equals(cVar.f63622b)) {
            return false;
        }
        return this.f63621a.equals(cVar.f63621a);
    }

    public int hashCode() {
        Integer num = this.f63622b;
        return (((num == null ? 0 : num.hashCode()) + 31) * 31) + this.f63621a.hashCode();
    }

    public String toString() {
        if (this.f63622b == null) {
            return Integer.toString(this.f63621a.intValue());
        }
        return this.f63621a + "." + this.f63622b;
    }
}
