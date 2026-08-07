package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.core.DocumentType;
import com.fourthline.core.DocumentTypeKt;
import java.util.Locale;
import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.nC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3592nC implements InterfaceC3354ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3438jo f33875a;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.nC$a */
    public interface a extends InterfaceC3354ho.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.nC$a$a, reason: collision with other inner class name */
        public static final class C0587a {
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

        /* JADX INFO: renamed from: com.fourthline.orca.internal.nC$a$b */
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f33876a = new b();

            private b() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0587a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0587a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0587a.c(this);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.nC$a$c */
        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f33877a;

            public c(Object type) {
                p013kotlin.jvm.internal.s.k(type, "type");
                this.f33877a = type;
            }

            public final Object a() {
                return this.f33877a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f33877a, ((c) obj).f33877a);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0587a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0587a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0587a.c(this);
            }

            public int hashCode() {
                return this.f33877a.hashCode();
            }

            public String toString() {
                return "OnNextButtonClicked(type=" + this.f33877a + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.nC$a$d */
        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f33878a;

            public d(Object type) {
                p013kotlin.jvm.internal.s.k(type, "type");
                this.f33878a = type;
            }

            public final Object a() {
                return this.f33878a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && p013kotlin.jvm.internal.s.f(this.f33878a, ((d) obj).f33878a);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0587a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0587a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0587a.c(this);
            }

            public int hashCode() {
                return this.f33878a.hashCode();
            }

            public String toString() {
                return "OnTypeClicked(type=" + this.f33878a + ")";
            }
        }
    }

    public C3592nC(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        this.f33875a = tracker;
    }

    private final void b(Object obj) {
        this.f33875a.a(new C3380iD(p013kotlin.collections.v0.f(jn0.x.a("type", a(obj)))));
    }

    private final void c(Object obj) {
        this.f33875a.a(new C3764rD(AnalyticsAttribute.DocumentType, a(obj)));
    }

    @Override // com.fourthline.orca.internal.InterfaceC3354ho
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof a.d) {
            c(((a.d) event).a());
        } else if (event instanceof a.b) {
            a();
        } else {
            if (!(event instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            b(((a.c) event).a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void a() {
        C3103bt.a(C3103bt.f30707a, AnalyticsAttribute.DocumentType, null, 2, null);
        this.f33875a.a(new C3294gD(null, 1, 0 == true ? 1 : 0));
    }

    private final String a(Object obj) {
        if (obj instanceof DocumentType) {
            return DocumentTypeKt.toFourthlineValue((DocumentType) obj);
        }
        String lowerCase = obj.toString().toLowerCase(Locale.ROOT);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
