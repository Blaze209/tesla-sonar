package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public class Bo extends Throwable {
    public static final int $stable = 0;
    private final String alias;

    public /* synthetic */ Bo(String str, Throwable th2, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : th2, str2);
    }

    public final String getAlias() {
        return this.alias;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bo(String str, Throwable th2, String alias) {
        super(str, th2);
        p013kotlin.jvm.internal.s.k(alias, "alias");
        this.alias = alias;
    }
}
