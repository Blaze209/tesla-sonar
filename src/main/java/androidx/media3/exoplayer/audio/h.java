package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;
import p7.g0;
import p7.u;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
public final class h implements DefaultAudioSink.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f9519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f9520b;

    private static final class a {
        public static d a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z11) {
            return !AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes) ? d.f9468d : new d.b().e(true).g(z11).d();
        }
    }

    private static final class b {
        public static d a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z11) {
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            if (playbackOffloadSupport == 0) {
                return d.f9468d;
            }
            return new d.b().e(true).f(Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2).g(z11).d();
        }
    }

    public h(Context context) {
        this.f9519a = context == null ? null : context.getApplicationContext();
    }

    private boolean b(Context context) {
        Boolean bool = this.f9520b;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context != null) {
            String parameters = q7.f.c(context).getParameters("offloadVariableRateSupported");
            this.f9520b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
        } else {
            this.f9520b = Boolean.FALSE;
        }
        return this.f9520b.booleanValue();
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.d
    public d a(u uVar, p7.d dVar) {
        s7.a.f(uVar);
        s7.a.f(dVar);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 29 || uVar.H == -1) {
            return d.f9468d;
        }
        boolean zB = b(this.f9519a);
        int iF = g0.f((String) s7.a.f(uVar.f101544o), uVar.f101540k);
        if (iF == 0 || i11 < q0.N(iF)) {
            return d.f9468d;
        }
        int iQ = q0.Q(uVar.G);
        if (iQ == 0) {
            return d.f9468d;
        }
        try {
            AudioFormat audioFormatP = q0.P(uVar.H, iQ, iF);
            return i11 >= 31 ? b.a(audioFormatP, dVar.b().f101245a, zB) : a.a(audioFormatP, dVar.b().f101245a, zB);
        } catch (IllegalArgumentException unused) {
            return d.f9468d;
        }
    }
}
