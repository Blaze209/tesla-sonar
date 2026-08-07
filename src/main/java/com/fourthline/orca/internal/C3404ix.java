package com.fourthline.orca.internal;

import java.util.List;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ix, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3404ix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f32614a;

    public C3404ix(List documents) {
        p013kotlin.jvm.internal.s.k(documents, "documents");
        this.f32614a = documents;
    }

    public final List a() {
        return this.f32614a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3404ix) && p013kotlin.jvm.internal.s.f(this.f32614a, ((C3404ix) obj).f32614a);
    }

    public int hashCode() {
        return this.f32614a.hashCode();
    }

    public String toString() {
        return "SecondaryDocumentsBundle(documents=" + this.f32614a + ")";
    }

    public final void a(List list) {
        p013kotlin.jvm.internal.s.k(list, "<set-?>");
        this.f32614a = list;
    }

    public /* synthetic */ C3404ix(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? p013kotlin.collections.v.m() : list);
    }
}
