package com.plaid.internal;

import com.plaid.internal.classic.networking.adapter.AccountSubtypeAdapter;
import com.plaid.internal.classic.networking.adapter.AccountTypeAdapter;
import com.plaid.internal.classic.networking.adapter.LinkAccountVerificationStatusAdapter;
import com.plaid.internal.classic.networking.adapter.LinkEventNameAdapter;
import com.plaid.internal.classic.networking.adapter.LinkEventViewNameAdapter;
import com.plaid.internal.classic.networking.adapter.LinkExitMetadataStatusAdapter;
import com.plaid.internal.classic.networking.adapter.PlaidErrorCodeAdapter;
import com.plaid.internal.classic.networking.adapter.PlaidErrorTypeAdapter;
import com.plaid.link.event.LinkEventName;
import com.plaid.link.event.LinkEventViewName;
import com.plaid.link.result.LinkAccountSubtype;
import com.plaid.link.result.LinkAccountType;
import com.plaid.link.result.LinkAccountVerificationStatus;
import com.plaid.link.result.LinkErrorCode;
import com.plaid.link.result.LinkErrorType;
import com.plaid.link.result.LinkExitMetadataStatus;

/* JADX INFO: renamed from: com.plaid.internal.w5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4568w5 implements qj0.e<com.google.gson.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4515q5 f48205a;

    public C4568w5(C4515q5 c4515q5) {
        this.f48205a = c4515q5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f48205a.getClass();
        com.google.gson.g gVar = new com.google.gson.g();
        gVar.d(LinkEventViewName.class, new LinkEventViewNameAdapter());
        gVar.d(LinkEventName.class, new LinkEventNameAdapter());
        gVar.d(LinkAccountType.class, new AccountTypeAdapter());
        gVar.d(LinkAccountSubtype.class, new AccountSubtypeAdapter());
        gVar.d(LinkErrorCode.class, new PlaidErrorCodeAdapter());
        gVar.d(LinkErrorType.class, new PlaidErrorTypeAdapter());
        gVar.d(LinkAccountVerificationStatus.class, new LinkAccountVerificationStatusAdapter());
        gVar.d(LinkExitMetadataStatus.class, new LinkExitMetadataStatusAdapter());
        com.google.gson.f fVarB = gVar.b();
        p013kotlin.jvm.internal.s.j(fVarB, "create(...)");
        return (com.google.gson.f) qj0.h.d(fVarB);
    }
}
