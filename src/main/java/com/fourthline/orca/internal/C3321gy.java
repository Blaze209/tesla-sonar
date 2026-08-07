package com.fourthline.orca.internal;

import com.fourthline.vision.selfie.SelfieScannerError;
import com.fourthline.vision.selfie.SelfieScannerStep;
import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;

/* JADX INFO: renamed from: com.fourthline.orca.internal.gy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3321gy implements InterfaceC3354ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3438jo f32119a;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.gy$a */
    public interface a extends InterfaceC3354ho.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.gy$a$a, reason: collision with other inner class name */
        public static final class C0565a {
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

        /* JADX INFO: renamed from: com.fourthline.orca.internal.gy$a$b */
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f32120a = new b();

            private b() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0565a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0565a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0565a.c(this);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.gy$a$c */
        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f32121a = new c();

            private c() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0565a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0565a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0565a.c(this);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.gy$a$d */
        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f32122a = new d();

            private d() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0565a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0565a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0565a.c(this);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.gy$a$e */
        public static final class e implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final SelfieScannerStep f32123a;

            public e(SelfieScannerStep step) {
                p013kotlin.jvm.internal.s.k(step, "step");
                this.f32123a = step;
            }

            public final SelfieScannerStep a() {
                return this.f32123a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.f32123a == ((e) obj).f32123a;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0565a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0565a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0565a.c(this);
            }

            public int hashCode() {
                return this.f32123a.hashCode();
            }

            public String toString() {
                return "OnConfirmClicked(step=" + this.f32123a + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.gy$a$f */
        public static final class f implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final SelfieScannerStep f32124a;

            public f(SelfieScannerStep step) {
                p013kotlin.jvm.internal.s.k(step, "step");
                this.f32124a = step;
            }

            public final SelfieScannerStep a() {
                return this.f32124a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.f32124a == ((f) obj).f32124a;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0565a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0565a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0565a.c(this);
            }

            public int hashCode() {
                return this.f32124a.hashCode();
            }

            public String toString() {
                return "OnConfirmationEntered(step=" + this.f32124a + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.gy$a$g */
        public static final class g implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final SelfieScannerStep f32125a;

            public g(SelfieScannerStep step) {
                p013kotlin.jvm.internal.s.k(step, "step");
                this.f32125a = step;
            }

            public final SelfieScannerStep a() {
                return this.f32125a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && this.f32125a == ((g) obj).f32125a;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0565a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0565a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0565a.c(this);
            }

            public int hashCode() {
                return this.f32125a.hashCode();
            }

            public String toString() {
                return "OnDismissClicked(step=" + this.f32125a + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.gy$a$h */
        public static final class h implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final h f32126a = new h();

            private h() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0565a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0565a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0565a.c(this);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.gy$a$i */
        public static final class i implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final i f32127a = new i();

            private i() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0565a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0565a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0565a.c(this);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.gy$a$j */
        public static final class j implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final SelfieScannerStep f32128a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final SelfieScannerError f32129b;

            public j(SelfieScannerStep step, SelfieScannerError error) {
                p013kotlin.jvm.internal.s.k(step, "step");
                p013kotlin.jvm.internal.s.k(error, "error");
                this.f32128a = step;
                this.f32129b = error;
            }

            public final SelfieScannerError a() {
                return this.f32129b;
            }

            public final SelfieScannerStep b() {
                return this.f32128a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return this.f32128a == jVar.f32128a && this.f32129b == jVar.f32129b;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0565a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0565a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0565a.c(this);
            }

            public int hashCode() {
                return (this.f32128a.hashCode() * 31) + this.f32129b.hashCode();
            }

            public String toString() {
                return "OnRetakeClicked(step=" + this.f32128a + ", error=" + this.f32129b + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.gy$a$k */
        public static final class k implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final k f32130a = new k();

            private k() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof k);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0565a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0565a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0565a.c(this);
            }

            public int hashCode() {
                return -770805705;
            }

            public String toString() {
                return "OnScannerSuccess";
            }
        }
    }

    public C3321gy(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        this.f32119a = tracker;
    }

    private final void b(SelfieScannerStep selfieScannerStep) {
        C3103bt.f30707a.c("selfie_scan_confirm", p013kotlin.collections.v0.f(d(selfieScannerStep)));
    }

    private final void c(SelfieScannerStep selfieScannerStep) {
        Map mapF = p013kotlin.collections.v0.f(d(selfieScannerStep));
        C3103bt.f30707a.a("selfie_scan", mapF);
        this.f32119a.a(new C3294gD(mapF));
    }

    private final void d() {
        C3103bt.c(C3103bt.f30707a, "selfie_scan", null, 2, null);
    }

    private final void e() {
        C3103bt.a(C3103bt.f30707a, "orca_document_scan_confirm_action_preview", null, null, 6, null);
        this.f32119a.a(new C3593nD(null, 1, null));
    }

    private final void f() {
        C3103bt.b(C3103bt.f30707a, "selfie_scan", null, 2, null);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3354ho
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof a.e) {
            a(((a.e) event).a());
            return;
        }
        if (event instanceof a.f) {
            b(((a.f) event).a());
            return;
        }
        if (event instanceof a.g) {
            c(((a.g) event).a());
            return;
        }
        if (event instanceof a.i) {
            e();
            return;
        }
        if (event instanceof a.h) {
            d();
            return;
        }
        if (event instanceof a.k) {
            f();
            return;
        }
        if (event instanceof a.j) {
            a.j jVar = (a.j) event;
            a(jVar.b(), jVar.a());
        } else if (event instanceof a.c) {
            b();
        } else if (event instanceof a.b) {
            a();
        } else {
            if (!(event instanceof a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            c();
        }
    }

    private final Pair d(SelfieScannerStep selfieScannerStep) {
        return jn0.x.a("step", AbstractC3989wg.a(selfieScannerStep));
    }

    private final void b() {
        C3103bt.a(C3103bt.f30707a, "orca_selfie_scan_action_camera_permission_granted", null, null, 6, null);
    }

    private final void c() {
        C3103bt.a(C3103bt.f30707a, "orca_selfie_scan_action_camera_permission_open_settings", null, null, 6, null);
    }

    private final void a(SelfieScannerStep selfieScannerStep) {
        Map mapF = p013kotlin.collections.v0.f(d(selfieScannerStep));
        C3103bt.f30707a.b("selfie_scan_confirm", mapF);
        this.f32119a.a(new C3380iD(mapF));
    }

    private final void a(SelfieScannerStep selfieScannerStep, SelfieScannerError selfieScannerError) {
        Map mapM = p013kotlin.collections.v0.m(d(selfieScannerStep), a(selfieScannerError));
        C3103bt.f30707a.a("selfie_scan_confirm", mapM);
        this.f32119a.a(new C3636oD(mapM));
    }

    private final void a() {
        C3103bt.a(C3103bt.f30707a, "orca_selfie_scan_action_camera_permission_denied", null, null, 6, null);
    }

    private final Pair a(SelfieScannerError selfieScannerError) {
        return jn0.x.a("orca_error", AbstractC3989wg.a(selfieScannerError));
    }
}
