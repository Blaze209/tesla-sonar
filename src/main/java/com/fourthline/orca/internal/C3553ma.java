package com.fourthline.orca.internal;

import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ma, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3553ma implements InterfaceC3354ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3438jo f33539a;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ma$a */
    public interface a extends InterfaceC3354ho.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ma$a$a, reason: collision with other inner class name */
        public static final class C0582a {
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

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ma$a$b */
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f33540a = new b();

            private b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0582a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0582a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0582a.c(this);
            }

            public int hashCode() {
                return -2035942974;
            }

            public String toString() {
                return "OnBackButtonClicked";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ma$a$c */
        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f33541a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0582a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0582a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0582a.c(this);
            }

            public int hashCode() {
                return -267887816;
            }

            public String toString() {
                return "OnEnterScreen";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ma$a$d */
        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f33542a = new d();

            private d() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0582a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0582a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0582a.c(this);
            }

            public int hashCode() {
                return 615491382;
            }

            public String toString() {
                return "OnNextButtonClicked";
            }
        }
    }

    public C3553ma(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        this.f33539a = tracker;
    }

    private final void b() {
        C3103bt.c(C3103bt.f30707a, "document_ready", null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void c() {
        C3103bt.b(C3103bt.f30707a, "document_ready", null, 2, null);
        this.f33539a.a(new C3380iD(null, 1, 0 == true ? 1 : 0));
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
        C3103bt.a(C3103bt.f30707a, "document_ready", null, 2, null);
        this.f33539a.a(new C3294gD(null, 1, 0 == true ? 1 : 0));
    }
}
