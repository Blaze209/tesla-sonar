package qq0;

import sq0.f;
import sq0.r;
import sq0.v;
import sq0.w;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b implements vq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f105855a;

    protected b(char c11) {
        this.f105855a = c11;
    }

    @Override // vq0.a
    public char a() {
        return this.f105855a;
    }

    @Override // vq0.a
    public int b() {
        return 1;
    }

    @Override // vq0.a
    public char c() {
        return this.f105855a;
    }

    @Override // vq0.a
    public int d(vq0.b bVar, vq0.b bVar2) {
        if ((bVar.a() || bVar2.c()) && bVar2.b() % 3 != 0 && (bVar.b() + bVar2.b()) % 3 == 0) {
            return 0;
        }
        return (bVar.length() < 2 || bVar2.length() < 2) ? 1 : 2;
    }

    @Override // vq0.a
    public void e(w wVar, w wVar2, int i11) {
        r vVar;
        String strValueOf = String.valueOf(c());
        if (i11 == 1) {
            vVar = new f(strValueOf);
        } else {
            vVar = new v(strValueOf + strValueOf);
        }
        r rVarE = wVar.e();
        while (rVarE != null && rVarE != wVar2) {
            r rVarE2 = rVarE.e();
            vVar.b(rVarE);
            rVarE = rVarE2;
        }
        wVar.h(vVar);
    }
}
