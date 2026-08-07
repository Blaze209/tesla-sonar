package com.fourthline.orca.internal;

import com.fourthline.core.CountryNetworkModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class R5 implements Q5, EA {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f27594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EA f27595b;

    public R5(List supportedCountries, EA inputValidator) {
        p013kotlin.jvm.internal.s.k(supportedCountries, "supportedCountries");
        p013kotlin.jvm.internal.s.k(inputValidator, "inputValidator");
        this.f27594a = supportedCountries;
        this.f27595b = inputValidator;
    }

    @Override // com.fourthline.orca.internal.EA
    public Fh a(String input, List suggestedCountries) {
        p013kotlin.jvm.internal.s.k(input, "input");
        p013kotlin.jvm.internal.s.k(suggestedCountries, "suggestedCountries");
        return this.f27595b.a(input, suggestedCountries);
    }

    @Override // com.fourthline.orca.internal.Q5
    public boolean a(G5 country) {
        p013kotlin.jvm.internal.s.k(country, "country");
        List list = this.f27594a;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((CountryNetworkModel) it.next()).getIssuingCountry());
        }
        return arrayList.contains(country.c());
    }
}
