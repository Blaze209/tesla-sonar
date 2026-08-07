package com.fourthline.orca.internal;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.q5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3714q5 implements G4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F4 f34719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3029a4 f34720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f34721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f34722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f34723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private G5 f34724f;

    public C3714q5(F4 contactBundle, InterfaceC3029a4 cellularManager, List countries) {
        G5 g5E;
        p013kotlin.jvm.internal.s.k(contactBundle, "contactBundle");
        p013kotlin.jvm.internal.s.k(cellularManager, "cellularManager");
        p013kotlin.jvm.internal.s.k(countries, "countries");
        this.f34719a = contactBundle;
        this.f34720b = cellularManager;
        this.f34721c = countries;
        if (e() == null && contactBundle.c() != null) {
            g5E = a();
        } else if (e() == null) {
            G5 g5K = k();
            String strG = g5K.g();
            String strF = f();
            contactBundle.c(p013kotlin.text.t.F1(strG + " " + (strF == null ? "" : strF)).toString());
            g5E = g5K;
        } else {
            g5E = e();
        }
        a(g5E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G5 c(C3714q5 c3714q5) {
        Object obj;
        Object next;
        String strA;
        String strA2;
        Iterator it = c3714q5.b().iterator();
        do {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
                strA = AbstractC3157d4.a(((G5) next).b());
                strA2 = c3714q5.f34720b.a();
            }
            return (G5) obj;
        } while (!p013kotlin.jvm.internal.s.f(strA, strA2 != null ? AbstractC3157d4.a(strA2) : null));
        obj = next;
        return (G5) obj;
    }

    private final G5 k() {
        G5 g5A;
        Lazy lazyB = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.v91
            @Override // wn0.a
            public final Object invoke() {
                return C3714q5.b(this.f36048a);
            }
        });
        Lazy lazyB2 = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.w91
            @Override // wn0.a
            public final Object invoke() {
                return C3714q5.c(this.f36373a);
            }
        });
        Lazy lazyB3 = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.x91
            @Override // wn0.a
            public final Object invoke() {
                return C3714q5.a(this.f36690a);
            }
        });
        if (c(lazyB2) != null) {
            g5A = c(lazyB2);
        } else {
            g5A = a(lazyB3) != null ? a(lazyB3) : b(lazyB);
        }
        return g5A == null ? b(lazyB) : g5A;
    }

    @Override // com.fourthline.orca.internal.G4
    public void a(String str) {
        String strG;
        F4 f11 = this.f34719a;
        G5 g5E = e();
        if (g5E == null || (strG = g5E.g()) == null) {
            strG = "";
        }
        f11.c(p013kotlin.text.t.F1(strG + " " + str).toString());
        this.f34723e = str;
    }

    @Override // com.fourthline.orca.internal.G4
    public List b() {
        return this.f34721c;
    }

    @Override // com.fourthline.orca.internal.G4
    public String g() {
        return this.f34719a.a();
    }

    @Override // com.fourthline.orca.internal.G4
    public boolean h() {
        String strG = g();
        return strG == null || strG.length() == 0;
    }

    @Override // com.fourthline.orca.internal.G4
    public boolean i() {
        String strF;
        return d() && (strF = f()) != null && strF.length() != 0 && j();
    }

    @Override // com.fourthline.orca.internal.G4
    public boolean j() {
        return this.f34719a.d();
    }

    @Override // com.fourthline.orca.internal.G4
    public void b(String str) {
        this.f34719a.b(str);
        this.f34722d = str;
    }

    @Override // com.fourthline.orca.internal.G4
    public boolean d() {
        return this.f34719a.b();
    }

    @Override // com.fourthline.orca.internal.G4
    public G5 e() {
        return this.f34724f;
    }

    @Override // com.fourthline.orca.internal.G4
    public String f() {
        List listF1;
        String strC = this.f34719a.c();
        if (strC == null || (listF1 = p013kotlin.text.t.f1(strC, new String[]{" "}, false, 0, 6, null)) == null) {
            return null;
        }
        return (String) p013kotlin.collections.v.r0(listF1, 1);
    }

    @Override // com.fourthline.orca.internal.G4
    public void a(G5 g11) {
        String strG;
        F4 f11 = this.f34719a;
        if (g11 == null || (strG = g11.g()) == null) {
            strG = "";
        }
        String strF = f();
        f11.c(p013kotlin.text.t.F1(strG + " " + (strF != null ? strF : "")).toString());
        this.f34724f = g11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G5 b(C3714q5 c3714q5) {
        for (G5 g11 : c3714q5.b()) {
            if (p013kotlin.jvm.internal.s.f(g11.c(), "NLD")) {
                return g11;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final G5 a() {
        List listF1;
        String strC = this.f34719a.c();
        Object obj = null;
        String str = (strC == null || (listF1 = p013kotlin.text.t.f1(strC, new String[]{" "}, false, 0, 6, null)) == null) ? null : (String) p013kotlin.collections.v.r0(listF1, 0);
        for (Object obj2 : b()) {
            if (p013kotlin.jvm.internal.s.f(((G5) obj2).g(), str)) {
                obj = obj2;
                break;
            }
        }
        G5 g11 = (G5) obj;
        if (g11 != null) {
            return g11;
        }
        G5 g5K = k();
        this.f34719a.c(g5K.g());
        return g5K;
    }

    private static final G5 c(Lazy lazy) {
        return (G5) lazy.getValue();
    }

    @Override // com.fourthline.orca.internal.G4
    public boolean c() {
        String strF = f();
        return strF == null || strF.length() == 0;
    }

    private static final G5 b(Lazy lazy) {
        return (G5) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G5 a(C3714q5 c3714q5) {
        Object next;
        Iterator it = c3714q5.b().iterator();
        while (it.hasNext()) {
            next = it.next();
            String strA = AbstractC3157d4.a(((G5) next).b());
            String country = Locale.getDefault().getCountry();
            p013kotlin.jvm.internal.s.j(country, "getCountry(...)");
            if (p013kotlin.jvm.internal.s.f(strA, AbstractC3157d4.a(country))) {
                return (G5) next;
            }
        }
        next = null;
        return (G5) next;
    }

    private static final G5 a(Lazy lazy) {
        return (G5) lazy.getValue();
    }
}
