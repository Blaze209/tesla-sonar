package z7;

import android.os.Handler;
import androidx.media3.exoplayer.l2;

/* JADX INFO: loaded from: classes.dex */
public interface z {
    l2[] a(Handler handler, androidx.media3.exoplayer.video.o oVar, androidx.media3.exoplayer.audio.e eVar, q8.h hVar, k8.b bVar);

    default l2 b(l2 l2Var, Handler handler, androidx.media3.exoplayer.video.o oVar, androidx.media3.exoplayer.audio.e eVar, q8.h hVar, k8.b bVar) {
        return null;
    }
}
