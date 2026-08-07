package com.fourthline.orca.internal;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Pair;

/* JADX INFO: renamed from: com.fourthline.orca.internal.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3880u0 implements InterfaceC3607nl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3880u0 f35779a = new C3880u0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f35780b = C3880u0.class.getSimpleName();

    private C3880u0() {
    }

    @Override // com.fourthline.orca.internal.InterfaceC3607nl
    public void a(Cl.a request) {
        p013kotlin.jvm.internal.s.k(request, "request");
        b(request);
    }

    private final String c(Cl.a aVar) {
        return a(this, new String(aVar.a().b(), p013kotlin.text.d.UTF_8), 0, 1, null);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3607nl
    public void a(Cl.c request) {
        p013kotlin.jvm.internal.s.k(request, "request");
        b(request);
    }

    public final String b(Cl.a aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        return p013kotlin.text.t.n("\nAlias: " + aVar.getAlias() + "\nUrl: " + aVar.c() + " " + aVar.e() + "\nParameters: " + aVar.d() + "\nHeaders: \n" + a(aVar.b()) + "\nRequest Body: \n" + c(aVar) + "\n    ");
    }

    private final String c(Cl.c cVar) {
        return p013kotlin.text.t.n("\nMultipart Body:\n" + p013kotlin.collections.v.y0(cVar.a(), "\n", null, "\n", 0, null, new wn0.l() { // from class: com.fourthline.orca.internal.qe1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3880u0.b((Cl.c.a) obj);
            }
        }, 26, null) + "\n    ");
    }

    @Override // com.fourthline.orca.internal.InterfaceC3607nl
    public void a(Object obj) {
        Throwable thE = jn0.s.e(obj);
        if (thE == null) {
            f35779a.a((Dl) obj);
        } else {
            thE.toString();
        }
    }

    public final String a(Dl dl2) {
        p013kotlin.jvm.internal.s.k(dl2, "<this>");
        return p013kotlin.text.t.n("\nResponse Code: " + dl2.c() + "\nHeaders: \n" + a(dl2.b()) + "\nBody: \n" + b(dl2) + "\n    ");
    }

    public final String b(Cl.c cVar) {
        p013kotlin.jvm.internal.s.k(cVar, "<this>");
        return p013kotlin.text.t.n("\nAlias: " + cVar.getAlias() + "\nUrl: " + cVar.d() + "\nParameters: " + cVar.c() + "\nHeaders: \n" + a(cVar.b()) + "\nRequest Body: \n" + c(cVar) + "\n    ");
    }

    private final String a(Map map) {
        return p013kotlin.collections.v.y0(p013kotlin.collections.v0.F(map), "\n", null, "\n", 0, null, new wn0.l() { // from class: com.fourthline.orca.internal.re1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3880u0.a((Pair) obj);
            }
        }, 26, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence a(Pair header) {
        p013kotlin.jvm.internal.s.k(header, "header");
        return header.e() + ": " + header.f();
    }

    private final String a(Cl.c.a aVar) {
        String strA;
        if (AbstractC3345hf.b(AbstractC3345hf.a(aVar.a()))) {
            strA = "*** BINARY FILE ***";
        } else {
            strA = a(this, new String(aVar.c().b(), p013kotlin.text.d.UTF_8), 0, 1, null);
        }
        return aVar.b() + " : {\n " + strA + " \n}";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence b(Cl.c.a bodyPart) {
        p013kotlin.jvm.internal.s.k(bodyPart, "bodyPart");
        return f35779a.a(bodyPart);
    }

    private final String b(Dl dl2) {
        String strA = AbstractC3345hf.a(dl2.b());
        if (AbstractC3345hf.b(strA)) {
            return "*** BINARY FILE ***";
        }
        String str = new String(El.a(dl2), p013kotlin.text.d.UTF_8);
        if (AbstractC3345hf.c(strA)) {
            str = a(f35779a, str, 0, 1, null);
        }
        p013kotlin.jvm.internal.s.h(str);
        return str;
    }

    static /* synthetic */ String a(C3880u0 c3880u0, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 2;
        }
        return c3880u0.a(str, i11);
    }

    private final String a(String str, int i11) {
        try {
            if (str.length() == 0) {
                return "*** EMPTY ***";
            }
            return new JSONObject(str).toString(i11);
        } catch (JSONException unused) {
            return str;
        }
    }
}
