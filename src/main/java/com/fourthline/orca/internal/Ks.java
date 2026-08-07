package com.fourthline.orca.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Ks {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f26651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Ks f26652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Ks f26653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Ks f26654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Ks f26655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Ks f26656h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Ks f26657i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Ks f26658j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Ks f26659k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Ks f26660l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f26661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f26662b;

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
        HashMap map = new HashMap(10);
        f26651c = map;
        f26652d = new Ks(null, null);
        a aVar = a.none;
        f26653e = new Ks(aVar, null);
        a aVar2 = a.xMidYMid;
        b bVar = b.meet;
        f26654f = new Ks(aVar2, bVar);
        a aVar3 = a.xMinYMin;
        f26655g = new Ks(aVar3, bVar);
        a aVar4 = a.xMaxYMax;
        f26656h = new Ks(aVar4, bVar);
        a aVar5 = a.xMidYMin;
        f26657i = new Ks(aVar5, bVar);
        a aVar6 = a.xMidYMax;
        f26658j = new Ks(aVar6, bVar);
        b bVar2 = b.slice;
        f26659k = new Ks(aVar2, bVar2);
        f26660l = new Ks(aVar3, bVar2);
        map.put("none", aVar);
        map.put("xMinYMin", aVar3);
        map.put("xMidYMin", aVar5);
        map.put("xMaxYMin", a.xMaxYMin);
        map.put("xMinYMid", a.xMinYMid);
        map.put("xMidYMid", aVar2);
        map.put("xMaxYMid", a.xMaxYMid);
        map.put("xMinYMax", a.xMinYMax);
        map.put("xMidYMax", aVar6);
        map.put("xMaxYMax", aVar4);
    }

    Ks(a aVar, b bVar) {
        this.f26661a = aVar;
        this.f26662b = bVar;
    }

    public static Ks a(String str) {
        try {
            return b(str);
        } catch (Xw e11) {
            throw new IllegalArgumentException(e11.getMessage());
        }
    }

    public b b() {
        return this.f26662b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Ks ks2 = (Ks) obj;
        return this.f26661a == ks2.f26661a && this.f26662b == ks2.f26662b;
    }

    public String toString() {
        return this.f26661a + " " + this.f26662b;
    }

    private static Ks b(String str) throws Xw {
        b bVar;
        SA sa2 = new SA(str);
        sa2.q();
        String strK = sa2.k();
        if ("defer".equals(strK)) {
            sa2.q();
            strK = sa2.k();
        }
        a aVar = (a) f26651c.get(strK);
        sa2.q();
        if (sa2.c()) {
            bVar = null;
        } else {
            String strK2 = sa2.k();
            strK2.getClass();
            if (strK2.equals("meet")) {
                bVar = b.meet;
            } else {
                if (!strK2.equals("slice")) {
                    throw new Xw("Invalid preserveAspectRatio definition: " + str);
                }
                bVar = b.slice;
            }
        }
        return new Ks(aVar, bVar);
    }

    public a a() {
        return this.f26661a;
    }
}
