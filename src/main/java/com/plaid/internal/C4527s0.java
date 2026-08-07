package com.plaid.internal;

import ch.qos.logback.classic.spi.CallerData;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.plaid.internal.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4527s0 implements InterfaceC4418f7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4572x0 f48100a;

    static {
        W3 w11 = Z3.f46846a;
        f48100a = new C4572x0("auth");
    }

    @Override // com.plaid.internal.InterfaceC4418f7
    public final C4428h a(Object obj, C4500p c4500p) {
        try {
            return C4428h.a(a((InterfaceC4535t) obj, c4500p));
        } catch (Exception e11) {
            return C4428h.a(e11);
        }
    }

    public static String a(InterfaceC4535t interfaceC4535t, C4500p c4500p) throws C4509q {
        InterfaceC4421g1 c4439i1;
        long j11;
        String strB = interfaceC4535t.b();
        LinkedHashMap linkedHashMapB = AbstractC4555v1.b(strB);
        if (linkedHashMapB.containsKey("testVfp")) {
            LinkedHashMap linkedHashMapB2 = AbstractC4555v1.b(strB);
            try {
                j11 = Long.parseLong((String) linkedHashMapB2.get("delay"));
            } catch (Exception unused) {
                j11 = 0;
            }
            String str = (String) linkedHashMapB2.get("testVfp");
            String str2 = (String) AbstractC4555v1.b(strB).get("cid");
            if (str2 == null) {
                LinkedHashMap linkedHashMapB3 = AbstractC4555v1.b(strB);
                str2 = (String) linkedHashMapB3.get("vfp");
                if (str2 == null) {
                    str2 = (String) linkedHashMapB3.get("token");
                }
            }
            c4439i1 = new C4430h1(j11, str, str2);
        } else if ("2".equals((String) linkedHashMapB.get("pfflow"))) {
            f48100a.a(W3.INFO, "flow v2 detected", new Object[0]);
            c4439i1 = C4448j1.a(strB);
        } else {
            f48100a.a(W3.INFO, "flow v1 detected", new Object[0]);
            C4572x0 c4572x0 = C4439i1.f47726b;
            if (!"f".equals(AbstractC4555v1.b(strB).get("r"))) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strB);
                sb2.append(strB.indexOf(63) == -1 ? CallerData.NA : "&");
                sb2.append("r=f");
                strB = sb2.toString();
            }
            try {
                new URL(strB);
                c4439i1 = new C4439i1(strB);
            } catch (MalformedURLException unused2) {
                throw new C4509q(T0.AUTH_MALFORMED_INPUT_DATA, "Malformed url " + strB);
            }
        }
        return c4439i1.a(interfaceC4535t.a(), c4500p);
    }
}
