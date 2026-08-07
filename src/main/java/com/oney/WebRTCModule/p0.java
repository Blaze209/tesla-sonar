package com.oney.WebRTCModule;

import android.util.Log;
import java.util.Map;
import org.webrtc.RTCStats;
import org.webrtc.RTCStatsReport;

/* JADX INFO: loaded from: classes6.dex */
public class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f46047a = "p0";

    private static void a(StringBuilder sb2, Object obj) {
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            sb2.append("[");
            for (int i11 = 0; i11 < objArr.length; i11++) {
                if (i11 != 0) {
                    sb2.append(",");
                }
                a(sb2, objArr[i11]);
            }
            sb2.append("]");
            return;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof String)) {
                sb2.append(obj);
                return;
            }
            sb2.append("\"");
            sb2.append(obj);
            sb2.append("\"");
            return;
        }
        try {
            sb2.append("{");
            boolean z11 = true;
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                if (z11) {
                    z11 = false;
                } else {
                    sb2.append(",");
                }
                sb2.append("\"");
                sb2.append((String) entry.getKey());
                sb2.append("\":");
                a(sb2, entry.getValue());
            }
            sb2.append("}");
        } catch (ClassCastException unused) {
            Log.e(f46047a, "Error parsing stats value " + obj);
        }
    }

    public static String b(RTCStatsReport rTCStatsReport) {
        StringBuilder sb2 = new StringBuilder("[");
        Map<String, RTCStats> statsMap = rTCStatsReport.getStatsMap();
        boolean z11 = true;
        for (String str : rTCStatsReport.getStatsMap().keySet()) {
            if (z11) {
                z11 = false;
            } else {
                sb2.append(",");
            }
            sb2.append("[\"");
            sb2.append(str);
            sb2.append("\",{");
            RTCStats rTCStats = statsMap.get(str);
            sb2.append("\"timestamp\":");
            sb2.append(rTCStats.getTimestampUs() / 1000.0d);
            sb2.append(",\"type\":\"");
            sb2.append(rTCStats.getType());
            sb2.append("\",\"id\":\"");
            sb2.append(rTCStats.getId());
            sb2.append("\"");
            for (Map.Entry<String, Object> entry : rTCStats.getMembers().entrySet()) {
                sb2.append(",");
                sb2.append("\"");
                sb2.append(entry.getKey());
                sb2.append("\":");
                a(sb2, entry.getValue());
            }
            sb2.append("}]");
        }
        sb2.append("]");
        return sb2.toString();
    }
}
