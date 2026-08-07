package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.core.DocumentType;
import com.fourthline.core.DocumentTypeKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Xb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3010Xb implements InterfaceC3354ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3392ik f29726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3438jo f29727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private G5 f29728c;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Xb$a */
    public interface a extends InterfaceC3354ho.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Xb$a$a, reason: collision with other inner class name */
        public static final class C0531a {
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

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Xb$a$b */
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f29729a = new b();

            private b() {
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0531a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0531a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0531a.c(this);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Xb$a$c */
        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final List f29730a;

            public c(List unsupportedDocumentTypes) {
                p013kotlin.jvm.internal.s.k(unsupportedDocumentTypes, "unsupportedDocumentTypes");
                this.f29730a = unsupportedDocumentTypes;
            }

            public final List a() {
                return this.f29730a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f29730a, ((c) obj).f29730a);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0531a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0531a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0531a.c(this);
            }

            public int hashCode() {
                return this.f29730a.hashCode();
            }

            public String toString() {
                return "OnDocumentNotSupportedClicked(unsupportedDocumentTypes=" + this.f29730a + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Xb$a$d */
        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final DocumentType f29731a;

            public d(DocumentType documentType) {
                p013kotlin.jvm.internal.s.k(documentType, "documentType");
                this.f29731a = documentType;
            }

            public final DocumentType a() {
                return this.f29731a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.f29731a == ((d) obj).f29731a;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0531a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0531a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0531a.c(this);
            }

            public int hashCode() {
                return this.f29731a.hashCode();
            }

            public String toString() {
                return "OnDocumentOptionClicked(documentType=" + this.f29731a + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Xb$a$e */
        public static final class e implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final G5 f29732a;

            public e(G5 g11) {
                this.f29732a = g11;
            }

            public final G5 a() {
                return this.f29732a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && p013kotlin.jvm.internal.s.f(this.f29732a, ((e) obj).f29732a);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0531a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0531a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0531a.c(this);
            }

            public int hashCode() {
                G5 g11 = this.f29732a;
                if (g11 == null) {
                    return 0;
                }
                return g11.hashCode();
            }

            public String toString() {
                return "OnEnterScreen(selectedCountry=" + this.f29732a + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Xb$a$f */
        public static final class f implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final DocumentType f29733a;

            public f(DocumentType documentType) {
                p013kotlin.jvm.internal.s.k(documentType, "documentType");
                this.f29733a = documentType;
            }

            public final DocumentType a() {
                return this.f29733a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.f29733a == ((f) obj).f29733a;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0531a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0531a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0531a.c(this);
            }

            public int hashCode() {
                return this.f29733a.hashCode();
            }

            public String toString() {
                return "OnNextButtonClicked(documentType=" + this.f29733a + ")";
            }
        }
    }

    public C3010Xb(C3392ik analyticsContext, C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(analyticsContext, "analyticsContext");
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        this.f29726a = analyticsContext;
        this.f29727b = tracker;
    }

    private final void b(DocumentType documentType) {
        C3103bt.f30707a.b(AnalyticsAttribute.DocumentType, p013kotlin.collections.v0.f(jn0.x.a(AnalyticsAttribute.DocumentType, AbstractC3989wg.a(documentType))));
        this.f29727b.a(new C3380iD(p013kotlin.collections.v0.f(jn0.x.a(AnalyticsAttribute.DocumentType, DocumentTypeKt.toFourthlineValue(documentType)))));
        jn0.h0 h0Var = jn0.h0.f84049a;
        this.f29726a.set(AnalyticsAttribute.DocumentType, DocumentTypeKt.toFourthlineValue(documentType));
    }

    @Override // com.fourthline.orca.internal.InterfaceC3354ho
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof a.b) {
            a();
            return;
        }
        if (event instanceof a.e) {
            a(((a.e) event).a());
            return;
        }
        if (event instanceof a.f) {
            b(((a.f) event).a());
        } else if (event instanceof a.d) {
            a(((a.d) event).a());
        } else {
            if (!(event instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            a(((a.c) event).a());
        }
    }

    private final void a(DocumentType documentType) {
        C3103bt.a(C3103bt.f30707a, "orca_document_type_action_select_type", null, p013kotlin.collections.v0.f(jn0.x.a(AnalyticsAttribute.DocumentType, AbstractC3989wg.a(documentType))), 2, null);
        this.f29727b.a(new C3764rD(AnalyticsAttribute.DocumentType, DocumentTypeKt.toFourthlineValue(documentType)));
    }

    private final void a() {
        C3103bt.a(C3103bt.f30707a, AnalyticsAttribute.DocumentType, null, 2, null);
        this.f29727b.a(new C3294gD(null, 1, null));
    }

    private final void a(G5 g11) {
        C3103bt.f30707a.c(AnalyticsAttribute.DocumentType, a(p013kotlin.collections.v0.i(), g11));
        jn0.h0 h0Var = jn0.h0.f84049a;
        this.f29728c = g11;
    }

    private final void a(List list) {
        Pair pairB = EnumC3176dh.DOCUMENT_TYPE.b();
        Pair pairA = jn0.x.a("orca_error", "document_type_not_supported");
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC3989wg.a((DocumentType) it.next()));
        }
        Map mapA = a(p013kotlin.collections.v0.m(pairB, pairA, jn0.x.a("unsupported_document_types", a((Collection) arrayList))), this.f29728c);
        C3103bt.a(C3103bt.f30707a, "orca_leave_identity_check", null, mapA, 2, null);
        this.f29727b.a(new C3464kD(mapA));
    }

    private final Map a(Map map, G5 g11) {
        Pair pairD;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        if (g11 != null && (pairD = g11.d()) != null) {
            linkedHashMap.put(pairD.e(), pairD.f());
        }
        return linkedHashMap;
    }

    private final String a(Collection collection) {
        String string = collection.toString();
        String strSubstring = string.substring(1, string.length() - 1);
        p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
        return strSubstring;
    }
}
