package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ls, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3528ls {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC3272fs f33397a;

    public C3528ls(InterfaceC3272fs interfaceC3272fs) {
        this.f33397a = interfaceC3272fs;
    }

    public final InterfaceC3272fs a() {
        return this.f33397a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3528ls) && p013kotlin.jvm.internal.s.f(this.f33397a, ((C3528ls) obj).f33397a);
    }

    public int hashCode() {
        InterfaceC3272fs interfaceC3272fs = this.f33397a;
        if (interfaceC3272fs == null) {
            return 0;
        }
        return interfaceC3272fs.hashCode();
    }

    public String toString() {
        return "PoaFlowDataBundle(file=" + this.f33397a + ")";
    }

    public final void a(InterfaceC3272fs interfaceC3272fs) {
        this.f33397a = interfaceC3272fs;
    }

    public /* synthetic */ C3528ls(InterfaceC3272fs interfaceC3272fs, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : interfaceC3272fs);
    }
}
