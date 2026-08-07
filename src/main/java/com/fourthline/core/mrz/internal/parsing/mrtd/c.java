package com.fourthline.core.mrz.internal.parsing.mrtd;

import java.util.Comparator;
import java.util.List;
import p013kotlin.Lazy;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a f24239g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f24241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.fourthline.core.mrz.internal.validation.b f24242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f24243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f24244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f24245f;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return mn0.a.d(Integer.valueOf(((bo0.j) obj2).getLast()), Integer.valueOf(((bo0.j) obj).getLast()));
        }
    }

    public c(String mrz, boolean z11, com.fourthline.core.mrz.internal.validation.b checksumValidator) {
        p013kotlin.jvm.internal.s.k(mrz, "mrz");
        p013kotlin.jvm.internal.s.k(checksumValidator, "checksumValidator");
        this.f24240a = mrz;
        this.f24241b = z11;
        this.f24242c = checksumValidator;
        this.f24243d = jn0.m.b(new wn0.a() { // from class: com.fourthline.core.mrz.internal.parsing.mrtd.l
            @Override // wn0.a
            public final Object invoke() {
                return c.c(this.f24285a);
            }
        });
        this.f24244e = jn0.m.b(new wn0.a() { // from class: com.fourthline.core.mrz.internal.parsing.mrtd.m
            @Override // wn0.a
            public final Object invoke() {
                return c.b(this.f24286a);
            }
        });
        this.f24245f = jn0.m.b(new wn0.a() { // from class: com.fourthline.core.mrz.internal.parsing.mrtd.n
            @Override // wn0.a
            public final Object invoke() {
                return c.a(this.f24287a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List a(c cVar) {
        bo0.j jVar;
        List listA1 = p013kotlin.collections.v.a1(cVar.d(), new b());
        List listE = null;
        List list = cVar.g() ? listA1 : null;
        if (list != null && (jVar = (bo0.j) p013kotlin.collections.v.q0(list)) != null) {
            int first = jVar.getFirst();
            String strSubstring = cVar.f24240a.substring(first, jVar.getLast() + 4);
            p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
            int length = strSubstring.length();
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                }
                if (strSubstring.charAt(i11) == '<') {
                    break;
                }
                i11++;
            }
            Integer numValueOf = Integer.valueOf(i11);
            if (i11 == -1) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                if (numValueOf.intValue() == 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    listE = p013kotlin.collections.v.e(bo0.n.w(first, (numValueOf.intValue() - 2) + first));
                }
            }
        }
        return listE == null ? listA1 : listE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.fourthline.core.mrz.internal.parsing.model.a b(c cVar) {
        return cVar.a(cVar.a(cVar.f()), cVar.f().getLast() + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.fourthline.core.mrz.internal.parsing.model.a c(c cVar) {
        com.fourthline.core.mrz.internal.parsing.model.a aVarA = cVar.a();
        return aVarA == null ? cVar.c() : aVarA;
    }

    private final boolean g() {
        return p013kotlin.jvm.internal.s.f(c().b(), "<");
    }

    protected abstract List d();

    protected abstract bo0.j f();

    private final com.fourthline.core.mrz.internal.parsing.model.a c() {
        return (com.fourthline.core.mrz.internal.parsing.model.a) this.f24244e.getValue();
    }

    public final com.fourthline.core.mrz.internal.parsing.model.a e() {
        return (com.fourthline.core.mrz.internal.parsing.model.a) this.f24243d.getValue();
    }

    private final List b() {
        return (List) this.f24245f.getValue();
    }

    public /* synthetic */ c(String str, boolean z11, com.fourthline.core.mrz.internal.validation.b bVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z11, (i11 & 4) != 0 ? new com.fourthline.core.mrz.internal.validation.b() : bVar);
    }

    private final com.fourthline.core.mrz.internal.parsing.model.a a() {
        com.fourthline.core.mrz.internal.parsing.model.a aVarC = c();
        if (this.f24242c.a(aVarC.a(), aVarC.b())) {
            return aVarC;
        }
        for (bo0.j jVar : b()) {
            if (g()) {
                jVar = new bo0.j(jVar.getFirst(), jVar.getLast() + 1);
            }
            String str = aVarC.a() + aVarC.b() + a(jVar);
            int last = jVar.getLast() + 1;
            if (this.f24242c.a(str, a(last))) {
                return a(str, last);
            }
        }
        return null;
    }

    private final String a(bo0.j jVar) {
        String strG = com.fourthline.core.mrz.internal.transformation.f.g(p013kotlin.text.t.n1(this.f24240a, jVar));
        return !this.f24241b ? com.fourthline.core.mrz.internal.transformation.f.h(strG) : strG;
    }

    private final String a(int i11) {
        return com.fourthline.core.mrz.internal.transformation.f.i(String.valueOf(this.f24240a.charAt(i11)));
    }

    private final com.fourthline.core.mrz.internal.parsing.model.a a(String str, int i11) {
        return new com.fourthline.core.mrz.internal.parsing.model.a(str, a(str), a(i11), i11);
    }

    private final String a(String str) {
        return p013kotlin.text.t.V(str, "<", "", false, 4, null);
    }
}
