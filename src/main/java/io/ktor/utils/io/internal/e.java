package io.ktor.utils.io.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.nio.ByteBuffer;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0002\"\u0014\u0010\b\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0002\" \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\" \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0007\u0010\r\" \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u0014"}, d2 = {"", "a", "I", "()I", "BUFFER_SIZE", "b", "BUFFER_POOL_SIZE", "c", "BUFFER_OBJECT_POOL_SIZE", "Lnl0/f;", "Ljava/nio/ByteBuffer;", DateTokenConverter.CONVERTER_KEY, "Lnl0/f;", "()Lnl0/f;", "BufferPool", "Lio/ktor/utils/io/internal/g$c;", "e", "BufferObjectPool", "f", "BufferObjectNoPool", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f78744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f78745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f78746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final nl0.f<ByteBuffer> f78747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final nl0.f<g.c> f78748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final nl0.f<g.c> f78749f;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"io/ktor/utils/io/internal/e$a", "Lnl0/e;", "Lio/ktor/utils/io/internal/g$c;", "c", "()Lio/ktor/utils/io/internal/g$c;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends nl0.e<g.c> {
        a() {
        }

        @Override // nl0.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public g.c S2() {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(e.a());
            s.j(byteBufferAllocateDirect, "allocateDirect(BUFFER_SIZE)");
            return new g.c(byteBufferAllocateDirect, 0, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"io/ktor/utils/io/internal/e$b", "Lnl0/c;", "Lio/ktor/utils/io/internal/g$c;", "b0", "()Lio/ktor/utils/io/internal/g$c;", "instance", "Ljn0/h0;", "T", "(Lio/ktor/utils/io/internal/g$c;)V", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends nl0.c<g.c> {
        b(int i11) {
            super(i11);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // nl0.c
        /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
        public void p(g.c instance) {
            s.k(instance, "instance");
            e.d().F1(instance.backingBuffer);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // nl0.c
        /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
        public g.c B() {
            return new g.c(e.d().S2(), 0, 2, null);
        }
    }

    static {
        int iA = k.a("BufferSize", 4096);
        f78744a = iA;
        int iA2 = k.a("BufferPoolSize", 2048);
        f78745b = iA2;
        int iA3 = k.a("BufferObjectPoolSize", 1024);
        f78746c = iA3;
        f78747d = new nl0.d(iA2, iA);
        f78748e = new b(iA3);
        f78749f = new a();
    }

    public static final int a() {
        return f78744a;
    }

    public static final nl0.f<g.c> b() {
        return f78749f;
    }

    public static final nl0.f<g.c> c() {
        return f78748e;
    }

    public static final nl0.f<ByteBuffer> d() {
        return f78747d;
    }
}
