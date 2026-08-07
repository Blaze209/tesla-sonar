package fh0;

import com.withpersona.sdk2.inquiry.FallbackMode;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements qj0.e<FallbackMode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f65968a;

    public d(b bVar) {
        this.f65968a = bVar;
    }

    public static d a(b bVar) {
        return new d(bVar);
    }

    public static FallbackMode b(b bVar) {
        return (FallbackMode) qj0.h.d(bVar.getFallbackMode());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public FallbackMode get() {
        return b(this.f65968a);
    }
}
