package com.fourthline.orca.internal;

import android.content.Context;
import android.telephony.TelephonyManager;

/* JADX INFO: renamed from: com.fourthline.orca.internal.b4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3072b4 implements InterfaceC3029a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f30550a;

    public C3072b4(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        this.f30550a = context;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3029a4
    public String a() {
        try {
            Object systemService = this.f30550a.getSystemService("phone");
            p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            return ((TelephonyManager) systemService).getSimCountryIso();
        } catch (Exception unused) {
            return null;
        }
    }
}
