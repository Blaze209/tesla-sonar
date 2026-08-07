package com.fourthline.orca.internal;

import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class Yf implements InterfaceC3354ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3438jo f29872a;

    public interface a extends InterfaceC3354ho.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Yf$a$a, reason: collision with other inner class name */
        public static final class C0535a {
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
            public static final b f29873a = new b();

            private b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0535a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0535a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0535a.c(this);
            }

            public int hashCode() {
                return 1571641093;
            }

            public String toString() {
                return "OnBackButtonClicked";
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f29874a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0535a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0535a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0535a.c(this);
            }

            public int hashCode() {
                return -1569177781;
            }

            public String toString() {
                return "OnDataConsentViewed";
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f29875a = new d();

            private d() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0535a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0535a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0535a.c(this);
            }

            public int hashCode() {
                return -2111592773;
            }

            public String toString() {
                return "OnEnterScreen";
            }
        }

        public static final class e implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f29876a = new e();

            private e() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0535a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0535a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0535a.c(this);
            }

            public int hashCode() {
                return -71891847;
            }

            public String toString() {
                return "OnNextButtonClicked";
            }
        }

        public static final class f implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final EnumC3718q9 f29877a;

            public f(EnumC3718q9 flowType) {
                p013kotlin.jvm.internal.s.k(flowType, "flowType");
                this.f29877a = flowType;
            }

            public final EnumC3718q9 a() {
                return this.f29877a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.f29877a == ((f) obj).f29877a;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0535a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0535a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0535a.c(this);
            }

            public int hashCode() {
                return this.f29877a.hashCode();
            }

            public String toString() {
                return "OnOptionSelected(flowType=" + this.f29877a + ")";
            }
        }

        public static final class g implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f29878a = new g();

            private g() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0535a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0535a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0535a.c(this);
            }

            public int hashCode() {
                return -217746135;
            }

            public String toString() {
                return "OnUnableToContinueClicked";
            }
        }
    }

    public Yf(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        this.f29872a = tracker;
    }

    private final void b() {
    }

    private final void c() {
        C3103bt.c(C3103bt.f30707a, "document_flow_selection", null, 2, null);
    }

    private final void d() {
        C3103bt.b(C3103bt.f30707a, "document_flow_selection", null, 2, null);
        this.f29872a.a(new C3380iD(null, 1, null));
    }

    private final void e() {
        C3103bt.b(C3103bt.f30707a, "document_flow_selection", null, 2, null);
        this.f29872a.a(new C3464kD(null, 1, null));
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
        if (event instanceof a.g) {
            e();
        } else if (event instanceof a.f) {
            a(((a.f) event).a());
        } else {
            if (!(event instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            b();
        }
    }

    private final void a() {
        C3103bt.a(C3103bt.f30707a, "document_flow_selection", null, 2, null);
        this.f29872a.a(new C3294gD(null, 1, null));
    }

    private final void a(EnumC3718q9 enumC3718q9) {
        C3103bt.a(C3103bt.f30707a, "document_flow_selection_action_select_option", null, p013kotlin.collections.v0.f(jn0.x.a("flow_type", AbstractC3989wg.a(enumC3718q9))), 2, null);
    }
}
