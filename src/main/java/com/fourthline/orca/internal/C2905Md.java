package com.fourthline.orca.internal;

import android.content.Context;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Md, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2905Md {
    public final C2885Id a(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new C2885Id(tracker);
    }

    public final C2976Vd a() {
        return new C2976Vd();
    }

    public final InterfaceC2930Rd a(C2899Lc eidBundle) {
        p013kotlin.jvm.internal.s.k(eidBundle, "eidBundle");
        return new C2935Sd(eidBundle);
    }

    public final C3007Wd a(Context context, C2976Vd stateProvider, C3343hd flowCoordinator, InterfaceC2930Rd repository, C2885Id analytics, InterfaceC3732qh imageServiceLocator, C4087ys popupHandlerBuilder, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        return new C3007Wd(context, new C3520lk(stateProvider), new C2874Gc(coroutineScope), flowCoordinator, stateProvider, repository, analytics, popupHandlerBuilder.a(new C2940Td(imageServiceLocator)), coroutineScope);
    }
}
