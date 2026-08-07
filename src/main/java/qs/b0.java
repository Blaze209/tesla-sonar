package qs;

import br.j0;
import com.google.android.exoplayer2.g2;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f105958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0[] f105959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r[] f105960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g2 f105961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f105962e;

    public b0(j0[] j0VarArr, r[] rVarArr, g2 g2Var, Object obj) {
        this.f105959b = j0VarArr;
        this.f105960c = (r[]) rVarArr.clone();
        this.f105961d = g2Var;
        this.f105962e = obj;
        this.f105958a = j0VarArr.length;
    }

    public boolean a(b0 b0Var) {
        if (b0Var == null || b0Var.f105960c.length != this.f105960c.length) {
            return false;
        }
        for (int i11 = 0; i11 < this.f105960c.length; i11++) {
            if (!b(b0Var, i11)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(b0 b0Var, int i11) {
        return b0Var != null && p0.c(this.f105959b[i11], b0Var.f105959b[i11]) && p0.c(this.f105960c[i11], b0Var.f105960c[i11]);
    }

    public boolean c(int i11) {
        return this.f105959b[i11] != null;
    }
}
