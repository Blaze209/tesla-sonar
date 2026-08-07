package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.provider.Settings;
import android.util.Pair;
import com.google.android.exoplayer2.u0;
import com.google.common.collect.b0;
import com.google.common.collect.d1;
import com.google.common.collect.x;
import com.google.common.collect.z;
import java.util.Arrays;
import org.webrtc.MediaStreamTrack;
import ts.p0;
import ts.y;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f39521c = new b(new int[]{2}, 10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final x<Integer> f39522d = x.u(2, 5, 6);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final z<Integer, Integer> f39523e = new z.a().f(5, 6).f(17, 6).f(7, 6).f(30, 10).f(18, 6).f(6, 8).f(8, 8).f(14, 8).c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f39524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f39525b;

    private static final class a {
        private static final b0<Integer> a() {
            b0.a aVarI = new b0.a().i(8, 7);
            int i11 = p0.f115040a;
            if (i11 >= 31) {
                aVarI.i(26, 27);
            }
            if (i11 >= 33) {
                aVarI.a(30);
            }
            return aVarI.l();
        }

        public static final boolean b(Context context) {
            AudioDeviceInfo[] devices = ((AudioManager) ts.a.e((AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND))).getDevices(2);
            b0<Integer> b0VarA = a();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (b0VarA.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.b$b, reason: collision with other inner class name */
    private static final class C0647b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final AudioAttributes f39526a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        /* JADX WARN: Multi-variable type inference failed */
        public static x<Integer> a() {
            x.a aVarK = x.k();
            d1 it = b.f39523e.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (p0.f115040a >= 34 || iIntValue != 30) {
                    if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), f39526a)) {
                        aVarK.a(num);
                    }
                }
            }
            aVarK.a(2);
            return aVarK.k();
        }

        public static int b(int i11, int i12) {
            for (int i13 = 10; i13 > 0; i13--) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i11).setSampleRate(i12).setChannelMask(p0.F(i13)).build(), f39526a)) {
                    return i13;
                }
            }
            return 0;
        }
    }

    public b(int[] iArr, int i11) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f39524a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f39524a = new int[0];
        }
        this.f39525b = i11;
    }

    private static boolean b() {
        if (p0.f115040a < 17) {
            return false;
        }
        String str = p0.f115042c;
        return "Amazon".equals(str) || "Xiaomi".equals(str);
    }

    public static b c(Context context) {
        return d(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    static b d(Context context, Intent intent) {
        int i11 = p0.f115040a;
        if (i11 >= 23 && a.b(context)) {
            return f39521c;
        }
        b0.a aVar = new b0.a();
        if (b() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            aVar.j(f39522d);
        }
        if (i11 >= 29 && (p0.z0(context) || p0.u0(context))) {
            aVar.j(C0647b.a());
            return new b(ru.f.n(aVar.l()), 10);
        }
        if (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            b0 b0VarL = aVar.l();
            return !b0VarL.isEmpty() ? new b(ru.f.n(b0VarL), 10) : f39521c;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            aVar.j(ru.f.c(intArrayExtra));
        }
        return new b(ru.f.n(aVar.l()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10));
    }

    private static int e(int i11) {
        int i12 = p0.f115040a;
        if (i12 <= 28) {
            if (i11 == 7) {
                i11 = 8;
            } else if (i11 == 3 || i11 == 4 || i11 == 5) {
                i11 = 6;
            }
        }
        if (i12 <= 26 && "fugu".equals(p0.f115041b) && i11 == 1) {
            i11 = 2;
        }
        return p0.F(i11);
    }

    static Uri g() {
        if (b()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    private static int h(int i11, int i12) {
        return p0.f115040a >= 29 ? C0647b.b(i11, i12) : ((Integer) ts.a.e(f39523e.getOrDefault(Integer.valueOf(i11), 0))).intValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Arrays.equals(this.f39524a, bVar.f39524a) && this.f39525b == bVar.f39525b;
    }

    public Pair<Integer, Integer> f(u0 u0Var) {
        int iD = y.d((String) ts.a.e(u0Var.f40712l), u0Var.f40709i);
        if (!f39523e.containsKey(Integer.valueOf(iD))) {
            return null;
        }
        if (iD == 18 && !j(18)) {
            iD = 6;
        } else if ((iD == 8 && !j(8)) || (iD == 30 && !j(30))) {
            iD = 7;
        }
        if (!j(iD)) {
            return null;
        }
        int iH = u0Var.f40725y;
        if (iH == -1 || iD == 18) {
            int i11 = u0Var.f40726z;
            if (i11 == -1) {
                i11 = 48000;
            }
            iH = h(iD, i11);
        } else if (u0Var.f40712l.equals("audio/vnd.dts.uhd;profile=p2")) {
            if (iH > 10) {
                return null;
            }
        } else if (iH > this.f39525b) {
            return null;
        }
        int iE = e(iH);
        if (iE == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iD), Integer.valueOf(iE));
    }

    public int hashCode() {
        return this.f39525b + (Arrays.hashCode(this.f39524a) * 31);
    }

    public boolean i(u0 u0Var) {
        return f(u0Var) != null;
    }

    public boolean j(int i11) {
        return Arrays.binarySearch(this.f39524a, i11) >= 0;
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f39525b + ", supportedEncodings=" + Arrays.toString(this.f39524a) + "]";
    }
}
