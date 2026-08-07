package d5;

import e5.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f59420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f59421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f59422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f59423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f59424f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    a5.i f59427i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashSet<d> f59419a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f59425g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f59426h = Integer.MIN_VALUE;

    public enum a {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, a aVar) {
        this.f59422d = eVar;
        this.f59423e = aVar;
    }

    public boolean a(d dVar, int i11) {
        return b(dVar, i11, Integer.MIN_VALUE, false);
    }

    public boolean b(d dVar, int i11, int i12, boolean z11) {
        if (dVar == null) {
            q();
            return true;
        }
        if (!z11 && !p(dVar)) {
            return false;
        }
        this.f59424f = dVar;
        if (dVar.f59419a == null) {
            dVar.f59419a = new HashSet<>();
        }
        HashSet<d> hashSet = this.f59424f.f59419a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f59425g = i11;
        this.f59426h = i12;
        return true;
    }

    public void c(int i11, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.f59419a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                e5.i.a(it.next().f59422d, i11, arrayList, oVar);
            }
        }
    }

    public HashSet<d> d() {
        return this.f59419a;
    }

    public int e() {
        if (this.f59421c) {
            return this.f59420b;
        }
        return 0;
    }

    public int f() {
        d dVar;
        if (this.f59422d.X() == 8) {
            return 0;
        }
        return (this.f59426h == Integer.MIN_VALUE || (dVar = this.f59424f) == null || dVar.f59422d.X() != 8) ? this.f59425g : this.f59426h;
    }

    public final d g() {
        switch (this.f59423e) {
            case NONE:
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
                return null;
            case LEFT:
                return this.f59422d.S;
            case TOP:
                return this.f59422d.T;
            case RIGHT:
                return this.f59422d.Q;
            case BOTTOM:
                return this.f59422d.R;
            default:
                throw new AssertionError(this.f59423e.name());
        }
    }

    public e h() {
        return this.f59422d;
    }

    public a5.i i() {
        return this.f59427i;
    }

    public d j() {
        return this.f59424f;
    }

    public a k() {
        return this.f59423e;
    }

    public boolean l() {
        HashSet<d> hashSet = this.f59419a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().g().o()) {
                return true;
            }
        }
        return false;
    }

    public boolean m() {
        HashSet<d> hashSet = this.f59419a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean n() {
        return this.f59421c;
    }

    public boolean o() {
        return this.f59424f != null;
    }

    public boolean p(d dVar) {
        if (dVar == null) {
            return false;
        }
        a aVarK = dVar.k();
        a aVar = this.f59423e;
        if (aVarK == aVar) {
            return aVar != a.BASELINE || (dVar.h().b0() && h().b0());
        }
        switch (aVar) {
            case NONE:
            case CENTER_X:
            case CENTER_Y:
                return false;
            case LEFT:
            case RIGHT:
                boolean z11 = aVarK == a.LEFT || aVarK == a.RIGHT;
                if (dVar.h() instanceof h) {
                    return z11 || aVarK == a.CENTER_X;
                }
                return z11;
            case TOP:
            case BOTTOM:
                boolean z12 = aVarK == a.TOP || aVarK == a.BOTTOM;
                if (dVar.h() instanceof h) {
                    return z12 || aVarK == a.CENTER_Y;
                }
                return z12;
            case BASELINE:
                return (aVarK == a.LEFT || aVarK == a.RIGHT) ? false : true;
            case CENTER:
                return (aVarK == a.BASELINE || aVarK == a.CENTER_X || aVarK == a.CENTER_Y) ? false : true;
            default:
                throw new AssertionError(this.f59423e.name());
        }
    }

    public void q() {
        HashSet<d> hashSet;
        d dVar = this.f59424f;
        if (dVar != null && (hashSet = dVar.f59419a) != null) {
            hashSet.remove(this);
            if (this.f59424f.f59419a.size() == 0) {
                this.f59424f.f59419a = null;
            }
        }
        this.f59419a = null;
        this.f59424f = null;
        this.f59425g = 0;
        this.f59426h = Integer.MIN_VALUE;
        this.f59421c = false;
        this.f59420b = 0;
    }

    public void r() {
        this.f59421c = false;
        this.f59420b = 0;
    }

    public void s(a5.c cVar) {
        a5.i iVar = this.f59427i;
        if (iVar == null) {
            this.f59427i = new a5.i(a5.i.a.UNRESTRICTED, null);
        } else {
            iVar.e();
        }
    }

    public void t(int i11) {
        this.f59420b = i11;
        this.f59421c = true;
    }

    public String toString() {
        return this.f59422d.v() + ":" + this.f59423e.toString();
    }

    public void u(int i11) {
        if (o()) {
            this.f59426h = i11;
        }
    }
}
