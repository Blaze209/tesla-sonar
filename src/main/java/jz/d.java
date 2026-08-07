package jz;

import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f84444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f84445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f84446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f84447h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f84448i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f84449j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f84450k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d f84451l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f84452m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f84453d;

    static {
        t tVar = t.REQUIRED;
        f84444e = new d("A128CBC-HS256", tVar, 256);
        t tVar2 = t.OPTIONAL;
        f84445f = new d("A192CBC-HS384", tVar2, KyberEngine.KyberPolyBytes);
        f84446g = new d("A256CBC-HS512", tVar, 512);
        f84447h = new d("A128CBC+HS256", tVar2, 256);
        f84448i = new d("A256CBC+HS512", tVar2, 512);
        t tVar3 = t.RECOMMENDED;
        f84449j = new d("A128GCM", tVar3, 128);
        f84450k = new d("A192GCM", tVar2, 192);
        f84451l = new d("A256GCM", tVar3, 256);
        f84452m = new d("XC20P", tVar2, 256);
    }

    public d(String str, t tVar, int i11) {
        super(str, tVar);
        this.f84453d = i11;
    }

    public static d c(String str) {
        d dVar = f84444e;
        if (str.equals(dVar.getName())) {
            return dVar;
        }
        d dVar2 = f84445f;
        if (str.equals(dVar2.getName())) {
            return dVar2;
        }
        d dVar3 = f84446g;
        if (str.equals(dVar3.getName())) {
            return dVar3;
        }
        d dVar4 = f84449j;
        if (str.equals(dVar4.getName())) {
            return dVar4;
        }
        d dVar5 = f84450k;
        if (str.equals(dVar5.getName())) {
            return dVar5;
        }
        d dVar6 = f84451l;
        if (str.equals(dVar6.getName())) {
            return dVar6;
        }
        d dVar7 = f84447h;
        if (str.equals(dVar7.getName())) {
            return dVar7;
        }
        d dVar8 = f84448i;
        if (str.equals(dVar8.getName())) {
            return dVar8;
        }
        d dVar9 = f84452m;
        return str.equals(dVar9.getName()) ? dVar9 : new d(str);
    }

    public int b() {
        return this.f84453d;
    }

    public d(String str) {
        this(str, null, 0);
    }
}
