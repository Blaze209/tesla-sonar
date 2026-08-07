package com.fourthline.orca.internal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class Nf implements InterfaceC3715q6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.a f27043a;

    public Nf(wn0.a getLocale) {
        p013kotlin.jvm.internal.s.k(getLocale, "getLocale");
        this.f27043a = getLocale;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3715q6
    public String a(Date date) {
        p013kotlin.jvm.internal.s.k(date, "date");
        String str = AbstractC3757r6.b(new SimpleDateFormat("ddMMyyyy", (Locale) this.f27043a.invoke())).format(date);
        p013kotlin.jvm.internal.s.j(str, "format(...)");
        return str;
    }
}
