package gu;

/* JADX INFO: loaded from: classes5.dex */
final class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f69567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f69568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f69569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ o f69570d;

    n(o oVar, a aVar, int i11, int i12) {
        this.f69570d = oVar;
        this.f69567a = aVar;
        this.f69568b = i11;
        this.f69569c = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar = this.f69570d;
        a aVar = this.f69567a;
        oVar.h(new c(aVar.d(), this.f69568b, this.f69569c, aVar.a(), aVar.f(), aVar.h(), aVar.g(), aVar.c(), aVar.i()));
    }
}
