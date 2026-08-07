package com.fourthline.orca.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.xf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4031xf implements InterfaceC3988wf {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f36714d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D5 f36715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5 f36716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wn0.a f36717c;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.xf$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C4031xf(D5 countriesFilter, C5 countriesComparator, wn0.a resources) {
        p013kotlin.jvm.internal.s.k(countriesFilter, "countriesFilter");
        p013kotlin.jvm.internal.s.k(countriesComparator, "countriesComparator");
        p013kotlin.jvm.internal.s.k(resources, "resources");
        this.f36715a = countriesFilter;
        this.f36716b = countriesComparator;
        this.f36717c = resources;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3988wf
    public void a(String query, List items, wn0.l onItemSelected, wn0.l onSuggestionsReady) {
        p013kotlin.jvm.internal.s.k(query, "query");
        p013kotlin.jvm.internal.s.k(items, "items");
        p013kotlin.jvm.internal.s.k(onItemSelected, "onItemSelected");
        p013kotlin.jvm.internal.s.k(onSuggestionsReady, "onSuggestionsReady");
        List listD1 = p013kotlin.collections.v.d1(p013kotlin.collections.v.a1(this.f36715a.a(query, items), this.f36716b), 5);
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listD1, 10));
        Iterator it = listD1.iterator();
        while (it.hasNext()) {
            arrayList.add(((D5.a) it.next()).a());
        }
        if (a(query, arrayList)) {
            onItemSelected.invoke(p013kotlin.collections.v.o0(arrayList));
        } else {
            onSuggestionsReady.invoke(arrayList);
        }
    }

    private final boolean a(String str, List list) {
        return list.size() == 1 && p013kotlin.text.t.M(str, RA.a(((InterfaceC3447jx) p013kotlin.collections.v.o0(list)).getName(), this.f36717c), true);
    }
}
