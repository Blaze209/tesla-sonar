package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
class Yh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f29885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f29886b;

    Yh(long j11, int i11) {
        this.f29886b = j11;
        this.f29885a = i11;
    }

    int a() {
        return this.f29885a;
    }

    public int b() {
        return (int) this.f29886b;
    }

    static Yh a(String str, int i11, int i12, boolean z11) {
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
            long j12 = j11 * 10;
            long j13 = cCharAt2 - '0';
            if (z12) {
                j11 = j12 - j13;
                if (j11 < -2147483648L) {
                    return null;
                }
            } else {
                j11 = j12 + j13;
                if (j11 > 2147483647L) {
                    return null;
                }
            }
            i13++;
        }
        if (i13 == i11) {
            return null;
        }
        return new Yh(j11, i13);
    }

    static Yh a(String str, int i11, int i12) {
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
        return new Yh(j12, i14);
    }
}
