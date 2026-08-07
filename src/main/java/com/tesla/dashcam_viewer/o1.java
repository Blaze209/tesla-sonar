package com.tesla.dashcam_viewer;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\u00020\b2\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\u0004\b\u0016\u0010\nJ#\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u0003J\u001b\u0010\u001f\u001a\u00020\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\u0004\b\u001f\u0010 J5\u0010'\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u001a¢\u0006\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010:\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00101\u001a\u0004\b8\u00103\"\u0004\b9\u00105R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR*\u0010D\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010CR*\u0010F\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010CR*\u0010G\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010CR0\u0010O\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010I0H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bE\u0010L\"\u0004\bM\u0010NR\u0018\u0010Q\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010PR\u0018\u0010R\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010PR\u0018\u0010V\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010X\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010WR*\u0010Y\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010CR\u0018\u0010[\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010ZR\u0018\u0010\\\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010UR\u0018\u0010]\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010ZR\u0014\u0010`\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010_R\u0014\u0010a\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010_R\"\u0010f\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bT\u0010d\"\u0004\bb\u0010eR\"\u0010k\u001a\u00020S8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010g\u001a\u0004\bJ\u0010h\"\u0004\bi\u0010jR\"\u0010m\u001a\u00020S8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010g\u001a\u0004\b<\u0010h\"\u0004\bl\u0010j¨\u0006n"}, d2 = {"Lcom/tesla/dashcam_viewer/o1;", "", "<init>", "()V", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "data", "Ljn0/h0;", "n", "(Ljava/util/ArrayList;)V", "", "", "jsonPayloadEnd", "", "filename", "s", "(Ljava/util/List;ILjava/lang/String;)Ljava/lang/String;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "l", "(Landroid/content/Context;)V", "o", "photoData", "Ljava/io/File;", Action.FILE_ATTRIBUTE, "", "r", "(Ljava/util/List;Ljava/io/File;)Z", "c", "eventPaths", "q", "(Ljava/util/List;)V", "eventPath", "Ljn0/c0;", "startTimestampRelativeMs", "requestDurationMs", "camera", "requestPreviewFrames", "p", "(Ljava/lang/String;JJLjava/lang/String;Z)V", "b", "Landroid/content/Context;", "appContext", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/dashcam_viewer/t;", DateTokenConverter.CONVERTER_KEY, "Lcom/tesla/dashcam_viewer/t;", "k", "()Lcom/tesla/dashcam_viewer/t;", "w", "(Lcom/tesla/dashcam_viewer/t;)V", "streamingCache", "e", "g", "t", "downloadCache", "Lcom/tesla/dashcam_viewer/v;", "f", "Lcom/tesla/dashcam_viewer/v;", IntegerTokenConverter.CONVERTER_KEY, "()Lcom/tesla/dashcam_viewer/v;", "v", "(Lcom/tesla/dashcam_viewer/v;)V", "previewFrameCache", "Ljava/util/ArrayList;", "latestSPS", "h", "latestPPS", "latestSEI", "", "Lcom/tesla/dashcam_viewer/k;", "j", "Ljava/util/Map;", "()Ljava/util/Map;", "setMetadataCache", "(Ljava/util/Map;)V", "metadataCache", "Ljn0/c0;", "lastTimestampEpochMs", "lastFramePTS", "Ljn0/a0;", "m", "Ljn0/a0;", "lastFrameIndex", "Ljava/lang/String;", "lastCamera", "lastFrameMetadata", "Ljava/lang/Boolean;", "isLastFramePreviewFrame", "lastFrameBitrate", "isLastFrameDownloadFrame", "Lwo0/b;", "Lwo0/b;", "flexibleJson", "creationsJson", "u", "Z", "()Z", "(Z)V", "isDownloading", "I", "()I", "setStreamingBitrate-WZ4Q5Ns", "(I)V", "streamingBitrate", "setDownloadBitrate-WZ4Q5Ns", "downloadBitrate", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static Context appContext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static t streamingCache;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static t downloadCache;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static v previewFrameCache;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static ArrayList<Byte> latestSPS;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static ArrayList<Byte> latestPPS;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static ArrayList<Byte> latestSEI;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static jn0.c0 lastTimestampEpochMs;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static jn0.c0 lastFramePTS;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static jn0.a0 lastFrameIndex;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static String lastCamera;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static ArrayList<Byte> lastFrameMetadata;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static Boolean isLastFramePreviewFrame;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static jn0.a0 lastFrameBitrate;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static Boolean isLastFrameDownloadFrame;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static boolean isDownloading;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o1 f55932a = new o1();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("DashcamViewer_Downloader");

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static Map<String, DashcamViewerEventMetadata> metadataCache = new HashMap();

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final wo0.b flexibleJson = wo0.u.b(null, new wn0.l() { // from class: com.tesla.dashcam_viewer.m1
        @Override // wn0.l
        public final Object invoke(Object obj) {
            return o1.e((wo0.d) obj);
        }
    }, 1, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final wo0.b creationsJson = wo0.u.b(null, new wn0.l() { // from class: com.tesla.dashcam_viewer.n1
        @Override // wn0.l
        public final Object invoke(Object obj) {
            return o1.d((wo0.d) obj);
        }
    }, 1, null);

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static int streamingBitrate = 700000;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static int downloadBitrate = 4000000;

    private o1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 d(wo0.d Json) {
        p013kotlin.jvm.internal.s.k(Json, "$this$Json");
        Json.h(true);
        Json.c("Id");
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 e(wo0.d Json) {
        p013kotlin.jvm.internal.s.k(Json, "$this$Json");
        Json.h(true);
        return jn0.h0.f84049a;
    }

    private final void n(ArrayList<Byte> data) {
        String str;
        ArrayList arrayList;
        boolean z11 = false;
        if (!o.c(data)) {
            logger.n("invalid nal start code");
            return;
        }
        Integer numB = o.b(data);
        if (numB != null && numB.intValue() == 7) {
            latestSPS = new ArrayList<>(data.subList(4, data.size()));
            return;
        }
        if (numB != null && numB.intValue() == 8) {
            latestPPS = new ArrayList<>(data.subList(4, data.size()));
            return;
        }
        if ((numB != null && numB.intValue() == 5) || (numB != null && numB.intValue() == 1)) {
            if (latestSPS == null || latestPPS == null) {
                logger.n("received frame without pps/sps");
                return;
            }
            if (lastTimestampEpochMs == null || lastFrameIndex == null || lastCamera == null || lastFrameMetadata == null || lastFramePTS == null || isLastFramePreviewFrame == null) {
                logger.n("received frame without metadata");
                return;
            }
            if (numB != null && numB.intValue() == 5) {
                z11 = true;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(o.a());
            ArrayList<Byte> arrayList3 = latestSPS;
            p013kotlin.jvm.internal.s.h(arrayList3);
            arrayList2.addAll(arrayList3);
            arrayList2.addAll(o.a());
            ArrayList<Byte> arrayList4 = latestPPS;
            p013kotlin.jvm.internal.s.h(arrayList4);
            arrayList2.addAll(arrayList4);
            ArrayList<Byte> arrayList5 = latestSEI;
            if (arrayList5 != null) {
                arrayList2.addAll(o.a());
                arrayList2.addAll(arrayList5);
            }
            arrayList2.addAll(data);
            byte[] bArrI = o.i(jn0.a0.b(arrayList2.size()));
            ArrayList arrayList6 = new ArrayList();
            ArrayList<Byte> arrayList7 = lastFrameMetadata;
            p013kotlin.jvm.internal.s.h(arrayList7);
            arrayList6.addAll(arrayList7);
            arrayList6.addAll(p013kotlin.collections.v.p((byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 27));
            arrayList6.addAll(p013kotlin.collections.n.q1(bArrI));
            arrayList6.addAll(arrayList2);
            Boolean bool = isLastFramePreviewFrame;
            Boolean bool2 = Boolean.TRUE;
            if (p013kotlin.jvm.internal.s.f(bool, bool2)) {
                v vVarI = i();
                jn0.c0 c0Var = lastTimestampEpochMs;
                p013kotlin.jvm.internal.s.h(c0Var);
                long data2 = c0Var.getData();
                jn0.a0 a0Var = lastFrameIndex;
                p013kotlin.jvm.internal.s.h(a0Var);
                long jB = jn0.c0.b(((long) a0Var.getData()) & 4294967295L);
                String str2 = lastCamera;
                p013kotlin.jvm.internal.s.h(str2);
                arrayList = arrayList6;
                vVarI.t(data2, jB, arrayList, str2, (16 & 16) != 0, false);
            } else {
                arrayList = arrayList6;
                if (p013kotlin.jvm.internal.s.f(isLastFrameDownloadFrame, bool2) && x.f56132a.d()) {
                    t tVarG = g();
                    jn0.c0 c0Var2 = lastTimestampEpochMs;
                    p013kotlin.jvm.internal.s.h(c0Var2);
                    long data3 = c0Var2.getData();
                    jn0.a0 a0Var2 = lastFrameIndex;
                    p013kotlin.jvm.internal.s.h(a0Var2);
                    long jB2 = jn0.c0.b(((long) a0Var2.getData()) & 4294967295L);
                    String str3 = lastCamera;
                    p013kotlin.jvm.internal.s.h(str3);
                    t.q(tVarG, data3, jB2, arrayList, str3, false, 16, null);
                } else {
                    t tVarK = k();
                    jn0.c0 c0Var3 = lastTimestampEpochMs;
                    p013kotlin.jvm.internal.s.h(c0Var3);
                    long data4 = c0Var3.getData();
                    jn0.a0 a0Var3 = lastFrameIndex;
                    p013kotlin.jvm.internal.s.h(a0Var3);
                    long jB3 = jn0.c0.b(((long) a0Var3.getData()) & 4294967295L);
                    String str4 = lastCamera;
                    p013kotlin.jvm.internal.s.h(str4);
                    t.q(tVarK, data4, jB3, arrayList, str4, false, 16, null);
                }
            }
            v vVarI2 = i();
            jn0.c0 c0Var4 = lastTimestampEpochMs;
            p013kotlin.jvm.internal.s.h(c0Var4);
            long data5 = c0Var4.getData();
            jn0.c0 c0Var5 = lastTimestampEpochMs;
            p013kotlin.jvm.internal.s.h(c0Var5);
            long data6 = c0Var5.getData();
            jn0.c0 c0Var6 = lastFramePTS;
            p013kotlin.jvm.internal.s.h(c0Var6);
            long jB4 = jn0.c0.b(data6 + c0Var6.getData());
            String str5 = lastCamera;
            p013kotlin.jvm.internal.s.h(str5);
            boolean zS = vVarI2.s(data5, jB4, str5);
            if (z11 && p013kotlin.jvm.internal.s.f(isLastFramePreviewFrame, Boolean.FALSE) && !zS) {
                v vVarI3 = i();
                jn0.c0 c0Var7 = lastTimestampEpochMs;
                p013kotlin.jvm.internal.s.h(c0Var7);
                long data7 = c0Var7.getData();
                jn0.c0 c0Var8 = lastFramePTS;
                p013kotlin.jvm.internal.s.h(c0Var8);
                long jA = u.a(c0Var8.getData(), jn0.c0.b(((long) 1000) & 4294967295L));
                String str6 = lastCamera;
                p013kotlin.jvm.internal.s.h(str6);
                vVarI3.t(data7, jA, arrayList, str6, false, true);
            }
            lastTimestampEpochMs = null;
            lastFrameIndex = null;
            lastCamera = null;
            lastFrameMetadata = null;
            isLastFramePreviewFrame = null;
            latestSEI = null;
            return;
        }
        if ((numB != null && numB.intValue() == 31) || (numB != null && numB.intValue() == 28)) {
            x xVar = x.f56132a;
            if (data.size() == (xVar.d() ? 34 : 30)) {
                isLastFramePreviewFrame = Boolean.valueOf(numB != null && numB.intValue() == 28);
                lastFrameMetadata = new ArrayList<>(data);
                lastTimestampEpochMs = jn0.c0.a(o.g(data, 9, 17));
                lastFrameIndex = jn0.a0.a(o.e(data, 17, 21));
                lastFramePTS = jn0.c0.a(o.g(data, 21, 29));
                t.Companion companion = t.INSTANCE;
                Byte b11 = data.get(29);
                p013kotlin.jvm.internal.s.j(b11, "get(...)");
                lastCamera = companion.a(jn0.y.b(b11.byteValue()));
                if (xVar.d()) {
                    jn0.a0 a0VarA = jn0.a0.a(o.e(data, 30, 34));
                    lastFrameBitrate = a0VarA;
                    int iF = f();
                    if (a0VarA != null && a0VarA.getData() == iF) {
                        z11 = true;
                    }
                    isLastFrameDownloadFrame = Boolean.valueOf(z11);
                    return;
                }
                return;
            }
            com.tesla.logging.g gVar = logger;
            String str7 = "unexpected 1F/1C NAL unit size " + data.size();
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g(str7);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            return;
        }
        if (numB != null && numB.intValue() == 6) {
            if (data.size() > 16 && data.get(5).byteValue() == 5 && data.get(7).byteValue() == 66) {
                latestSEI = new ArrayList<>(data.subList(4, data.size()));
                return;
            }
            return;
        }
        if (numB != null && numB.intValue() == 9) {
            return;
        }
        if (numB == null || numB.intValue() != 30) {
            if ((numB == null || numB.intValue() != 29) && (numB == null || numB.intValue() != 26)) {
                logger.n("unexpected NAL unit type " + numB);
                return;
            }
            if (data.size() != 26) {
                logger.n("unexpected 0x1D/0x1A NAL unit size " + data.size());
                return;
            }
            boolean z12 = numB != null && numB.intValue() == 26;
            long jG = o.g(data, 9, 17);
            int iE = o.e(data, 17, 21);
            int iE2 = o.e(data, 21, 25);
            Byte b12 = data.get(25);
            p013kotlin.jvm.internal.s.j(b12, "get(...)");
            byte b13 = jn0.y.b(b12.byteValue());
            String strA = t.INSTANCE.a(b13);
            if (strA == null || strA.length() == 0) {
                com.tesla.logging.g gVar2 = logger;
                String str8 = "invalid camera index (0x1D/0x1A unit): " + jn0.y.e(b13);
                TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                String tag2 = gVar2.getTag();
                String strG2 = gVar2.g(str8);
                zb0.a aVar2 = zb0.a.f128044a;
                Map mapF2 = p013kotlin.collections.v0.f(jn0.x.a(tag2, strG2));
                FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry2 : mapF2.entrySet()) {
                    zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
                }
                firebaseCrashlytics2.recordException(new Exception(strG2));
                TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
                vr0.a.INSTANCE.a(strG2, new Object[0]);
                return;
            }
            logger.j("received gap (0x1D/0x1A unit): ts=" + jn0.c0.f(jG) + " startIndex=" + jn0.a0.e(iE) + " endIndex=" + jn0.a0.e(iE2) + " cameraName=" + strA);
            while (jn0.j0.b(iE, iE2) < 0) {
                if (z12) {
                    str = strA;
                    i().t(jG, jn0.c0.b(((long) iE) & 4294967295L), p013kotlin.collections.v.m(), str, (16 & 16) != 0, false);
                } else {
                    str = strA;
                    if (p013kotlin.jvm.internal.s.f(isLastFrameDownloadFrame, Boolean.TRUE) && x.f56132a.d()) {
                        t.q(g(), jG, jn0.c0.b(((long) iE) & 4294967295L), p013kotlin.collections.v.m(), str, false, 16, null);
                    } else {
                        t.q(k(), jG, jn0.c0.b(((long) iE) & 4294967295L), p013kotlin.collections.v.m(), str, false, 16, null);
                    }
                }
                iE++;
                strA = str;
            }
            return;
        }
        if (data.size() <= 13) {
            logger.n("unexpected 1E NAL unit size " + data.size());
            return;
        }
        int iE3 = o.e(data, 9, 13) + 13;
        if (iE3 > data.size()) {
            logger.n("1E NAL unit json payload size exceeds payload size " + data.size());
            return;
        }
        List<Byte> listSubList = data.subList(13, iE3);
        p013kotlin.jvm.internal.s.j(listSubList, "subList(...)");
        String str9 = new String(p013kotlin.collections.v.g1(listSubList), p013kotlin.text.d.UTF_8);
        com.tesla.logging.g gVar3 = logger;
        gVar3.j("decode json, jsonStr: " + str9);
        if (p013kotlin.text.t.h0(str9, "TotalDurationMs", false, 2, null)) {
            try {
                wo0.b bVar = flexibleJson;
                bVar.getSerializersModule();
                DashcamViewerEventMetadata dashcamViewerEventMetadata = (DashcamViewerEventMetadata) bVar.d(DashcamViewerEventMetadata.INSTANCE.serializer(), str9);
                List<Byte> listSubList2 = data.subList(iE3, data.size());
                List listP = p013kotlin.collections.v.p((byte) -119, (byte) 80, (byte) 78, (byte) 71, (byte) 13, (byte) 10, (byte) 26, (byte) 10);
                if ((listSubList2 != null ? listSubList2.size() : 0) <= listP.size()) {
                    listSubList2 = null;
                } else if (!p013kotlin.jvm.internal.s.f(listSubList2 != null ? listSubList2.subList(0, listP.size()) : null, listP)) {
                    gVar3.n("1E NAL unit thumbnail has unexpected header");
                    listSubList2 = null;
                }
                String name = dashcamViewerEventMetadata.getName();
                if (name != null && name.length() != 0) {
                    dashcamViewerEventMetadata.i(listSubList2);
                    metadataCache.put(name, dashcamViewerEventMetadata);
                    RNH264Stream.INSTANCE.receiveMetadatas(p013kotlin.collections.v.e(dashcamViewerEventMetadata));
                    gVar3.j("received event metadata: " + name + " thumbnailSize=" + (listSubList2 != null ? Integer.valueOf(listSubList2.size()) : null));
                    return;
                }
                TeslaLog teslaLog3 = TeslaLog.INSTANCE;
                String tag3 = gVar3.getTag();
                String strG3 = gVar3.g("event metadata has no path");
                zb0.a aVar3 = zb0.a.f128044a;
                Map mapF3 = p013kotlin.collections.v0.f(jn0.x.a(tag3, strG3));
                FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry3 : mapF3.entrySet()) {
                    zb0.a.f128044a.a((String) entry3.getKey(), (String) entry3.getValue());
                }
                firebaseCrashlytics3.recordException(new Exception(strG3));
                TeslaLog.setTag$default(teslaLog3, tag3, false, 2, null);
                vr0.a.INSTANCE.a(strG3, new Object[0]);
                return;
            } catch (SerializationException e11) {
                com.tesla.logging.g gVar4 = logger;
                TeslaLog teslaLog4 = TeslaLog.INSTANCE;
                String tag4 = gVar4.getTag();
                String strG4 = gVar4.g("error decoding metadata json: " + e11);
                zb0.a aVar4 = zb0.a.f128044a;
                Map mapF4 = p013kotlin.collections.v0.f(jn0.x.a(tag4, strG4));
                FirebaseCrashlytics firebaseCrashlytics4 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry4 : mapF4.entrySet()) {
                    zb0.a.f128044a.a((String) entry4.getKey(), (String) entry4.getValue());
                }
                firebaseCrashlytics4.recordException(new Exception(strG4));
                TeslaLog.setTag$default(teslaLog4, tag4, false, 2, null);
                vr0.a.INSTANCE.a(strG4, new Object[0]);
                return;
            }
        }
        if (p013kotlin.text.t.h0(str9, "SentryClips", false, 2, null)) {
            try {
                wo0.b bVar2 = flexibleJson;
                bVar2.getSerializersModule();
                DashcamViewerEventList dashcamViewerEventList = (DashcamViewerEventList) bVar2.d(DashcamViewerEventList.INSTANCE.serializer(), str9);
                String error = dashcamViewerEventList.getError();
                if (error != null && error.length() != 0) {
                    gVar3.j("received event list error - " + error);
                    RNH264Stream rNH264Stream = RNH264Stream.INSTANCE;
                    n nVarA = n.INSTANCE.a(error);
                    if (nVarA == null) {
                        nVarA = n.UNKNOWN_ERROR;
                    }
                    rNH264Stream.setDashcamViewerStatus(nVarA);
                    return;
                }
                gVar3.j("received event list, set RNH264Stream's dashcamViewerStatus & eventList");
                RNH264Stream rNH264Stream2 = RNH264Stream.INSTANCE;
                rNH264Stream2.setDashcamViewerStatus(n.CONNECTED_LOADED);
                rNH264Stream2.setEventList(dashcamViewerEventList);
                return;
            } catch (SerializationException e12) {
                com.tesla.logging.g gVar5 = logger;
                TeslaLog teslaLog5 = TeslaLog.INSTANCE;
                String tag5 = gVar5.getTag();
                String strG5 = gVar5.g("error decoding event list json: " + e12);
                zb0.a aVar5 = zb0.a.f128044a;
                Map mapF5 = p013kotlin.collections.v0.f(jn0.x.a(tag5, strG5));
                FirebaseCrashlytics firebaseCrashlytics5 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry5 : mapF5.entrySet()) {
                    zb0.a.f128044a.a((String) entry5.getKey(), (String) entry5.getValue());
                }
                firebaseCrashlytics5.recordException(new Exception(strG5));
                TeslaLog.setTag$default(teslaLog5, tag5, false, 2, null);
                vr0.a.INSTANCE.a(strG5, new Object[0]);
                return;
            }
        }
        if (p013kotlin.text.t.h0(str9, "Id", false, 2, null) && (p013kotlin.text.t.h0(str9, "sketchpad_list", false, 2, null) || p013kotlin.text.t.h0(str9, "sketchpad_image", false, 2, null) || p013kotlin.text.t.h0(str9, "sketchpad_thumbnail", false, 2, null))) {
            try {
                wo0.b bVar3 = creationsJson;
                bVar3.getSerializersModule();
                k1 k1Var = (k1) bVar3.d(k1.INSTANCE.serializer(), str9);
                if (k1Var instanceof SketchpadListResponse) {
                    RNH264StreamEvents.receiveSketchpadResponse$default(RNH264StreamEvents.INSTANCE, k1Var, f1.f55840a.W(), null, 4, null);
                    return;
                }
                if (k1Var instanceof SketchpadImageResponse) {
                    String strS = s(data, iE3, ((SketchpadImageResponse) k1Var).getFilename());
                    if (strS != null) {
                        RNH264StreamEvents.INSTANCE.receiveSketchpadResponse(k1Var, f1.f55840a.W(), strS);
                        return;
                    }
                    TeslaLog teslaLog6 = TeslaLog.INSTANCE;
                    String tag6 = gVar3.getTag();
                    String strG6 = gVar3.g("failed to save sketchpad image to disk");
                    zb0.a aVar6 = zb0.a.f128044a;
                    Map mapF6 = p013kotlin.collections.v0.f(jn0.x.a(tag6, strG6));
                    FirebaseCrashlytics firebaseCrashlytics6 = FirebaseCrashlytics.getInstance();
                    for (Map.Entry entry6 : mapF6.entrySet()) {
                        zb0.a.f128044a.a((String) entry6.getKey(), (String) entry6.getValue());
                    }
                    firebaseCrashlytics6.recordException(new Exception(strG6));
                    TeslaLog.setTag$default(teslaLog6, tag6, false, 2, null);
                    vr0.a.INSTANCE.a(strG6, new Object[0]);
                    return;
                }
                if (!(k1Var instanceof SketchpadThumbnailResponse)) {
                    throw new NoWhenBranchMatchedException();
                }
                String strS2 = s(data, iE3, ((SketchpadThumbnailResponse) k1Var).getFilename());
                if (strS2 != null) {
                    RNH264StreamEvents.INSTANCE.receiveSketchpadResponse(k1Var, f1.f55840a.W(), strS2);
                    return;
                }
                TeslaLog teslaLog7 = TeslaLog.INSTANCE;
                String tag7 = gVar3.getTag();
                String strG7 = gVar3.g("failed to save sketchpad thumbnail to disk");
                zb0.a aVar7 = zb0.a.f128044a;
                Map mapF7 = p013kotlin.collections.v0.f(jn0.x.a(tag7, strG7));
                FirebaseCrashlytics firebaseCrashlytics7 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry7 : mapF7.entrySet()) {
                    zb0.a.f128044a.a((String) entry7.getKey(), (String) entry7.getValue());
                }
                firebaseCrashlytics7.recordException(new Exception(strG7));
                TeslaLog.setTag$default(teslaLog7, tag7, false, 2, null);
                vr0.a.INSTANCE.a(strG7, new Object[0]);
                return;
            } catch (SerializationException e13) {
                com.tesla.logging.g gVar6 = logger;
                TeslaLog teslaLog8 = TeslaLog.INSTANCE;
                String tag8 = gVar6.getTag();
                String strG8 = gVar6.g("error decoding sketchpad json: " + e13);
                zb0.a aVar8 = zb0.a.f128044a;
                Map mapF8 = p013kotlin.collections.v0.f(jn0.x.a(tag8, strG8));
                FirebaseCrashlytics firebaseCrashlytics8 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry8 : mapF8.entrySet()) {
                    zb0.a.f128044a.a((String) entry8.getKey(), (String) entry8.getValue());
                }
                firebaseCrashlytics8.recordException(new Exception(strG8));
                TeslaLog.setTag$default(teslaLog8, tag8, false, 2, null);
                vr0.a.INSTANCE.a(strG8, new Object[0]);
                return;
            }
        }
        if (!p013kotlin.text.t.h0(str9, "Id", false, 2, null)) {
            TeslaLog teslaLog9 = TeslaLog.INSTANCE;
            String tag9 = gVar3.getTag();
            String strG9 = gVar3.g("unknown json object");
            zb0.a aVar9 = zb0.a.f128044a;
            Map mapF9 = p013kotlin.collections.v0.f(jn0.x.a(tag9, strG9));
            FirebaseCrashlytics firebaseCrashlytics9 = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry9 : mapF9.entrySet()) {
                zb0.a.f128044a.a((String) entry9.getKey(), (String) entry9.getValue());
            }
            firebaseCrashlytics9.recordException(new Exception(strG9));
            TeslaLog.setTag$default(teslaLog9, tag9, false, 2, null);
            vr0.a.INSTANCE.a(strG9, new Object[0]);
            return;
        }
        try {
            wo0.b bVar4 = creationsJson;
            bVar4.getSerializersModule();
            a0 a0Var4 = (a0) bVar4.d(a0.INSTANCE.serializer(), str9);
            if (a0Var4 instanceof PhotoBoothListResponse) {
                RNH264StreamEvents.receivePhotoBoothResponse$default(RNH264StreamEvents.INSTANCE, a0Var4, f1.f55840a.W(), null, 4, null);
                return;
            }
            if (a0Var4 instanceof PhotoBoothImageResponse) {
                List<Byte> listSubList3 = data.subList(iE3, data.size());
                p013kotlin.jvm.internal.s.j(listSubList3, "subList(...)");
                Context context = appContext;
                if (context == null) {
                    p013kotlin.jvm.internal.s.B("appContext");
                    context = null;
                }
                File cacheDir = context.getCacheDir();
                f1 f1Var = f1.f55840a;
                File file = new File(cacheDir, "photobooth/" + f1Var.W());
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(file, ((PhotoBoothImageResponse) a0Var4).getFilename());
                if (r(listSubList3, file2)) {
                    RNH264StreamEvents.INSTANCE.receivePhotoBoothResponse(a0Var4, f1Var.W(), "file://" + file2.getAbsolutePath());
                    return;
                }
                TeslaLog teslaLog10 = TeslaLog.INSTANCE;
                String tag10 = gVar3.getTag();
                String strG10 = gVar3.g("failed to save photo booth image to disk");
                zb0.a aVar10 = zb0.a.f128044a;
                Map mapF10 = p013kotlin.collections.v0.f(jn0.x.a(tag10, strG10));
                FirebaseCrashlytics firebaseCrashlytics10 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry10 : mapF10.entrySet()) {
                    zb0.a.f128044a.a((String) entry10.getKey(), (String) entry10.getValue());
                }
                firebaseCrashlytics10.recordException(new Exception(strG10));
                TeslaLog.setTag$default(teslaLog10, tag10, false, 2, null);
                vr0.a.INSTANCE.a(strG10, new Object[0]);
                return;
            }
            if (!(a0Var4 instanceof PhotoBoothThumbnailResponse)) {
                throw new NoWhenBranchMatchedException();
            }
            List<Byte> listSubList4 = data.subList(iE3, data.size());
            p013kotlin.jvm.internal.s.j(listSubList4, "subList(...)");
            Context context2 = appContext;
            if (context2 == null) {
                p013kotlin.jvm.internal.s.B("appContext");
                context2 = null;
            }
            File cacheDir2 = context2.getCacheDir();
            f1 f1Var2 = f1.f55840a;
            File file3 = new File(cacheDir2, "photobooth/" + f1Var2.W());
            if (!file3.exists()) {
                file3.mkdirs();
            }
            File file4 = new File(file3, ((PhotoBoothThumbnailResponse) a0Var4).getFilename());
            if (r(listSubList4, file4)) {
                RNH264StreamEvents.INSTANCE.receivePhotoBoothResponse(a0Var4, f1Var2.W(), "file://" + file4.getAbsolutePath());
                return;
            }
            TeslaLog teslaLog11 = TeslaLog.INSTANCE;
            String tag11 = gVar3.getTag();
            String strG11 = gVar3.g("failed to save photo booth image to disk");
            zb0.a aVar11 = zb0.a.f128044a;
            Map mapF11 = p013kotlin.collections.v0.f(jn0.x.a(tag11, strG11));
            FirebaseCrashlytics firebaseCrashlytics11 = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry11 : mapF11.entrySet()) {
                zb0.a.f128044a.a((String) entry11.getKey(), (String) entry11.getValue());
            }
            firebaseCrashlytics11.recordException(new Exception(strG11));
            TeslaLog.setTag$default(teslaLog11, tag11, false, 2, null);
            vr0.a.INSTANCE.a(strG11, new Object[0]);
        } catch (SerializationException e14) {
            com.tesla.logging.g gVar7 = logger;
            TeslaLog teslaLog12 = TeslaLog.INSTANCE;
            String tag12 = gVar7.getTag();
            String strG12 = gVar7.g("error decoding photo booth json: " + e14);
            zb0.a aVar12 = zb0.a.f128044a;
            Map mapF12 = p013kotlin.collections.v0.f(jn0.x.a(tag12, strG12));
            FirebaseCrashlytics firebaseCrashlytics12 = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry12 : mapF12.entrySet()) {
                zb0.a.f128044a.a((String) entry12.getKey(), (String) entry12.getValue());
            }
            firebaseCrashlytics12.recordException(new Exception(strG12));
            TeslaLog.setTag$default(teslaLog12, tag12, false, 2, null);
            vr0.a.INSTANCE.a(strG12, new Object[0]);
        }
    }

    private final String s(List<Byte> data, int jsonPayloadEnd, String filename) {
        List<Byte> listSubList = data.subList(jsonPayloadEnd, data.size());
        Context context = appContext;
        if (context == null) {
            p013kotlin.jvm.internal.s.B("appContext");
            context = null;
        }
        File file = new File(context.getCacheDir(), "sketchpad/" + f1.f55840a.W());
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, filename);
        if (!r(listSubList, file2)) {
            return null;
        }
        return "file://" + file2.getAbsolutePath();
    }

    public final void c() {
        Map<String, DashcamViewerEventMetadata> map = metadataCache;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, DashcamViewerEventMetadata> entry : map.entrySet()) {
            DashcamViewerEventMetadata value = entry.getValue();
            if ((value != null ? value.getName() : null) == null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            metadataCache.remove((String) it.next());
        }
    }

    public final int f() {
        return downloadBitrate;
    }

    public final t g() {
        t tVar = downloadCache;
        if (tVar != null) {
            return tVar;
        }
        p013kotlin.jvm.internal.s.B("downloadCache");
        return null;
    }

    public final Map<String, DashcamViewerEventMetadata> h() {
        return metadataCache;
    }

    public final v i() {
        v vVar = previewFrameCache;
        if (vVar != null) {
            return vVar;
        }
        p013kotlin.jvm.internal.s.B("previewFrameCache");
        return null;
    }

    public final int j() {
        return streamingBitrate;
    }

    public final t k() {
        t tVar = streamingCache;
        if (tVar != null) {
            return tVar;
        }
        p013kotlin.jvm.internal.s.B("streamingCache");
        return null;
    }

    public final void l(Context context) {
        Context context2;
        Context context3;
        p013kotlin.jvm.internal.s.k(context, "context");
        appContext = context.getApplicationContext();
        Context context4 = appContext;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (context4 == null) {
            p013kotlin.jvm.internal.s.B("appContext");
            context2 = null;
        } else {
            context2 = context4;
        }
        w(new t(0, 24, false, context2, null));
        Context context5 = appContext;
        if (context5 == null) {
            p013kotlin.jvm.internal.s.B("appContext");
            context3 = null;
        } else {
            context3 = context5;
        }
        t(new t(0, 24, true, context3, null));
        Context context6 = appContext;
        if (context6 == null) {
            p013kotlin.jvm.internal.s.B("appContext");
            context6 = null;
        }
        v(new v(0, 24, context6, defaultConstructorMarker));
    }

    public final boolean m() {
        return isDownloading;
    }

    public final void o(ArrayList<Byte> data) {
        p013kotlin.jvm.internal.s.k(data, "data");
        Iterator<ArrayList<Byte>> it = t.INSTANCE.d(data).iterator();
        p013kotlin.jvm.internal.s.j(it, "iterator(...)");
        while (it.hasNext()) {
            ArrayList<Byte> next = it.next();
            p013kotlin.jvm.internal.s.j(next, "next(...)");
            n(next);
        }
    }

    public final void p(String eventPath, long startTimestampRelativeMs, long requestDurationMs, String camera, boolean requestPreviewFrames) {
        String str;
        p013kotlin.jvm.internal.s.k(eventPath, "eventPath");
        p013kotlin.jvm.internal.s.k(camera, "camera");
        String str2 = requestPreviewFrames ? "play_keyframes" : "play_event";
        if (x.f56132a.d()) {
            int iF = isDownloading ? f() : j();
            str = str2 + ":" + eventPath + ":" + jn0.c0.f(startTimestampRelativeMs) + ":" + jn0.c0.f(requestDurationMs) + ":" + camera + ":" + jn0.a0.e(iF) + "\n";
        } else {
            str = str2 + ":" + eventPath + ":" + jn0.c0.f(startTimestampRelativeMs) + ":" + jn0.c0.f(requestDurationMs) + ":" + camera + "\n";
        }
        logger.j("requestFrames " + str);
        byte[] bytes = str.getBytes(p013kotlin.text.d.UTF_8);
        p013kotlin.jvm.internal.s.j(bytes, "getBytes(...)");
        f1.f55840a.n0(bytes);
    }

    public final void q(List<String> eventPaths) {
        p013kotlin.jvm.internal.s.k(eventPaths, "eventPaths");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str : eventPaths) {
            if (metadataCache.keySet().contains(str)) {
                DashcamViewerEventMetadata dashcamViewerEventMetadata = metadataCache.get(str);
                String name = dashcamViewerEventMetadata != null ? dashcamViewerEventMetadata.getName() : null;
                List<Byte> listF = dashcamViewerEventMetadata != null ? dashcamViewerEventMetadata.f() : null;
                if (name != null && listF != null) {
                    arrayList2.add(dashcamViewerEventMetadata);
                }
            } else {
                metadataCache.put(str, null);
                arrayList.add(str);
            }
        }
        if (!arrayList2.isEmpty()) {
            RNH264Stream.INSTANCE.receiveMetadatas(arrayList2);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        String str2 = "metadata:" + p013kotlin.collections.v.y0(arrayList, ",", null, null, 0, null, null, 62, null) + "\n";
        com.tesla.logging.g gVar = logger;
        gVar.j("requestMetadata metadataCmd: " + str2);
        byte[] bytes = str2.getBytes(p013kotlin.text.d.UTF_8);
        p013kotlin.jvm.internal.s.j(bytes, "getBytes(...)");
        if (f1.f55840a.l0(bytes)) {
            return;
        }
        gVar.j("requestMetadata failed");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            metadataCache.remove((String) it.next());
        }
    }

    public final boolean r(List<Byte> photoData, File file) {
        p013kotlin.jvm.internal.s.k(photoData, "photoData");
        p013kotlin.jvm.internal.s.k(file, "file");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(p013kotlin.collections.v.g1(photoData));
                jn0.h0 h0Var = jn0.h0.f84049a;
                sn0.b.a(fileOutputStream, null);
                return true;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Exception e11) {
            com.tesla.logging.g gVar = logger;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("saveImageDataToDisk error: " + e11);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            return false;
        }
    }

    public final void t(t tVar) {
        p013kotlin.jvm.internal.s.k(tVar, "<set-?>");
        downloadCache = tVar;
    }

    public final void u(boolean z11) {
        isDownloading = z11;
    }

    public final void v(v vVar) {
        p013kotlin.jvm.internal.s.k(vVar, "<set-?>");
        previewFrameCache = vVar;
    }

    public final void w(t tVar) {
        p013kotlin.jvm.internal.s.k(tVar, "<set-?>");
        streamingCache = tVar;
    }
}
