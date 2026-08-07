package ps;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f103940f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f103942h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f103949o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f103935a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f103936b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<String> f103937c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f103938d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f103939e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f103941g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f103943i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f103944j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f103945k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f103946l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f103947m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f103948n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f103950p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f103951q = false;

    private static int B(int i11, String str, String str2, int i12) {
        if (str.isEmpty() || i11 == -1) {
            return i11;
        }
        if (str.equals(str2)) {
            return i11 + i12;
        }
        return -1;
    }

    public d A(boolean z11) {
        this.f103945k = z11 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f103943i) {
            return this.f103942h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f103951q;
    }

    public int c() {
        if (this.f103941g) {
            return this.f103940f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f103939e;
    }

    public float e() {
        return this.f103949o;
    }

    public int f() {
        return this.f103948n;
    }

    public int g() {
        return this.f103950p;
    }

    public int h(String str, String str2, Set<String> set, String str3) {
        if (this.f103935a.isEmpty() && this.f103936b.isEmpty() && this.f103937c.isEmpty() && this.f103938d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iB = B(B(B(0, this.f103935a, str, 1073741824), this.f103936b, str2, 2), this.f103938d, str3, 4);
        if (iB == -1 || !set.containsAll(this.f103937c)) {
            return 0;
        }
        return iB + (this.f103937c.size() * 4);
    }

    public int i() {
        int i11 = this.f103946l;
        if (i11 == -1 && this.f103947m == -1) {
            return -1;
        }
        return (i11 == 1 ? 1 : 0) | (this.f103947m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.f103943i;
    }

    public boolean k() {
        return this.f103941g;
    }

    public boolean l() {
        return this.f103944j == 1;
    }

    public boolean m() {
        return this.f103945k == 1;
    }

    public d n(int i11) {
        this.f103942h = i11;
        this.f103943i = true;
        return this;
    }

    public d o(boolean z11) {
        this.f103946l = z11 ? 1 : 0;
        return this;
    }

    public d p(boolean z11) {
        this.f103951q = z11;
        return this;
    }

    public d q(int i11) {
        this.f103940f = i11;
        this.f103941g = true;
        return this;
    }

    public d r(String str) {
        this.f103939e = str == null ? null : ou.c.e(str);
        return this;
    }

    public d s(float f11) {
        this.f103949o = f11;
        return this;
    }

    public d t(int i11) {
        this.f103948n = i11;
        return this;
    }

    public d u(boolean z11) {
        this.f103947m = z11 ? 1 : 0;
        return this;
    }

    public d v(int i11) {
        this.f103950p = i11;
        return this;
    }

    public void w(String[] strArr) {
        this.f103937c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.f103935a = str;
    }

    public void y(String str) {
        this.f103936b = str;
    }

    public void z(String str) {
        this.f103938d = str;
    }
}
