package com.caverock.androidsvg;

/* JADX INFO: loaded from: classes3.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f21214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f21215b;

    c(long j11, int i11) {
        this.f21215b = j11;
        this.f21214a = i11;
    }

    static c b(String str, int i11, int i12) {
        long j11;
        int i13;
        if (i11 >= i12) {
            return null;
        }
        long j12 = 0;
        int i14 = i11;
        while (i14 < i12) {
            char cCharAt = str.charAt(i14);
            if (cCharAt < '0' || cCharAt > '9') {
                if (cCharAt >= 'A' && cCharAt <= 'F') {
                    j11 = j12 * 16;
                    i13 = cCharAt - 'A';
                } else {
                    if (cCharAt < 'a' || cCharAt > 'f') {
                        break;
                    }
                    j11 = j12 * 16;
                    i13 = cCharAt - 'a';
                }
                j12 = j11 + ((long) i13) + 10;
            } else {
                j12 = (j12 * 16) + ((long) (cCharAt - '0'));
            }
            if (j12 > 4294967295L) {
                return null;
            }
            i14++;
        }
        if (i14 == i11) {
            return null;
        }
        return new c(j12, i14);
    }

    static c c(String str, int i11, int i12, boolean z11) {
        if (i11 >= i12) {
            return null;
        }
        boolean z12 = false;
        if (z11) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '+') {
                i11++;
            } else if (cCharAt == '-') {
                z12 = true;
                i11++;
            }
        }
        long j11 = 0;
        int i13 = i11;
        while (i13 < i12) {
            char cCharAt2 = str.charAt(i13);
            if (cCharAt2 < '0' || cCharAt2 > '9') {
                break;
            }
            if (z12) {
                j11 = (j11 * 10) - ((long) (cCharAt2 - '0'));
                if (j11 < -2147483648L) {
                    return null;
                }
            } else {
                j11 = (j11 * 10) + ((long) (cCharAt2 - '0'));
                if (j11 > 2147483647L) {
                    return null;
                }
            }
            i13++;
        }
        if (i13 == i11) {
            return null;
        }
        return new c(j11, i13);
    }

    int a() {
        return this.f21214a;
    }

    public int d() {
        return (int) this.f21215b;
    }
}
