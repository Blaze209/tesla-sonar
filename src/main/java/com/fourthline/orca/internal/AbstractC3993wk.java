package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.wk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3993wk {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.wk$a */
    static final class a implements wn0.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ wn0.r f36495a;

        a(wn0.r rVar) {
            this.f36495a = rVar;
        }

        public final void a(p015o1.b composable, p011ja.k it, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(composable, "$this$composable");
            p013kotlin.jvm.internal.s.k(it, "it");
            if (p020r2.o.J()) {
                p020r2.o.S(1854646457, i11, -1, "com.fourthline.orca.core.internal.navigation.screenComposable.<anonymous> (NavigationExtensions.kt:78)");
            }
            this.f36495a.invoke(composable, it, lVar, Integer.valueOf(i11 & 126));
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            a((p015o1.b) obj, (p011ja.k) obj2, (p020r2.l) obj3, ((Number) obj4).intValue());
            return jn0.h0.f84049a;
        }
    }

    public static final String a(p011ja.r rVar) {
        String strR1;
        p013kotlin.jvm.internal.s.k(rVar, "<this>");
        String route = rVar.getRoute();
        return (route == null || (strR1 = p013kotlin.text.t.r1(route, ".", null, 2, null)) == null) ? "not_set" : strR1;
    }

    public static /* synthetic */ void a(p011ja.u uVar, String str, List list, List list2, wn0.l lVar, wn0.l lVar2, wn0.l lVar3, wn0.l lVar4, wn0.r rVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list = p013kotlin.collections.v.m();
        }
        List list3 = list;
        if ((i11 & 4) != 0) {
            list2 = p013kotlin.collections.v.m();
        }
        List list4 = list2;
        wn0.l lVar5 = (i11 & 8) != 0 ? null : lVar;
        wn0.l lVar6 = (i11 & 16) != 0 ? null : lVar2;
        a(uVar, str, list3, list4, lVar5, lVar6, (i11 & 32) != 0 ? lVar5 : lVar3, (i11 & 64) != 0 ? lVar6 : lVar4, rVar);
    }

    public static final void a(p011ja.u uVar, String route, List arguments, List deepLinks, wn0.l lVar, wn0.l lVar2, wn0.l lVar3, wn0.l lVar4, wn0.r content) {
        p013kotlin.jvm.internal.s.k(uVar, "<this>");
        p013kotlin.jvm.internal.s.k(route, "route");
        p013kotlin.jvm.internal.s.k(arguments, "arguments");
        p013kotlin.jvm.internal.s.k(deepLinks, "deepLinks");
        p013kotlin.jvm.internal.s.k(content, "content");
        ka.k.c(uVar, route, arguments, deepLinks, lVar, lVar2, lVar3, lVar4, null, z2.c.c(1854646457, true, new a(content)), 128, null);
    }
}
