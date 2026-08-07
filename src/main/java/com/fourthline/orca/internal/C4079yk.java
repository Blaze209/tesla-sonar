package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.selects.SelectClause2;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.orca.internal.yk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4079yk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p011ja.w f37032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lq.b f37033b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.yk$a */
    public static final class a implements InterfaceC3863tk, SendChannel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ SendChannel f37034a;

        a(CoroutineScope coroutineScope, Zj zj2) {
            this.f37034a = A5.a(coroutineScope, zj2);
        }

        @Override // kotlinx.coroutines.channels.SendChannel
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean offer(InterfaceC3949vk element) {
            p013kotlin.jvm.internal.s.k(element, "element");
            return this.f37034a.offer(element);
        }

        @Override // kotlinx.coroutines.channels.SendChannel
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Object mo85trySendJP2dKIU(InterfaceC3949vk element) {
            p013kotlin.jvm.internal.s.k(element, "element");
            return this.f37034a.mo85trySendJP2dKIU(element);
        }

        @Override // kotlinx.coroutines.channels.SendChannel
        public boolean close(Throwable th2) {
            return this.f37034a.close(th2);
        }

        @Override // kotlinx.coroutines.channels.SendChannel
        public SelectClause2 getOnSend() {
            return this.f37034a.getOnSend();
        }

        @Override // kotlinx.coroutines.channels.SendChannel
        /* JADX INFO: renamed from: invokeOnClose */
        public void mo586invokeOnClose(wn0.l handler) {
            p013kotlin.jvm.internal.s.k(handler, "handler");
            this.f37034a.mo586invokeOnClose(handler);
        }

        @Override // kotlinx.coroutines.channels.SendChannel
        public boolean isClosedForSend() {
            return this.f37034a.isClosedForSend();
        }

        @Override // kotlinx.coroutines.channels.SendChannel
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object send(InterfaceC3949vk interfaceC3949vk, Continuation continuation) {
            return this.f37034a.send(interfaceC3949vk, continuation);
        }
    }

    public C4079yk(p011ja.w navHostController, lq.b systemUiController) {
        p013kotlin.jvm.internal.s.k(navHostController, "navHostController");
        p013kotlin.jvm.internal.s.k(systemUiController, "systemUiController");
        this.f37032a = navHostController;
        this.f37033b = systemUiController;
    }

    public final p011ja.w a() {
        return this.f37032a;
    }

    public final lq.b b() {
        return this.f37033b;
    }

    public final Fk a(p011ja.w navHostController) {
        p013kotlin.jvm.internal.s.k(navHostController, "navHostController");
        return new Ji(navHostController);
    }

    public final HA a(lq.b systemUiController) {
        p013kotlin.jvm.internal.s.k(systemUiController, "systemUiController");
        return new IA(systemUiController);
    }

    public final Zj a(InterfaceC3051ak repository, InterfaceC3997wo orcaDestroyer, Fk navigator, HA systemBarsController, InterfaceC3692pk navigationAnalytics) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(orcaDestroyer, "orcaDestroyer");
        p013kotlin.jvm.internal.s.k(navigator, "navigator");
        p013kotlin.jvm.internal.s.k(systemBarsController, "systemBarsController");
        p013kotlin.jvm.internal.s.k(navigationAnalytics, "navigationAnalytics");
        return new Zj(repository, orcaDestroyer, navigator, systemBarsController, navigationAnalytics);
    }

    public final InterfaceC3863tk a(Zj mainCoordinator, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(mainCoordinator, "mainCoordinator");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        return new a(coroutineScope, mainCoordinator);
    }
}
