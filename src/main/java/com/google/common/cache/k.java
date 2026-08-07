package com.google.common.cache;

import java.util.concurrent.atomic.AtomicLong;
import ou.x;

/* JADX INFO: loaded from: classes5.dex */
final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final x<j> f43490a;

    class a implements x<j> {
        a() {
        }

        @Override // ou.x
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j get() {
            return new l();
        }
    }

    class b implements x<j> {
        b() {
        }

        @Override // ou.x
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j get() {
            return new c(null);
        }
    }

    private static final class c extends AtomicLong implements j {
        private c() {
        }

        @Override // com.google.common.cache.j
        public void a() {
            getAndIncrement();
        }

        @Override // com.google.common.cache.j
        public void add(long j11) {
            getAndAdd(j11);
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    static {
        x<j> bVar;
        try {
            new l();
            bVar = new a();
        } catch (Throwable unused) {
            bVar = new b();
        }
        f43490a = bVar;
    }

    public static j a() {
        return f43490a.get();
    }
}
