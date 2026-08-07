package fh0;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements qj0.e<bh0.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f65967a;

    public c(b bVar) {
        this.f65967a = bVar;
    }

    public static c a(b bVar) {
        return new c(bVar);
    }

    public static bh0.f b(b bVar) {
        return (bh0.f) qj0.h.d(bVar.getCom.fourthline.analytics.internal.AnalyticsAttribute.Environment java.lang.String());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public bh0.f get() {
        return b(this.f65967a);
    }
}
