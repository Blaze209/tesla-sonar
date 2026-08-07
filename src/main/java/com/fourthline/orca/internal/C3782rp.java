package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.rp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3782rp implements EA {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.a f35132a;

    public C3782rp(wn0.a resources) {
        p013kotlin.jvm.internal.s.k(resources, "resources");
        this.f35132a = resources;
    }

    @Override // com.fourthline.orca.internal.EA
    public Fh a(String input, List suggestedCountries) {
        QA name;
        String strA;
        p013kotlin.jvm.internal.s.k(input, "input");
        p013kotlin.jvm.internal.s.k(suggestedCountries, "suggestedCountries");
        InterfaceC3447jx interfaceC3447jx = (InterfaceC3447jx) p013kotlin.collections.v.q0(suggestedCountries);
        boolean zF = p013kotlin.jvm.internal.s.f((interfaceC3447jx == null || (name = interfaceC3447jx.getName()) == null || (strA = RA.a(name, this.f35132a)) == null) ? null : AbstractC3157d4.a(strA), AbstractC3157d4.a(input));
        if (input.length() == 0) {
            return Fh.REQUIRED;
        }
        if (input.length() > 0 && !zF) {
            return Fh.INVALID_FIELD;
        }
        if (input.length() <= 0 || !suggestedCountries.isEmpty()) {
            return null;
        }
        return Fh.INVALID_FIELD;
    }
}
