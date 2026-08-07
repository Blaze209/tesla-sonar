package androidx.media3.exoplayer.audio;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import com.google.common.collect.b0;
import com.google.common.collect.d1;
import com.google.common.collect.x;
import com.google.common.collect.z;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p7.g0;
import p7.u;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f9443c = new a(x.s(e.f9448d));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    private static final x<Integer> f9444d = x.u(2, 5, 6);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final z<Integer, Integer> f9445e = new z.a().f(5, 6).f(17, 6).f(7, 6).f(30, 10).f(18, 6).f(6, 8).f(8, 8).f(14, 8).c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray<e> f9446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9447b;

    private static final class b {
        private static b0<Integer> a() {
            b0.a aVarI = new b0.a().i(8, 7);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 31) {
                aVarI.i(26, 27);
            }
            if (i11 >= 33) {
                aVarI.a(30);
            }
            return aVarI.l();
        }

        public static boolean b(AudioManager audioManager, androidx.media3.exoplayer.audio.c cVar) {
            AudioDeviceInfo[] devices = cVar == null ? ((AudioManager) s7.a.f(audioManager)).getDevices(2) : new AudioDeviceInfo[]{cVar.f9467a};
            b0<Integer> b0VarA = a();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (b0VarA.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    private static final class c {
        public static x<Integer> a(p7.d dVar) {
            x.a aVarK = x.k();
            d1<Integer> it = a.f9445e.keySet().iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                int iIntValue = next.intValue();
                if (Build.VERSION.SDK_INT >= q0.N(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), dVar.b().f101245a)) {
                    aVarK.a(next);
                }
            }
            aVarK.a(2);
            return aVarK.k();
        }

        public static int b(int i11, int i12, p7.d dVar) {
            for (int i13 = 10; i13 > 0; i13--) {
                int iQ = q0.Q(i13);
                if (iQ != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i11).setSampleRate(i12).setChannelMask(iQ).build(), dVar.b().f101245a)) {
                    return i13;
                }
            }
            return 0;
        }
    }

    private static final class d {
        public static a a(AudioManager audioManager, p7.d dVar) {
            return new a(a.c(audioManager.getDirectProfilesForAttributes(dVar.b().f101245a)));
        }

        public static androidx.media3.exoplayer.audio.c b(AudioManager audioManager, p7.d dVar) {
            List<AudioDeviceInfo> audioDevicesForAttributes = ((AudioManager) s7.a.f(audioManager)).getAudioDevicesForAttributes(dVar.b().f101245a);
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return new androidx.media3.exoplayer.audio.c(audioDevicesForAttributes.get(0));
        }
    }

    private static boolean b() {
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"WrongConstant"})
    public static x<e> c(List<AudioProfile> list) {
        HashMap map = new HashMap();
        map.put(2, new HashSet(ru.f.c(12)));
        for (int i11 = 0; i11 < list.size(); i11++) {
            AudioProfile audioProfileA = b8.a.a(list.get(i11));
            if (audioProfileA.getEncapsulationType() != 1) {
                int format = audioProfileA.getFormat();
                if (q0.R0(format) || f9445e.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        ((Set) s7.a.f((Set) map.get(Integer.valueOf(format)))).addAll(ru.f.c(audioProfileA.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(ru.f.c(audioProfileA.getChannelMasks())));
                    }
                }
            }
        }
        x.a aVarK = x.k();
        for (Map.Entry entry : map.entrySet()) {
            aVarK.a(new e(((Integer) entry.getKey()).intValue(), (Set<Integer>) entry.getValue()));
        }
        return aVarK.k();
    }

    private static x<e> d(int[] iArr, int i11) {
        x.a aVarK = x.k();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i12 : iArr) {
            aVarK.a(new e(i12, i11));
        }
        return aVarK.k();
    }

    @SuppressLint({"InlinedApi"})
    static a e(Context context, Intent intent, p7.d dVar, androidx.media3.exoplayer.audio.c cVar) {
        AudioManager audioManagerC = q7.f.c(context);
        if (cVar == null) {
            cVar = Build.VERSION.SDK_INT >= 33 ? d.b(audioManagerC, dVar) : null;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33 && (q0.V0(context) || q0.O0(context))) {
            return d.a(audioManagerC, dVar);
        }
        if (b.b(audioManagerC, cVar)) {
            return f9443c;
        }
        b0.a aVar = new b0.a();
        aVar.a(2);
        if (i11 >= 29 && (q0.V0(context) || q0.O0(context))) {
            aVar.j(c.a(dVar));
            return new a(d(ru.f.n(aVar.l()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z11 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z11 || b()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            aVar.j(f9444d);
        }
        if (intent == null || z11 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new a(d(ru.f.n(aVar.l()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            aVar.j(ru.f.c(intArrayExtra));
        }
        return new a(d(ru.f.n(aVar.l()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    @SuppressLint({"UnprotectedReceiver"})
    static a f(Context context, p7.d dVar, androidx.media3.exoplayer.audio.c cVar) {
        return e(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), dVar, cVar);
    }

    private static int g(int i11) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 <= 28) {
            if (i11 == 7) {
                i11 = 8;
            } else if (i11 == 3 || i11 == 4 || i11 == 5) {
                i11 = 6;
            }
        }
        if (i12 <= 26 && "fugu".equals(Build.DEVICE) && i11 == 1) {
            i11 = 2;
        }
        return q0.Q(i11);
    }

    static Uri i() {
        if (b()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return q0.v(this.f9446a, aVar.f9446a) && this.f9447b == aVar.f9447b;
    }

    public Pair<Integer, Integer> h(u uVar, p7.d dVar) {
        int iF = g0.f((String) s7.a.f(uVar.f101544o), uVar.f101540k);
        if (!f9445e.containsKey(Integer.valueOf(iF))) {
            return null;
        }
        if (iF == 18 && !k(18)) {
            iF = 6;
        } else if ((iF == 8 && !k(8)) || (iF == 30 && !k(30))) {
            iF = 7;
        }
        if (!k(iF)) {
            return null;
        }
        e eVar = (e) s7.a.f(this.f9446a.get(iF));
        int iB = uVar.G;
        if (iB == -1 || iF == 18) {
            int i11 = uVar.H;
            if (i11 == -1) {
                i11 = 48000;
            }
            iB = eVar.b(i11, dVar);
        } else if (!uVar.f101544o.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (!eVar.c(iB)) {
                return null;
            }
        } else if (iB > 10) {
            return null;
        }
        int iG = g(iB);
        if (iG == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iF), Integer.valueOf(iG));
    }

    public int hashCode() {
        return this.f9447b + (q0.w(this.f9446a) * 31);
    }

    public boolean j(u uVar, p7.d dVar) {
        return h(uVar, dVar) != null;
    }

    public boolean k(int i11) {
        return q0.t(this.f9446a, i11);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f9447b + ", audioProfiles=" + this.f9446a + "]";
    }

    private a(List<e> list) {
        this.f9446a = new SparseArray<>();
        for (int i11 = 0; i11 < list.size(); i11++) {
            e eVar = list.get(i11);
            this.f9446a.put(eVar.f9449a, eVar);
        }
        int iMax = 0;
        for (int i12 = 0; i12 < this.f9446a.size(); i12++) {
            iMax = Math.max(iMax, this.f9446a.valueAt(i12).f9450b);
        }
        this.f9447b = iMax;
    }

    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f9448d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b0<Integer> f9451c;

        static {
            f9448d = Build.VERSION.SDK_INT >= 33 ? new e(2, a(10)) : new e(2, 10);
        }

        public e(int i11, Set<Integer> set) {
            this.f9449a = i11;
            b0<Integer> b0VarM = b0.m(set);
            this.f9451c = b0VarM;
            d1<Integer> it = b0VarM.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = Math.max(iMax, Integer.bitCount(it.next().intValue()));
            }
            this.f9450b = iMax;
        }

        private static b0<Integer> a(int i11) {
            b0.a aVar = new b0.a();
            for (int i12 = 1; i12 <= i11; i12++) {
                aVar.a(Integer.valueOf(q0.Q(i12)));
            }
            return aVar.l();
        }

        public int b(int i11, p7.d dVar) {
            if (this.f9451c != null) {
                return this.f9450b;
            }
            return Build.VERSION.SDK_INT >= 29 ? c.b(this.f9449a, i11, dVar) : ((Integer) s7.a.f(a.f9445e.getOrDefault(Integer.valueOf(this.f9449a), 0))).intValue();
        }

        public boolean c(int i11) {
            if (this.f9451c == null) {
                return i11 <= this.f9450b;
            }
            int iQ = q0.Q(i11);
            if (iQ == 0) {
                return false;
            }
            return this.f9451c.contains(Integer.valueOf(iQ));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f9449a == eVar.f9449a && this.f9450b == eVar.f9450b && Objects.equals(this.f9451c, eVar.f9451c);
        }

        public int hashCode() {
            int i11 = ((this.f9449a * 31) + this.f9450b) * 31;
            b0<Integer> b0Var = this.f9451c;
            return i11 + (b0Var == null ? 0 : b0Var.hashCode());
        }

        public String toString() {
            return "AudioProfile[format=" + this.f9449a + ", maxChannelCount=" + this.f9450b + ", channelMasks=" + this.f9451c + "]";
        }

        public e(int i11, int i12) {
            this.f9449a = i11;
            this.f9450b = i12;
            this.f9451c = null;
        }
    }
}
