package okio;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "", "beginIndex", "endIndex", "", "a", "(Ljava/lang/String;II)J", "okio"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t0 {
    public static final long a(String str, int i11, int i12) {
        int i13;
        p013kotlin.jvm.internal.s.k(str, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i11).toString());
        }
        if (i12 < i11) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i12 + " < " + i11).toString());
        }
        if (i12 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i12 + " > " + str.length()).toString());
        }
        long j11 = 0;
        while (i11 < i12) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                j11++;
            } else {
                if (cCharAt < 2048) {
                    i13 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i13 = 3;
                } else {
                    int i14 = i11 + 1;
                    char cCharAt2 = i14 < i12 ? str.charAt(i14) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j11++;
                        i11 = i14;
                    } else {
                        j11 += (long) 4;
                        i11 += 2;
                    }
                }
                j11 += (long) i13;
            }
            i11++;
        }
        return j11;
    }

    public static /* synthetic */ long b(String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        return a(str, i11, i12);
    }
}
