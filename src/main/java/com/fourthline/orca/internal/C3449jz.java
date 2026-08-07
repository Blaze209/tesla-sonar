package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.jz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3449jz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f32855b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f32856c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3406iz f32857a;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.jz$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3449jz(C3406iz deviceMetadata) {
        p013kotlin.jvm.internal.s.k(deviceMetadata, "deviceMetadata");
        this.f32857a = deviceMetadata;
    }

    public final C3406iz a() {
        return this.f32857a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3449jz) && p013kotlin.jvm.internal.s.f(this.f32857a, ((C3449jz) obj).f32857a);
    }

    public int hashCode() {
        return this.f32857a.hashCode();
    }

    public String toString() {
        return "StartSignatureRequest(deviceMetadata=" + this.f32857a + ")";
    }
}
