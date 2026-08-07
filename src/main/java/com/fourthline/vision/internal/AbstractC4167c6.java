package com.fourthline.vision.internal;

import android.util.Size;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.analytics.internal.AnalyticsContext;
import java.util.Iterator;
import java.util.Map;
import p013kotlin.Pair;

/* JADX INFO: renamed from: com.fourthline.vision.internal.c6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4167c6 {
    private static final String getClosestResolutionCategory(int i11, int i12) {
        Object obj;
        String str;
        Iterator it = p013kotlin.collections.v0.m(jn0.x.a("HD", new Pair(1280, 720)), jn0.x.a("FHD", new Pair(1920, 1080)), jn0.x.a("QHD", new Pair(2560, 1440)), jn0.x.a("UHD", new Pair(3840, 2160))).entrySet().iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                Pair pair = (Pair) ((Map.Entry) next).getValue();
                int iIntValue = i11 - ((Number) pair.e()).intValue();
                int iIntValue2 = i12 - ((Number) pair.f()).intValue();
                int i13 = (iIntValue * iIntValue) + (iIntValue2 * iIntValue2);
                do {
                    Object next2 = it.next();
                    Pair pair2 = (Pair) ((Map.Entry) next2).getValue();
                    int iIntValue3 = i11 - ((Number) pair2.e()).intValue();
                    int iIntValue4 = i12 - ((Number) pair2.f()).intValue();
                    int i14 = (iIntValue3 * iIntValue3) + (iIntValue4 * iIntValue4);
                    if (i13 > i14) {
                        next = next2;
                        i13 = i14;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Map.Entry entry = (Map.Entry) obj;
        return (entry == null || (str = (String) entry.getKey()) == null) ? AnalyticsAttribute.NotAvailable : str;
    }

    public static final String getThrowableDescription(Throwable th2) {
        p013kotlin.jvm.internal.s.k(th2, "<this>");
        String simpleName = th2.getClass().getSimpleName();
        p013kotlin.jvm.internal.s.j(simpleName, "getSimpleName(...)");
        String message = th2.getMessage();
        if (message != null) {
            String str = simpleName + ": " + message;
            if (str != null) {
                return str;
            }
        }
        return simpleName;
    }

    public static final void setVideoRecordingAttributes(AnalyticsContext analyticsContext, Size resolution, int i11, String codec) {
        p013kotlin.jvm.internal.s.k(analyticsContext, "<this>");
        p013kotlin.jvm.internal.s.k(resolution, "resolution");
        p013kotlin.jvm.internal.s.k(codec, "codec");
        analyticsContext.set(AnalyticsAttribute.Vision.VideoBitrateTarget, Integer.valueOf(i11));
        analyticsContext.set(AnalyticsAttribute.Vision.VideoCodec, toCodecAnalyticsValue(codec));
        analyticsContext.set(AnalyticsAttribute.Vision.VideoResolution, resolution.getWidth() + "x" + resolution.getHeight());
        analyticsContext.set(AnalyticsAttribute.Vision.VideoResolutionTarget, getClosestResolutionCategory(resolution.getHeight(), resolution.getWidth()));
    }

    private static final String toCodecAnalyticsValue(String str) {
        if (p013kotlin.text.t.f0(str, "h264", true)) {
            return "H264";
        }
        if (p013kotlin.text.t.f0(str, "h265", true)) {
            return "H265";
        }
        return p013kotlin.text.t.f0(str, "avc", true) ? "AVC" : AnalyticsAttribute.NotAvailable;
    }
}
