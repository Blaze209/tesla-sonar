package vf0;

/* JADX INFO: loaded from: classes8.dex */
final class f0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f119285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f119286b;

    f0(c cVar, String str) {
        this.f119286b = cVar;
        this.f119285a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f119286b.f119269a.loadUrl(this.f119285a);
    }
}
