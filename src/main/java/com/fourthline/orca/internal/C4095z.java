package com.fourthline.orca.internal;

import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4095z implements InterfaceC3354ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3438jo f37161a;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.z$a */
    public interface a extends InterfaceC3354ho.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.z$a$a, reason: collision with other inner class name */
        public static final class C0627a {
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

        /* JADX INFO: renamed from: com.fourthline.orca.internal.z$a$b */
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f37162a = new b();

            private b() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0627a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0627a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0627a.c(this);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.z$a$c */
        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f37163a = new c();

            private c() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0627a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0627a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0627a.c(this);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.z$a$d */
        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f37164a = new d();

            private d() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0627a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0627a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0627a.c(this);
            }
        }
    }

    public C4095z(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        this.f37161a = tracker;
    }

    private final void b() {
        C3103bt.c(C3103bt.f30707a, "address_details", null, 2, null);
    }

    private final void c() {
        C3103bt.b(C3103bt.f30707a, "address_details", null, 2, null);
        this.f37161a.a(new C3380iD(null, 1, null));
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

    private final void a() {
        C3103bt.a(C3103bt.f30707a, "address_details", null, 2, null);
        this.f37161a.a(new C3294gD(null, 1, null));
    }
}
