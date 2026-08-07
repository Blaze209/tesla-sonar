package cn;

/* JADX INFO: loaded from: classes3.dex */
public class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f19442a;

    public h(int i11) {
        this.f19442a = i11;
    }

    @Override // cn.d
    public c createImageTranscoder(gm.c cVar, boolean z11) {
        return new g(z11, this.f19442a);
    }
}
