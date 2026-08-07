package jj;

import androidx.annotation.NonNull;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class b<Data> implements o<byte[], Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1773b<Data> f83819a;

    /* JADX INFO: renamed from: jj.b$b, reason: collision with other inner class name */
    public interface InterfaceC1773b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    public b(InterfaceC1773b<Data> interfaceC1773b) {
        this.f83819a = interfaceC1773b;
    }

    @Override // jj.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(@NonNull byte[] bArr, int i11, int i12, @NonNull dj.h hVar) {
        return new o.a<>(new wj.d(bArr), new c(bArr, this.f83819a));
    }

    @Override // jj.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull byte[] bArr) {
        return true;
    }

    public static class a implements p<byte[], ByteBuffer> {

        /* JADX INFO: renamed from: jj.b$a$a, reason: collision with other inner class name */
        class C1772a implements InterfaceC1773b<ByteBuffer> {
            C1772a() {
            }

            @Override // jj.b.InterfaceC1773b
            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // jj.b.InterfaceC1773b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // jj.p
        @NonNull
        public o<byte[], ByteBuffer> e(@NonNull s sVar) {
            return new b(new C1772a());
        }

        @Override // jj.p
        public void d() {
        }
    }

    private static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f83821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC1773b<Data> f83822b;

        c(byte[] bArr, InterfaceC1773b<Data> interfaceC1773b) {
            this.f83821a = bArr;
            this.f83822b = interfaceC1773b;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<Data> a() {
            return this.f83822b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public dj.a c() {
            return dj.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void d(@NonNull com.bumptech.glide.h hVar, @NonNull com.bumptech.glide.load.data.d.a<? super Data> aVar) {
            aVar.e(this.f83822b.b(this.f83821a));
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }

    public static class d implements p<byte[], InputStream> {

        class a implements InterfaceC1773b<InputStream> {
            a() {
            }

            @Override // jj.b.InterfaceC1773b
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // jj.b.InterfaceC1773b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // jj.p
        @NonNull
        public o<byte[], InputStream> e(@NonNull s sVar) {
            return new b(new a());
        }

        @Override // jj.p
        public void d() {
        }
    }
}
