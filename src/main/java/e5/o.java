package e5;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static int f61838g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f61840b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f61842d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList<d5.e> f61839a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f61841c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList<a> f61843e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f61844f = -1;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<d5.e> f61845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f61846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f61847c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f61848d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f61849e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f61850f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f61851g;

        a(d5.e eVar, a5.d dVar, int i11) {
            this.f61845a = new WeakReference<>(eVar);
            this.f61846b = dVar.y(eVar.Q);
            this.f61847c = dVar.y(eVar.R);
            this.f61848d = dVar.y(eVar.S);
            this.f61849e = dVar.y(eVar.T);
            this.f61850f = dVar.y(eVar.U);
            this.f61851g = i11;
        }
    }

    public o(int i11) {
        int i12 = f61838g;
        f61838g = i12 + 1;
        this.f61840b = i12;
        this.f61842d = i11;
    }

    private String e() {
        int i11 = this.f61842d;
        if (i11 == 0) {
            return "Horizontal";
        }
        if (i11 == 1) {
            return "Vertical";
        }
        return i11 == 2 ? "Both" : "Unknown";
    }

    private int j(a5.d dVar, ArrayList<d5.e> arrayList, int i11) {
        int iY;
        int iY2;
        d5.f fVar = (d5.f) arrayList.get(0).M();
        dVar.E();
        fVar.g(dVar, false);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList.get(i12).g(dVar, false);
        }
        if (i11 == 0 && fVar.f59487g1 > 0) {
            d5.b.b(fVar, dVar, arrayList, 0);
        }
        if (i11 == 1 && fVar.f59488h1 > 0) {
            d5.b.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.A();
        } catch (Exception e11) {
            System.err.println(e11.toString() + "\n" + Arrays.toString(e11.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f61843e = new ArrayList<>();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            this.f61843e.add(new a(arrayList.get(i13), dVar, i11));
        }
        if (i11 == 0) {
            iY = dVar.y(fVar.Q);
            iY2 = dVar.y(fVar.S);
            dVar.E();
        } else {
            iY = dVar.y(fVar.R);
            iY2 = dVar.y(fVar.T);
            dVar.E();
        }
        return iY2 - iY;
    }

    public boolean a(d5.e eVar) {
        if (this.f61839a.contains(eVar)) {
            return false;
        }
        this.f61839a.add(eVar);
        return true;
    }

    public void b(ArrayList<o> arrayList) {
        int size = this.f61839a.size();
        if (this.f61844f != -1 && size > 0) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                o oVar = arrayList.get(i11);
                if (this.f61844f == oVar.f61840b) {
                    g(this.f61842d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f61840b;
    }

    public int d() {
        return this.f61842d;
    }

    public int f(a5.d dVar, int i11) {
        if (this.f61839a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f61839a, i11);
    }

    public void g(int i11, o oVar) {
        for (d5.e eVar : this.f61839a) {
            oVar.a(eVar);
            if (i11 == 0) {
                eVar.S0 = oVar.c();
            } else {
                eVar.T0 = oVar.c();
            }
        }
        this.f61844f = oVar.f61840b;
    }

    public void h(boolean z11) {
        this.f61841c = z11;
    }

    public void i(int i11) {
        this.f61842d = i11;
    }

    public String toString() {
        String str = e() + " [" + this.f61840b + "] <";
        Iterator<d5.e> it = this.f61839a.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().v();
        }
        return str + " >";
    }
}
