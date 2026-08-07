package com.fourthline.orca.internal;

import com.fourthline.orca.qes.internal.error.QesError;
import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.rs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3785rs implements InterfaceC3354ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3438jo f35144a;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.rs$a */
    public interface a extends InterfaceC3354ho.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.rs$a$a, reason: collision with other inner class name */
        public static final class C0609a {
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

        /* JADX INFO: renamed from: com.fourthline.orca.internal.rs$a$b */
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Ds f35145a;

            public b(Ds type) {
                p013kotlin.jvm.internal.s.k(type, "type");
                this.f35145a = type;
            }

            public Ds a() {
                return this.f35145a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f35145a, ((b) obj).f35145a);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0609a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0609a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0609a.c(this);
            }

            public int hashCode() {
                return this.f35145a.hashCode();
            }

            public String toString() {
                return "OnPopupShown(type=" + this.f35145a + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.rs$a$c */
        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Ds f35146a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final InterfaceC3807sD f35147b;

            public c(Ds type, InterfaceC3807sD intent) {
                p013kotlin.jvm.internal.s.k(type, "type");
                p013kotlin.jvm.internal.s.k(intent, "intent");
                this.f35146a = type;
                this.f35147b = intent;
            }

            public final InterfaceC3807sD a() {
                return this.f35147b;
            }

            public Ds b() {
                return this.f35146a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return p013kotlin.jvm.internal.s.f(this.f35146a, cVar.f35146a) && p013kotlin.jvm.internal.s.f(this.f35147b, cVar.f35147b);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0609a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0609a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0609a.c(this);
            }

            public int hashCode() {
                return (this.f35146a.hashCode() * 31) + this.f35147b.hashCode();
            }

            public String toString() {
                return "OnPrimaryClicked(type=" + this.f35146a + ", intent=" + this.f35147b + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.rs$a$d */
        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Ds f35148a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final InterfaceC3807sD f35149b;

            public d(Ds type, InterfaceC3807sD intent) {
                p013kotlin.jvm.internal.s.k(type, "type");
                p013kotlin.jvm.internal.s.k(intent, "intent");
                this.f35148a = type;
                this.f35149b = intent;
            }

            public final InterfaceC3807sD a() {
                return this.f35149b;
            }

            public Ds b() {
                return this.f35148a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return p013kotlin.jvm.internal.s.f(this.f35148a, dVar.f35148a) && p013kotlin.jvm.internal.s.f(this.f35149b, dVar.f35149b);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0609a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0609a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0609a.c(this);
            }

            public int hashCode() {
                return (this.f35148a.hashCode() * 31) + this.f35149b.hashCode();
            }

            public String toString() {
                return "OnSecondaryClicked(type=" + this.f35148a + ", intent=" + this.f35149b + ")";
            }
        }
    }

    public C3785rs(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        this.f35144a = tracker;
    }

    private final void b(Ds ds2) {
        C3103bt.f30707a.b("orca_" + ds2.a() + "_screen_error_popup", ds2 instanceof Ds.c ? ((Ds.c) ds2).c() : null, a(ds2));
        this.f35144a.a(new K6(AbstractC3828ss.b(ds2)));
    }

    @Override // com.fourthline.orca.internal.InterfaceC3354ho
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof a.b) {
            b(((a.b) event).a());
            return;
        }
        if (event instanceof a.c) {
            a.c cVar = (a.c) event;
            a(cVar.b(), cVar.a());
        } else {
            if (!(event instanceof a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            a.d dVar = (a.d) event;
            b(dVar.b(), dVar.a());
        }
    }

    private final void a(Ds ds2, InterfaceC3807sD interfaceC3807sD) {
        C3103bt.f30707a.b("orca_" + ds2.a() + "_screen_error_popup_primary_action", ds2 instanceof Ds.c ? ((Ds.c) ds2).c() : null, a(ds2));
        this.f35144a.a(new J6(AbstractC3828ss.b(ds2), interfaceC3807sD));
    }

    private final void b(Ds ds2, InterfaceC3807sD interfaceC3807sD) {
        C3103bt.f30707a.b("orca_" + ds2.a() + "_screen_error_popup_secondary_action", ds2 instanceof Ds.c ? ((Ds.c) ds2).c() : null, a(ds2));
        this.f35144a.a(new J6(AbstractC3828ss.b(ds2), interfaceC3807sD));
    }

    private final Map a(Ds ds2) {
        if (ds2 instanceof Ds.c) {
            Ds.c cVar = (Ds.c) ds2;
            return p013kotlin.collections.v0.m(jn0.x.a("orca_error", cVar.c().getAlias()), jn0.x.a("recoverable", Boolean.valueOf(a(cVar.c()))));
        }
        return p013kotlin.collections.v0.i();
    }

    private final boolean a(Throwable th2) {
        return (th2 instanceof AbstractC3658ot.a) || (th2 instanceof Jv.a) || (th2 instanceof AbstractC3397ip.b) || (th2 instanceof ZD.a) || (th2 instanceof ZD.c) || (th2 instanceof QesError.Canceled);
    }
}
