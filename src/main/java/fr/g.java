package fr;

import com.google.android.exoplayer2.u0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f66357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f66358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f66359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f66360e;

    public g(String str, u0 u0Var, u0 u0Var2, int i11, int i12) {
        ts.a.a(i11 == 0 || i12 == 0);
        this.f66356a = ts.a.d(str);
        this.f66357b = (u0) ts.a.e(u0Var);
        this.f66358c = (u0) ts.a.e(u0Var2);
        this.f66359d = i11;
        this.f66360e = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (this.f66359d == gVar.f66359d && this.f66360e == gVar.f66360e && this.f66356a.equals(gVar.f66356a) && this.f66357b.equals(gVar.f66357b) && this.f66358c.equals(gVar.f66358c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f66359d) * 31) + this.f66360e) * 31) + this.f66356a.hashCode()) * 31) + this.f66357b.hashCode()) * 31) + this.f66358c.hashCode();
    }
}
