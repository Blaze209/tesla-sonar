package com.fourthline.orca.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class Y0 implements InterfaceC3354ho {

    public interface a extends InterfaceC3354ho.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Y0$a$a, reason: collision with other inner class name */
        public static final class C0532a {
            public static Map a(a aVar) {
                return InterfaceC3354ho.a.C0566a.a(aVar);
            }

            public static String b(a aVar) {
                return InterfaceC3354ho.a.C0566a.b(aVar);
            }

            public static String c(a aVar) {
                return InterfaceC3354ho.a.C0566a.c(aVar);
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f29792a = new b();

            private b() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0532a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0532a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0532a.c(this);
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f29793a = new c();

            private c() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0532a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0532a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0532a.c(this);
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f29794a = new d();

            private d() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0532a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0532a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0532a.c(this);
            }
        }

        public static final class e implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f29795a = new e();

            private e() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0532a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0532a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0532a.c(this);
            }
        }
    }

    public Y0(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
    }

    @Override // com.fourthline.orca.internal.InterfaceC3354ho
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        p013kotlin.jvm.internal.s.k(event, "event");
    }
}
