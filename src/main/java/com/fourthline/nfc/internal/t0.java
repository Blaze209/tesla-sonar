package com.fourthline.nfc.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.core.DocumentType;
import java.util.Locale;
import java.util.Map;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public abstract class t0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(Throwable th2) {
        String message;
        String simpleName = th2 != null ? th2.getClass().getSimpleName() : AnalyticsAttribute.NotAvailable;
        if (th2 != null && (message = th2.getMessage()) != null) {
            String str = simpleName + ": " + message;
            if (str != null) {
                return str;
            }
        }
        return simpleName;
    }

    private static final String a(Enum r11) {
        String strName = r11.name();
        Locale ROOT = Locale.ROOT;
        p013kotlin.jvm.internal.s.j(ROOT, "ROOT");
        String lowerCase = strName.toLowerCase(ROOT);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map b(I0.b bVar) {
        Map mapC = p013kotlin.collections.v0.c();
        mapC.put("auth_protocol", bVar.a());
        if (bVar instanceof I0.b.e) {
            I0.b.e eVar = (I0.b.e) bVar;
            Object objB = eVar.b();
            String str = AnalyticsAttribute.NotAvailable;
            if (objB == null) {
                objB = AnalyticsAttribute.NotAvailable;
            }
            mapC.put("available_configs", objB);
            String strC = eVar.c();
            if (strC != null) {
                str = strC;
            }
            mapC.put("selected_config", str);
        }
        return p013kotlin.collections.v0.b(mapC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map b(I0.a aVar) {
        String strA;
        String strB = aVar.b();
        String str = AnalyticsAttribute.NotAvailable;
        if (strB == null) {
            strB = AnalyticsAttribute.NotAvailable;
        }
        Pair pairA = jn0.x.a(AnalyticsAttribute.DocumentCountry, strB);
        DocumentType documentTypeA = aVar.a();
        if (documentTypeA != null && (strA = a(documentTypeA)) != null) {
            str = strA;
        }
        return p013kotlin.collections.v0.m(pairA, jn0.x.a(AnalyticsAttribute.DocumentType, str));
    }
}
