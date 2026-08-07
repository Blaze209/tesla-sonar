package com.google.android.play.core.integrity;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
final class a0 extends a.d.AbstractC0675a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f43130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Set f43131b;

    a0() {
    }

    @Override // com.google.android.play.core.integrity.a.d.AbstractC0675a
    public final a.d a() {
        Set set = this.f43131b;
        if (set != null) {
            return new b0(this.f43130a, set, null);
        }
        throw new IllegalStateException("Missing required properties: verdictOptOut");
    }

    @Override // com.google.android.play.core.integrity.a.d.AbstractC0675a
    public final a.d.AbstractC0675a b(String str) {
        this.f43130a = str;
        return this;
    }

    public final a.d.AbstractC0675a c(Set<Integer> set) {
        if (set == null) {
            throw new NullPointerException("Null verdictOptOut");
        }
        this.f43131b = set;
        return this;
    }
}
