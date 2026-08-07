package p40;

import qj0.f;
import qj0.i;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f101099a;

    e(d dVar) {
        this.f101099a = dVar;
    }

    public static i<c.b> b(d dVar) {
        return f.a(new e(dVar));
    }

    @Override // p40.c.b
    public c a(AccountUpdateRequiredState accountUpdateRequiredState) {
        return this.f101099a.b(accountUpdateRequiredState);
    }
}
