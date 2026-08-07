package i50;

import qj0.f;
import qj0.i;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f75992a;

    d(c cVar) {
        this.f75992a = cVar;
    }

    public static i<b.c> b(c cVar) {
        return f.a(new d(cVar));
    }

    @Override // i50.b.c
    public b a(SharedPartnerAuthState sharedPartnerAuthState) {
        return this.f75992a.b(sharedPartnerAuthState);
    }
}
