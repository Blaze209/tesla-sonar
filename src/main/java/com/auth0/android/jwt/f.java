package com.auth0.android.jwt;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f20277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f20278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Date f20279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Date f20280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Date f20281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f20282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final List<String> f20283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Map<String, b> f20284h;

    f(String str, String str2, Date date, Date date2, Date date3, String str3, List<String> list, Map<String, b> map) {
        this.f20277a = str;
        this.f20278b = str2;
        this.f20279c = date;
        this.f20280d = date2;
        this.f20281e = date3;
        this.f20282f = str3;
        this.f20283g = list;
        this.f20284h = Collections.unmodifiableMap(map);
    }

    b a(String str) {
        b bVar = this.f20284h.get(str);
        return bVar != null ? bVar : new a();
    }
}
