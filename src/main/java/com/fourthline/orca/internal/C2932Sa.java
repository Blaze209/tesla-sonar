package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.DocumentScannerStep;
import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Sa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2932Sa implements InterfaceC3354ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3438jo f27755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3212eb f27756b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Sa$a */
    public interface a extends InterfaceC3354ho.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Sa$a$a, reason: collision with other inner class name */
        public static final class C0516a {
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

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Sa$a$b */
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f27757a = new b();

            private b() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0516a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0516a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0516a.c(this);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Sa$a$c */
        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f27758a = new c();

            private c() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0516a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0516a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0516a.c(this);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Sa$a$d */
        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f27759a = new d();

            private d() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0516a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0516a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0516a.c(this);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Sa$a$e */
        public static final class e implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f27760b = DocumentScannerStep.$stable;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final DocumentScannerStep f27761a;

            public e(DocumentScannerStep step) {
                p013kotlin.jvm.internal.s.k(step, "step");
                this.f27761a = step;
            }

            public final DocumentScannerStep a() {
                return this.f27761a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && p013kotlin.jvm.internal.s.f(this.f27761a, ((e) obj).f27761a);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0516a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0516a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0516a.c(this);
            }

            public int hashCode() {
                return this.f27761a.hashCode();
            }

            public String toString() {
                return "OnConfirmClicked(step=" + this.f27761a + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Sa$a$f */
        public static final class f implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f27762b = DocumentScannerStep.$stable;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final DocumentScannerStep f27763a;

            public f(DocumentScannerStep step) {
                p013kotlin.jvm.internal.s.k(step, "step");
                this.f27763a = step;
            }

            public final DocumentScannerStep a() {
                return this.f27763a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && p013kotlin.jvm.internal.s.f(this.f27763a, ((f) obj).f27763a);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0516a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0516a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0516a.c(this);
            }

            public int hashCode() {
                return this.f27763a.hashCode();
            }

            public String toString() {
                return "OnConfirmationEntered(step=" + this.f27763a + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Sa$a$g */
        public static final class g implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f27764b = DocumentScannerStep.$stable;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final DocumentScannerStep f27765a;

            public g(DocumentScannerStep step) {
                p013kotlin.jvm.internal.s.k(step, "step");
                this.f27765a = step;
            }

            public final DocumentScannerStep a() {
                return this.f27765a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && p013kotlin.jvm.internal.s.f(this.f27765a, ((g) obj).f27765a);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0516a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0516a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0516a.c(this);
            }

            public int hashCode() {
                return this.f27765a.hashCode();
            }

            public String toString() {
                return "OnDismissClicked(step=" + this.f27765a + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Sa$a$h */
        public static final class h implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final h f27766a = new h();

            private h() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0516a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0516a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0516a.c(this);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Sa$a$i */
        public static final class i implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final i f27767a = new i();

            private i() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0516a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0516a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0516a.c(this);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Sa$a$j */
        public static final class j implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final j f27768a = new j();

            private j() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0516a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0516a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0516a.c(this);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Sa$a$k */
        public static final class k implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final k f27769a = new k();

            private k() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0516a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0516a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0516a.c(this);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Sa$a$l */
        public static final class l implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f27770b = DocumentScannerStep.$stable;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final DocumentScannerStep f27771a;

            public l(DocumentScannerStep step) {
                p013kotlin.jvm.internal.s.k(step, "step");
                this.f27771a = step;
            }

            public final DocumentScannerStep a() {
                return this.f27771a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof l) && p013kotlin.jvm.internal.s.f(this.f27771a, ((l) obj).f27771a);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0516a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0516a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0516a.c(this);
            }

            public int hashCode() {
                return this.f27771a.hashCode();
            }

            public String toString() {
                return "OnRetakeClicked(step=" + this.f27771a + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Sa$a$m */
        public static final class m implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final m f27772a = new m();

            private m() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0516a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0516a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0516a.c(this);
            }
        }
    }

    public C2932Sa(C3438jo tracker, InterfaceC3212eb documentScannerRepository) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        p013kotlin.jvm.internal.s.k(documentScannerRepository, "documentScannerRepository");
        this.f27755a = tracker;
        this.f27756b = documentScannerRepository;
    }

    private final void b(DocumentScannerStep documentScannerStep) {
        C3103bt.f30707a.c("document_scan_confirm", a(documentScannerStep, this.f27756b.t()));
    }

    private final void c(DocumentScannerStep documentScannerStep) {
        Map mapA = a(documentScannerStep, this.f27756b.t());
        C3103bt.f30707a.a("document_scan", mapA);
        this.f27755a.a(new C3294gD(mapA));
    }

    private final void d() {
        C3103bt.a(C3103bt.f30707a, "orca_document_scan_document_ready_popup_action_confirm", null, null, 6, null);
        this.f27755a.a(new J6("document_ready", new InterfaceC3807sD.d(null, 1, null)));
    }

    private final void e() {
        C3103bt.a(C3103bt.f30707a, "orca_document_scan_document_ready_popup_action_cancel", null, null, 6, null);
        this.f27755a.a(new J6("document_ready", new InterfaceC3807sD.a(null, 1, null)));
    }

    private final void f() {
        C3103bt.c(C3103bt.f30707a, "document_scan", null, 2, null);
    }

    private final void g() {
        C3103bt.a(C3103bt.f30707a, "orca_document_scan_confirm_action_preview", null, a(this.f27756b.t().getType()), 2, null);
    }

    private final void h() {
        C3103bt.b(C3103bt.f30707a, "document_scan", null, 2, null);
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
        if (event instanceof a.j) {
            f();
            return;
        }
        if (event instanceof a.l) {
            d(((a.l) event).a());
            return;
        }
        if (event instanceof a.c) {
            b();
            return;
        }
        if (event instanceof a.b) {
            a();
            return;
        }
        if (event instanceof a.d) {
            c();
            return;
        }
        if (event instanceof a.m) {
            h();
            return;
        }
        if (event instanceof a.h) {
            d();
        } else if (event instanceof a.i) {
            e();
        } else {
            if (!(event instanceof a.k)) {
                throw new NoWhenBranchMatchedException();
            }
            g();
        }
    }

    private final Pair f(DocumentScannerStep documentScannerStep) {
        return jn0.x.a("index", Integer.valueOf(documentScannerStep.getIndex()));
    }

    private final Pair h(DocumentScannerStep documentScannerStep) {
        return jn0.x.a("is_autodetect_available", Boolean.valueOf(documentScannerStep.isAutoDetectAvailable()));
    }

    private final void d(DocumentScannerStep documentScannerStep) {
        Map mapA = a(documentScannerStep, this.f27756b.t());
        C3103bt.f30707a.a("document_scan_confirm", mapA);
        this.f27755a.a(new C3636oD(mapA));
    }

    private final Pair e(DocumentScannerStep documentScannerStep) {
        return jn0.x.a("fileside", AbstractC3989wg.a(documentScannerStep.getFileSide()));
    }

    private final void b() {
        C3103bt.a(C3103bt.f30707a, "orca_document_scan_action_camera_permission_granted", null, null, 6, null);
    }

    private final void c() {
        C3103bt.a(C3103bt.f30707a, "orca_document_scan_action_camera_permission_open_settings", null, null, 6, null);
    }

    private final Pair g(DocumentScannerStep documentScannerStep) {
        return jn0.x.a("is_angled", Boolean.valueOf(documentScannerStep.isAngled()));
    }

    private final void a(DocumentScannerStep documentScannerStep) {
        Map mapA = a(documentScannerStep, this.f27756b.t());
        C3103bt.f30707a.b("document_scan_confirm", mapA);
        this.f27755a.a(new C3380iD(mapA));
    }

    private final void a() {
        C3103bt.a(C3103bt.f30707a, "orca_document_scan_action_camera_permission_denied", null, null, 6, null);
    }

    private final Map a(DocumentScannerStep documentScannerStep, DocumentScannerConfig documentScannerConfig) {
        return p013kotlin.collections.v0.m(a(documentScannerConfig), e(documentScannerStep), f(documentScannerStep), g(documentScannerStep), h(documentScannerStep));
    }

    private final Pair a(DocumentScannerConfig documentScannerConfig) {
        return jn0.x.a(AnalyticsAttribute.DocumentType, AbstractC3989wg.a(documentScannerConfig.getType()));
    }

    private final Map a(DocumentType documentType) {
        return p013kotlin.collections.v0.f(jn0.x.a(AnalyticsAttribute.DocumentType, AbstractC3989wg.a(documentType)));
    }
}
