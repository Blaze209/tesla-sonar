package com.fourthline.orca.internal;

import com.fourthline.core.internal.TimestampProvider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.fourthline.orca.internal.lq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3526lq implements qj0.e {
    public static Kq a(Sp sp2, Rp rp2, Jq jq2, Gq gq2, Bq bq2, TimestampProvider timestampProvider, ED ed2, InterfaceC4044xs interfaceC4044xs, CoroutineScope coroutineScope) {
        return (Kq) qj0.h.d(sp2.a(rp2, jq2, gq2, bq2, timestampProvider, ed2, interfaceC4044xs, coroutineScope));
    }

    @Override // javax.inject.Provider
    public abstract /* synthetic */ Object get();
}
