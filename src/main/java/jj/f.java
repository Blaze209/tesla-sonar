package jj;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class f<DataT> implements o<Integer, DataT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f83831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e<DataT> f83832b;

    private interface e<DataT> {
        Class<DataT> a();

        void b(DataT datat);

        DataT c(Resources.Theme theme, Resources resources, int i11);
    }

    f(Context context, e<DataT> eVar) {
        this.f83831a = context.getApplicationContext();
        this.f83832b = eVar;
    }

    public static p<Integer, AssetFileDescriptor> c(Context context) {
        return new a(context);
    }

    public static p<Integer, Drawable> e(Context context) {
        return new b(context);
    }

    public static p<Integer, InputStream> g(Context context) {
        return new c(context);
    }

    @Override // jj.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public o.a<DataT> b(@NonNull Integer num, int i11, int i12, @NonNull dj.h hVar) {
        Resources.Theme theme = (Resources.Theme) hVar.c(nj.g.f95062b);
        return new o.a<>(new wj.d(num), new d(theme, theme != null ? theme.getResources() : this.f83831a.getResources(), this.f83832b, num.intValue()));
    }

    @Override // jj.o
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull Integer num) {
        return true;
    }

    private static final class a implements p<Integer, AssetFileDescriptor>, e<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f83833a;

        a(Context context) {
            this.f83833a = context;
        }

        @Override // jj.f.e
        public Class<AssetFileDescriptor> a() {
            return AssetFileDescriptor.class;
        }

        @Override // jj.p
        @NonNull
        public o<Integer, AssetFileDescriptor> e(@NonNull s sVar) {
            return new f(this.f83833a, this);
        }

        @Override // jj.f.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void b(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // jj.f.e
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public AssetFileDescriptor c(Resources.Theme theme, Resources resources, int i11) {
            return resources.openRawResourceFd(i11);
        }

        @Override // jj.p
        public void d() {
        }
    }

    private static final class b implements p<Integer, Drawable>, e<Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f83834a;

        b(Context context) {
            this.f83834a = context;
        }

        @Override // jj.f.e
        public Class<Drawable> a() {
            return Drawable.class;
        }

        @Override // jj.p
        @NonNull
        public o<Integer, Drawable> e(@NonNull s sVar) {
            return new f(this.f83834a, this);
        }

        @Override // jj.f.e
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Drawable c(Resources.Theme theme, Resources resources, int i11) {
            return nj.d.a(this.f83834a, i11, theme);
        }

        @Override // jj.p
        public void d() {
        }

        @Override // jj.f.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void b(Drawable drawable) {
        }
    }

    private static final class c implements p<Integer, InputStream>, e<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f83835a;

        c(Context context) {
            this.f83835a = context;
        }

        @Override // jj.f.e
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // jj.p
        @NonNull
        public o<Integer, InputStream> e(@NonNull s sVar) {
            return new f(this.f83835a, this);
        }

        @Override // jj.f.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void b(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // jj.f.e
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public InputStream c(Resources.Theme theme, Resources resources, int i11) {
            return resources.openRawResource(i11);
        }

        @Override // jj.p
        public void d() {
        }
    }

    private static final class d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources.Theme f83836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Resources f83837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e<DataT> f83838c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f83839d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private DataT f83840e;

        d(Resources.Theme theme, Resources resources, e<DataT> eVar, int i11) {
            this.f83836a = theme;
            this.f83837b = resources;
            this.f83838c = eVar;
            this.f83839d = i11;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<DataT> a() {
            return this.f83838c.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            DataT datat = this.f83840e;
            if (datat != null) {
                try {
                    this.f83838c.b(datat);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public dj.a c() {
            return dj.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [DataT, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public void d(@NonNull com.bumptech.glide.h hVar, @NonNull com.bumptech.glide.load.data.d.a<? super DataT> aVar) {
            try {
                DataT datatC = this.f83838c.c(this.f83836a, this.f83837b, this.f83839d);
                this.f83840e = datatC;
                aVar.e(datatC);
            } catch (Resources.NotFoundException e11) {
                aVar.f(e11);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
