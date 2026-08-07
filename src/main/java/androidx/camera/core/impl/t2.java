package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface t2 {

    public interface a {
        default void onCaptureBufferLost(@NonNull b bVar, long j11, int i11) {
        }

        default void onCaptureCompleted(@NonNull b bVar, @NonNull z zVar) {
        }

        default void onCaptureFailed(@NonNull b bVar, @NonNull r rVar) {
        }

        default void onCaptureProgressed(@NonNull b bVar, @NonNull z zVar) {
        }

        default void onCaptureSequenceAborted(int i11) {
        }

        default void onCaptureSequenceCompleted(int i11, long j11) {
        }

        default void onCaptureStarted(@NonNull b bVar, long j11, long j12) {
        }
    }

    public interface b {
        @NonNull
        x0 getParameters();

        @NonNull
        List<Integer> getTargetOutputConfigIds();

        int getTemplateId();
    }

    void a();

    void b();

    int c(@NonNull b bVar, @NonNull a aVar);

    int d(@NonNull List<b> list, @NonNull a aVar);

    int e(@NonNull b bVar, @NonNull a aVar);
}
