package kj;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import dj.h;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import jj.o;
import jj.p;
import jj.s;

/* JADX INFO: loaded from: classes3.dex */
public final class d<DataT> implements o<Uri, DataT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f86163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o<File, DataT> f86164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o<Uri, DataT> f86165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Class<DataT> f86166d;

    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* JADX INFO: renamed from: kj.d$d, reason: collision with other inner class name */
    private static final class C1845d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String[] f86169k = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f86170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final o<File, DataT> f86171b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final o<Uri, DataT> f86172c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Uri f86173d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f86174e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f86175f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final h f86176g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Class<DataT> f86177h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private volatile boolean f86178i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private volatile com.bumptech.glide.load.data.d<DataT> f86179j;

        C1845d(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Uri uri, int i11, int i12, h hVar, Class<DataT> cls) {
            this.f86170a = context.getApplicationContext();
            this.f86171b = oVar;
            this.f86172c = oVar2;
            this.f86173d = uri;
            this.f86174e = i11;
            this.f86175f = i12;
            this.f86176g = hVar;
            this.f86177h = cls;
        }

        private o.a<DataT> e() {
            if (Environment.isExternalStorageLegacy()) {
                return this.f86171b.b(h(this.f86173d), this.f86174e, this.f86175f, this.f86176g);
            }
            if (ej.b.a(this.f86173d)) {
                return this.f86172c.b(this.f86173d, this.f86174e, this.f86175f, this.f86176g);
            }
            return this.f86172c.b(g() ? MediaStore.setRequireOriginal(this.f86173d) : this.f86173d, this.f86174e, this.f86175f, this.f86176g);
        }

        private com.bumptech.glide.load.data.d<DataT> f() {
            o.a<DataT> aVarE = e();
            if (aVarE != null) {
                return aVarE.f83876c;
            }
            return null;
        }

        private boolean g() {
            return this.f86170a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        @NonNull
        private File h(Uri uri) {
            Cursor cursor = null;
            try {
                Cursor cursorQuery = this.f86170a.getContentResolver().query(uri, f86169k, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursorQuery.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th2) {
                if (0 == 0) {
                    throw th2;
                }
                cursor.close();
                throw th2;
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<DataT> a() {
            return this.f86177h;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.f86179j;
            if (dVar != null) {
                dVar.b();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public dj.a c() {
            return dj.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f86178i = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.f86179j;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void d(@NonNull com.bumptech.glide.h hVar, @NonNull com.bumptech.glide.load.data.d.a<? super DataT> aVar) {
            try {
                com.bumptech.glide.load.data.d<DataT> dVarF = f();
                if (dVarF == null) {
                    aVar.f(new IllegalArgumentException("Failed to build fetcher for: " + this.f86173d));
                    return;
                }
                this.f86179j = dVarF;
                if (this.f86178i) {
                    cancel();
                } else {
                    dVarF.d(hVar, aVar);
                }
            } catch (FileNotFoundException e11) {
                aVar.f(e11);
            }
        }
    }

    d(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Class<DataT> cls) {
        this.f86163a = context.getApplicationContext();
        this.f86164b = oVar;
        this.f86165c = oVar2;
        this.f86166d = cls;
    }

    @Override // jj.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<DataT> b(@NonNull Uri uri, int i11, int i12, @NonNull h hVar) {
        return new o.a<>(new wj.d(uri), new C1845d(this.f86163a, this.f86164b, this.f86165c, uri, i11, i12, hVar, this.f86166d));
    }

    @Override // jj.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && ej.b.c(uri);
    }

    private static abstract class a<DataT> implements p<Uri, DataT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f86167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class<DataT> f86168b;

        a(Context context, Class<DataT> cls) {
            this.f86167a = context;
            this.f86168b = cls;
        }

        @Override // jj.p
        @NonNull
        public final o<Uri, DataT> e(@NonNull s sVar) {
            return new d(this.f86167a, sVar.d(File.class, this.f86168b), sVar.d(Uri.class, this.f86168b), this.f86168b);
        }

        @Override // jj.p
        public final void d() {
        }
    }
}
