package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Pair;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: renamed from: com.fourthline.orca.internal.dh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC3176dh {
    DOCUMENT_COUNTRY(AnalyticsAttribute.DocumentCountry),
    DOCUMENT_VALIDATION("document_validation"),
    DOCUMENT_TYPE(AnalyticsAttribute.DocumentType),
    DOCUMENT_ANALYSIS("document_analysis"),
    DOCUMENT_NATIONALITY("personal_details_nationality");


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f31183h = on0.a.a(a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pair f31184a;

    EnumC3176dh(String str) {
        this.f31184a = jn0.x.a("source", str);
    }

    public final Pair b() {
        return this.f31184a;
    }
}
