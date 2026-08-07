package com.fourthline.orca.internal;

import com.fourthline.analytics.FourthlineAnalytics;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.DocumentFileSideKt;
import com.fourthline.core.DocumentTypeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Vb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2974Vb implements InterfaceC3354ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3438jo f29057a;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Vb$a */
    public interface a extends InterfaceC3354ho.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Vb$a$a, reason: collision with other inner class name */
        public static final class C0526a {
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

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Vb$a$b */
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Throwable f29058a;

            public b(Throwable error) {
                p013kotlin.jvm.internal.s.k(error, "error");
                this.f29058a = error;
            }

            public final Throwable a() {
                return this.f29058a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f29058a, ((b) obj).f29058a);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0526a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0526a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0526a.c(this);
            }

            public int hashCode() {
                return this.f29058a.hashCode();
            }

            public String toString() {
                return "OnError(error=" + this.f29058a + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Vb$a$c */
        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final DocumentRecognitionData f29059a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final C3936vD f29060b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final List f29061c;

            public c(DocumentRecognitionData result, C3936vD expectations, List validationErrors) {
                p013kotlin.jvm.internal.s.k(result, "result");
                p013kotlin.jvm.internal.s.k(expectations, "expectations");
                p013kotlin.jvm.internal.s.k(validationErrors, "validationErrors");
                this.f29059a = result;
                this.f29060b = expectations;
                this.f29061c = validationErrors;
            }

            public final C3936vD a() {
                return this.f29060b;
            }

            public final DocumentRecognitionData b() {
                return this.f29059a;
            }

            public final List c() {
                return this.f29061c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return p013kotlin.jvm.internal.s.f(this.f29059a, cVar.f29059a) && p013kotlin.jvm.internal.s.f(this.f29060b, cVar.f29060b) && p013kotlin.jvm.internal.s.f(this.f29061c, cVar.f29061c);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0526a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0526a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0526a.c(this);
            }

            public int hashCode() {
                return (((this.f29059a.hashCode() * 31) + this.f29060b.hashCode()) * 31) + this.f29061c.hashCode();
            }

            public String toString() {
                return "OnResultReceived(result=" + this.f29059a + ", expectations=" + this.f29060b + ", validationErrors=" + this.f29061c + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Vb$a$d */
        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final AbstractC3641oc f29062a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final C3936vD f29063b;

            public d(AbstractC3641oc validationError, C3936vD expectations) {
                p013kotlin.jvm.internal.s.k(validationError, "validationError");
                p013kotlin.jvm.internal.s.k(expectations, "expectations");
                this.f29062a = validationError;
                this.f29063b = expectations;
            }

            public final C3936vD a() {
                return this.f29063b;
            }

            public final AbstractC3641oc b() {
                return this.f29062a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return p013kotlin.jvm.internal.s.f(this.f29062a, dVar.f29062a) && p013kotlin.jvm.internal.s.f(this.f29063b, dVar.f29063b);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0526a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0526a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0526a.c(this);
            }

            public int hashCode() {
                return (this.f29062a.hashCode() * 31) + this.f29063b.hashCode();
            }

            public String toString() {
                return "OnSkipRecurringError(validationError=" + this.f29062a + ", expectations=" + this.f29063b + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Vb$a$e */
        public static final class e implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final C3936vD f29064a;

            public e(C3936vD expectations) {
                p013kotlin.jvm.internal.s.k(expectations, "expectations");
                this.f29064a = expectations;
            }

            public final C3936vD a() {
                return this.f29064a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && p013kotlin.jvm.internal.s.f(this.f29064a, ((e) obj).f29064a);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0526a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0526a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0526a.c(this);
            }

            public int hashCode() {
                return this.f29064a.hashCode();
            }

            public String toString() {
                return "OnStart(expectations=" + this.f29064a + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Vb$a$f */
        public static final class f implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f29065a = new f();

            private f() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0526a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0526a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0526a.c(this);
            }

            public int hashCode() {
                return 1335141389;
            }

            public String toString() {
                return "OnTimeout";
            }
        }
    }

    public C2974Vb(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        this.f29057a = tracker;
    }

    private final Map b(C3936vD c3936vD) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("expected_issuing_country", c3936vD.d());
        linkedHashMap.put("expected_document_type", DocumentTypeKt.toFourthlineValue(c3936vD.c()));
        DocumentFileSide documentFileSideB = c3936vD.b();
        if (documentFileSideB != null) {
            linkedHashMap.put("expected_document_side", DocumentFileSideKt.toFourthlineValue(documentFileSideB));
        }
        Boolean boolA = c3936vD.a();
        if (boolA != null) {
            linkedHashMap.put("expected_is_angled", boolA);
        }
        return linkedHashMap;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3354ho
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof a.e) {
            a(((a.e) event).a());
            return;
        }
        if (event instanceof a.c) {
            a.c cVar = (a.c) event;
            a(cVar.b(), cVar.a(), cVar.c());
        } else if (event instanceof a.d) {
            a.d dVar = (a.d) event;
            a(dVar.b(), dVar.a());
        } else if (event instanceof a.f) {
            a();
        } else {
            if (!(event instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            a(((a.b) event).a());
        }
    }

    private final void a(C3936vD c3936vD) {
        this.f29057a.a(new InterfaceC3844t7.e(c3936vD));
    }

    private final void a() {
        FourthlineAnalytics.i$default(FourthlineAnalytics.INSTANCE, "orca_document_step_analysis_timeout", null, null, 6, null);
        this.f29057a.a(InterfaceC3844t7.f.f35576a);
    }

    private final void a(Throwable th2) {
        FourthlineAnalytics.e$default(FourthlineAnalytics.INSTANCE, "orca_document_step_analysis_error", th2, null, 4, null);
        this.f29057a.a(new InterfaceC3844t7.c(th2));
    }

    private final void a(DocumentRecognitionData documentRecognitionData, C3936vD c3936vD, List list) {
        Map mapA = a(documentRecognitionData);
        C3103bt c3103bt = C3103bt.f30707a;
        Map mapC = p013kotlin.collections.v0.c();
        mapC.put("isPublic", Boolean.FALSE);
        mapC.putAll(mapA);
        mapC.putAll(b(c3936vD));
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(R6.a((AbstractC3641oc) it.next()));
        }
        mapC.put("validation_errors", arrayList);
        jn0.h0 h0Var = jn0.h0.f84049a;
        C3103bt.a(c3103bt, "orca_document_step_analysis_result_received", null, p013kotlin.collections.v0.b(mapC), 2, null);
        this.f29057a.a(new InterfaceC3844t7.b(c3936vD, p013kotlin.collections.v0.A(mapA), list));
    }

    private final void a(AbstractC3641oc abstractC3641oc, C3936vD c3936vD) {
        C3103bt c3103bt = C3103bt.f30707a;
        Map mapC = p013kotlin.collections.v0.c();
        mapC.put("isPublic", Boolean.FALSE);
        mapC.put("validation_error", R6.a(abstractC3641oc));
        mapC.putAll(b(c3936vD));
        jn0.h0 h0Var = jn0.h0.f84049a;
        C3103bt.a(c3103bt, "orca_document_step_analysis_skip_error", null, p013kotlin.collections.v0.b(mapC), 2, null);
        this.f29057a.a(new InterfaceC3844t7.d(c3936vD, abstractC3641oc));
    }

    private final Map a(DocumentRecognitionData documentRecognitionData) {
        String strB;
        String strA;
        String strC;
        String strD;
        DocumentRecognitionValue value = documentRecognitionData.getValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (value != null && (strD = value.getIssuingCountry()) != null) {
            linkedHashMap.put("issuing_country", strD);
        }
        if (value != null && (strC = value.getDocumentType()) != null) {
            linkedHashMap.put(AnalyticsAttribute.DocumentType, strC);
        }
        if (value != null && (strA = value.getDocumentModel()) != null) {
            linkedHashMap.put("document_model", strA);
        }
        if (value != null && (strB = value.getDocumentSide()) != null) {
            linkedHashMap.put("document_side", strB);
        }
        return linkedHashMap;
    }
}
