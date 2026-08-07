package com.caverock.androidsvg;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f21219c = new e(null, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f21220d = new e(a.none, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f21221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f21222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f21223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f21224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f21225i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f21226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e f21227k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f21228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f21229b;

    public enum a {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax
    }

    public enum b {
        meet,
        slice
    }

    static {
        a aVar = a.xMidYMid;
        b bVar = b.meet;
        f21221e = new e(aVar, bVar);
        a aVar2 = a.xMinYMin;
        f21222f = new e(aVar2, bVar);
        f21223g = new e(a.xMaxYMax, bVar);
        f21224h = new e(a.xMidYMin, bVar);
        f21225i = new e(a.xMidYMax, bVar);
        b bVar2 = b.slice;
        f21226j = new e(aVar, bVar2);
        f21227k = new e(aVar2, bVar2);
    }

    e(a aVar, b bVar) {
        this.f21228a = aVar;
        this.f21229b = bVar;
    }

    public a a() {
        return this.f21228a;
    }

    public b b() {
        return this.f21229b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f21228a == eVar.f21228a && this.f21229b == eVar.f21229b;
    }

    public String toString() {
        return this.f21228a + " " + this.f21229b;
    }
}
