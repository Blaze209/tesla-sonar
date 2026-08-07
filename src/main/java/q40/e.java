package q40;

import qj0.f;
import qj0.i;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements c.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f104814a;

    e(d dVar) {
        this.f104814a = dVar;
    }

    public static i<c.d> b(d dVar) {
        return f.a(new e(dVar));
    }

    @Override // q40.c.d
    public c a(AttachPaymentState attachPaymentState) {
        return this.f104814a.b(attachPaymentState);
    }
}
