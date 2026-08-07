package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioTrack;
import android.os.Build;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
public class k implements DefaultAudioSink.f {
    private AudioTrack c(AudioSink.a aVar, p7.d dVar, int i11, Context context) {
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(e(dVar, aVar.f9350d)).setAudioFormat(q0.P(aVar.f9348b, aVar.f9349c, aVar.f9347a)).setTransferMode(1).setBufferSizeInBytes(aVar.f9352f).setSessionId(i11);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
            g(sessionId, aVar.f9351e);
        }
        if (i12 >= 34 && context != null) {
            sessionId.setContext(context);
        }
        return d(sessionId).build();
    }

    private AudioAttributes e(p7.d dVar, boolean z11) {
        return z11 ? f() : dVar.b().f101245a;
    }

    private AudioAttributes f() {
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    private void g(AudioTrack.Builder builder, boolean z11) {
        builder.setOffloadedPlayback(z11);
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.f
    public final AudioTrack a(AudioSink.a aVar, p7.d dVar, int i11, Context context) {
        return c(aVar, dVar, i11, context);
    }

    protected AudioTrack.Builder d(AudioTrack.Builder builder) {
        return builder;
    }
}
