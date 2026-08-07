package com.fourthline.orca.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.yf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4074yf implements InterfaceC4117zf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f36995c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D5 f36996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5 f36997b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.yf$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C4074yf(D5 countriesFilter, C5 countriesComparator) {
        p013kotlin.jvm.internal.s.k(countriesFilter, "countriesFilter");
        p013kotlin.jvm.internal.s.k(countriesComparator, "countriesComparator");
        this.f36996a = countriesFilter;
        this.f36997b = countriesComparator;
    }

    @Override // com.fourthline.orca.internal.InterfaceC4117zf
    public List a(String query, List candidates) {
        p013kotlin.jvm.internal.s.k(query, "query");
        p013kotlin.jvm.internal.s.k(candidates, "candidates");
        List listD1 = p013kotlin.collections.v.d1(p013kotlin.collections.v.a1(this.f36996a.a(query, candidates), this.f36997b), 5);
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listD1, 10));
        Iterator it = listD1.iterator();
        while (it.hasNext()) {
            arrayList.add(((D5.a) it.next()).a());
        }
        return arrayList;
    }
}
