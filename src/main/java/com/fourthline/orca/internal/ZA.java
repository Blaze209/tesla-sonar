package com.fourthline.orca.internal;

import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class ZA implements InterfaceC3354ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3438jo f30000a;

    public interface a extends InterfaceC3354ho.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ZA$a$a, reason: collision with other inner class name */
        public static final class C0537a {
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
            public static final b f30001a = new b();

            private b() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0537a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0537a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0537a.c(this);
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f30002a = new c();

            private c() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0537a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0537a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0537a.c(this);
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f30003a = new d();

            private d() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0537a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0537a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0537a.c(this);
            }
        }

        public static final class e implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f30004a = new e();

            private e() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0537a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0537a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0537a.c(this);
            }
        }
    }

    public ZA(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        this.f30000a = tracker;
    }

    private final void b() {
        C3103bt.c(C3103bt.f30707a, "tin_details", null, 2, null);
    }

    private final void c() {
        C3103bt.b(C3103bt.f30707a, "tin_details", null, 2, null);
        this.f30000a.a(new C3380iD(null, 1, null));
    }

    private final void d() {
        C3103bt.a(C3103bt.f30707a, "orca_tin_details_action_edit_tax_number", null, null, 6, null);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3354ho
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof a.c) {
            b();
            return;
        }
        if (event instanceof a.e) {
            d();
        } else if (event instanceof a.d) {
            c();
        } else {
            if (!(event instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            a();
        }
    }

    private final void a() {
        C3103bt.a(C3103bt.f30707a, "tin_details", null, 2, null);
        this.f30000a.a(new C3294gD(null, 1, null));
    }
}
