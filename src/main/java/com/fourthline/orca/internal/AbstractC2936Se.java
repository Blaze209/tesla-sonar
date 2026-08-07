package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Se, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2936Se {
    public static final C2972Ue a(Bs presenter, InterfaceC3216ef stateBuilder, InterfaceC3131cf clicksHandler, InterfaceC3354ho analytics, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(stateBuilder, "stateBuilder");
        p013kotlin.jvm.internal.s.k(clicksHandler, "clicksHandler");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        return new C2972Ue(new C2941Te(stateBuilder, presenter, new C3174df(clicksHandler, analytics), CoroutineScopeKt.plus(coroutineScope, JobKt__JobKt.Job$default((Job) null, 1, (Object) null))), analytics);
    }
}
