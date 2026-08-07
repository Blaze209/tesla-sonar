package com.fourthline.orca.internal;

import com.fourthline.analytics.FourthlineAnalytics;
import com.fourthline.analytics.internal.AnalyticsInterface;
import com.fourthline.orca.core.ProductConfig;
import com.fourthline.orca.core.ProductCustomization;
import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.o3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3626o3 extends InterfaceC3354ho {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.o3$a */
    public static final class a {
        public static void a(InterfaceC3626o3 interfaceC3626o3, Throwable error) {
            p013kotlin.jvm.internal.s.k(error, "error");
        }

        public static void a(InterfaceC3626o3 interfaceC3626o3, ProductConfig productConfig, ProductCustomization customization) {
            p013kotlin.jvm.internal.s.k(productConfig, "productConfig");
            p013kotlin.jvm.internal.s.k(customization, "customization");
        }

        public static void a(InterfaceC3626o3 interfaceC3626o3, Object result) {
            p013kotlin.jvm.internal.s.k(result, "result");
        }

        public static void a(InterfaceC3626o3 interfaceC3626o3, b event) {
            p013kotlin.jvm.internal.s.k(event, "event");
            if (event instanceof b.C0593b) {
                a(interfaceC3626o3);
                return;
            }
            if (event instanceof b.d) {
                b.d dVar = (b.d) event;
                interfaceC3626o3.onProductStart(dVar.b(), dVar.a());
            } else if (event instanceof b.e) {
                interfaceC3626o3.onProductSuccess(((b.e) event).a());
            } else {
                if (!(event instanceof b.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC3626o3.onProductFailed(((b.c) event).a());
            }
        }

        private static void a(InterfaceC3626o3 interfaceC3626o3) {
            AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
            if (analytics != null) {
                analytics.trackNew(Ns.f27089a);
            }
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.o3$b */
    public interface b extends InterfaceC3354ho.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.o3$b$a */
        public static final class a {
            public static Map a(b bVar) {
                return InterfaceC3354ho.a.C0566a.a(bVar);
            }

            public static String b(b bVar) {
                return InterfaceC3354ho.a.C0566a.b(bVar);
            }

            public static String c(b bVar) {
                return InterfaceC3354ho.a.C0566a.c(bVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.o3$b$b, reason: collision with other inner class name */
        public static final class C0593b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0593b f34053a = new C0593b();

            private C0593b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0593b);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return a.c(this);
            }

            public int hashCode() {
                return 1451921120;
            }

            public String toString() {
                return "NotSupportedDeviceState";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.o3$b$c */
        public static final class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Throwable f34054a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final ProductConfig f34055b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final XE f34056c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f34057d;

            public c(Throwable error, ProductConfig productConfig, XE networkConfig) {
                p013kotlin.jvm.internal.s.k(error, "error");
                p013kotlin.jvm.internal.s.k(productConfig, "productConfig");
                p013kotlin.jvm.internal.s.k(networkConfig, "networkConfig");
                this.f34054a = error;
                this.f34055b = productConfig;
                this.f34056c = networkConfig;
                this.f34057d = "product-failed";
            }

            public final Throwable a() {
                return this.f34054a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return p013kotlin.jvm.internal.s.f(this.f34054a, cVar.f34054a) && p013kotlin.jvm.internal.s.f(this.f34055b, cVar.f34055b) && p013kotlin.jvm.internal.s.f(this.f34056c, cVar.f34056c);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return this.f34057d;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return a.c(this);
            }

            public int hashCode() {
                return (((this.f34054a.hashCode() * 31) + this.f34055b.hashCode()) * 31) + this.f34056c.hashCode();
            }

            public String toString() {
                return "OnProductFailed(error=" + this.f34054a + ", productConfig=" + this.f34055b + ", networkConfig=" + this.f34056c + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.o3$b$d */
        public static final class d implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ProductConfig f34058a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final XE f34059b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final ProductCustomization f34060c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f34061d;

            public d(ProductConfig productConfig, XE networkConfig, ProductCustomization customization) {
                p013kotlin.jvm.internal.s.k(productConfig, "productConfig");
                p013kotlin.jvm.internal.s.k(networkConfig, "networkConfig");
                p013kotlin.jvm.internal.s.k(customization, "customization");
                this.f34058a = productConfig;
                this.f34059b = networkConfig;
                this.f34060c = customization;
                this.f34061d = "product-started";
            }

            public final ProductCustomization a() {
                return this.f34060c;
            }

            public final ProductConfig b() {
                return this.f34058a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return p013kotlin.jvm.internal.s.f(this.f34058a, dVar.f34058a) && p013kotlin.jvm.internal.s.f(this.f34059b, dVar.f34059b) && p013kotlin.jvm.internal.s.f(this.f34060c, dVar.f34060c);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return this.f34061d;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return a.c(this);
            }

            public int hashCode() {
                return (((this.f34058a.hashCode() * 31) + this.f34059b.hashCode()) * 31) + this.f34060c.hashCode();
            }

            public String toString() {
                return "OnProductStart(productConfig=" + this.f34058a + ", networkConfig=" + this.f34059b + ", customization=" + this.f34060c + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.o3$b$e */
        public static final class e implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f34062a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final ProductConfig f34063b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final XE f34064c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f34065d;

            public e(Object result, ProductConfig productConfig, XE networkConfig) {
                p013kotlin.jvm.internal.s.k(result, "result");
                p013kotlin.jvm.internal.s.k(productConfig, "productConfig");
                p013kotlin.jvm.internal.s.k(networkConfig, "networkConfig");
                this.f34062a = result;
                this.f34063b = productConfig;
                this.f34064c = networkConfig;
                this.f34065d = "product-completed";
            }

            public final Object a() {
                return this.f34062a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return p013kotlin.jvm.internal.s.f(this.f34062a, eVar.f34062a) && p013kotlin.jvm.internal.s.f(this.f34063b, eVar.f34063b) && p013kotlin.jvm.internal.s.f(this.f34064c, eVar.f34064c);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return this.f34065d;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return a.c(this);
            }

            public int hashCode() {
                return (((this.f34062a.hashCode() * 31) + this.f34063b.hashCode()) * 31) + this.f34064c.hashCode();
            }

            public String toString() {
                return "OnProductSuccess(result=" + this.f34062a + ", productConfig=" + this.f34063b + ", networkConfig=" + this.f34064c + ")";
            }
        }
    }

    void onProductFailed(Throwable th2);

    void onProductStart(ProductConfig productConfig, ProductCustomization productCustomization);

    void onProductSuccess(Object obj);

    void track(b bVar);
}
