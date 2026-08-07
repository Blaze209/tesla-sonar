package d1;

import android.media.MediaMuxer;
import androidx.annotation.NonNull;
import java.io.FileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    @NonNull
    public static MediaMuxer a(@NonNull FileDescriptor fileDescriptor, int i11) {
        return new MediaMuxer(fileDescriptor, i11);
    }
}
