package jy;

import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.EnumC4419g;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f84413h = new a(4201, 4096, 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f84414i = new a(1033, 1024, 1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f84415j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f84416k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f84417l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f84418m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f84419n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f84420o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f84421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f84422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f84423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f84424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f84425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f84426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f84427g;

    static {
        a aVar = new a(67, 64, 1);
        f84415j = aVar;
        f84416k = new a(19, 16, 1);
        f84417l = new a(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE, 256, 0);
        a aVar2 = new a(EnumC4419g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE, 256, 1);
        f84418m = aVar2;
        f84419n = aVar2;
        f84420o = aVar;
    }

    public a(int i11, int i12, int i13) {
        this.f84426f = i11;
        this.f84425e = i12;
        this.f84427g = i13;
        this.f84421a = new int[i12];
        this.f84422b = new int[i12];
        int i14 = 1;
        for (int i15 = 0; i15 < i12; i15++) {
            this.f84421a[i15] = i14;
            i14 *= 2;
            if (i14 >= i12) {
                i14 = (i14 ^ i11) & (i12 - 1);
            }
        }
        for (int i16 = 0; i16 < i12 - 1; i16++) {
            this.f84422b[this.f84421a[i16]] = i16;
        }
        this.f84423c = new b(this, new int[]{0});
        this.f84424d = new b(this, new int[]{1});
    }

    static int a(int i11, int i12) {
        return i11 ^ i12;
    }

    b b(int i11, int i12) {
        if (i11 < 0) {
            throw new IllegalArgumentException();
        }
        if (i12 == 0) {
            return this.f84423c;
        }
        int[] iArr = new int[i11 + 1];
        iArr[0] = i12;
        return new b(this, iArr);
    }

    int c(int i11) {
        return this.f84421a[i11];
    }

    public int d() {
        return this.f84427g;
    }

    b e() {
        return this.f84423c;
    }

    int f(int i11) {
        if (i11 != 0) {
            return this.f84421a[(this.f84425e - this.f84422b[i11]) - 1];
        }
        throw new ArithmeticException();
    }

    int g(int i11) {
        if (i11 != 0) {
            return this.f84422b[i11];
        }
        throw new IllegalArgumentException();
    }

    int h(int i11, int i12) {
        if (i11 == 0 || i12 == 0) {
            return 0;
        }
        int[] iArr = this.f84421a;
        int[] iArr2 = this.f84422b;
        return iArr[(iArr2[i11] + iArr2[i12]) % (this.f84425e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f84426f) + CoreConstants.COMMA_CHAR + this.f84425e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
