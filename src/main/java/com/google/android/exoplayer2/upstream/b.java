package com.google.android.exoplayer2.upstream;

import es.h;
import es.i;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface b {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f41077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f41078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IOException f41079c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f41080d;

        public a(h hVar, i iVar, IOException iOException, int i11) {
            this.f41077a = hVar;
            this.f41078b = iVar;
            this.f41079c = iOException;
            this.f41080d = i11;
        }
    }

    default void a(long j11) {
    }

    int b(int i11);

    long c(a aVar);
}
