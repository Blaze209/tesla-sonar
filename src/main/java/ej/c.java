package ej;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class c implements com.bumptech.glide.load.data.d<InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f63006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f63007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InputStream f63008c;

    static class a implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String[] f63009b = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f63010a;

        a(ContentResolver contentResolver) {
            this.f63010a = contentResolver;
        }

        @Override // ej.d
        public Cursor a(Uri uri) {
            return this.f63010a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f63009b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    static class b implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String[] f63011b = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f63012a;

        b(ContentResolver contentResolver) {
            this.f63012a = contentResolver;
        }

        @Override // ej.d
        public Cursor a(Uri uri) {
            return this.f63012a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f63011b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    c(Uri uri, e eVar) {
        this.f63006a = uri;
        this.f63007b = eVar;
    }

    private static c e(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.c.e(context).n().g(), dVar, com.bumptech.glide.c.e(context).g(), context.getContentResolver()));
    }

    public static c f(Context context, Uri uri) {
        return e(context, uri, new a(context.getContentResolver()));
    }

    public static c g(Context context, Uri uri) {
        return e(context, uri, new b(context.getContentResolver()));
    }

    private InputStream h() throws Throwable {
        InputStream inputStreamD = this.f63007b.d(this.f63006a);
        int iA = inputStreamD != null ? this.f63007b.a(this.f63006a) : -1;
        return iA != -1 ? new g(inputStreamD, iA) : inputStreamD;
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f63008c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public dj.a c() {
        return dj.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void d(@NonNull h hVar, @NonNull com.bumptech.glide.load.data.d.a<? super InputStream> aVar) throws Throwable {
        try {
            InputStream inputStreamH = h();
            this.f63008c = inputStreamH;
            aVar.e(inputStreamH);
        } catch (FileNotFoundException e11) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e11);
            }
            aVar.f(e11);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
