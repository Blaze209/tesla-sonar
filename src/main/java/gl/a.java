package gl;

import bm.j;

/* JADX INFO: loaded from: classes3.dex */
public class a extends wm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wk.b f69171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f69172b;

    public a(wk.b bVar, j jVar) {
        this.f69171a = bVar;
        this.f69172b = jVar;
    }

    @Override // wm.e
    public void b(com.facebook.imagepipeline.request.a aVar, String str, boolean z11) {
        this.f69172b.J(this.f69171a.now());
        this.f69172b.I(aVar);
        this.f69172b.P(str);
        this.f69172b.O(z11);
    }

    @Override // wm.e
    public void e(com.facebook.imagepipeline.request.a aVar, Object obj, String str, boolean z11) {
        this.f69172b.K(this.f69171a.now());
        this.f69172b.I(aVar);
        this.f69172b.y(obj);
        this.f69172b.P(str);
        this.f69172b.O(z11);
    }

    @Override // wm.e
    public void j(com.facebook.imagepipeline.request.a aVar, String str, Throwable th2, boolean z11) {
        this.f69172b.J(this.f69171a.now());
        this.f69172b.I(aVar);
        this.f69172b.P(str);
        this.f69172b.O(z11);
    }

    @Override // wm.e
    public void k(String str) {
        this.f69172b.J(this.f69171a.now());
        this.f69172b.P(str);
    }
}
