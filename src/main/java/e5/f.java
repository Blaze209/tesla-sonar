package e5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    p f61812d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f61814f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f61815g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f61809a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f61810b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f61811c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    a f61813e = a.UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f61816h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    g f61817i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f61818j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    List<d> f61819k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    List<f> f61820l = new ArrayList();

    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f61812d = pVar;
    }

    @Override // e5.d
    public void a(d dVar) {
        Iterator<f> it = this.f61820l.iterator();
        while (it.hasNext()) {
            if (!it.next().f61818j) {
                return;
            }
        }
        this.f61811c = true;
        d dVar2 = this.f61809a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f61810b) {
            this.f61812d.a(this);
            return;
        }
        f fVar = null;
        int i11 = 0;
        for (f fVar2 : this.f61820l) {
            if (!(fVar2 instanceof g)) {
                i11++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i11 == 1 && fVar.f61818j) {
            g gVar = this.f61817i;
            if (gVar != null) {
                if (!gVar.f61818j) {
                    return;
                } else {
                    this.f61814f = this.f61816h * gVar.f61815g;
                }
            }
            d(fVar.f61815g + this.f61814f);
        }
        d dVar3 = this.f61809a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f61819k.add(dVar);
        if (this.f61818j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f61820l.clear();
        this.f61819k.clear();
        this.f61818j = false;
        this.f61815g = 0;
        this.f61811c = false;
        this.f61810b = false;
    }

    public void d(int i11) {
        if (this.f61818j) {
            return;
        }
        this.f61818j = true;
        this.f61815g = i11;
        for (d dVar : this.f61819k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f61812d.f61853b.v());
        sb2.append(":");
        sb2.append(this.f61813e);
        sb2.append("(");
        sb2.append(this.f61818j ? Integer.valueOf(this.f61815g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f61820l.size());
        sb2.append(":d=");
        sb2.append(this.f61819k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
