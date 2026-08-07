package com.plaid.internal;

import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class A6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile WeakReference<B6> f46207a;

    public static final class a {
        public static void a(String eventName, Map metadata, E6 logLevel) {
            p013kotlin.jvm.internal.s.k(eventName, "eventName");
            p013kotlin.jvm.internal.s.k(metadata, "metadata");
            p013kotlin.jvm.internal.s.k(logLevel, "logLevel");
            WeakReference weakReference = A6.f46207a;
            B6 b11 = weakReference != null ? (B6) weakReference.get() : null;
            if (b11 != null) {
                b11.a(eventName, metadata, logLevel);
                return;
            }
            X5.a.a(X5.f46812a, "RemoteLog: No controller registered, dropping event: " + eventName);
        }

        public static void b(Map metadata, String eventName) {
            p013kotlin.jvm.internal.s.k(eventName, "eventName");
            p013kotlin.jvm.internal.s.k(metadata, "metadata");
            a(eventName, metadata, E6.INFO);
        }

        public static void a() {
            Map metadata = p013kotlin.collections.v0.i();
            p013kotlin.jvm.internal.s.k("TwilioSNA - processUrl failure", "eventName");
            p013kotlin.jvm.internal.s.k(metadata, "metadata");
            a("TwilioSNA - processUrl failure", metadata, E6.ERROR);
        }

        public static void a(Map metadata, String eventName) {
            p013kotlin.jvm.internal.s.k(eventName, "eventName");
            p013kotlin.jvm.internal.s.k(metadata, "metadata");
            a(eventName, metadata, E6.ERROR);
        }
    }
}
