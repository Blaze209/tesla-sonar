package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.core.DocumentTypeKt;
import java.util.Map;

/* JADX INFO: renamed from: com.fourthline.orca.internal.u7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3887u7 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map b(C3936vD c3936vD) {
        Map mapC = p013kotlin.collections.v0.c();
        mapC.put("issuing_country", c3936vD.d());
        mapC.put(AnalyticsAttribute.DocumentType, DocumentTypeKt.toFourthlineValue(c3936vD.c()));
        mapC.put("tilted", c3936vD.a());
        if (c3936vD.b() != null) {
            mapC.put("document_side", c3936vD.b());
        }
        return p013kotlin.collections.v0.b(mapC);
    }
}
