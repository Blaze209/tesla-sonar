package com.fourthline.orca.internal;

import java.util.List;
import kotlinx.coroutines.Deferred;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Lc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2899Lc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f26757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f26758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f26759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f26760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f26761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Deferred f26762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private EnumC2894Kc f26763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f26764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f26765i;

    public C2899Lc(String str, String str2, String str3, boolean z11) {
        this.f26757a = str;
        this.f26758b = str2;
        this.f26759c = str3;
        this.f26760d = z11;
        this.f26763g = EnumC2894Kc.Pin;
        this.f26765i = true;
    }

    public final void a(String str) {
        this.f26758b = str;
    }

    public final EnumC2894Kc b() {
        return this.f26763g;
    }

    public final void c(String str) {
        this.f26757a = str;
    }

    public final void d(String str) {
        this.f26759c = str;
    }

    public final String e() {
        return this.f26764h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2899Lc)) {
            return false;
        }
        C2899Lc c2899Lc = (C2899Lc) obj;
        return p013kotlin.jvm.internal.s.f(this.f26757a, c2899Lc.f26757a) && p013kotlin.jvm.internal.s.f(this.f26758b, c2899Lc.f26758b) && p013kotlin.jvm.internal.s.f(this.f26759c, c2899Lc.f26759c) && this.f26760d == c2899Lc.f26760d;
    }

    public final String f() {
        return this.f26757a;
    }

    public final Deferred g() {
        return this.f26762f;
    }

    public final boolean h() {
        return this.f26765i;
    }

    public int hashCode() {
        String str = this.f26757a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f26758b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26759c;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.f26760d);
    }

    public String toString() {
        return "EidBundle(pin=" + this.f26757a + ", canNumber=" + this.f26758b + ", resultUrl=" + this.f26759c + ", eidDeveloperMode=" + this.f26760d + ")";
    }

    public final void a(boolean z11) {
        this.f26760d = z11;
    }

    public final void b(String str) {
        this.f26764h = str;
    }

    public final String c() {
        return this.f26758b;
    }

    public final boolean d() {
        return this.f26760d;
    }

    public final List a() {
        return this.f26761e;
    }

    public final void b(boolean z11) {
        this.f26765i = z11;
    }

    public final void a(List list) {
        this.f26761e = list;
    }

    public final void a(Deferred deferred) {
        this.f26762f = deferred;
    }

    public final void a(EnumC2894Kc enumC2894Kc) {
        p013kotlin.jvm.internal.s.k(enumC2894Kc, "<set-?>");
        this.f26763g = enumC2894Kc;
    }

    public /* synthetic */ C2899Lc(String str, String str2, String str3, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? false : z11);
    }
}
