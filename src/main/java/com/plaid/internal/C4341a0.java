package com.plaid.internal;

import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: renamed from: com.plaid.internal.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4341a0 extends p013kotlin.jvm.internal.u implements wn0.a<SimpleDateFormat> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4350b0 f46858a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4341a0(C4350b0 c4350b0) {
        super(0);
        this.f46858a = c4350b0;
    }

    @Override // wn0.a
    public final SimpleDateFormat invoke() {
        this.f46858a.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSSZ", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("gmt"));
        return simpleDateFormat;
    }
}
