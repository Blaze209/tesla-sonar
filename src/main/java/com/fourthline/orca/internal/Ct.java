package com.fourthline.orca.internal;

import p013kotlin.Pair;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes4.dex */
public enum Ct {
    INTRO("intro"),
    LOCATION_INTRO("location_intro"),
    LOCATION_SCANNER("location_scanner"),
    SELFIE_INTRO("selfie_intro"),
    AGREEMENTS("agreements"),
    SIGN("sign");


    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f25273j = on0.a.a(a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pair f25275b;

    Ct(String str) {
        this.f25274a = str;
        this.f25275b = jn0.x.a("source", str);
    }

    public final Pair b() {
        return this.f25275b;
    }
}
