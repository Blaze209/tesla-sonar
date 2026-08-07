package r40;

import i50.SharedPartnerAuthState;
import qj0.f;
import qj0.i;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f106980a;

    d(c cVar) {
        this.f106980a = cVar;
    }

    public static i<b.c> b(c cVar) {
        return f.a(new d(cVar));
    }

    @Override // r40.b.c
    public b a(SharedPartnerAuthState sharedPartnerAuthState) {
        return this.f106980a.b(sharedPartnerAuthState);
    }
}
