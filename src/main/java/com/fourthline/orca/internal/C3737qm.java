package com.fourthline.orca.internal;

import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.qm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3737qm implements InterfaceC3354ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3438jo f34859a;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.qm$a */
    public interface a extends InterfaceC3354ho.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.qm$a$a, reason: collision with other inner class name */
        public static final class C0602a {
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

        /* JADX INFO: renamed from: com.fourthline.orca.internal.qm$a$b */
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f34860a = new b();

            private b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0602a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0602a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0602a.c(this);
            }

            public int hashCode() {
                return 1371270090;
            }

            public String toString() {
                return "OnBackButtonClicked";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.qm$a$c */
        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f34861a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0602a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0602a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0602a.c(this);
            }

            public int hashCode() {
                return -542771902;
            }

            public String toString() {
                return "OnEditCan";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.qm$a$d */
        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f34862a = new d();

            private d() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0602a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0602a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0602a.c(this);
            }

            public int hashCode() {
                return 1994289984;
            }

            public String toString() {
                return "OnEnterScreen";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.qm$a$e */
        public static final class e implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f34863a = new e();

            private e() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0602a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0602a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0602a.c(this);
            }

            public int hashCode() {
                return 1633359767;
            }

            public String toString() {
                return "OnLinkButtonClicked";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.qm$a$f */
        public static final class f implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f34864a = new f();

            private f() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0602a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0602a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0602a.c(this);
            }

            public int hashCode() {
                return -272262850;
            }

            public String toString() {
                return "OnNextButtonClicked";
            }
        }
    }

    public C3737qm(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        this.f34859a = tracker;
    }

    private final void b() {
        C3103bt.a(C3103bt.f30707a, "document_can_action_edit_can_number", null, null, 6, null);
    }

    private final void c() {
        C3103bt.c(C3103bt.f30707a, "document_can", null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void d() {
        C3103bt.a(C3103bt.f30707a, "document_can_action_take_photos", null, null, 6, null);
        this.f34859a.a(new C3722qD(null, 1, 0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void e() {
        C3103bt.b(C3103bt.f30707a, "document_can", null, 2, null);
        this.f34859a.a(new C3380iD(null, 1, 0 == true ? 1 : 0));
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
        } else if (event instanceof a.f) {
            e();
        } else {
            if (!(event instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void a() {
        C3103bt.a(C3103bt.f30707a, "document_can", null, 2, null);
        this.f34859a.a(new C3294gD(null, 1, 0 == true ? 1 : 0));
    }
}
