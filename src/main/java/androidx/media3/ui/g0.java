package androidx.media3.ui;

/* JADX INFO: loaded from: classes3.dex */
public interface g0 {

    public interface a {
        void n(g0 g0Var, long j11);

        void q(g0 g0Var, long j11);

        void z(g0 g0Var, long j11, boolean z11);
    }

    void a(a aVar);

    long getPreferredUpdateDelay();

    void setAdGroupTimesMs(long[] jArr, boolean[] zArr, int i11);

    void setBufferedPosition(long j11);

    void setDuration(long j11);

    void setEnabled(boolean z11);

    void setPosition(long j11);
}
