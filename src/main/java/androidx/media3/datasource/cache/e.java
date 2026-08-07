package androidx.media3.datasource.cache;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;
import s7.t;

/* JADX INFO: loaded from: classes.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TreeSet<i> f9215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList<a> f9216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private w7.f f9217e;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f9218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f9219b;

        public a(long j11, long j12) {
            this.f9218a = j11;
            this.f9219b = j12;
        }

        public boolean a(long j11, long j12) {
            long j13 = this.f9219b;
            if (j13 == -1) {
                return j11 >= this.f9218a;
            }
            if (j12 == -1) {
                return false;
            }
            long j14 = this.f9218a;
            return j14 <= j11 && j11 + j12 <= j14 + j13;
        }

        public boolean b(long j11, long j12) {
            long j13 = this.f9218a;
            if (j13 > j11) {
                return j12 == -1 || j11 + j12 > j13;
            }
            long j14 = this.f9219b;
            return j14 == -1 || j13 + j14 > j11;
        }
    }

    public e(int i11, String str) {
        this(i11, str, w7.f.f121100c);
    }

    public void a(i iVar) {
        this.f9215c.add(iVar);
    }

    public boolean b(w7.e eVar) {
        w7.f fVar = this.f9217e;
        w7.f fVarG = fVar.g(eVar);
        this.f9217e = fVarG;
        return !fVarG.equals(fVar);
    }

    public w7.f c() {
        return this.f9217e;
    }

    public i d(long j11, long j12) {
        i iVarH = i.h(this.f9214b, j11);
        i iVarFloor = this.f9215c.floor(iVarH);
        if (iVarFloor != null && iVarFloor.f121093b + iVarFloor.f121094c > j11) {
            return iVarFloor;
        }
        i iVarCeiling = this.f9215c.ceiling(iVarH);
        if (iVarCeiling != null) {
            long j13 = iVarCeiling.f121093b - j11;
            j12 = j12 == -1 ? j13 : Math.min(j13, j12);
        }
        return i.g(this.f9214b, j11, j12);
    }

    public TreeSet<i> e() {
        return this.f9215c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f9213a == eVar.f9213a && this.f9214b.equals(eVar.f9214b) && this.f9215c.equals(eVar.f9215c) && this.f9217e.equals(eVar.f9217e)) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return this.f9215c.isEmpty();
    }

    public boolean g(long j11, long j12) {
        for (int i11 = 0; i11 < this.f9216d.size(); i11++) {
            if (this.f9216d.get(i11).a(j11, j12)) {
                return true;
            }
        }
        return false;
    }

    public boolean h() {
        return this.f9216d.isEmpty();
    }

    public int hashCode() {
        return (((this.f9213a * 31) + this.f9214b.hashCode()) * 31) + this.f9217e.hashCode();
    }

    public boolean i(long j11, long j12) {
        for (int i11 = 0; i11 < this.f9216d.size(); i11++) {
            if (this.f9216d.get(i11).b(j11, j12)) {
                return false;
            }
        }
        this.f9216d.add(new a(j11, j12));
        return true;
    }

    public boolean j(w7.c cVar) {
        if (!this.f9215c.remove(cVar)) {
            return false;
        }
        File file = cVar.f121096e;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public i k(i iVar, long j11, boolean z11) {
        long j12;
        s7.a.h(this.f9215c.remove(iVar));
        File file = (File) s7.a.f(iVar.f121096e);
        if (z11) {
            j12 = j11;
            File fileI = i.i((File) s7.a.f(file.getParentFile()), this.f9213a, iVar.f121093b, j12);
            if (file.renameTo(fileI)) {
                file = fileI;
            } else {
                t.i("CachedContent", "Failed to rename " + file + " to " + fileI);
            }
        } else {
            j12 = j11;
        }
        i iVarD = iVar.d(file, j12);
        this.f9215c.add(iVarD);
        return iVarD;
    }

    public void l(long j11) {
        for (int i11 = 0; i11 < this.f9216d.size(); i11++) {
            if (this.f9216d.get(i11).f9218a == j11) {
                this.f9216d.remove(i11);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public e(int i11, String str, w7.f fVar) {
        this.f9213a = i11;
        this.f9214b = str;
        this.f9217e = fVar;
        this.f9215c = new TreeSet<>();
        this.f9216d = new ArrayList<>();
    }
}
