package r8;

import java.util.Objects;
import p7.a1;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f107154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z7.y[] f107155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t[] f107156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a1 f107157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f107158e;

    public b0(z7.y[] yVarArr, t[] tVarArr, a1 a1Var, Object obj) {
        s7.a.a(yVarArr.length == tVarArr.length);
        this.f107155b = yVarArr;
        this.f107156c = (t[]) tVarArr.clone();
        this.f107157d = a1Var;
        this.f107158e = obj;
        this.f107154a = yVarArr.length;
    }

    public boolean a(b0 b0Var) {
        if (b0Var == null || b0Var.f107156c.length != this.f107156c.length) {
            return false;
        }
        for (int i11 = 0; i11 < this.f107156c.length; i11++) {
            if (!b(b0Var, i11)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(b0 b0Var, int i11) {
        return b0Var != null && Objects.equals(this.f107155b[i11], b0Var.f107155b[i11]) && Objects.equals(this.f107156c[i11], b0Var.f107156c[i11]);
    }

    public boolean c(int i11) {
        return this.f107155b[i11] != null;
    }
}
