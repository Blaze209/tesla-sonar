package com.fourthline.orca.internal;

import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes4.dex */
public final class Ik implements InterfaceC3463kC {
    private final boolean b(String str) {
        try {
            if (!new p013kotlin.text.q("[\\d]{8,9}").i(str)) {
                return false;
            }
            if (str.length() == 8) {
                str = WebrtcBuildVersion.maint_version + str;
            }
            int iA = (a(str, 0) * 9) + (a(str, 1) * 8) + (a(str, 2) * 7) + (a(str, 3) * 6) + (a(str, 4) * 5) + (a(str, 5) * 4) + (a(str, 6) * 3) + (a(str, 7) * 2) + (a(str, 8) * (-1));
            if (iA != 0 && iA % 11 == 0) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private final boolean c(String str) {
        return str.length() == 9;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3463kC
    public EnumC3420jC a(String input) {
        p013kotlin.jvm.internal.s.k(input, "input");
        String string = p013kotlin.text.t.F1(input).toString();
        if (c(string)) {
            return !b(string) ? EnumC3420jC.INVALID_FORMAT : EnumC3420jC.SUCCESS;
        }
        return EnumC3420jC.INVALID_LENGTH;
    }

    private static final int a(String str, int i11) {
        return p013kotlin.text.a.f(str.charAt(i11));
    }
}
