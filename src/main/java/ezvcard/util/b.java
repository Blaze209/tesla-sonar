package ezvcard.util;

import java.util.BitSet;

/* JADX INFO: loaded from: classes8.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BitSet f63663a = new BitSet(128);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f63664b;

    public b(String str) {
        this.f63664b = str;
        int i11 = 0;
        while (i11 < str.length()) {
            char cCharAt = str.charAt(i11);
            if ((i11 < str.length() + (-2) ? str.charAt(i11 + 1) : (char) 0) == '-') {
                i11 += 2;
                char cCharAt2 = str.charAt(i11);
                if (cCharAt > cCharAt2) {
                    cCharAt2 = cCharAt;
                    cCharAt = cCharAt2;
                }
                this.f63663a.set(cCharAt, cCharAt2 + 1);
            } else {
                this.f63663a.set(cCharAt);
            }
            i11++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f63663a.equals(((b) obj).f63663a);
        }
        return false;
    }

    public int hashCode() {
        return this.f63663a.hashCode();
    }

    public String toString() {
        return this.f63664b;
    }
}
