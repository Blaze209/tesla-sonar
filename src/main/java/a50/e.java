package a50;

import qj0.f;
import qj0.i;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements c.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f472a;

    e(d dVar) {
        this.f472a = dVar;
    }

    public static i<c.d> b(d dVar) {
        return f.a(new e(dVar));
    }

    @Override // a50.c.d
    public c a(LinkStepUpVerificationState linkStepUpVerificationState) {
        return this.f472a.b(linkStepUpVerificationState);
    }
}
