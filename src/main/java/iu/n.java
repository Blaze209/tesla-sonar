package iu;

/* JADX INFO: loaded from: classes5.dex */
final class n extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f81900c;

    n(p pVar, int i11) {
        super(pVar.size(), i11);
        this.f81900c = pVar;
    }

    @Override // iu.l
    protected final Object a(int i11) {
        return this.f81900c.get(i11);
    }
}
