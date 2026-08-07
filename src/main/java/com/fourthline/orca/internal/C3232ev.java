package com.fourthline.orca.internal;

import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ev, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3232ev implements InterfaceC3354ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3438jo f31535a;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ev$a */
    public interface a extends InterfaceC3354ho.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ev$a$a, reason: collision with other inner class name */
        public static final class C0557a {
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

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ev$a$b */
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f31536a = new b();

            private b() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0557a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0557a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0557a.c(this);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ev$a$c */
        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Map f31537a;

            public c(Map usageAttributes) {
                p013kotlin.jvm.internal.s.k(usageAttributes, "usageAttributes");
                this.f31537a = usageAttributes;
            }

            public final Map a() {
                return this.f31537a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f31537a, ((c) obj).f31537a);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0557a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0557a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0557a.c(this);
            }

            public int hashCode() {
                return this.f31537a.hashCode();
            }

            public String toString() {
                return "OnDocumentClosed(usageAttributes=" + this.f31537a + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ev$a$d */
        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f31538a = new d();

            private d() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0557a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0557a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0557a.c(this);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ev$a$e */
        public static final class e implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f31539a = new e();

            private e() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0557a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0557a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0557a.c(this);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ev$a$f */
        public static final class f implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f31540a = new f();

            private f() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0557a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0557a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0557a.c(this);
            }
        }
    }

    public C3232ev(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        this.f31535a = tracker;
    }

    private final void b() {
        C3103bt.a(C3103bt.f30707a, "orca_document_viewer_screen_action_download", null, null, 6, null);
        this.f31535a.a(new C3421jD(null, 1, null));
    }

    private final void c() {
        C3103bt.c(C3103bt.f30707a, "document_viewer", null, 2, null);
    }

    private final void d() {
        C3103bt.a(C3103bt.f30707a, "orca_document_viewer_screen_action_share", null, null, 6, null);
        this.f31535a.a(new C3679pD(null, 1, null));
    }

    @Override // com.fourthline.orca.internal.InterfaceC3354ho
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof a.b) {
            a();
            return;
        }
        if (event instanceof a.e) {
            c();
            return;
        }
        if (event instanceof a.d) {
            b();
        } else if (event instanceof a.f) {
            d();
        } else {
            if (!(event instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            a(((a.c) event).a());
        }
    }

    private final void a() {
        C3103bt.a(C3103bt.f30707a, "document_viewer", null, 2, null);
        this.f31535a.a(new C3294gD(null, 1, null));
    }

    private final void a(Map map) {
        C3103bt.a(C3103bt.f30707a, "orca_document_viewer_screen_ux_summary", null, map, 2, null);
    }
}
