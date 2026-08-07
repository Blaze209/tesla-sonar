package com.fourthline.orca.internal;

import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class M9 implements InterfaceC3354ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3438jo f26900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private G5 f26901b;

    public interface a extends InterfaceC3354ho.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.M9$a$a, reason: collision with other inner class name */
        public static final class C0502a {
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
            public static final b f26902a = new b();

            private b() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0502a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0502a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0502a.c(this);
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final G5 f26903a;

            public c(G5 selectedCountry) {
                p013kotlin.jvm.internal.s.k(selectedCountry, "selectedCountry");
                this.f26903a = selectedCountry;
            }

            public final G5 a() {
                return this.f26903a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f26903a, ((c) obj).f26903a);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0502a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0502a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0502a.c(this);
            }

            public int hashCode() {
                return this.f26903a.hashCode();
            }

            public String toString() {
                return "OnCountrySelected(selectedCountry=" + this.f26903a + ")";
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f26904a = new d();

            private d() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0502a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0502a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0502a.c(this);
            }
        }

        public static final class e implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final G5 f26905a;

            public e(G5 selectedCountry) {
                p013kotlin.jvm.internal.s.k(selectedCountry, "selectedCountry");
                this.f26905a = selectedCountry;
            }

            public final G5 a() {
                return this.f26905a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && p013kotlin.jvm.internal.s.f(this.f26905a, ((e) obj).f26905a);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0502a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0502a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0502a.c(this);
            }

            public int hashCode() {
                return this.f26905a.hashCode();
            }

            public String toString() {
                return "OnNextButtonClicked(selectedCountry=" + this.f26905a + ")";
            }
        }

        public static final class f implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final G5 f26906a;

            public f(G5 selectedCountry) {
                p013kotlin.jvm.internal.s.k(selectedCountry, "selectedCountry");
                this.f26906a = selectedCountry;
            }

            public final G5 a() {
                return this.f26906a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && p013kotlin.jvm.internal.s.f(this.f26906a, ((f) obj).f26906a);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0502a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0502a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0502a.c(this);
            }

            public int hashCode() {
                return this.f26906a.hashCode();
            }

            public String toString() {
                return "OnUnsupportedCountry(selectedCountry=" + this.f26906a + ")";
            }
        }
    }

    public M9(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        this.f26900a = tracker;
    }

    private final void b() {
        C3103bt.c(C3103bt.f30707a, "nationality", null, 2, null);
    }

    private final void c(G5 g11) {
        C3103bt.a(C3103bt.f30707a, "orca_nationality_unsupported_country", null, p013kotlin.collections.v0.f(g11.d()), 2, null);
        jn0.h0 h0Var = jn0.h0.f84049a;
        this.f26901b = g11;
        this.f26900a.a(new C3764rD("nationality", g11.c()));
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
            b();
            return;
        }
        if (event instanceof a.e) {
            b(((a.e) event).a());
        } else if (event instanceof a.c) {
            a(((a.c) event).a());
        } else {
            if (!(event instanceof a.f)) {
                throw new NoWhenBranchMatchedException();
            }
            c(((a.f) event).a());
        }
    }

    private final void b(G5 g11) {
        Map mapF = p013kotlin.collections.v0.f(g11.d());
        C3103bt.f30707a.b("nationality", mapF);
        this.f26900a.a(new C3380iD(mapF));
    }

    private final void a() {
        C3103bt.a(C3103bt.f30707a, "nationality", null, 2, null);
        this.f26900a.a(new C3294gD(null, 1, null));
    }

    private final void a(G5 g11) {
        C3103bt.a(C3103bt.f30707a, "orca_nationality_action_select_country", null, p013kotlin.collections.v0.f(g11.d()), 2, null);
        jn0.h0 h0Var = jn0.h0.f84049a;
        this.f26901b = g11;
        this.f26900a.a(new C3764rD("nationality", g11.c()));
    }
}
