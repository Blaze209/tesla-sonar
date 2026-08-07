package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.orca.qes.internal.error.QesError;
import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.af, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3046af implements InterfaceC3354ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3438jo f30388a;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.af$a */
    public interface a extends InterfaceC3354ho.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.af$a$a, reason: collision with other inner class name */
        public static final class C0541a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Throwable f30389a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f30390b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f30391c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f30392d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final Map f30393e;

            public C0541a(Throwable error, String source) {
                p013kotlin.jvm.internal.s.k(error, "error");
                p013kotlin.jvm.internal.s.k(source, "source");
                this.f30389a = error;
                this.f30390b = source;
                this.f30391c = "iglu:com.fourthline.sdk/dialog_started/jsonschema/1-0-0";
                this.f30392d = "dialog_started";
                this.f30393e = p013kotlin.collections.v0.f(jn0.x.a("name", AbstractC3089bf.b(error)));
            }

            public final Throwable a() {
                return this.f30389a;
            }

            public final String b() {
                return this.f30390b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0541a)) {
                    return false;
                }
                C0541a c0541a = (C0541a) obj;
                return p013kotlin.jvm.internal.s.f(this.f30389a, c0541a.f30389a) && p013kotlin.jvm.internal.s.f(this.f30390b, c0541a.f30390b);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return this.f30393e;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return this.f30392d;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return this.f30391c;
            }

            public int hashCode() {
                return (this.f30389a.hashCode() * 31) + this.f30390b.hashCode();
            }

            public String toString() {
                return "OnPopupShown(error=" + this.f30389a + ", source=" + this.f30390b + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.af$a$b */
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final InterfaceC3807sD f30394a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Throwable f30395b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f30396c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f30397d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final String f30398e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final Map f30399f;

            public b(InterfaceC3807sD intent, Throwable error, String source) {
                p013kotlin.jvm.internal.s.k(intent, "intent");
                p013kotlin.jvm.internal.s.k(error, "error");
                p013kotlin.jvm.internal.s.k(source, "source");
                this.f30394a = intent;
                this.f30395b = error;
                this.f30396c = source;
                this.f30397d = "iglu:com.fourthline.sdk/dialog_action/jsonschema/1-0-0";
                this.f30398e = "dialog_action";
                this.f30399f = p013kotlin.collections.v0.m(jn0.x.a("name", AbstractC3089bf.b(error)), jn0.x.a(AnalyticsAttribute.Intent, AbstractC3850tD.a(intent)));
            }

            public final Throwable a() {
                return this.f30395b;
            }

            public final InterfaceC3807sD b() {
                return this.f30394a;
            }

            public final String c() {
                return this.f30396c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return p013kotlin.jvm.internal.s.f(this.f30394a, bVar.f30394a) && p013kotlin.jvm.internal.s.f(this.f30395b, bVar.f30395b) && p013kotlin.jvm.internal.s.f(this.f30396c, bVar.f30396c);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return this.f30399f;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return this.f30398e;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return this.f30397d;
            }

            public int hashCode() {
                return (((this.f30394a.hashCode() * 31) + this.f30395b.hashCode()) * 31) + this.f30396c.hashCode();
            }

            public String toString() {
                return "OnPrimaryClicked(intent=" + this.f30394a + ", error=" + this.f30395b + ", source=" + this.f30396c + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.af$a$c */
        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final InterfaceC3807sD f30400a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Throwable f30401b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f30402c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f30403d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final String f30404e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final Map f30405f;

            public c(InterfaceC3807sD intent, Throwable error, String source) {
                p013kotlin.jvm.internal.s.k(intent, "intent");
                p013kotlin.jvm.internal.s.k(error, "error");
                p013kotlin.jvm.internal.s.k(source, "source");
                this.f30400a = intent;
                this.f30401b = error;
                this.f30402c = source;
                this.f30403d = "iglu:com.fourthline.sdk/dialog_action/jsonschema/1-0-0";
                this.f30404e = "dialog_action";
                this.f30405f = p013kotlin.collections.v0.m(jn0.x.a("name", AbstractC3089bf.b(error)), jn0.x.a(AnalyticsAttribute.Intent, AbstractC3850tD.a(intent)));
            }

            public final Throwable a() {
                return this.f30401b;
            }

            public final InterfaceC3807sD b() {
                return this.f30400a;
            }

            public final String c() {
                return this.f30402c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return p013kotlin.jvm.internal.s.f(this.f30400a, cVar.f30400a) && p013kotlin.jvm.internal.s.f(this.f30401b, cVar.f30401b) && p013kotlin.jvm.internal.s.f(this.f30402c, cVar.f30402c);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return this.f30405f;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return this.f30404e;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return this.f30403d;
            }

            public int hashCode() {
                return (((this.f30400a.hashCode() * 31) + this.f30401b.hashCode()) * 31) + this.f30402c.hashCode();
            }

            public String toString() {
                return "OnSecondaryClicked(intent=" + this.f30400a + ", error=" + this.f30401b + ", source=" + this.f30402c + ")";
            }
        }
    }

    public C3046af(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        this.f30388a = tracker;
    }

    private final void b(InterfaceC3807sD interfaceC3807sD, Throwable th2, String str) {
        if (th2 instanceof QesError.Canceled) {
            C3103bt.a(C3103bt.f30707a, "orca_leave_product", null, p013kotlin.collections.v0.f(jn0.x.a("source", str)), 2, null);
            return;
        }
        C3103bt.f30707a.b("orca_" + str + "_screen_error_popup_secondary_action", th2, p013kotlin.collections.v0.m(jn0.x.a("orca_error", a(th2)), jn0.x.a("recoverable", Boolean.valueOf(b(th2)))));
    }

    @Override // com.fourthline.orca.internal.InterfaceC3354ho
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof a.C0541a) {
            a.C0541a c0541a = (a.C0541a) event;
            a(c0541a.a(), c0541a.b());
        } else if (event instanceof a.b) {
            a.b bVar = (a.b) event;
            a(bVar.b(), bVar.a(), bVar.c());
        } else {
            if (!(event instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            a.c cVar = (a.c) event;
            b(cVar.b(), cVar.a(), cVar.c());
        }
        jn0.h0 h0Var = jn0.h0.f84049a;
        this.f30388a.a(event);
    }

    private final void a(Throwable th2, String str) {
        if (th2 instanceof QesError.Canceled) {
            C3103bt.a(C3103bt.f30707a, "orca_leave_popup", null, p013kotlin.collections.v0.f(jn0.x.a("source", str)), 2, null);
            return;
        }
        C3103bt.f30707a.b("orca_" + str + "_screen_error_popup", th2, p013kotlin.collections.v0.m(jn0.x.a("orca_error", a(th2)), jn0.x.a("recoverable", Boolean.valueOf(b(th2)))));
    }

    private final boolean b(Throwable th2) {
        return (th2 instanceof AbstractC3658ot.a) || (th2 instanceof Jv.a) || (th2 instanceof AbstractC3397ip.b) || (th2 instanceof ZD.a) || (th2 instanceof ZD.c) || (th2 instanceof QesError.Canceled);
    }

    private final void a(InterfaceC3807sD interfaceC3807sD, Throwable th2, String str) {
        if (th2 instanceof QesError.Canceled) {
            C3103bt.a(C3103bt.f30707a, "orca_leave_popup_action_stay", null, p013kotlin.collections.v0.f(jn0.x.a("source", str)), 2, null);
            return;
        }
        C3103bt.f30707a.b("orca_" + str + "_screen_error_popup_primary_action", th2, p013kotlin.collections.v0.m(jn0.x.a("orca_error", a(th2)), jn0.x.a("recoverable", Boolean.valueOf(b(th2)))));
    }

    private final String a(Throwable th2) {
        if (th2 instanceof Bo) {
            return ((Bo) th2).getAlias();
        }
        return th2 instanceof Jv ? ((Jv) th2).a() : th2.getClass().getSimpleName();
    }
}
