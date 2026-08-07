package jj;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class e<Model, Data> implements o<Model, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a<Data> f83825a;

    public interface a<Data> {
        Class<Data> a();

        void b(Data data);

        Data c(String str);
    }

    public e(a<Data> aVar) {
        this.f83825a = aVar;
    }

    @Override // jj.o
    public boolean a(@NonNull Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // jj.o
    public o.a<Data> b(@NonNull Model model, int i11, int i12, @NonNull dj.h hVar) {
        return new o.a<>(new wj.d(model), new b(model.toString(), this.f83825a));
    }

    private static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f83826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a<Data> f83827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Data f83828c;

        b(String str, a<Data> aVar) {
            this.f83826a = str;
            this.f83827b = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<Data> a() {
            return this.f83827b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            try {
                this.f83827b.b(this.f83828c);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public dj.a c() {
            return dj.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public void d(@NonNull com.bumptech.glide.h hVar, @NonNull com.bumptech.glide.load.data.d.a<? super Data> aVar) {
            try {
                Data dataC = this.f83827b.c(this.f83826a);
                this.f83828c = dataC;
                aVar.e(dataC);
            } catch (IllegalArgumentException e11) {
                aVar.f(e11);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }

    public static final class c<Model> implements p<Model, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a<InputStream> f83829a = new a();

        class a implements a<InputStream> {
            a() {
            }

            @Override // jj.e.a
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // jj.e.a
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // jj.e.a
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // jj.p
        @NonNull
        public o<Model, InputStream> e(@NonNull s sVar) {
            return new e(this.f83829a);
        }

        @Override // jj.p
        public void d() {
        }
    }
}
