package com.fourthline.orca.internal;

import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Id, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2885Id implements InterfaceC3354ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3438jo f26289a;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Id$a */
    public interface a extends InterfaceC3354ho.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Id$a$a, reason: collision with other inner class name */
        public static final class C0494a {
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

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Id$a$b */
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f26290a = new b();

            private b() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0494a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0494a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0494a.c(this);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Id$a$c */
        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f26291a = new c();

            private c() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0494a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0494a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0494a.c(this);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Id$a$d */
        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f26292a = new d();

            private d() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0494a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0494a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0494a.c(this);
            }
        }
    }

    public C2885Id(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        this.f26289a = tracker;
    }

    private final void b() {
        C3103bt.c(C3103bt.f30707a, "eid_pin", null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void c() {
        C3103bt.b(C3103bt.f30707a, "eid_pin", null, 2, null);
        this.f26289a.a(new C3380iD(null, 1, 0 == true ? 1 : 0));
    }

    @Override // com.fourthline.orca.internal.InterfaceC3354ho
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof a.b) {
            a();
        } else if (event instanceof a.c) {
            b();
        } else {
            if (!(event instanceof a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void a() {
        C3103bt.a(C3103bt.f30707a, "eid_pin", null, 2, null);
        this.f26289a.a(new C3294gD(null, 1, 0 == true ? 1 : 0));
    }
}
