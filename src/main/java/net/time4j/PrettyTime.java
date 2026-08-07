package net.time4j;

import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes9.dex */
public final class PrettyTime {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final net.time4j.format.i f93903k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final ConcurrentMap<Locale, PrettyTime> f93904l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final x[] f93905m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final x[] f93906n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Set<x> f93907o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f93908p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final net.time4j.format.p f93909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Locale f93910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final net.time4j.base.e<?> f93911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final char f93912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f93913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final x f93914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f93915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f93916h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f93917i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f93918j;

    static {
        net.time4j.format.i iVar = null;
        int i11 = 0;
        for (net.time4j.format.i iVar2 : net.time4j.base.d.c().g(net.time4j.format.i.class)) {
            int length = iVar2.a().length;
            if (length >= i11) {
                iVar = iVar2;
                i11 = length;
            }
        }
        if (iVar == null) {
            iVar = net.time4j.format.i.f94437a;
        }
        f93903k = iVar;
        f93904l = new ConcurrentHashMap();
        f fVar = f.YEARS;
        f fVar2 = f.MONTHS;
        f fVar3 = f.DAYS;
        h hVar = h.HOURS;
        h hVar2 = h.MINUTES;
        h hVar3 = h.SECONDS;
        x[] xVarArr = {fVar, fVar2, f.WEEKS, fVar3, hVar, hVar2, hVar3};
        f93905m = xVarArr;
        f93906n = new x[]{fVar, fVar2, fVar3, hVar, hVar2, hVar3};
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, xVarArr);
        hashSet.add(h.NANOS);
        f93907o = Collections.unmodifiableSet(hashSet);
        f93908p = 63072000L;
    }

    private PrettyTime(Locale locale, net.time4j.base.e<?> eVar, char c11, String str, x xVar, boolean z11, boolean z12, String str2, String str3) {
        if (xVar == null) {
            throw new NullPointerException("Missing zero time unit.");
        }
        if (eVar == null) {
            throw new NullPointerException("Missing reference clock.");
        }
        this.f93909a = net.time4j.format.p.f(locale, net.time4j.format.k.CARDINALS);
        this.f93910b = locale;
        this.f93911c = eVar;
        this.f93912d = c11;
        this.f93914f = xVar;
        this.f93913e = str;
        this.f93915g = z11;
        this.f93916h = z12;
        this.f93917i = str2;
        this.f93918j = str3;
    }

    public static PrettyTime b(Locale locale) {
        ConcurrentMap<Locale, PrettyTime> concurrentMap = f93904l;
        PrettyTime prettyTime = concurrentMap.get(locale);
        if (prettyTime != null) {
            return prettyTime;
        }
        p0 p0Var = p0.f94706e;
        net.time4j.format.i iVar = f93903k;
        PrettyTime prettyTime2 = new PrettyTime(locale, p0Var, iVar.d(locale), iVar.c(locale), h.SECONDS, false, false, null, null);
        PrettyTime prettyTimePutIfAbsent = concurrentMap.putIfAbsent(locale, prettyTime2);
        return prettyTimePutIfAbsent != null ? prettyTimePutIfAbsent : prettyTime2;
    }

    public Locale a() {
        return this.f93910b;
    }

    public String c() {
        return s0.h(a()).b();
    }
}
