package com.fourthline.orca.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class EE implements InterfaceC3354ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3438jo f25582a;

    public interface a extends InterfaceC3354ho.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.EE$a$a, reason: collision with other inner class name */
        public static final class C0485a {
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
            public static final b f25583a = new b();

            private b() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0485a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0485a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0485a.c(this);
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f25584a = new c();

            private c() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0485a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0485a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0485a.c(this);
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final PE f25585a;

            public d(PE session) {
                p013kotlin.jvm.internal.s.k(session, "session");
                this.f25585a = session;
            }

            public final PE a() {
                return this.f25585a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && p013kotlin.jvm.internal.s.f(this.f25585a, ((d) obj).f25585a);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0485a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0485a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0485a.c(this);
            }

            public int hashCode() {
                return this.f25585a.hashCode();
            }

            public String toString() {
                return "OnLoadingComplete(session=" + this.f25585a + ")";
            }
        }
    }

    public EE(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        this.f25582a = tracker;
    }

    private final void b() {
        C3103bt.c(C3103bt.f30707a, "loading", null, 2, null);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3354ho
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof a.c) {
            b();
        } else if (event instanceof a.b) {
            a();
        } else {
            if (!(event instanceof a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            a(((a.d) event).a());
        }
    }

    private final void a() {
        C3103bt.a(C3103bt.f30707a, "loading", null, 2, null);
        this.f25582a.a(new C3294gD(null, 1, null));
    }

    private final void a(PE pe2) {
        List listB = pe2.b();
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listB, 10));
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(a((UE) it.next()));
        }
        Map mapF = p013kotlin.collections.v0.f(jn0.x.a("products", arrayList));
        C3103bt c3103bt = C3103bt.f30707a;
        C3103bt.a(c3103bt, "workflow_configured", null, mapF, 2, null);
        C3103bt.b(c3103bt, "loading", null, 2, null);
    }

    private final String a(UE ue2) {
        if (ue2 instanceof UE.b) {
            return "IDV";
        }
        if (ue2 instanceof UE.c) {
            return "QES";
        }
        if (ue2 instanceof UE.a) {
            return "BAV";
        }
        throw new NoWhenBranchMatchedException();
    }
}
