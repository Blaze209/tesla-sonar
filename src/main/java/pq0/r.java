package pq0;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class r extends uq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sq0.t f103740a = new sq0.t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o f103741b = new o();

    @Override // uq0.a, uq0.d
    public boolean b() {
        return true;
    }

    @Override // uq0.d
    public sq0.a c() {
        return this.f103740a;
    }

    @Override // uq0.a, uq0.d
    public void d(CharSequence charSequence) {
        this.f103741b.f(charSequence);
    }

    @Override // uq0.d
    public uq0.c e(uq0.h hVar) {
        return !hVar.b() ? uq0.c.b(hVar.getIndex()) : uq0.c.d();
    }

    @Override // uq0.a, uq0.d
    public void g() {
        if (this.f103741b.d().length() == 0) {
            this.f103740a.l();
        }
    }

    @Override // uq0.a, uq0.d
    public void h(tq0.a aVar) {
        CharSequence charSequenceD = this.f103741b.d();
        if (charSequenceD.length() > 0) {
            aVar.a(charSequenceD.toString(), this.f103740a);
        }
    }

    public CharSequence i() {
        return this.f103741b.d();
    }

    public List<sq0.o> j() {
        return this.f103741b.c();
    }
}
