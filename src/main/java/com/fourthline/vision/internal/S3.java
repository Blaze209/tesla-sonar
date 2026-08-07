package com.fourthline.vision.internal;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class S3 implements InterfaceC4306w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f37949a;

    public S3(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        this.f37949a = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4306w0
    public void subscribe(wn0.p<? super Boolean, ? super Continuation<? super jn0.h0>, ? extends Object> pVar) {
        InterfaceC4306w0.a.subscribe(this, pVar);
    }

    @Override // com.fourthline.vision.internal.InterfaceC4306w0
    public Boolean get() {
        return Boolean.valueOf(this.f37949a);
    }
}
