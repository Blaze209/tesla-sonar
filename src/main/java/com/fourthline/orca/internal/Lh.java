package com.fourthline.orca.internal;

import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes4.dex */
public enum Lh {
    All(""),
    Numeric("^[0-9]*$"),
    AlphaWithSpace("^[a-zA-Z ]*$"),
    AlphaNumericWithSpace("^[a-zA-Z0-9 ]*$"),
    AlphaNumeric("^[a-zA-Z0-9]*$"),
    AlphaWithExtra("^[a-zA-Z\\-'\"]*$"),
    AlphaWithDiacriticsExtra("^[\\p{L}'`‘ \\-]*$"),
    Email("^[a-zA-Z0-9@.-]*$");


    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f26786l = on0.a.a(a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p013kotlin.text.q f26788b;

    Lh(String str) {
        this.f26787a = str;
        this.f26788b = new p013kotlin.text.q(str);
    }

    public final boolean a(String value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        if (this == All) {
            return true;
        }
        return this.f26788b.i(value);
    }
}
