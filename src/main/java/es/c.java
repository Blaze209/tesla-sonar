package es;

import com.google.android.exoplayer2.source.c0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class c implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final c0[] f63140a;

    public c(c0[] c0VarArr) {
        this.f63140a = c0VarArr;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public boolean a(long j11) {
        boolean zA;
        boolean z11 = false;
        do {
            long jF = f();
            if (jF == Long.MIN_VALUE) {
                return z11;
            }
            zA = false;
            for (c0 c0Var : this.f63140a) {
                long jF2 = c0Var.f();
                boolean z12 = jF2 != Long.MIN_VALUE && jF2 <= j11;
                if (jF2 == jF || z12) {
                    zA |= c0Var.a(j11);
                }
            }
            z11 |= zA;
        } while (zA);
        return z11;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public boolean c() {
        for (c0 c0Var : this.f63140a) {
            if (c0Var.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public final long d() {
        long jMin = Long.MAX_VALUE;
        for (c0 c0Var : this.f63140a) {
            long jD = c0Var.d();
            if (jD != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jD);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public final void e(long j11) {
        for (c0 c0Var : this.f63140a) {
            c0Var.e(j11);
        }
    }

    @Override // com.google.android.exoplayer2.source.c0
    public final long f() {
        long jMin = Long.MAX_VALUE;
        for (c0 c0Var : this.f63140a) {
            long jF = c0Var.f();
            if (jF != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jF);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }
}
