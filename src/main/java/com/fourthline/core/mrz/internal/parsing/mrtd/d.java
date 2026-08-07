package com.fourthline.core.mrz.internal.parsing.mrtd;

import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d implements com.fourthline.core.mrz.internal.parsing.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bo0.j f24248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bo0.j f24249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bo0.j f24250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final bo0.j f24251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final bo0.j f24252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final bo0.j f24253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final bo0.j f24254h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final bo0.j f24255i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final bo0.j f24256j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final bo0.j f24257k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Lazy f24258l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Lazy f24259m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Lazy f24260n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Lazy f24261o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Lazy f24262p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Lazy f24263q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Lazy f24264r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Lazy f24265s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Lazy f24266t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Lazy f24267u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Lazy f24268v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Lazy f24269w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Lazy f24270x;

    public d(String mrzText) {
        p013kotlin.jvm.internal.s.k(mrzText, "mrzText");
        this.f24247a = mrzText;
        bo0.j.Companion companion = bo0.j.INSTANCE;
        this.f24248b = companion.a();
        this.f24249c = companion.a();
        this.f24250d = companion.a();
        this.f24251e = companion.a();
        this.f24252f = companion.a();
        this.f24253g = companion.a();
        this.f24254h = companion.a();
        this.f24255i = companion.a();
        this.f24256j = companion.a();
        this.f24257k = companion.a();
        this.f24258l = jn0.m.b(new wn0.a() { // from class: com.fourthline.core.mrz.internal.parsing.mrtd.o
            @Override // wn0.a
            public final Object invoke() {
                return d.h(this.f24288a);
            }
        });
        this.f24259m = jn0.m.b(new wn0.a() { // from class: com.fourthline.core.mrz.internal.parsing.mrtd.v
            @Override // wn0.a
            public final Object invoke() {
                return d.i(this.f24295a);
            }
        });
        this.f24260n = jn0.m.b(new wn0.a() { // from class: com.fourthline.core.mrz.internal.parsing.mrtd.w
            @Override // wn0.a
            public final Object invoke() {
                return d.b(this.f24296a);
            }
        });
        this.f24261o = jn0.m.b(new wn0.a() { // from class: com.fourthline.core.mrz.internal.parsing.mrtd.x
            @Override // wn0.a
            public final Object invoke() {
                return d.f(this.f24297a);
            }
        });
        this.f24262p = jn0.m.b(new wn0.a() { // from class: com.fourthline.core.mrz.internal.parsing.mrtd.y
            @Override // wn0.a
            public final Object invoke() {
                return d.g(this.f24298a);
            }
        });
        this.f24263q = jn0.m.b(new wn0.a() { // from class: com.fourthline.core.mrz.internal.parsing.mrtd.z
            @Override // wn0.a
            public final Object invoke() {
                return d.j(this.f24299a);
            }
        });
        this.f24264r = jn0.m.b(new wn0.a() { // from class: com.fourthline.core.mrz.internal.parsing.mrtd.a0
            @Override // wn0.a
            public final Object invoke() {
                return d.l(this.f24235a);
            }
        });
        this.f24265s = jn0.m.b(new wn0.a() { // from class: com.fourthline.core.mrz.internal.parsing.mrtd.p
            @Override // wn0.a
            public final Object invoke() {
                return d.a(this.f24289a);
            }
        });
        this.f24266t = jn0.m.b(new wn0.a() { // from class: com.fourthline.core.mrz.internal.parsing.mrtd.q
            @Override // wn0.a
            public final Object invoke() {
                return d.e(this.f24290a);
            }
        });
        this.f24267u = jn0.m.b(new wn0.a() { // from class: com.fourthline.core.mrz.internal.parsing.mrtd.r
            @Override // wn0.a
            public final Object invoke() {
                return d.m(this.f24291a);
            }
        });
        this.f24268v = jn0.m.b(new wn0.a() { // from class: com.fourthline.core.mrz.internal.parsing.mrtd.s
            @Override // wn0.a
            public final Object invoke() {
                return d.d(this.f24292a);
            }
        });
        this.f24269w = jn0.m.b(new wn0.a() { // from class: com.fourthline.core.mrz.internal.parsing.mrtd.t
            @Override // wn0.a
            public final Object invoke() {
                return d.c(this.f24293a);
            }
        });
        this.f24270x = jn0.m.b(new wn0.a() { // from class: com.fourthline.core.mrz.internal.parsing.mrtd.u
            @Override // wn0.a
            public final Object invoke() {
                return d.k(this.f24294a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(d dVar) {
        return com.fourthline.core.mrz.internal.transformation.f.c(dVar.a(dVar.d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(d dVar) {
        return com.fourthline.core.mrz.internal.transformation.f.b(dVar.a(new bo0.j(2, 4)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(d dVar) {
        return com.fourthline.core.mrz.internal.transformation.f.b(dVar.a(new bo0.j(0, 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(d dVar) {
        return com.fourthline.core.mrz.internal.transformation.f.c(dVar.a(dVar.j()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(d dVar) {
        return dVar.a(dVar.l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(d dVar) {
        return com.fourthline.core.mrz.internal.transformation.f.b(dVar.a(dVar.p()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String l(d dVar) {
        return dVar.a(dVar.y());
    }

    public abstract boolean A();

    @Override // com.fourthline.core.mrz.internal.parsing.a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public com.fourthline.core.mrz.internal.parsing.model.c a() {
        String strF = f();
        String strS = s();
        return a(new com.fourthline.core.mrz.internal.parsing.model.c(g(), strF, strS, v(), null, null, e(), a(e()), k(), b(k()), m(), u(), A(), b(), h(), w(), x(), 48, null));
    }

    protected abstract bo0.j c();

    protected abstract bo0.j d();

    protected String e() {
        return (String) this.f24260n.getValue();
    }

    protected bo0.j i() {
        return this.f24256j;
    }

    protected bo0.j j() {
        return this.f24251e;
    }

    protected String k() {
        return (String) this.f24261o.getValue();
    }

    protected abstract bo0.j l();

    protected String m() {
        return (String) this.f24262p.getValue();
    }

    public abstract c n();

    protected abstract String x();

    protected abstract bo0.j z();

    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(d dVar) {
        return dVar.a(dVar.c());
    }

    private final String c(String str) {
        return com.fourthline.core.mrz.internal.transformation.f.f(com.fourthline.core.mrz.internal.transformation.f.e(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(d dVar) {
        return dVar.a(dVar.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i(d dVar) {
        return com.fourthline.core.mrz.internal.transformation.f.b(dVar.a(dVar.r()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(d dVar) {
        String strG;
        String strA = dVar.a(dVar.t());
        int i11 = 0;
        while (true) {
            if (i11 >= strA.length()) {
                strA = null;
                break;
            }
            if (strA.charAt(i11) != '<') {
                break;
            }
            i11++;
        }
        if (strA == null || (strG = com.fourthline.core.mrz.internal.transformation.f.g(strA)) == null) {
            return null;
        }
        return dVar.c(strG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.fourthline.core.mrz.internal.parsing.model.a k(d dVar) {
        return dVar.n().e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String m(d dVar) {
        return dVar.a(dVar.z());
    }

    private final SimpleDateFormat o() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMdd", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }

    private final com.fourthline.core.mrz.internal.parsing.model.a v() {
        return (com.fourthline.core.mrz.internal.parsing.model.a) this.f24270x.getValue();
    }

    protected String b() {
        return (String) this.f24265s.getValue();
    }

    protected final String f() {
        return (String) this.f24269w.getValue();
    }

    protected final String g() {
        return (String) this.f24268v.getValue();
    }

    protected String h() {
        return (String) this.f24266t.getValue();
    }

    protected bo0.j p() {
        return this.f24248b;
    }

    protected String q() {
        return (String) this.f24258l.getValue();
    }

    protected bo0.j r() {
        return this.f24249c;
    }

    protected String s() {
        return (String) this.f24259m.getValue();
    }

    protected bo0.j t() {
        return this.f24253g;
    }

    protected String u() {
        return (String) this.f24263q.getValue();
    }

    protected String w() {
        return (String) this.f24267u.getValue();
    }

    protected bo0.j y() {
        return this.f24254h;
    }

    private final com.fourthline.core.mrz.internal.parsing.model.c a(com.fourthline.core.mrz.internal.parsing.model.c cVar) {
        List listF1 = p013kotlin.text.t.f1(q(), new String[]{"<<"}, false, 0, 6, null);
        return com.fourthline.core.mrz.internal.parsing.model.c.a(cVar, null, null, null, null, p013kotlin.text.t.f1((CharSequence) listF1.get(1), new String[]{"<"}, false, 0, 6, null), p013kotlin.text.t.f1((CharSequence) listF1.get(0), new String[]{"<"}, false, 0, 6, null), null, null, null, null, null, null, false, null, null, null, null, 131023, null);
    }

    private final Date b(String str) {
        return a(str, 50);
    }

    private final Date a(String str) {
        return a(str, 100);
    }

    private final Date a(String str, int i11) {
        try {
            SimpleDateFormat simpleDateFormatO = o();
            Calendar calendar = Calendar.getInstance();
            calendar.add(1, -i11);
            simpleDateFormatO.set2DigitYearStart(calendar.getTime());
            return simpleDateFormatO.parse(str);
        } catch (ParseException unused) {
            return null;
        }
    }

    private final String a(bo0.j jVar) {
        return p013kotlin.text.t.n1(this.f24247a, jVar);
    }
}
