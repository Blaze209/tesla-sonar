package ii0;

import qj0.i;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements qj0.e<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i<ei0.e> f78189a;

    public c(i<ei0.e> iVar) {
        this.f78189a = iVar;
    }

    public static c a(i<ei0.e> iVar) {
        return new c(iVar);
    }

    public static b c(ei0.e eVar) {
        return new b(eVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f78189a.get());
    }
}
