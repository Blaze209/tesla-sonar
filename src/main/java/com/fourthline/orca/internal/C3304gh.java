package com.fourthline.orca.internal;

import java.util.List;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.gh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3304gh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f32020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f32021b;

    public C3304gh(List parts, List requests) {
        p013kotlin.jvm.internal.s.k(parts, "parts");
        p013kotlin.jvm.internal.s.k(requests, "requests");
        this.f32020a = parts;
        this.f32021b = requests;
    }

    public final List a() {
        return this.f32021b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3304gh)) {
            return false;
        }
        C3304gh c3304gh = (C3304gh) obj;
        return p013kotlin.jvm.internal.s.f(this.f32020a, c3304gh.f32020a) && p013kotlin.jvm.internal.s.f(this.f32021b, c3304gh.f32021b);
    }

    public int hashCode() {
        return (this.f32020a.hashCode() * 31) + this.f32021b.hashCode();
    }

    public String toString() {
        return "IdvUploadDataRequest(parts=" + this.f32020a + ", requests=" + this.f32021b + ")";
    }

    public /* synthetic */ C3304gh(List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? p013kotlin.collections.v.m() : list2);
    }
}
