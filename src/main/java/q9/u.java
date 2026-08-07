package q9;

import w8.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f105087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f105088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0.a f105089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f105090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f105091e;

    public u(boolean z11, String str, int i11, byte[] bArr, int i12, int i13, byte[] bArr2) {
        s7.a.a((bArr2 == null) ^ (i11 == 0));
        this.f105087a = z11;
        this.f105088b = str;
        this.f105090d = i11;
        this.f105091e = bArr2;
        this.f105089c = new o0.a(a(str), bArr, i12, i13);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        byte b11 = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    b11 = 0;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    b11 = 1;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    b11 = 2;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    b11 = 3;
                }
                break;
        }
        switch (b11) {
            case 0:
            case 1:
                return 2;
            default:
                s7.t.i("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
