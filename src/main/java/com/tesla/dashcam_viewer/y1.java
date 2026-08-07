package com.tesla.dashcam_viewer;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001#B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u0004\u0018\u00010\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0016J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0016JM\u0010#\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0014¢\u0006\u0004\b%\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010&R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010(R\"\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010-R\u0018\u00100\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00101¨\u00063"}, d2 = {"Lcom/tesla/dashcam_viewer/y1;", "", "", "bufferSize", "<init>", "(I)V", "Lcom/tesla/dashcam_viewer/y1$a;", "stats", "", "", "b", "(Lcom/tesla/dashcam_viewer/y1$a;)Ljava/util/Map;", "", "sortedData", "percentile", "h", "(Ljava/util/List;I)Ljava/lang/Integer;", "", "c", "()J", "Ljn0/h0;", "g", "()V", DateTokenConverter.CONVERTER_KEY, "e", "f", "candidatePairId", "", "totalRoundTripTime", "responsesReceived", "rttSeconds", "bytesTx", "bytesRx", "localType", "remoteType", "a", "(Ljava/lang/String;DIDJJLjava/lang/String;Ljava/lang/String;)V", IntegerTokenConverter.CONVERTER_KEY, "I", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "", "Ljava/util/Map;", "candidatePairStats", "Ljava/lang/Long;", "connectStartTime", "connectedTime", "sessionEndTime", "Ljava/lang/Integer;", "connectToMsgReceivedMs", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int bufferSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final com.tesla.logging.g logger;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Map<String, a> candidatePairStats;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Long connectStartTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Long connectedTime;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Long sessionEndTime;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Integer connectToMsgReceivedMs;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001a\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001d\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\r\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\"\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\t\u0010 \"\u0004\b!\u0010\"R\"\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b\u001b\u0010 \"\u0004\b$\u0010\"R\"\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001f\u001a\u0004\b\u001e\u0010 \"\u0004\b&\u0010\"¨\u0006("}, d2 = {"Lcom/tesla/dashcam_viewer/y1$a;", "", "", "bufferSize", "", "localType", "remoteType", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "b", "g", "Lcom/tesla/dashcam_viewer/e;", "c", "Lcom/tesla/dashcam_viewer/e;", "h", "()Lcom/tesla/dashcam_viewer/e;", "rttBuffer", "", "J", "()J", "k", "(J)V", "bytesTx", "e", "j", "bytesRx", "f", "I", "()I", IntegerTokenConverter.CONVERTER_KEY, "(I)V", "avgRTT", "l", "maxRTT", "m", "minRTT", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String localType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String remoteType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final e<Integer> rttBuffer;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private long bytesTx;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private long bytesRx;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private int avgRTT;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private int maxRTT;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private int minRTT;

        public a(int i11, String localType, String remoteType) {
            p013kotlin.jvm.internal.s.k(localType, "localType");
            p013kotlin.jvm.internal.s.k(remoteType, "remoteType");
            this.localType = localType;
            this.remoteType = remoteType;
            this.rttBuffer = new e<>(i11);
            this.maxRTT = Integer.MIN_VALUE;
            this.minRTT = Integer.MAX_VALUE;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getAvgRTT() {
            return this.avgRTT;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getBytesRx() {
            return this.bytesRx;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getBytesTx() {
            return this.bytesTx;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getLocalType() {
            return this.localType;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getMaxRTT() {
            return this.maxRTT;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getMinRTT() {
            return this.minRTT;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getRemoteType() {
            return this.remoteType;
        }

        public final e<Integer> h() {
            return this.rttBuffer;
        }

        public final void i(int i11) {
            this.avgRTT = i11;
        }

        public final void j(long j11) {
            this.bytesRx = j11;
        }

        public final void k(long j11) {
            this.bytesTx = j11;
        }

        public final void l(int i11) {
            this.maxRTT = i11;
        }

        public final void m(int i11) {
            this.minRTT = i11;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            Object obj = ((Map) t12).get("bytes_rx");
            Long l11 = obj instanceof Long ? (Long) obj : null;
            Long lValueOf = Long.valueOf(l11 != null ? l11.longValue() : 0L);
            Object obj2 = ((Map) t11).get("bytes_rx");
            Long l12 = obj2 instanceof Long ? (Long) obj2 : null;
            return mn0.a.d(lValueOf, Long.valueOf(l12 != null ? l12.longValue() : 0L));
        }
    }

    public y1(int i11) {
        this.bufferSize = i11;
        this.logger = com.tesla.logging.g.INSTANCE.a("DashcamViewer_Stats");
        this.candidatePairStats = new LinkedHashMap();
    }

    private final Map<String, Integer> b(a stats) {
        Map<String, Integer> mapO = p013kotlin.collections.v0.o(jn0.x.a("rtt_avg", Integer.valueOf(stats.getAvgRTT())), jn0.x.a("rtt_max", Integer.valueOf(stats.getMaxRTT())), jn0.x.a("rtt_min", Integer.valueOf(stats.getMinRTT())));
        List<Integer> listY0 = p013kotlin.collections.v.Y0(stats.h().a());
        Iterator it = p013kotlin.collections.v.p(10, 20, 30, 40, 50, 60, 70, 80, 90, 95, 99).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            Integer numH = h(listY0, iIntValue);
            if (numH != null) {
                mapO.put("rtt_p" + iIntValue, numH);
            }
        }
        return mapO;
    }

    private final long c() {
        return System.nanoTime();
    }

    private final Integer h(List<Integer> sortedData, int percentile) {
        if (sortedData.isEmpty()) {
            this.logger.j("skip percentileValue: sortedData is empty");
            return null;
        }
        double size = (((double) percentile) / 100.0d) * ((double) (sortedData.size() - 1));
        int iFloor = (int) Math.floor(size);
        int iCeil = (int) Math.ceil(size);
        if (iFloor == iCeil) {
            return sortedData.get(iFloor);
        }
        double d11 = size - ((double) iFloor);
        return Integer.valueOf((int) ((((double) sortedData.get(iFloor).intValue()) * (((double) 1) - d11)) + (((double) sortedData.get(iCeil).intValue()) * d11)));
    }

    public final void a(String candidatePairId, double totalRoundTripTime, int responsesReceived, double rttSeconds, long bytesTx, long bytesRx, String localType, String remoteType) {
        p013kotlin.jvm.internal.s.k(candidatePairId, "candidatePairId");
        p013kotlin.jvm.internal.s.k(localType, "localType");
        p013kotlin.jvm.internal.s.k(remoteType, "remoteType");
        if (bytesTx <= 0 || bytesRx <= 0 || rttSeconds < 0.0d || rttSeconds >= 100.0d) {
            return;
        }
        double d11 = 1000;
        int iC = yn0.a.c(rttSeconds * d11);
        if (this.candidatePairStats.get(candidatePairId) == null) {
            this.candidatePairStats.put(candidatePairId, new a(this.bufferSize, localType, remoteType));
        }
        a aVar = this.candidatePairStats.get(candidatePairId);
        if (aVar == null) {
            this.logger.j("skip addDataPoint stats for " + candidatePairId + " is null");
            return;
        }
        aVar.h().b(Integer.valueOf(iC));
        aVar.k(bytesTx);
        aVar.j(bytesRx);
        aVar.l(bo0.n.f(aVar.getMaxRTT(), iC));
        aVar.m(bo0.n.j(aVar.getMinRTT(), iC));
        aVar.i(yn0.a.c((totalRoundTripTime / ((double) responsesReceived)) * d11));
        this.candidatePairStats.put(candidatePairId, aVar);
    }

    public final void d() {
        if (this.connectedTime == null) {
            Long lValueOf = Long.valueOf(c());
            this.connectedTime = lValueOf;
            this.logger.j("markConnected connectedTime: " + lValueOf);
        }
    }

    public final void e() {
        if (this.connectStartTime == null || this.connectToMsgReceivedMs != null) {
            return;
        }
        long jC = c();
        Long l11 = this.connectStartTime;
        p013kotlin.jvm.internal.s.h(l11);
        long jLongValue = (jC - l11.longValue()) / ((long) 1000000);
        this.connectToMsgReceivedMs = Integer.valueOf(jLongValue > 2147483647L ? Integer.MAX_VALUE : (int) jLongValue);
    }

    public final void f() {
        if (this.connectedTime == null) {
            this.logger.j("skip markSessionEnd since connectedTime is null");
            return;
        }
        if (this.sessionEndTime == null) {
            Long lValueOf = Long.valueOf(c());
            this.sessionEndTime = lValueOf;
            this.logger.j("markSessionEnd sessionEndTime: " + lValueOf);
        }
    }

    public final void g() {
        if (this.connectStartTime != null) {
            return;
        }
        this.connectStartTime = Long.valueOf(c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        int i11;
        if (this.candidatePairStats.isEmpty() || this.connectStartTime == null) {
            this.logger.j("skip sending stats: candidatePairStats: " + this.candidatePairStats.size() + " connectStartTime: " + this.connectStartTime);
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<String, a>> it = this.candidatePairStats.entrySet().iterator();
            while (it.hasNext()) {
                a value = it.next().getValue();
                Map mapO = p013kotlin.collections.v0.o(jn0.x.a("bytes_rx", Long.valueOf(value.getBytesRx())), jn0.x.a("bytes_tx", Long.valueOf(value.getBytesTx())), jn0.x.a("type_local", value.getLocalType()), jn0.x.a("type_remote", value.getRemoteType()));
                for (Map.Entry<String, Integer> entry : b(value).entrySet()) {
                    mapO.put(entry.getKey(), Integer.valueOf(entry.getValue().intValue()));
                }
                arrayList.add(mapO);
            }
            if (arrayList.size() > 1) {
                p013kotlin.collections.v.C(arrayList, new b());
            }
            Long l11 = this.sessionEndTime;
            Long l12 = this.connectedTime;
            if (l11 == null || l12 == null || l11.longValue() < l12.longValue()) {
                i11 = -1;
            } else {
                long jLongValue = (l11.longValue() - l12.longValue()) / ((long) 1000000);
                i11 = jLongValue > 2147483647L ? Integer.MAX_VALUE : (int) jLongValue;
            }
            Pair pairA = jn0.x.a("telemetry_type", "dashcam_viewer");
            Integer num = this.connectToMsgReceivedMs;
            Map mapO2 = p013kotlin.collections.v0.o(pairA, jn0.x.a("start_to_msg_received_ms", Integer.valueOf(num != null ? num.intValue() : -1)), jn0.x.a("total_connected_time_ms", Integer.valueOf(i11)));
            Iterator it2 = arrayList.iterator();
            int i12 = 0;
            while (it2.hasNext()) {
                int i13 = i12 + 1;
                for (Map.Entry entry2 : ((Map) it2.next()).entrySet()) {
                    String str = (String) entry2.getKey();
                    mapO2.put("c" + i12 + "_" + str, entry2.getValue());
                }
                i12 = i13;
            }
            ud0.a.b(mapO2, false, null, 4, null);
            this.logger.j("sent stats: " + mapO2);
        } catch (Exception e11) {
            com.tesla.logging.g gVar = this.logger;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("error sending stats: " + e11);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry3 : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry3.getKey(), (String) entry3.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
        } finally {
            this.connectStartTime = null;
            this.connectToMsgReceivedMs = null;
            this.connectedTime = null;
            this.sessionEndTime = null;
            this.candidatePairStats.clear();
        }
    }

    public /* synthetic */ y1(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 1000 : i11);
    }
}
