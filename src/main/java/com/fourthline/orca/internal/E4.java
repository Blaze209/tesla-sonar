package com.fourthline.orca.internal;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.Map;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes4.dex */
public final class E4 implements Zk, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f25548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConnectivityManager f25549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f25550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f25551d;

    public static final class a extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.E4$a$a, reason: collision with other inner class name */
        static final class C0483a extends SuspendLambda implements wn0.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f25553a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ E4 f25554b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0483a(E4 e11, Continuation continuation) {
                super(2, continuation);
                this.f25554b = e11;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C0483a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0483a(this.f25554b, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f25553a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                Network[] allNetworks = this.f25554b.f25549b.getAllNetworks();
                p013kotlin.jvm.internal.s.j(allNetworks, "getAllNetworks(...)");
                if (allNetworks.length == 0) {
                    C3103bt.a(C3103bt.f30707a, "network_connection_lost", null, p013kotlin.collections.v0.f(jn0.x.a("isPublic", Boxing.boxBoolean(false))), 2, null);
                }
                return jn0.h0.f84049a;
            }
        }

        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            Object obj;
            p013kotlin.jvm.internal.s.k(network, "network");
            p013kotlin.jvm.internal.s.k(networkCapabilities, "networkCapabilities");
            String str = "unknown";
            if (networkCapabilities.hasTransport(1)) {
                obj = "wifi";
            } else if (networkCapabilities.hasTransport(0)) {
                obj = "cellular";
            } else if (networkCapabilities.hasTransport(3)) {
                obj = "ethernet";
            } else if (networkCapabilities.hasTransport(2)) {
                obj = "bluetooth";
            } else {
                obj = networkCapabilities.hasTransport(8) ? "usb" : "unknown";
            }
            Pair pairA = jn0.x.a("network_type", obj);
            Pair pairA2 = jn0.x.a("vpn_connected", Boolean.valueOf(networkCapabilities.hasTransport(4)));
            Boolean bool = Boolean.FALSE;
            Map mapM = p013kotlin.collections.v0.m(pairA, pairA2, jn0.x.a("isPublic", bool));
            if (p013kotlin.jvm.internal.s.f(mapM, E4.this.f25550c)) {
                return;
            }
            E4.this.f25550c = mapM;
            C3103bt c3103bt = C3103bt.f30707a;
            if (networkCapabilities.hasTransport(1)) {
                str = "wifi";
            } else if (networkCapabilities.hasTransport(0)) {
                str = "cellular";
            } else if (networkCapabilities.hasTransport(3)) {
                str = "ethernet";
            } else if (networkCapabilities.hasTransport(2)) {
                str = "bluetooth";
            } else if (networkCapabilities.hasTransport(8)) {
                str = "usb";
            }
            C3103bt.a(c3103bt, "network_connection_connected", null, p013kotlin.collections.v0.m(jn0.x.a("network_type", str), jn0.x.a("vpn_connected", Boolean.valueOf(networkCapabilities.hasTransport(4))), jn0.x.a("isPublic", bool)), 2, null);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            p013kotlin.jvm.internal.s.k(network, "network");
            E4 e11 = E4.this;
            BuildersKt__Builders_commonKt.launch$default(e11, null, null, new C0483a(e11, null), 3, null);
        }
    }

    public E4(ConnectivityManager connectivityManager, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(connectivityManager, "connectivityManager");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f25548a = coroutineScope;
        this.f25549b = connectivityManager;
        this.f25550c = p013kotlin.collections.v0.i();
        this.f25551d = new a();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (Build.VERSION.SDK_INT >= 26) {
            ta0.a.f(this.f25551d);
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f25548a.getCoroutineContext();
    }

    @Override // com.fourthline.orca.internal.Zk
    public void b() {
        if (Build.VERSION.SDK_INT >= 26) {
            ta0.a.e(this.f25551d);
        }
    }
}
