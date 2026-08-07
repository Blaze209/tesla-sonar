package br;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.z1;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class f implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f17918a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f17922e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f17924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f17925h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f17926i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.mediacodec.h f17919b = new com.google.android.exoplayer2.mediacodec.h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f17920c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f17921d = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.exoplayer2.mediacodec.l f17923f = com.google.android.exoplayer2.mediacodec.l.f40264a;

    public f(Context context) {
        this.f17918a = context;
    }

    @Override // br.k0
    public z1[] a(Handler handler, us.x xVar, com.google.android.exoplayer2.audio.e eVar, gs.o oVar, ur.e eVar2) {
        Handler handler2;
        ArrayList<z1> arrayList = new ArrayList<>();
        h(this.f17918a, this.f17920c, this.f17923f, this.f17922e, handler, xVar, this.f17921d, arrayList);
        AudioSink audioSinkC = c(this.f17918a, this.f17924g, this.f17925h, this.f17926i);
        if (audioSinkC != null) {
            handler2 = handler;
            b(this.f17918a, this.f17920c, this.f17923f, this.f17922e, audioSinkC, handler2, eVar, arrayList);
        } else {
            handler2 = handler;
        }
        g(this.f17918a, oVar, handler2.getLooper(), this.f17920c, arrayList);
        e(this.f17918a, eVar2, handler2.getLooper(), this.f17920c, arrayList);
        d(this.f17918a, this.f17920c, arrayList);
        f(this.f17918a, handler2, this.f17920c, arrayList);
        return (z1[]) arrayList.toArray(new z1[0]);
    }

    protected void b(Context context, int i11, com.google.android.exoplayer2.mediacodec.l lVar, boolean z11, AudioSink audioSink, Handler handler, com.google.android.exoplayer2.audio.e eVar, ArrayList<z1> arrayList) {
        int i12;
        int i13;
        int i14;
        arrayList.add(new com.google.android.exoplayer2.audio.k(context, i(), lVar, z11, handler, eVar, audioSink));
        if (i11 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i11 == 2) {
            size--;
        }
        try {
            try {
                i12 = size + 1;
                try {
                    arrayList.add(size, (z1) Class.forName("com.google.android.exoplayer2.decoder.midi.MidiRenderer").getConstructor(null).newInstance(null));
                    ts.u.f("DefaultRenderersFactory", "Loaded MidiRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i12;
                    i12 = size;
                }
            } catch (ClassNotFoundException unused2) {
            }
            try {
                try {
                    i13 = i12 + 1;
                    try {
                        arrayList.add(i12, (z1) Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, com.google.android.exoplayer2.audio.e.class, AudioSink.class).newInstance(handler, eVar, audioSink));
                        ts.u.f("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        i12 = i13;
                        i13 = i12;
                    }
                } catch (Exception e11) {
                    throw new RuntimeException("Error instantiating Opus extension", e11);
                }
            } catch (ClassNotFoundException unused4) {
            }
            try {
                try {
                    i14 = i13 + 1;
                    try {
                        arrayList.add(i13, (z1) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, com.google.android.exoplayer2.audio.e.class, AudioSink.class).newInstance(handler, eVar, audioSink));
                        ts.u.f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                    } catch (ClassNotFoundException unused5) {
                        i13 = i14;
                        i14 = i13;
                    }
                } catch (Exception e12) {
                    throw new RuntimeException("Error instantiating FLAC extension", e12);
                }
            } catch (ClassNotFoundException unused6) {
            }
            try {
                arrayList.add(i14, (z1) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, com.google.android.exoplayer2.audio.e.class, AudioSink.class).newInstance(handler, eVar, audioSink));
                ts.u.f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
            } catch (ClassNotFoundException unused7) {
            } catch (Exception e13) {
                throw new RuntimeException("Error instantiating FFmpeg extension", e13);
            }
        } catch (Exception e14) {
            throw new RuntimeException("Error instantiating MIDI extension", e14);
        }
    }

    protected AudioSink c(Context context, boolean z11, boolean z12, boolean z13) {
        return new DefaultAudioSink.f(context).i(z11).h(z12).j(z13 ? 1 : 0).g();
    }

    protected void d(Context context, int i11, ArrayList<z1> arrayList) {
        arrayList.add(new vs.b());
    }

    protected void e(Context context, ur.e eVar, Looper looper, int i11, ArrayList<z1> arrayList) {
        arrayList.add(new ur.f(eVar, looper));
    }

    protected void g(Context context, gs.o oVar, Looper looper, int i11, ArrayList<z1> arrayList) {
        arrayList.add(new gs.p(oVar, looper));
    }

    protected void h(Context context, int i11, com.google.android.exoplayer2.mediacodec.l lVar, boolean z11, Handler handler, us.x xVar, long j11, ArrayList<z1> arrayList) {
        String str;
        Integer num;
        int i12;
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        arrayList.add(new us.g(context, i(), lVar, j11, z11, handler, xVar, 50));
        if (i11 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i11 == 2) {
            size--;
        }
        try {
            try {
                Constructor<?> constructor = Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, us.x.class, cls);
                num = 50;
                try {
                    i12 = size + 1;
                    try {
                        arrayList.add(size, (z1) constructor.newInstance(Long.valueOf(j11), handler, xVar, 50));
                        str = "DefaultRenderersFactory";
                        try {
                            ts.u.f(str, "Loaded LibvpxVideoRenderer.");
                        } catch (ClassNotFoundException unused) {
                            size = i12;
                            i12 = size;
                        }
                    } catch (ClassNotFoundException unused2) {
                        str = "DefaultRenderersFactory";
                    }
                } catch (ClassNotFoundException unused3) {
                    str = "DefaultRenderersFactory";
                }
            } catch (ClassNotFoundException unused4) {
                str = "DefaultRenderersFactory";
                num = 50;
            }
            try {
                arrayList.add(i12, (z1) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(cls2, Handler.class, us.x.class, cls).newInstance(Long.valueOf(j11), handler, xVar, num));
                ts.u.f(str, "Loaded Libgav1VideoRenderer.");
            } catch (ClassNotFoundException unused5) {
            } catch (Exception e11) {
                throw new RuntimeException("Error instantiating AV1 extension", e11);
            }
        } catch (Exception e12) {
            throw new RuntimeException("Error instantiating VP9 extension", e12);
        }
    }

    protected com.google.android.exoplayer2.mediacodec.j.b i() {
        return this.f17919b;
    }

    protected void f(Context context, Handler handler, int i11, ArrayList<z1> arrayList) {
    }
}
