package androidx.media3.exoplayer.mediacodec;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.google.common.collect.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p7.g0;
import p7.u;
import s7.q0;
import s7.t;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"InlinedApi"})
public final class MediaCodecUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashMap<b, List<j>> f10491a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f10492b = -1;

    public static class DecoderQueryException extends Exception {
        private DecoderQueryException(Throwable th2) {
            super("Failed to query underlying media codecs", th2);
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f10494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f10495c;

        public b(String str, boolean z11, boolean z12) {
            this.f10493a = str;
            this.f10494b = z11;
            this.f10495c = z12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == b.class) {
                b bVar = (b) obj;
                if (TextUtils.equals(this.f10493a, bVar.f10493a) && this.f10494b == bVar.f10494b && this.f10495c == bVar.f10495c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f10493a.hashCode() + 31) * 31) + (this.f10494b ? 1231 : 1237)) * 31) + (this.f10495c ? 1231 : 1237);
        }
    }

    private interface c {
        boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        MediaCodecInfo b(int i11);

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    private static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f10496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private MediaCodecInfo[] f10497b;

        public d(boolean z11, boolean z12, boolean z13) {
            this.f10496a = (z11 || z12 || z13) ? 1 : 0;
        }

        @EnsuresNonNull({"mediaCodecInfos"})
        private void f() {
            if (this.f10497b == null) {
                this.f10497b = new MediaCodecList(this.f10496a).getCodecInfos();
            }
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public MediaCodecInfo b(int i11) {
            f();
            return this.f10497b[i11];
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public int d() {
            f();
            return this.f10497b.length;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
        public boolean e() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface e<T> {
        int a(T t11);
    }

    private static <T> void A(List<T> list, final e<T> eVar) {
        Collections.sort(list, new Comparator() { // from class: androidx.media3.exoplayer.mediacodec.o
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MediaCodecUtil.a(eVar, obj, obj2);
            }
        });
    }

    public static /* synthetic */ int a(e eVar, Object obj, Object obj2) {
        return eVar.a(obj2) - eVar.a(obj);
    }

    public static /* synthetic */ int b(j jVar) {
        return (jVar.f10563i ? 2 : 0) + (!jVar.f10564j ? 1 : 0);
    }

    public static /* synthetic */ int c(u uVar, j jVar) {
        return jVar.o(uVar) ? 1 : 0;
    }

    public static /* synthetic */ int d(j jVar) {
        String str = jVar.f10555a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    private static void e(String str, List<j> list) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && list.size() == 1 && list.get(0).f10555a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(j.E("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            A(list, new e() { // from class: androidx.media3.exoplayer.mediacodec.m
                @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.e
                public final int a(Object obj) {
                    return MediaCodecUtil.d((j) obj);
                }
            });
        }
        if (Build.VERSION.SDK_INT >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).f10555a)) {
            return;
        }
        list.add(list.remove(0));
    }

    public static String f(u uVar) {
        Pair<Integer, Integer> pairI;
        if ("audio/eac3-joc".equals(uVar.f101544o)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(uVar.f101544o) && (pairI = i(uVar)) != null) {
            int iIntValue = ((Integer) pairI.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(uVar.f101544o)) {
            return "video/hevc";
        }
        return null;
    }

    public static List<j> g(l lVar, u uVar, boolean z11, boolean z12) {
        String strF = f(uVar);
        return strF == null ? x.r() : lVar.a(strF, z11, z12);
    }

    private static String h(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    @Deprecated
    public static Pair<Integer, Integer> i(u uVar) {
        return s7.k.s(uVar);
    }

    public static j j(String str, boolean z11, boolean z12) {
        List<j> listK = k(str, z11, z12);
        if (listK.isEmpty()) {
            return null;
        }
        return listK.get(0);
    }

    public static synchronized List<j> k(String str, boolean z11, boolean z12) {
        try {
            b bVar = new b(str, z11, z12);
            HashMap<b, List<j>> map = f10491a;
            List<j> list = map.get(bVar);
            if (list != null) {
                return list;
            }
            ArrayList<j> arrayListL = l(bVar, new d(z11, z12, str.equals("video/mv-hevc")));
            if (z11) {
                arrayListL.isEmpty();
            }
            e(str, arrayListL);
            x xVarN = x.n(arrayListL);
            map.put(bVar, xVarN);
            return xVarN;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    private static ArrayList<j> l(b bVar, c cVar) throws DecoderQueryException {
        String strH;
        String str;
        int i11;
        c cVar2 = cVar;
        try {
            ArrayList<j> arrayList = new ArrayList<>();
            String str2 = bVar.f10493a;
            int iD = cVar2.d();
            boolean zE = cVar2.e();
            int i12 = 0;
            while (i12 < iD) {
                MediaCodecInfo mediaCodecInfoB = cVar2.b(i12);
                if (r(mediaCodecInfoB)) {
                    i11 = i12;
                } else {
                    int i13 = i12;
                    String name = mediaCodecInfoB.getName();
                    if (t(mediaCodecInfoB, name, zE, str2) && (strH = h(mediaCodecInfoB, name, str2)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoB.getCapabilitiesForType(strH);
                            boolean zC = cVar2.c("tunneled-playback", strH, capabilitiesForType);
                            boolean zA = cVar2.a("tunneled-playback", strH, capabilitiesForType);
                            boolean z11 = bVar.f10495c;
                            if ((z11 || !zA) && (!z11 || zC)) {
                                boolean zC2 = cVar2.c("secure-playback", strH, capabilitiesForType);
                                boolean zA2 = cVar2.a("secure-playback", strH, capabilitiesForType);
                                boolean z12 = bVar.f10494b;
                                if ((z12 || !zA2) && (!z12 || zC2)) {
                                    try {
                                        boolean zU = u(mediaCodecInfoB, str2);
                                        boolean zW = w(mediaCodecInfoB, str2);
                                        boolean zY = y(mediaCodecInfoB);
                                        try {
                                            if (zE) {
                                                if (bVar.f10494b != zC2) {
                                                }
                                                str = strH;
                                                i11 = i13;
                                                arrayList.add(j.E(name, str2, str, capabilitiesForType, zU, zW, zY, false, false));
                                            }
                                            arrayList.add(j.E(name, str2, str, capabilitiesForType, zU, zW, zY, false, false));
                                        } catch (Exception e11) {
                                            e = e11;
                                            t.d("MediaCodecUtil", "Failed to query codec " + name + " (" + str + ")");
                                            throw e;
                                        }
                                        if (zE || bVar.f10494b) {
                                            str = strH;
                                            i11 = i13;
                                            if (!zE && zC2) {
                                                try {
                                                    try {
                                                        arrayList.add(j.E(name + ".secure", str2, str, capabilitiesForType, zU, zW, zY, false, true));
                                                        return arrayList;
                                                    } catch (Exception e12) {
                                                        e = e12;
                                                        name = name;
                                                        t.d("MediaCodecUtil", "Failed to query codec " + name + " (" + str + ")");
                                                        throw e;
                                                    }
                                                } catch (Exception e13) {
                                                    e = e13;
                                                }
                                            }
                                        }
                                        str = strH;
                                        i11 = i13;
                                    } catch (Exception e14) {
                                        e = e14;
                                        str = strH;
                                    }
                                } else {
                                    i11 = i13;
                                }
                            } else {
                                i11 = i13;
                            }
                        } catch (Exception e15) {
                            e = e15;
                            str = strH;
                        }
                    } else {
                        i11 = i13;
                    }
                }
                i12 = i11 + 1;
                cVar2 = cVar;
            }
            return arrayList;
        } catch (Exception e16) {
            throw new DecoderQueryException(e16);
        }
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    public static List<j> m(l lVar, u uVar, boolean z11, boolean z12) {
        List<j> listA = lVar.a(uVar.f101544o, z11, z12);
        return x.k().j(listA).j(g(lVar, uVar, z11, z12)).k();
    }

    public static List<j> n(List<j> list, final u uVar) {
        ArrayList arrayList = new ArrayList(list);
        A(arrayList, new e() { // from class: androidx.media3.exoplayer.mediacodec.p
            @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.e
            public final int a(Object obj) {
                return MediaCodecUtil.c(uVar, (j) obj);
            }
        });
        return arrayList;
    }

    public static List<j> o(List<j> list) {
        ArrayList arrayList = new ArrayList(list);
        A(arrayList, new e() { // from class: androidx.media3.exoplayer.mediacodec.n
            @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.e
            public final int a(Object obj) {
                return MediaCodecUtil.b((j) obj);
            }
        });
        return x.n(arrayList);
    }

    public static j p() {
        return j("audio/raw", false, false);
    }

    public static Pair<Integer, Integer> q(u uVar) {
        String strH = t7.h.h(uVar.f101547r);
        if (strH == null) {
            return null;
        }
        return s7.k.v(strH, q0.E1(strH.trim(), "\\."), uVar.E);
    }

    private static boolean r(MediaCodecInfo mediaCodecInfo) {
        return Build.VERSION.SDK_INT >= 29 && s(mediaCodecInfo);
    }

    private static boolean s(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean t(MediaCodecInfo mediaCodecInfo, String str, boolean z11, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        return z11 || !str.endsWith(".secure");
    }

    private static boolean u(MediaCodecInfo mediaCodecInfo, String str) {
        return Build.VERSION.SDK_INT >= 29 ? v(mediaCodecInfo) : !w(mediaCodecInfo, str);
    }

    private static boolean v(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean w(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return x(mediaCodecInfo);
        }
        if (g0.o(str)) {
            return true;
        }
        String strE = ou.c.e(mediaCodecInfo.getName());
        if (strE.startsWith("arc.")) {
            return false;
        }
        return strE.startsWith("omx.google.") || strE.startsWith("omx.ffmpeg.") || (strE.startsWith("omx.sec.") && strE.contains(".sw.")) || strE.equals("omx.qcom.video.decoder.hevcswvdec") || strE.startsWith("c2.android.") || strE.startsWith("c2.google.") || !(strE.startsWith("omx.") || strE.startsWith("c2."));
    }

    private static boolean x(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean y(MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            return z(mediaCodecInfo);
        }
        String strE = ou.c.e(mediaCodecInfo.getName());
        return (strE.startsWith("omx.google.") || strE.startsWith("c2.android.") || strE.startsWith("c2.google.")) ? false : true;
    }

    private static boolean z(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }
}
