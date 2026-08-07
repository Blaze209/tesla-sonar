package j8;

import android.media.LoudnessCodecController;
import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
import com.google.common.util.concurrent.w;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashSet<MediaCodec> f82797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f82798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LoudnessCodecController f82799c;

    class a implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
        a() {
        }

        public Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
            return c.this.f82798b.b(bundle);
        }
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f82801a = new b() { // from class: j8.d
            @Override // j8.c.b
            public final Bundle b(Bundle bundle) {
                return c.b.a(bundle);
            }
        };

        static /* synthetic */ Bundle a(Bundle bundle) {
            return bundle;
        }

        Bundle b(Bundle bundle);
    }

    public c() {
        this(b.f82801a);
    }

    public void b(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f82799c;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            s7.a.h(this.f82797a.add(mediaCodec));
        }
    }

    public void c() {
        this.f82797a.clear();
        LoudnessCodecController loudnessCodecController = this.f82799c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public void d(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f82797a.remove(mediaCodec) || (loudnessCodecController = this.f82799c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void e(int i11) {
        LoudnessCodecController loudnessCodecController = this.f82799c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f82799c = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i11, w.b(), new a());
        this.f82799c = loudnessCodecControllerCreate;
        Iterator<MediaCodec> it = this.f82797a.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec(it.next())) {
                it.remove();
            }
        }
    }

    public c(b bVar) {
        this.f82797a = new HashSet<>();
        this.f82798b = bVar;
    }
}
