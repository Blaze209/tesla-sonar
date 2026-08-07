package com.fourthline.orca.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.yq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4085yq implements Fi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f37098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final KD f37099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4117zf f37100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f37101d;

    public C4085yq(List countries, KD stringExtractor, InterfaceC4117zf filterCountriesUseCase) {
        p013kotlin.jvm.internal.s.k(countries, "countries");
        p013kotlin.jvm.internal.s.k(stringExtractor, "stringExtractor");
        p013kotlin.jvm.internal.s.k(filterCountriesUseCase, "filterCountriesUseCase");
        this.f37098a = countries;
        this.f37099b = stringExtractor;
        this.f37100c = filterCountriesUseCase;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(countries, 10));
        Iterator it = countries.iterator();
        while (it.hasNext()) {
            final G5 g11 = (G5) it.next();
            arrayList.add(new C4042xq(g11, g11.f(), new wn0.a() { // from class: com.fourthline.orca.internal.dj1
                @Override // wn0.a
                public final Object invoke() {
                    return C4085yq.a(g11, this);
                }
            }));
        }
        this.f37101d = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(G5 g11, C4085yq c4085yq) {
        return g11.e() + " " + c4085yq.f37099b.a(g11.f());
    }

    @Override // com.fourthline.orca.internal.Fi
    public List a(String value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        return this.f37100c.a(p013kotlin.text.t.F1(value).toString(), this.f37101d);
    }
}
