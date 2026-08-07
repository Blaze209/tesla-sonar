package com.plaid.internal.core.networking.models;

import okhttp3.ResponseBody;
import p013kotlin.jvm.internal.u;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends u implements wn0.a<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ResponseBody f46928a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ResponseBody responseBody) {
        super(0);
        this.f46928a = responseBody;
    }

    @Override // wn0.a
    public final String invoke() {
        String strString;
        String strV;
        try {
            ResponseBody responseBody = this.f46928a;
            return (responseBody == null || (strString = responseBody.string()) == null || (strV = t.V(strString, "\n", " ", false, 4, null)) == null) ? "unknown" : strV;
        } catch (Throwable unused) {
        }
    }
}
