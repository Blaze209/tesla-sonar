package sk;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class b implements u5.f<ByteBuffer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f111318a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f111319b = 16384;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ThreadLocal<ByteBuffer> f111320c = new a();

    class a extends ThreadLocal<ByteBuffer> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ByteBuffer initialValue() {
            return ByteBuffer.allocate(b.f111319b);
        }
    }

    public static int e() {
        return f111319b;
    }

    @Override // u5.f
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ByteBuffer b() {
        return f111320c.get();
    }

    @Override // u5.f
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer) {
        return true;
    }
}
