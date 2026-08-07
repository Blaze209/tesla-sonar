package com.plaid.internal;

import java.util.HashMap;
import org.json.JSONException;

/* JADX INFO: renamed from: com.plaid.internal.l7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4472l7 implements C4463k7.c<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4500p f47846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4463k7 f47847b;

    public C4472l7(C4463k7 c4463k7, C4500p c4500p) {
        this.f47847b = c4463k7;
        this.f47846a = c4500p;
    }

    @Override // com.plaid.internal.C4463k7.c
    public final String call() throws JSONException, r {
        C4491o<R> c4491o = this.f47847b.f47807a;
        C4500p c4500p = this.f47846a;
        InterfaceC4519r1 interfaceC4519r1 = (InterfaceC4519r1) C4491o.a(EnumC4427g7.PRE_CHECK, c4491o.f47946a, new C4446j(c4491o), c4500p);
        c4491o.f47951f.a(interfaceC4519r1);
        C4491o.a aVar = new C4491o.a((D0) C4491o.a(EnumC4427g7.DEVICE_DESCRIPTOR, c4491o.f47947b, new C4455k(interfaceC4519r1), c4500p), interfaceC4519r1);
        D0 d11 = aVar.f47953b;
        InterfaceC4519r1 interfaceC4519r2 = aVar.f47952a;
        D0 d0A = this.f47847b.f47810d.a(d11);
        C4491o<R> c4491o2 = this.f47847b.f47807a;
        C4500p c4500p2 = this.f47846a;
        c4491o2.getClass();
        try {
            C4572x0 c4572x0 = C4491o.f47945g;
            W3 w11 = W3.INFO;
            c4572x0.a(w11, "device descriptor=" + d0A, new Object[0]);
            String str = (String) C4491o.a(EnumC4427g7.START, c4491o2.f47948c, new C4464l(d0A), c4500p2);
            c4572x0.a(w11, "auth url=" + str, new Object[0]);
            if (d0A.f46259b != null) {
                throw new r(EnumC4427g7.AUTHENTICATION);
            }
            HashMap mapA = C4596z6.a(str);
            if (mapA != null) {
                c4572x0.a(w11, "use remote features: " + mapA, new Object[0]);
                c4500p2.f48005f = c4500p2.f48005f.a(mapA);
            }
            String str2 = (String) C4491o.a(EnumC4427g7.AUTHENTICATION, c4491o2.f47949d, new C4473m(interfaceC4519r2, str), c4500p2);
            c4572x0.a(w11, "vfp=" + str2, new Object[0]);
            return str2;
        } catch (r e11) {
            c4491o2.f47951f.a();
            throw e11;
        }
    }
}
