package com.fourthline.orca.internal;

import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class Cv implements InterfaceC3354ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3438jo f25277a;

    public interface a extends InterfaceC3354ho.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Cv$a$a, reason: collision with other inner class name */
        public static final class C0481a {
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
            public static final b f25278a = new b();

            private b() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0481a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0481a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0481a.c(this);
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f25279a;

            public c(int i11) {
                this.f25279a = i11;
            }

            public final int a() {
                return this.f25279a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f25279a == ((c) obj).f25279a;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0481a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0481a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0481a.c(this);
            }

            public int hashCode() {
                return Integer.hashCode(this.f25279a);
            }

            public String toString() {
                return "OnDidFinishEditingCode(codeLength=" + this.f25279a + ")";
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f25280a;

            public d(int i11) {
                this.f25280a = i11;
            }

            public final int a() {
                return this.f25280a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.f25280a == ((d) obj).f25280a;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0481a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0481a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0481a.c(this);
            }

            public int hashCode() {
                return Integer.hashCode(this.f25280a);
            }

            public String toString() {
                return "OnDidStartEditingCode(codeLength=" + this.f25280a + ")";
            }
        }

        public static final class e implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f25281a = new e();

            private e() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0481a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0481a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0481a.c(this);
            }
        }

        public static final class f implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f25282a = new f();

            private f() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0481a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0481a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0481a.c(this);
            }
        }

        public static final class g implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f25283a = new g();

            private g() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0481a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0481a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0481a.c(this);
            }
        }

        public static final class h implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final h f25284a = new h();

            private h() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0481a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0481a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0481a.c(this);
            }
        }
    }

    public Cv(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        this.f25277a = tracker;
    }

    private final void b() {
        C3103bt.c(C3103bt.f30707a, "sign", null, 2, null);
    }

    private final void c() {
        C3103bt.a(C3103bt.f30707a, "orca_leave_popup", null, p013kotlin.collections.v0.f(Ct.SIGN.b()), 2, null);
    }

    private final void d() {
        C3103bt.b(C3103bt.f30707a, "sign", null, 2, null);
        this.f25277a.a(new C3380iD(null, 1, null));
    }

    private final void e() {
        C3103bt.a(C3103bt.f30707a, "orca_sign_screen_action_resend", null, null, 6, null);
        this.f25277a.a(new C3636oD(null, 1, null));
    }

    @Override // com.fourthline.orca.internal.InterfaceC3354ho
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof a.e) {
            b();
            return;
        }
        if (event instanceof a.b) {
            a();
            return;
        }
        if (event instanceof a.g) {
            d();
            return;
        }
        if (event instanceof a.h) {
            e();
            return;
        }
        if (event instanceof a.d) {
            b(((a.d) event).a());
        } else if (event instanceof a.c) {
            a(((a.c) event).a());
        } else {
            if (!(event instanceof a.f)) {
                throw new NoWhenBranchMatchedException();
            }
            c();
        }
    }

    private final void b(int i11) {
        C3103bt.a(C3103bt.f30707a, "orca_sign_screen_did_start_editing_code", null, null, 6, null);
    }

    private final void a() {
        C3103bt.a(C3103bt.f30707a, "sign", null, 2, null);
        this.f25277a.a(new C3294gD(null, 1, null));
    }

    private final void a(int i11) {
        C3103bt.a(C3103bt.f30707a, "orca_sign_screen_did_finish_editing_code", null, p013kotlin.collections.v0.f(jn0.x.a("code_length", Integer.valueOf(i11))), 2, null);
    }
}
