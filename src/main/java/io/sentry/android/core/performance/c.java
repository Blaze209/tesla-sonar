package io.sentry.android.core.performance;

/* JADX INFO: loaded from: classes9.dex */
public class c implements Comparable<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f79670a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f79671b = new i();

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        int iCompare = Long.compare(this.f79670a.j(), cVar.f79670a.j());
        return iCompare == 0 ? Long.compare(this.f79671b.j(), cVar.f79671b.j()) : iCompare;
    }

    public final i b() {
        return this.f79670a;
    }

    public final i c() {
        return this.f79671b;
    }
}
