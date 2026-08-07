package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Jv extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26507a;

    public static final class a extends Jv {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f26508b = new a();

        private a() {
            super(null, null, "code_expired", 3, null);
        }
    }

    public /* synthetic */ Jv(String str, Throwable th2, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th2, str2);
    }

    public final String a() {
        return this.f26507a;
    }

    private Jv(String str, Throwable th2, String str2) {
        super(str, th2);
        this.f26507a = str2;
    }

    public /* synthetic */ Jv(String str, Throwable th2, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : th2, str2, null);
    }
}
