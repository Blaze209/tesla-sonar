package fi0;

import qj0.e;
import qj0.h;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements e<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f66007a;

    public b(a aVar) {
        this.f66007a = aVar;
    }

    public static b a(a aVar) {
        return new b(aVar);
    }

    public static c c(a aVar) {
        return (c) h.d(aVar.getSdkFilesManager());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f66007a);
    }
}
