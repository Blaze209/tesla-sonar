package vf0;

/* JADX INFO: loaded from: classes8.dex */
final class e0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f119280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f119281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f119282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ c f119283d;

    e0(c cVar, h hVar, String str, i iVar) {
        this.f119283d = cVar;
        this.f119280a = hVar;
        this.f119281b = str;
        this.f119282c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h hVar = this.f119280a;
        if (hVar != null) {
            hVar.a(this.f119281b, this.f119282c);
        }
    }
}
