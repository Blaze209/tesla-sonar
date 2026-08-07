package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;

/* JADX INFO: renamed from: com.fourthline.orca.internal.np, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3611np {
    private static final ColorElement a(Map map, String str) {
        OrcaPaletteColor orcaPaletteColor = (OrcaPaletteColor) map.get(str);
        return orcaPaletteColor != null ? new ColorElement(orcaPaletteColor.getLight(), orcaPaletteColor.getDark(), null) : ColorElement.INSTANCE.a();
    }

    public static final ColorElement b(Map map) {
        p013kotlin.jvm.internal.s.k(map, "<this>");
        return a(map, "primary");
    }

    public static final ColorElement c(Map map) {
        p013kotlin.jvm.internal.s.k(map, "<this>");
        return a(map, "success");
    }

    public static final ColorElement d(Map map) {
        p013kotlin.jvm.internal.s.k(map, "<this>");
        return a(map, "warning");
    }

    public static final ColorElement a(Map map) {
        p013kotlin.jvm.internal.s.k(map, "<this>");
        return a(map, AnalyticsAttribute.Error);
    }

    public static final ColorElement a(OrcaStylingElements.PageElement pageElement) {
        p013kotlin.jvm.internal.s.k(pageElement, "<this>");
        k3.p1.Companion companion = k3.p1.INSTANCE;
        return new ColorElement(companion.a(), companion.k(), null);
    }

    public static final ColorElement a(OrcaStylingElements.ScannerPageElement scannerPageElement) {
        p013kotlin.jvm.internal.s.k(scannerPageElement, "<this>");
        return ColorElement.INSTANCE.a(k3.p1.p(k3.r1.d(4281545523L), 0.9f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null));
    }

    public static final Fn a(OrcaStylingElements orcaStylingElements) {
        p013kotlin.jvm.internal.s.k(orcaStylingElements, "<this>");
        k3.p1.Companion companion = k3.p1.INSTANCE;
        return new Fn(new ColorElement(companion.k(), k3.r1.d(4278650916L), null), new TextElement(orcaStylingElements.getScanner().getMessage().getTypography(), new ColorElement(k3.r1.d(4283979864L), companion.k(), null)), new ProgressElement(orcaStylingElements.getSpinner().getHighlight(), new ColorElement(k3.r1.d(4292598747L), k3.p1.p(companion.k(), 0.3f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), null), 1.0f), ColorElement.INSTANCE.a(k3.r1.d(4288124823L)));
    }

    public static final float a(int i11, p020r2.l lVar, int i12) {
        lVar.o(-937844263);
        if (p020r2.o.J()) {
            p020r2.o.S(-937844263, i12, -1, "com.fourthline.orca.core.internal.styling.toPx (OrcaStyling.kt:254)");
        }
        float fO1 = ((w4.d) lVar.U(androidx.compose.ui.platform.z0.g())).O1(w4.h.g(i11));
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.l();
        return fO1;
    }
}
