package pj;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class e extends nj.e<c> implements fj.b {
    public e(c cVar) {
        super(cVar);
    }

    @Override // fj.c
    @NonNull
    public Class<c> a() {
        return c.class;
    }

    @Override // fj.c
    public int getSize() {
        return ((c) this.f95061a).i();
    }

    @Override // nj.e, fj.b
    public void initialize() {
        ((c) this.f95061a).e().prepareToDraw();
    }

    @Override // fj.c
    public void recycle() {
        ((c) this.f95061a).stop();
        ((c) this.f95061a).k();
    }
}
