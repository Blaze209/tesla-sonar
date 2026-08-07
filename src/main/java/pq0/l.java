package pq0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class l extends uq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sq0.m f103693a = new sq0.m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<CharSequence> f103694b = new ArrayList();

    public static class a extends uq0.b {
        @Override // uq0.e
        public uq0.f a(uq0.h hVar, uq0.g gVar) {
            return (hVar.O() < rq0.d.f108704a || hVar.b() || (hVar.d().c() instanceof sq0.t)) ? uq0.f.c() : uq0.f.d(new l()).a(hVar.getColumn() + rq0.d.f108704a);
        }
    }

    @Override // uq0.d
    public sq0.a c() {
        return this.f103693a;
    }

    @Override // uq0.a, uq0.d
    public void d(CharSequence charSequence) {
        this.f103694b.add(charSequence);
    }

    @Override // uq0.d
    public uq0.c e(uq0.h hVar) {
        if (hVar.O() >= rq0.d.f108704a) {
            return uq0.c.a(hVar.getColumn() + rq0.d.f108704a);
        }
        return hVar.b() ? uq0.c.b(hVar.c()) : uq0.c.d();
    }

    @Override // uq0.a, uq0.d
    public void g() {
        int size = this.f103694b.size() - 1;
        while (size >= 0 && rq0.d.f(this.f103694b.get(size))) {
            size--;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < size + 1; i11++) {
            sb2.append(this.f103694b.get(i11));
            sb2.append('\n');
        }
        this.f103693a.o(sb2.toString());
    }
}
