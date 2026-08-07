package com.google.android.exoplayer2.ui;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface e0 {

    public interface a {
        void n(e0 e0Var, long j11, boolean z11);

        void q(e0 e0Var, long j11);

        void u(e0 e0Var, long j11);
    }

    void a(a aVar);

    long getPreferredUpdateDelay();

    void setAdGroupTimesMs(long[] jArr, boolean[] zArr, int i11);

    void setBufferedPosition(long j11);

    void setDuration(long j11);

    void setEnabled(boolean z11);

    void setPosition(long j11);
}
