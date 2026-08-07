package r8;

import java.util.List;
import p7.t0;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f107272i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Object f107273j;

    public u(t0 t0Var, int i11, int i12) {
        this(t0Var, i11, i12, 0, null);
    }

    @Override // r8.t
    public int a() {
        return 0;
    }

    @Override // r8.t
    public Object r() {
        return this.f107273j;
    }

    @Override // r8.t
    public int t() {
        return this.f107272i;
    }

    public u(t0 t0Var, int i11, int i12, int i13, Object obj) {
        super(t0Var, new int[]{i11}, i12);
        this.f107272i = i13;
        this.f107273j = obj;
    }

    @Override // r8.t
    public void m(long j11, long j12, long j13, List<? extends p8.m> list, p8.n[] nVarArr) {
    }
}
