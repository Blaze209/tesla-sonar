package jj;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class g<Data> implements o<File, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d<Data> f83841a;

    public static class b extends a<ParcelFileDescriptor> {

        class a implements d<ParcelFileDescriptor> {
            a() {
            }

            @Override // jj.g.d
            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // jj.g.d
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // jj.g.d
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    public interface d<Data> {
        Class<Data> a();

        void b(Data data);

        Data c(File file);
    }

    public static class e extends a<InputStream> {

        class a implements d<InputStream> {
            a() {
            }

            @Override // jj.g.d
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // jj.g.d
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // jj.g.d
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(File file) {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public g(d<Data> dVar) {
        this.f83841a = dVar;
    }

    @Override // jj.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(@NonNull File file, int i11, int i12, @NonNull dj.h hVar) {
        return new o.a<>(new wj.d(file), new c(file, this.f83841a));
    }

    @Override // jj.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull File file) {
        return true;
    }

    public static class a<Data> implements p<File, Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d<Data> f83842a;

        public a(d<Data> dVar) {
            this.f83842a = dVar;
        }

        @Override // jj.p
        @NonNull
        public final o<File, Data> e(@NonNull s sVar) {
            return new g(this.f83842a);
        }

        @Override // jj.p
        public final void d() {
        }
    }

    private static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f83843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d<Data> f83844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Data f83845c;

        c(File file, d<Data> dVar) {
            this.f83843a = file;
            this.f83844b = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<Data> a() {
            return this.f83844b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            Data data = this.f83845c;
            if (data != null) {
                try {
                    this.f83844b.b(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public dj.a c() {
            return dj.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public void d(@NonNull com.bumptech.glide.h hVar, @NonNull com.bumptech.glide.load.data.d.a<? super Data> aVar) {
            try {
                Data dataC = this.f83844b.c(this.f83843a);
                this.f83845c = dataC;
                aVar.e(dataC);
            } catch (FileNotFoundException e11) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e11);
                }
                aVar.f(e11);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
