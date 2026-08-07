package androidx.media3.exoplayer.mediacodec;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
interface i {
    void a();

    void flush();

    void g(int i11, int i12, y7.c cVar, long j11, int i13);

    void queueInputBuffer(int i11, int i12, int i13, long j11, int i14);

    void setParameters(Bundle bundle);

    void shutdown();

    void start();
}
