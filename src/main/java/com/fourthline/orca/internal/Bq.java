package com.fourthline.orca.internal;

import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class Bq implements InterfaceC3354ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3438jo f25106a;

    public interface a extends InterfaceC3354ho.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Bq$a$a, reason: collision with other inner class name */
        public static final class C0475a {
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
            public static final b f25107a = new b();

            private b() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0475a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0475a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0475a.c(this);
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f25108a = new c();

            private c() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0475a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0475a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0475a.c(this);
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f25109a = new d();

            private d() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0475a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0475a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0475a.c(this);
            }
        }

        public static final class e implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f25110a = new e();

            private e() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0475a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0475a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0475a.c(this);
            }
        }

        public static final class f implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f25111a = new f();

            private f() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0475a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0475a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0475a.c(this);
            }
        }

        public static final class g implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f25112a = new g();

            private g() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0475a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0475a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0475a.c(this);
            }
        }

        public static final class h implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final h f25113a = new h();

            private h() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0475a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0475a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0475a.c(this);
            }
        }
    }

    public Bq(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        this.f25106a = tracker;
    }

    private final void b() {
        C3103bt.a(C3103bt.f30707a, "orca_personal_details_action_edit_date_of_birth", null, null, 6, null);
    }

    private final void c() {
        C3103bt.c(C3103bt.f30707a, "personal_details", null, 2, null);
    }

    private final void d() {
        C3103bt.a(C3103bt.f30707a, "orca_personal_details_action_edit_first_name", null, null, 6, null);
    }

    private final void e() {
        C3103bt.a(C3103bt.f30707a, "orca_personal_details_action_edit_gender", null, null, 6, null);
    }

    private final void f() {
        C3103bt.a(C3103bt.f30707a, "orca_personal_details_action_edit_last_name", null, null, 6, null);
    }

    private final void g() {
        C3103bt.b(C3103bt.f30707a, "personal_details", null, 2, null);
        this.f25106a.a(new C3380iD(null, 1, null));
    }

    @Override // com.fourthline.orca.internal.InterfaceC3354ho
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof a.b) {
            a();
            return;
        }
        if (event instanceof a.d) {
            c();
            return;
        }
        if (event instanceof a.e) {
            d();
            return;
        }
        if (event instanceof a.f) {
            e();
            return;
        }
        if (event instanceof a.g) {
            f();
        } else if (event instanceof a.c) {
            b();
        } else {
            if (!(event instanceof a.h)) {
                throw new NoWhenBranchMatchedException();
            }
            g();
        }
    }

    private final void a() {
        C3103bt.a(C3103bt.f30707a, "personal_details", null, 2, null);
        this.f25106a.a(new C3294gD(null, 1, null));
    }
}
