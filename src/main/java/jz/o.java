package jz;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f84535d = new o("HS256", t.REQUIRED);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o f84536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o f84537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o f84538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o f84539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final o f84540i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final o f84541j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final o f84542k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final o f84543l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final o f84544m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final o f84545n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final o f84546o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final o f84547p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final o f84548q;

    static {
        t tVar = t.OPTIONAL;
        f84536e = new o("HS384", tVar);
        f84537f = new o("HS512", tVar);
        t tVar2 = t.RECOMMENDED;
        f84538g = new o("RS256", tVar2);
        f84539h = new o("RS384", tVar);
        f84540i = new o("RS512", tVar);
        f84541j = new o("ES256", tVar2);
        f84542k = new o("ES256K", tVar);
        f84543l = new o("ES384", tVar);
        f84544m = new o("ES512", tVar);
        f84545n = new o("PS256", tVar);
        f84546o = new o("PS384", tVar);
        f84547p = new o("PS512", tVar);
        f84548q = new o("EdDSA", tVar);
    }

    public o(String str, t tVar) {
        super(str, tVar);
    }

    public static o b(String str) {
        o oVar = f84535d;
        if (str.equals(oVar.getName())) {
            return oVar;
        }
        o oVar2 = f84536e;
        if (str.equals(oVar2.getName())) {
            return oVar2;
        }
        o oVar3 = f84537f;
        if (str.equals(oVar3.getName())) {
            return oVar3;
        }
        o oVar4 = f84538g;
        if (str.equals(oVar4.getName())) {
            return oVar4;
        }
        o oVar5 = f84539h;
        if (str.equals(oVar5.getName())) {
            return oVar5;
        }
        o oVar6 = f84540i;
        if (str.equals(oVar6.getName())) {
            return oVar6;
        }
        o oVar7 = f84541j;
        if (str.equals(oVar7.getName())) {
            return oVar7;
        }
        o oVar8 = f84542k;
        if (str.equals(oVar8.getName())) {
            return oVar8;
        }
        o oVar9 = f84543l;
        if (str.equals(oVar9.getName())) {
            return oVar9;
        }
        o oVar10 = f84544m;
        if (str.equals(oVar10.getName())) {
            return oVar10;
        }
        o oVar11 = f84545n;
        if (str.equals(oVar11.getName())) {
            return oVar11;
        }
        o oVar12 = f84546o;
        if (str.equals(oVar12.getName())) {
            return oVar12;
        }
        o oVar13 = f84547p;
        if (str.equals(oVar13.getName())) {
            return oVar13;
        }
        o oVar14 = f84548q;
        return str.equals(oVar14.getName()) ? oVar14 : new o(str);
    }

    public o(String str) {
        super(str, null);
    }
}
