package com.plaid.internal;

import java.io.IOException;

/* JADX INFO: renamed from: com.plaid.internal.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4545u0 implements InterfaceC4418f7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48147a = "https://device.payfone.com:4443/whatismyipaddress";

    @Override // com.plaid.internal.InterfaceC4418f7
    public final C4428h a(Object obj, C4500p c4500p) {
        F0 f11 = (F0) obj;
        D0 d0B = f11.b();
        if (d0B != null && d0B.f46259b != null) {
            return C4428h.a(d0B);
        }
        if (d0B != null && !"_auto_detect_".equals(d0B.f46258a)) {
            return C4428h.a(d0B);
        }
        try {
            return C4428h.a(a(d0B, f11.a()));
        } catch (C4509q e11) {
            return C4428h.a((Exception) e11);
        }
    }

    public final D0 a(D0 d11, InterfaceC4519r1 interfaceC4519r1) throws C4509q {
        String strReplaceAll;
        try {
            InterfaceC4519r1.b bVarA = interfaceC4519r1.a(new InterfaceC4519r1.a(this.f48147a, false, null, -1));
            int i11 = bVarA.f48083b;
            if (i11 < 200 || i11 >= 300) {
                strReplaceAll = null;
            } else {
                strReplaceAll = bVarA.f48082a;
                if (strReplaceAll != null) {
                    strReplaceAll = strReplaceAll.replaceAll("[^0-9.:a-fA-F]", "");
                }
            }
            if (strReplaceAll == null || strReplaceAll.length() > 64) {
                throw new C4509q(T0.GENERIC_COMMUNICATION_ERROR, "API failed to provide a valid device IP address");
            }
            if (d11 == null) {
                return new D0(strReplaceAll, null, null);
            }
            return new D0(strReplaceAll, d11.f46259b, d11.f46260c);
        } catch (IOException unused) {
            throw new C4509q(T0.GENERIC_COMMUNICATION_ERROR, "No response received from URL.");
        }
    }
}
