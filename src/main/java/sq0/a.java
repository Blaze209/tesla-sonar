package sq0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a extends r {
    @Override // sq0.r
    protected void j(r rVar) {
        if (!(rVar instanceof a)) {
            throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
        }
        super.j(rVar);
    }

    @Override // sq0.r
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public a f() {
        return (a) super.f();
    }
}
