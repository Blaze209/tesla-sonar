package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Ve, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2977Ve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Channel f29068a = ChannelKt.Channel$default(0, null, null, 7, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Channel f29069b = ChannelKt.Channel$default(0, null, null, 7, null);

    public final Es a(CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        return new Es(coroutineScope, FlowKt.receiveAsFlow(this.f29068a), this.f29069b);
    }

    public final C3785rs b(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new C3785rs(tracker);
    }

    public final Bs a() {
        return new D0(this.f29068a, this.f29069b);
    }

    public final C3046af a(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new C3046af(tracker);
    }
}
