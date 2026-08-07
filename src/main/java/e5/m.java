package e5;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f61827h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    p f61830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    p f61831d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f61833f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f61834g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f61828a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f61829b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList<p> f61832e = new ArrayList<>();

    m(p pVar, int i11) {
        this.f61830c = null;
        this.f61831d = null;
        int i12 = f61827h;
        this.f61833f = i12;
        f61827h = i12 + 1;
        this.f61830c = pVar;
        this.f61831d = pVar;
        this.f61834g = i11;
    }

    private long c(f fVar, long j11) {
        p pVar = fVar.f61812d;
        if (pVar instanceof k) {
            return j11;
        }
        int size = fVar.f61819k.size();
        long jMin = j11;
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = fVar.f61819k.get(i11);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f61812d != pVar) {
                    jMin = Math.min(jMin, c(fVar2, ((long) fVar2.f61814f) + j11));
                }
            }
        }
        if (fVar != pVar.f61860i) {
            return jMin;
        }
        long j12 = j11 - pVar.j();
        return Math.min(Math.min(jMin, c(pVar.f61859h, j12)), j12 - ((long) pVar.f61859h.f61814f));
    }

    private long d(f fVar, long j11) {
        p pVar = fVar.f61812d;
        if (pVar instanceof k) {
            return j11;
        }
        int size = fVar.f61819k.size();
        long jMax = j11;
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = fVar.f61819k.get(i11);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f61812d != pVar) {
                    jMax = Math.max(jMax, d(fVar2, ((long) fVar2.f61814f) + j11));
                }
            }
        }
        if (fVar != pVar.f61859h) {
            return jMax;
        }
        long j12 = j11 + pVar.j();
        return Math.max(Math.max(jMax, d(pVar.f61860i, j12)), j12 - ((long) pVar.f61860i.f61814f));
    }

    public void a(p pVar) {
        this.f61832e.add(pVar);
        this.f61831d = pVar;
    }

    public long b(d5.f fVar, int i11) {
        long j11;
        int i12;
        p pVar = this.f61830c;
        if (pVar instanceof c) {
            if (((c) pVar).f61857f != i11) {
                return 0L;
            }
        } else if (i11 == 0) {
            if (!(pVar instanceof l)) {
                return 0L;
            }
        } else if (!(pVar instanceof n)) {
            return 0L;
        }
        f fVar2 = (i11 == 0 ? fVar.f59436e : fVar.f59438f).f61859h;
        f fVar3 = (i11 == 0 ? fVar.f59436e : fVar.f59438f).f61860i;
        boolean zContains = pVar.f61859h.f61820l.contains(fVar2);
        boolean zContains2 = this.f61830c.f61860i.f61820l.contains(fVar3);
        long j12 = this.f61830c.j();
        if (zContains && zContains2) {
            long jD = d(this.f61830c.f61859h, 0L);
            long jC = c(this.f61830c.f61860i, 0L);
            long j13 = jD - j12;
            p pVar2 = this.f61830c;
            int i13 = pVar2.f61860i.f61814f;
            if (j13 >= (-i13)) {
                j13 += (long) i13;
            }
            int i14 = pVar2.f61859h.f61814f;
            long j14 = ((-jC) - j12) - ((long) i14);
            if (j14 >= i14) {
                j14 -= (long) i14;
            }
            float fS = pVar2.f61853b.s(i11);
            float f11 = fS > BitmapDescriptorFactory.HUE_RED ? (long) ((j14 / fS) + (j13 / (1.0f - fS))) : 0L;
            long j15 = ((long) ((f11 * fS) + 0.5f)) + j12 + ((long) ((f11 * (1.0f - fS)) + 0.5f));
            p pVar3 = this.f61830c;
            j11 = ((long) pVar3.f61859h.f61814f) + j15;
            i12 = pVar3.f61860i.f61814f;
        } else {
            if (zContains) {
                f fVar4 = this.f61830c.f61859h;
                return Math.max(d(fVar4, fVar4.f61814f), ((long) this.f61830c.f61859h.f61814f) + j12);
            }
            if (zContains2) {
                f fVar5 = this.f61830c.f61860i;
                return Math.max(-c(fVar5, fVar5.f61814f), ((long) (-this.f61830c.f61860i.f61814f)) + j12);
            }
            p pVar4 = this.f61830c;
            j11 = ((long) pVar4.f61859h.f61814f) + pVar4.j();
            i12 = this.f61830c.f61860i.f61814f;
        }
        return j11 - ((long) i12);
    }
}
