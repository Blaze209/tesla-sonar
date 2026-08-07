package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class Di implements InterfaceC3463kC {
    private final boolean b(String str) {
        return p013kotlin.jvm.internal.s.f(new p013kotlin.text.q("[A-Z]").j(new p013kotlin.text.q("\\d").j(str, "9"), "L"), "LLLLLL99L99L999L");
    }

    private final boolean c(String str) {
        return str.length() == 16;
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
}
