package jj;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements o<Uri, File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f83863a;

    public l(Context context) {
        this.f83863a = context;
    }

    @Override // jj.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<File> b(@NonNull Uri uri, int i11, int i12, @NonNull dj.h hVar) {
        return new o.a<>(new wj.d(uri), new b(this.f83863a, uri));
    }

    @Override // jj.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull Uri uri) {
        return ej.b.c(uri);
    }

    public static final class a implements p<Uri, File> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f83864a;

        public a(Context context) {
            this.f83864a = context;
        }

        @Override // jj.p
        @NonNull
        public o<Uri, File> e(s sVar) {
            return new l(this.f83864a);
        }

        @Override // jj.p
        public void d() {
        }
    }

    private static class b implements com.bumptech.glide.load.data.d<File> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String[] f83865c = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f83866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f83867b;

        b(Context context, Uri uri) {
            this.f83866a = context;
            this.f83867b = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<File> a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public dj.a c() {
            return dj.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void d(@NonNull com.bumptech.glide.h hVar, @NonNull com.bumptech.glide.load.data.d.a<? super File> aVar) {
            Cursor cursorQuery = this.f83866a.getContentResolver().query(this.f83867b, f83865c, null, null, null);
            String string = null;
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th2) {
                    cursorQuery.close();
                    throw th2;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.e(new File(string));
                return;
            }
            aVar.f(new FileNotFoundException("Failed to find file path for: " + this.f83867b));
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
