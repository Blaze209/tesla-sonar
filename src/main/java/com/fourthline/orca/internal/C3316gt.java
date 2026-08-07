package com.fourthline.orca.internal;

import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.gt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3316gt implements InterfaceC3354ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3438jo f32081a;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.gt$a */
    public interface a extends InterfaceC3354ho.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.gt$a$a, reason: collision with other inner class name */
        public static final class C0564a {
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

        /* JADX INFO: renamed from: com.fourthline.orca.internal.gt$a$b */
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f32082a = new b();

            private b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0564a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0564a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0564a.c(this);
            }

            public int hashCode() {
                return -1336549477;
            }

            public String toString() {
                return "OnBackButtonClicked";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.gt$a$c */
        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final boolean f32083a;

            public c(boolean z11) {
                this.f32083a = z11;
            }

            public final boolean a() {
                return this.f32083a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f32083a == ((c) obj).f32083a;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0564a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0564a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0564a.c(this);
            }

            public int hashCode() {
                return Boolean.hashCode(this.f32083a);
            }

            public String toString() {
                return "OnClaimsCheckBoxClicked(isChecked=" + this.f32083a + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.gt$a$d */
        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f32084a = new d();

            private d() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0564a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0564a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0564a.c(this);
            }

            public int hashCode() {
                return -39069743;
            }

            public String toString() {
                return "OnEnterScreen";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.gt$a$e */
        public static final class e implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f32085a;

            public e(int i11) {
                this.f32085a = i11;
            }

            public final int a() {
                return this.f32085a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.f32085a == ((e) obj).f32085a;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0564a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0564a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0564a.c(this);
            }

            public int hashCode() {
                return Integer.hashCode(this.f32085a);
            }

            public String toString() {
                return "OnLegalDocumentClicked(index=" + this.f32085a + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.gt$a$f */
        public static final class f implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f32086a = new f();

            private f() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0564a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0564a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0564a.c(this);
            }

            public int hashCode() {
                return 1314884879;
            }

            public String toString() {
                return "OnNextButtonClicked";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.gt$a$g */
        public static final class g implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f32087a = new g();

            private g() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0564a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0564a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0564a.c(this);
            }

            public int hashCode() {
                return 1456135422;
            }

            public String toString() {
                return "OnShowLessClicked";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.gt$a$h */
        public static final class h implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final h f32088a = new h();

            private h() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0564a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0564a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0564a.c(this);
            }

            public int hashCode() {
                return 871962562;
            }

            public String toString() {
                return "OnShowMoreClicked";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.gt$a$i */
        public static final class i implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f32089a;

            public i(int i11) {
                this.f32089a = i11;
            }

            public final int a() {
                return this.f32089a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && this.f32089a == ((i) obj).f32089a;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0564a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0564a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0564a.c(this);
            }

            public int hashCode() {
                return Integer.hashCode(this.f32089a);
            }

            public String toString() {
                return "OnSignDocumentClicked(index=" + this.f32089a + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.gt$a$j */
        public static final class j implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final boolean f32090a;

            public j(boolean z11) {
                this.f32090a = z11;
            }

            public final boolean a() {
                return this.f32090a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && this.f32090a == ((j) obj).f32090a;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0564a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0564a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0564a.c(this);
            }

            public int hashCode() {
                return Boolean.hashCode(this.f32090a);
            }

            public String toString() {
                return "OnTermsCheckBoxClicked(isChecked=" + this.f32090a + ")";
            }
        }
    }

    public C3316gt(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        this.f32081a = tracker;
    }

    private final void b() {
        C3103bt.c(C3103bt.f30707a, "agreements", null, 2, null);
    }

    private final void c() {
        C3103bt.b(C3103bt.f30707a, "agreements", null, 2, null);
        this.f32081a.a(new C3380iD(null, 1, null));
    }

    private final void d() {
        C3103bt.a(C3103bt.f30707a, "orca_agreements_screen_action_see_less", null, null, 6, null);
        this.f32081a.a(new C3337hD(null, 1, null));
    }

    private final void e() {
        C3103bt.a(C3103bt.f30707a, "orca_agreements_screen_action_see_more", null, null, 6, null);
        this.f32081a.a(new C3507lD(null, 1, null));
    }

    @Override // com.fourthline.orca.internal.InterfaceC3354ho
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof a.d) {
            b();
            return;
        }
        if (event instanceof a.b) {
            a();
            return;
        }
        if (event instanceof a.f) {
            c();
            return;
        }
        if (event instanceof a.e) {
            a(((a.e) event).a());
            return;
        }
        if (event instanceof a.i) {
            b(((a.i) event).a());
            return;
        }
        if (event instanceof a.h) {
            e();
            return;
        }
        if (event instanceof a.g) {
            d();
        } else if (event instanceof a.j) {
            b(((a.j) event).a());
        } else {
            if (!(event instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            a(((a.c) event).a());
        }
    }

    private final void b(int i11) {
        Map mapM = p013kotlin.collections.v0.m(jn0.x.a("name", "sign_document"), jn0.x.a("index", Integer.valueOf(i11)));
        C3103bt.a(C3103bt.f30707a, "orca_agreements_screen_select_agreement", null, mapM, 2, null);
        this.f32081a.a(new C3593nD(mapM));
    }

    private final void b(boolean z11) {
        C3103bt.a(C3103bt.f30707a, "orca_agreements_screen_action_terms_checkbox", null, p013kotlin.collections.v0.f(jn0.x.a("value", Boolean.valueOf(z11))), 2, null);
        this.f32081a.a(new C3764rD("legal_checkbox", Boolean.valueOf(z11)));
    }

    private final void a() {
        C3103bt.a(C3103bt.f30707a, "agreements", null, 2, null);
        this.f32081a.a(new C3294gD(null, 1, null));
    }

    private final void a(int i11) {
        Map mapM = p013kotlin.collections.v0.m(jn0.x.a("name", "legal_document"), jn0.x.a("index", Integer.valueOf(i11)));
        C3103bt.a(C3103bt.f30707a, "orca_agreements_screen_select_legal_document", null, mapM, 2, null);
        this.f32081a.a(new C3593nD(mapM));
    }

    private final void a(boolean z11) {
        C3103bt.a(C3103bt.f30707a, "orca_agreements_screen_action_claims_checkbox", null, p013kotlin.collections.v0.f(jn0.x.a("value", Boolean.valueOf(z11))), 2, null);
        this.f32081a.a(new C3764rD("sign_document", Boolean.valueOf(z11)));
    }
}
