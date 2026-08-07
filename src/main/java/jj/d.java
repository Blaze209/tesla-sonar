package jj;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class d implements o<File, ByteBuffer> {
    @Override // jj.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<ByteBuffer> b(@NonNull File file, int i11, int i12, @NonNull dj.h hVar) {
        return new o.a<>(new wj.d(file), new a(file));
    }

    @Override // jj.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull File file) {
        return true;
    }

    private static final class a implements com.bumptech.glide.load.data.d<ByteBuffer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f83824a;

        a(File file) {
            this.f83824a = file;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public dj.a c() {
            return dj.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void d(@NonNull com.bumptech.glide.h hVar, @NonNull com.bumptech.glide.load.data.d.a<? super ByteBuffer> aVar) {
            try {
                aVar.e(xj.a.a(this.f83824a));
            } catch (IOException e11) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e11);
                }
                aVar.f(e11);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }

    public static class b implements p<File, ByteBuffer> {
        @Override // jj.p
        @NonNull
        public o<File, ByteBuffer> e(@NonNull s sVar) {
            return new d();
        }

        @Override // jj.p
        public void d() {
        }
    }
}
