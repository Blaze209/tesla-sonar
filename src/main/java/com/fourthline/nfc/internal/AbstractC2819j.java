package com.fourthline.nfc.internal;

import com.fourthline.analytics.FourthlineAnalytics;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.analytics.internal.AnalyticsInterface;
import com.fourthline.core.DocumentType;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.nfc.internal.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2819j implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f24656a = new a(null);

    /* JADX INFO: renamed from: com.fourthline.nfc.internal.j$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public abstract Map a(List list);

    @Override // com.fourthline.nfc.internal.m0
    public void a(I0.a document, I0.b protocol) {
        p013kotlin.jvm.internal.s.k(document, "document");
        p013kotlin.jvm.internal.s.k(protocol, "protocol");
        FourthlineAnalytics fourthlineAnalytics = FourthlineAnalytics.INSTANCE;
        FourthlineAnalytics.i$default(fourthlineAnalytics, "nfc_inspection_start", null, p013kotlin.collections.v0.m(jn0.x.a("issuing_country", b(document)), jn0.x.a(AnalyticsAttribute.DocumentType, a(document)), jn0.x.a("protocol", protocol.a())), 2, null);
        p0 p0Var = new p0(protocol, document);
        AnalyticsInterface analytics = fourthlineAnalytics.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(p0Var);
        }
    }

    public abstract List b(List list);

    @Override // com.fourthline.nfc.internal.m0
    public void b(I0.a document, I0.b protocol) {
        p013kotlin.jvm.internal.s.k(document, "document");
        p013kotlin.jvm.internal.s.k(protocol, "protocol");
        FourthlineAnalytics fourthlineAnalytics = FourthlineAnalytics.INSTANCE;
        Map mapO = p013kotlin.collections.v0.o(jn0.x.a("issuing_country", b(document)), jn0.x.a(AnalyticsAttribute.DocumentType, a(document)), jn0.x.a("protocol", protocol.a()));
        if (protocol instanceof I0.b.e) {
            I0.b.e eVar = (I0.b.e) protocol;
            jn0.x.a(mapO.get("available_configs"), eVar.b());
            jn0.x.a(mapO.get("selected_config"), eVar.c());
        }
        jn0.h0 h0Var = jn0.h0.f84049a;
        FourthlineAnalytics.i$default(fourthlineAnalytics, "nfc_inspection_success", null, mapO, 2, null);
        n0 n0Var = new n0(protocol, document);
        AnalyticsInterface analytics = fourthlineAnalytics.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(n0Var);
        }
    }

    public abstract List c(List list);

    public void c(I0.a document) {
        p013kotlin.jvm.internal.s.k(document, "document");
        FourthlineAnalytics fourthlineAnalytics = FourthlineAnalytics.INSTANCE;
        FourthlineAnalytics.i$default(fourthlineAnalytics, "nfc_read_data_start", null, p013kotlin.collections.v0.m(jn0.x.a("issuing_country", b(document)), jn0.x.a(AnalyticsAttribute.DocumentType, a(document))), 2, null);
        s0 s0Var = new s0(document);
        AnalyticsInterface analytics = fourthlineAnalytics.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(s0Var);
        }
    }

    @Override // com.fourthline.nfc.internal.m0
    public void a(I0.a document, I0.b protocol, Throwable th2) {
        String message;
        Throwable cause;
        String message2;
        p013kotlin.jvm.internal.s.k(document, "document");
        p013kotlin.jvm.internal.s.k(protocol, "protocol");
        FourthlineAnalytics fourthlineAnalytics = FourthlineAnalytics.INSTANCE;
        Pair pairA = jn0.x.a("issuing_country", b(document));
        Pair pairA2 = jn0.x.a(AnalyticsAttribute.DocumentType, a(document));
        Pair pairA3 = jn0.x.a("protocol", protocol.a());
        String str = "N/A";
        if (th2 == null || (message = th2.getMessage()) == null) {
            message = "N/A";
        }
        Pair pairA4 = jn0.x.a("nfc_error", message);
        if (th2 != null && (cause = th2.getCause()) != null && (message2 = cause.getMessage()) != null) {
            str = message2;
        }
        Map mapO = p013kotlin.collections.v0.o(pairA, pairA2, pairA3, pairA4, jn0.x.a("nfc_error_reason", str));
        if (protocol instanceof I0.b.e) {
            I0.b.e eVar = (I0.b.e) protocol;
            jn0.x.a(mapO.get("available_configs"), eVar.b());
            jn0.x.a(mapO.get("selected_config"), eVar.c());
        }
        jn0.h0 h0Var = jn0.h0.f84049a;
        FourthlineAnalytics.i$default(fourthlineAnalytics, "nfc_inspection_fail", null, mapO, 2, null);
        o0 o0Var = new o0(th2, protocol, document);
        AnalyticsInterface analytics = fourthlineAnalytics.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(o0Var);
        }
    }

    private final String b(I0.a aVar) {
        String strB = aVar.b();
        return strB == null ? "N/A" : strB;
    }

    public void a(I0.a document, Set availableDataGroups, List extractedDataGroups, long j11) {
        p013kotlin.jvm.internal.s.k(document, "document");
        p013kotlin.jvm.internal.s.k(availableDataGroups, "availableDataGroups");
        p013kotlin.jvm.internal.s.k(extractedDataGroups, "extractedDataGroups");
        List listC = c(extractedDataGroups);
        List listB = b(extractedDataGroups);
        Map mapA = a(extractedDataGroups);
        Map mapM = p013kotlin.collections.v0.m(jn0.x.a("issuing_country", b(document)), jn0.x.a(AnalyticsAttribute.DocumentType, a(document)), jn0.x.a("data_groups", availableDataGroups), jn0.x.a("personal_details", listC), jn0.x.a("document_details", listB), jn0.x.a("document_attributes", mapA), jn0.x.a("command_count", Long.valueOf(j11)));
        FourthlineAnalytics fourthlineAnalytics = FourthlineAnalytics.INSTANCE;
        FourthlineAnalytics.i$default(fourthlineAnalytics, "nfc_read_data_success", null, mapM, 2, null);
        q0 q0Var = new q0(document, availableDataGroups, listB, listC, mapA, j11);
        AnalyticsInterface analytics = fourthlineAnalytics.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(q0Var);
        }
    }

    public void a(I0.a document, Set availableDataGroups, List extractedDataGroups, int i11, long j11, Throwable throwable) {
        String message;
        p013kotlin.jvm.internal.s.k(document, "document");
        p013kotlin.jvm.internal.s.k(availableDataGroups, "availableDataGroups");
        p013kotlin.jvm.internal.s.k(extractedDataGroups, "extractedDataGroups");
        p013kotlin.jvm.internal.s.k(throwable, "throwable");
        List listC = c(extractedDataGroups);
        List listB = b(extractedDataGroups);
        Map mapA = a(extractedDataGroups);
        FourthlineAnalytics fourthlineAnalytics = FourthlineAnalytics.INSTANCE;
        Pair pairA = jn0.x.a("issuing_country", b(document));
        Pair pairA2 = jn0.x.a(AnalyticsAttribute.DocumentType, a(document));
        Pair pairA3 = jn0.x.a("data_groups", availableDataGroups);
        Pair pairA4 = jn0.x.a("personal_details", listC);
        Pair pairA5 = jn0.x.a("document_details", listB);
        Pair pairA6 = jn0.x.a("document_attributes", mapA);
        Pair pairA7 = jn0.x.a("command_count", Long.valueOf(j11));
        Pair pairA8 = jn0.x.a("data_group", Integer.valueOf(i11));
        Pair pairA9 = jn0.x.a("nfc_error", throwable.getMessage());
        Throwable cause = throwable.getCause();
        if (cause == null || (message = cause.getMessage()) == null) {
            message = "N/A";
        }
        FourthlineAnalytics.i$default(fourthlineAnalytics, "nfc_read_data_fail", null, p013kotlin.collections.v0.m(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, jn0.x.a("nfc_error_reason", message)), 2, null);
        r0 r0Var = new r0(throwable, document, availableDataGroups, listB, listC, mapA, j11, i11);
        AnalyticsInterface analytics = fourthlineAnalytics.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(r0Var);
        }
    }

    private final String a(Enum r11) {
        String strName = r11.name();
        Locale ROOT = Locale.ROOT;
        p013kotlin.jvm.internal.s.j(ROOT, "ROOT");
        String lowerCase = strName.toLowerCase(ROOT);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private final String a(I0.a aVar) {
        String strA;
        DocumentType documentTypeA = aVar.a();
        return (documentTypeA == null || (strA = a(documentTypeA)) == null) ? "N/A" : strA;
    }
}
