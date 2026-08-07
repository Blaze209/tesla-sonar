package androidx.camera.core.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p3 f3278a = new a();

    class a implements p3 {
        a() {
        }

        @Override // androidx.camera.core.impl.p3
        public x0 a(@NonNull b bVar, int i11) {
            return null;
        }
    }

    public enum b {
        IMAGE_CAPTURE,
        PREVIEW,
        IMAGE_ANALYSIS,
        VIDEO_CAPTURE,
        STREAM_SHARING,
        METERING_REPEATING
    }

    public interface c {
        @NonNull
        p3 newInstance(@NonNull Context context);
    }

    x0 a(@NonNull b bVar, int i11);
}
