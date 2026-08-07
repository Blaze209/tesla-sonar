package ca;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f18973f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f18975h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f18982o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f18968a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f18969b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<String> f18970c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f18971d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f18972e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f18974g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f18976i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f18977j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f18978k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f18979l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f18980m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f18981n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f18983p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f18984q = false;

    private static int B(int i11, String str, String str2, int i12) {
        if (str.isEmpty() || i11 == -1) {
            return i11;
        }
        if (str.equals(str2)) {
            return i11 + i12;
        }
        return -1;
    }

    public c A(boolean z11) {
        this.f18978k = z11 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f18976i) {
            return this.f18975h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f18984q;
    }

    public int c() {
        if (this.f18974g) {
            return this.f18973f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f18972e;
    }

    public float e() {
        return this.f18982o;
    }

    public int f() {
        return this.f18981n;
    }

    public int g() {
        return this.f18983p;
    }

    public int h(String str, String str2, Set<String> set, String str3) {
        if (this.f18968a.isEmpty() && this.f18969b.isEmpty() && this.f18970c.isEmpty() && this.f18971d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iB = B(B(B(0, this.f18968a, str, 1073741824), this.f18969b, str2, 2), this.f18971d, str3, 4);
        if (iB == -1 || !set.containsAll(this.f18970c)) {
            return 0;
        }
        return iB + (this.f18970c.size() * 4);
    }

    public int i() {
        int i11 = this.f18979l;
        if (i11 == -1 && this.f18980m == -1) {
            return -1;
        }
        return (i11 == 1 ? 1 : 0) | (this.f18980m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.f18976i;
    }

    public boolean k() {
        return this.f18974g;
    }

    public boolean l() {
        return this.f18977j == 1;
    }

    public boolean m() {
        return this.f18978k == 1;
    }

    public c n(int i11) {
        this.f18975h = i11;
        this.f18976i = true;
        return this;
    }

    public c o(boolean z11) {
        this.f18979l = z11 ? 1 : 0;
        return this;
    }

    public c p(boolean z11) {
        this.f18984q = z11;
        return this;
    }

    public c q(int i11) {
        this.f18973f = i11;
        this.f18974g = true;
        return this;
    }

    public c r(String str) {
        this.f18972e = str == null ? null : ou.c.e(str);
        return this;
    }

    public c s(float f11) {
        this.f18982o = f11;
        return this;
    }

    public c t(int i11) {
        this.f18981n = i11;
        return this;
    }

    public c u(boolean z11) {
        this.f18980m = z11 ? 1 : 0;
        return this;
    }

    public c v(int i11) {
        this.f18983p = i11;
        return this;
    }

    public void w(String[] strArr) {
        this.f18970c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.f18968a = str;
    }

    public void y(String str) {
        this.f18969b = str;
    }

    public void z(String str) {
        this.f18971d = str;
    }
}
