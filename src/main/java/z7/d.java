package z7;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.l2;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class d implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f127090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.exoplayer.mediacodec.g f127091b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f127094e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f127096g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f127097h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f127098i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f127099j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f127101l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f127092c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f127093d = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.media3.exoplayer.mediacodec.l f127095f = androidx.media3.exoplayer.mediacodec.l.f10571a;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f127100k = -9223372036854775807L;

    public d(Context context) {
        this.f127090a = context;
        this.f127091b = new androidx.media3.exoplayer.mediacodec.g(context);
    }

    @Override // z7.z
    public l2[] a(Handler handler, androidx.media3.exoplayer.video.o oVar, androidx.media3.exoplayer.audio.e eVar, q8.h hVar, k8.b bVar) {
        Handler handler2;
        ArrayList<l2> arrayList = new ArrayList<>();
        l(this.f127090a, this.f127092c, this.f127095f, this.f127094e, handler, oVar, this.f127093d, arrayList);
        AudioSink audioSinkD = d(this.f127090a, this.f127096g, this.f127097h);
        if (audioSinkD != null) {
            handler2 = handler;
            c(this.f127090a, this.f127092c, this.f127095f, this.f127094e, audioSinkD, handler2, eVar, arrayList);
        } else {
            handler2 = handler;
        }
        k(this.f127090a, hVar, handler2.getLooper(), this.f127092c, arrayList);
        h(this.f127090a, bVar, handler2.getLooper(), this.f127092c, arrayList);
        e(this.f127090a, this.f127092c, arrayList);
        f(this.f127090a, arrayList);
        i(this.f127090a, handler2, this.f127092c, arrayList);
        return (l2[]) arrayList.toArray(new l2[0]);
    }

    @Override // z7.z
    public l2 b(l2 l2Var, Handler handler, androidx.media3.exoplayer.video.o oVar, androidx.media3.exoplayer.audio.e eVar, q8.h hVar, k8.b bVar) {
        if (l2Var.c() == 2) {
            return j(l2Var, this.f127090a, this.f127092c, this.f127095f, this.f127094e, handler, oVar, this.f127093d);
        }
        return null;
    }

    protected void c(Context context, int i11, androidx.media3.exoplayer.mediacodec.l lVar, boolean z11, AudioSink audioSink, Handler handler, androidx.media3.exoplayer.audio.e eVar, ArrayList<l2> arrayList) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        arrayList.add(new androidx.media3.exoplayer.audio.l(context, n(), lVar, z11, handler, eVar, audioSink));
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
                    arrayList.add(size, (l2) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class, Handler.class, androidx.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(context, handler, eVar, audioSink));
                    s7.t.g("DefaultRenderersFactory", "Loaded MidiRenderer.");
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
                        arrayList.add(i12, (l2) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, androidx.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(handler, eVar, audioSink));
                        s7.t.g("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        i12 = i13;
                        i13 = i12;
                    }
                } catch (ClassNotFoundException unused4) {
                }
                try {
                    try {
                        i14 = i13 + 1;
                        try {
                            arrayList.add(i13, (l2) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, androidx.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(handler, eVar, audioSink));
                            s7.t.g("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                        } catch (ClassNotFoundException unused5) {
                            i13 = i14;
                            i14 = i13;
                        }
                    } catch (ClassNotFoundException unused6) {
                    }
                    try {
                        try {
                            i15 = i14 + 1;
                            try {
                                arrayList.add(i14, (l2) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, androidx.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(handler, eVar, audioSink));
                                s7.t.g("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                            } catch (ClassNotFoundException unused7) {
                                i14 = i15;
                                i15 = i14;
                            }
                        } catch (ClassNotFoundException unused8) {
                        }
                        try {
                            try {
                                i16 = i15 + 1;
                                try {
                                    arrayList.add(i15, (l2) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, androidx.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(context, handler, eVar, audioSink));
                                    s7.t.g("DefaultRenderersFactory", "Loaded LibiamfAudioRenderer.");
                                } catch (ClassNotFoundException unused9) {
                                    i15 = i16;
                                    i16 = i15;
                                }
                            } catch (ClassNotFoundException unused10) {
                            }
                            try {
                                arrayList.add(i16, (l2) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, androidx.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(handler, eVar, audioSink));
                                s7.t.g("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                            } catch (ClassNotFoundException unused11) {
                            } catch (Exception e11) {
                                throw new IllegalStateException("Error instantiating MPEG-H extension", e11);
                            }
                        } catch (Exception e12) {
                            throw new IllegalStateException("Error instantiating IAMF extension", e12);
                        }
                    } catch (Exception e13) {
                        throw new IllegalStateException("Error instantiating FFmpeg extension", e13);
                    }
                } catch (Exception e14) {
                    throw new IllegalStateException("Error instantiating FLAC extension", e14);
                }
            } catch (Exception e15) {
                throw new IllegalStateException("Error instantiating Opus extension", e15);
            }
        } catch (Exception e16) {
            throw new IllegalStateException("Error instantiating MIDI extension", e16);
        }
    }

    protected AudioSink d(Context context, boolean z11, boolean z12) {
        return new DefaultAudioSink.g(context).m(z11).l(z12).k();
    }

    protected void e(Context context, int i11, ArrayList<l2> arrayList) {
        arrayList.add(new v8.b());
    }

    protected void f(Context context, ArrayList<l2> arrayList) {
        g(arrayList);
    }

    @Deprecated
    protected void g(ArrayList<l2> arrayList) {
        arrayList.add(new i8.d(o(this.f127090a), null));
    }

    protected void h(Context context, k8.b bVar, Looper looper, int i11, ArrayList<l2> arrayList) {
        arrayList.add(new k8.c(bVar, looper));
        arrayList.add(new k8.c(bVar, looper));
    }

    protected l2 j(l2 l2Var, Context context, int i11, androidx.media3.exoplayer.mediacodec.l lVar, boolean z11, Handler handler, androidx.media3.exoplayer.video.o oVar, long j11) {
        if (!this.f127098i || l2Var.getClass() != androidx.media3.exoplayer.video.h.class) {
            return null;
        }
        androidx.media3.exoplayer.video.h.d dVarP = new androidx.media3.exoplayer.video.h.d(context).s(n()).x(lVar).r(j11).t(z11).u(handler).v(oVar).w(50).q(this.f127099j).p(this.f127100k);
        if (Build.VERSION.SDK_INT >= 34) {
            dVarP = dVarP.o(this.f127101l);
        }
        return dVarP.n();
    }

    protected void k(Context context, q8.h hVar, Looper looper, int i11, ArrayList<l2> arrayList) {
        arrayList.add(new q8.i(hVar, looper));
    }

    protected void l(Context context, int i11, androidx.media3.exoplayer.mediacodec.l lVar, boolean z11, Handler handler, androidx.media3.exoplayer.video.o oVar, long j11, ArrayList<l2> arrayList) {
        int i12;
        int i13;
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        androidx.media3.exoplayer.video.h.d dVarP = new androidx.media3.exoplayer.video.h.d(context).s(n()).x(lVar).r(j11).t(z11).u(handler).v(oVar).w(50).q(this.f127099j).p(this.f127100k);
        if (Build.VERSION.SDK_INT >= 34) {
            dVarP = dVarP.o(this.f127101l);
        }
        arrayList.add(dVarP.n());
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
                    arrayList.add(size, (l2) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, androidx.media3.exoplayer.video.o.class, cls).newInstance(Long.valueOf(j11), handler, oVar, 50));
                    s7.t.g("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
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
                        arrayList.add(i12, (l2) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(cls2, Handler.class, androidx.media3.exoplayer.video.o.class, cls).newInstance(Long.valueOf(j11), handler, oVar, 50));
                        s7.t.g("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        i12 = i13;
                        i13 = i12;
                    }
                } catch (ClassNotFoundException unused4) {
                }
                try {
                    arrayList.add(i13, (l2) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(cls2, Handler.class, androidx.media3.exoplayer.video.o.class, cls).newInstance(Long.valueOf(j11), handler, oVar, 50));
                    s7.t.g("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
                } catch (ClassNotFoundException unused5) {
                } catch (Exception e11) {
                    throw new IllegalStateException("Error instantiating FFmpeg extension", e11);
                }
            } catch (Exception e12) {
                throw new IllegalStateException("Error instantiating AV1 extension", e12);
            }
        } catch (Exception e13) {
            throw new IllegalStateException("Error instantiating VP9 extension", e13);
        }
    }

    public final d m() {
        this.f127091b.c();
        return this;
    }

    protected androidx.media3.exoplayer.mediacodec.h.b n() {
        return this.f127091b;
    }

    protected i8.b.a o(Context context) {
        return new i8.a.c(context);
    }

    public final d p(boolean z11) {
        this.f127094e = z11;
        return this;
    }

    public final d q(int i11) {
        this.f127092c = i11;
        return this;
    }

    protected void i(Context context, Handler handler, int i11, ArrayList<l2> arrayList) {
    }
}
