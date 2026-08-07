package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class O5 implements Fi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f27123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4117zf f27124b;

    public O5(List countries, InterfaceC4117zf filterCountriesUseCase) {
        p013kotlin.jvm.internal.s.k(countries, "countries");
        p013kotlin.jvm.internal.s.k(filterCountriesUseCase, "filterCountriesUseCase");
        this.f27123a = countries;
        this.f27124b = filterCountriesUseCase;
    }

    @Override // com.fourthline.orca.internal.Fi
    public List a(String value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        return this.f27124b.a(p013kotlin.text.t.F1(value).toString(), this.f27123a);
    }
}
