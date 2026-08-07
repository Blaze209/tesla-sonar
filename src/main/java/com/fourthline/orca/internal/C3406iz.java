package com.fourthline.orca.internal;

import com.fourthline.core.location.Coordinate;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.iz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3406iz {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f32625e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f32626f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Coordinate f32630d;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.iz$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3406iz(String language, String region, String model, Coordinate location) {
        p013kotlin.jvm.internal.s.k(language, "language");
        p013kotlin.jvm.internal.s.k(region, "region");
        p013kotlin.jvm.internal.s.k(model, "model");
        p013kotlin.jvm.internal.s.k(location, "location");
        this.f32627a = language;
        this.f32628b = region;
        this.f32629c = model;
        this.f32630d = location;
    }

    public final String a() {
        return this.f32627a;
    }

    public final Coordinate b() {
        return this.f32630d;
    }

    public final String c() {
        return this.f32629c;
    }

    public final String d() {
        return this.f32628b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3406iz)) {
            return false;
        }
        C3406iz c3406iz = (C3406iz) obj;
        return p013kotlin.jvm.internal.s.f(this.f32627a, c3406iz.f32627a) && p013kotlin.jvm.internal.s.f(this.f32628b, c3406iz.f32628b) && p013kotlin.jvm.internal.s.f(this.f32629c, c3406iz.f32629c) && p013kotlin.jvm.internal.s.f(this.f32630d, c3406iz.f32630d);
    }

    public int hashCode() {
        return (((((this.f32627a.hashCode() * 31) + this.f32628b.hashCode()) * 31) + this.f32629c.hashCode()) * 31) + this.f32630d.hashCode();
    }

    public String toString() {
        return "StartSignatureMetadata(language=" + this.f32627a + ", region=" + this.f32628b + ", model=" + this.f32629c + ", location=" + this.f32630d + ")";
    }
}
