package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ok, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3649ok implements InterfaceC3606nk, EA {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EA f34303a;

    public C3649ok(EA inputValidator) {
        p013kotlin.jvm.internal.s.k(inputValidator, "inputValidator");
        this.f34303a = inputValidator;
    }

    @Override // com.fourthline.orca.internal.EA
    public Fh a(String input, List suggestedCountries) {
        p013kotlin.jvm.internal.s.k(input, "input");
        p013kotlin.jvm.internal.s.k(suggestedCountries, "suggestedCountries");
        return this.f34303a.a(input, suggestedCountries);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3606nk
    public boolean a(G5 country, X7 x11) {
        List listA;
        p013kotlin.jvm.internal.s.k(country, "country");
        if (x11 == null || (listA = x11.a()) == null) {
            return true;
        }
        return listA.contains(country.c());
    }
}
