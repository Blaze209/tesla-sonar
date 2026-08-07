package com.google.android.exoplayer2.source;

import android.net.Uri;
import cr.q1;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface s {

    public interface a {
        s a(q1 q1Var);
    }

    void a(long j11, long j12);

    long b();

    void c();

    void d(ss.g gVar, Uri uri, Map<String, List<String>> map, long j11, long j12, hr.m mVar);

    int e(hr.y yVar);

    void release();
}
