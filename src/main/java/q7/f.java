package q7;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import org.webrtc.MediaStreamTrack;
import s7.m;
import s7.t;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AudioManager f104869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Context f104870b;

    public static /* synthetic */ void a(Context context, m mVar) {
        f104869a = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        mVar.f();
    }

    public static int b(AudioManager audioManager, c cVar) {
        return Build.VERSION.SDK_INT >= 26 ? audioManager.abandonAudioFocusRequest(cVar.c()) : audioManager.abandonAudioFocus(cVar.f());
    }

    public static synchronized AudioManager c(Context context) {
        try {
            final Context applicationContext = context.getApplicationContext();
            if (f104870b != applicationContext) {
                f104869a = null;
            }
            AudioManager audioManager = f104869a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                final m mVar = new m();
                s7.c.a().execute(new Runnable() { // from class: q7.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.a(applicationContext, mVar);
                    }
                });
                mVar.b();
                return (AudioManager) s7.a.f(f104869a);
            }
            AudioManager audioManager2 = (AudioManager) applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            f104869a = audioManager2;
            return (AudioManager) s7.a.f(audioManager2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static int d(AudioManager audioManager, int i11) {
        return audioManager.getStreamMaxVolume(i11);
    }

    public static int e(AudioManager audioManager, int i11) {
        if (Build.VERSION.SDK_INT >= 28) {
            return audioManager.getStreamMinVolume(i11);
        }
        return 0;
    }

    public static int f(AudioManager audioManager, int i11) {
        try {
            return audioManager.getStreamVolume(i11);
        } catch (RuntimeException e11) {
            t.j("AudioManagerCompat", "Could not retrieve stream volume for stream type " + i11, e11);
            return audioManager.getStreamMaxVolume(i11);
        }
    }

    public static boolean g(AudioManager audioManager, int i11) {
        return audioManager.isStreamMute(i11);
    }

    public static int h(AudioManager audioManager, c cVar) {
        return Build.VERSION.SDK_INT >= 26 ? audioManager.requestAudioFocus(cVar.c()) : audioManager.requestAudioFocus(cVar.f(), cVar.b().c(), cVar.e());
    }
}
