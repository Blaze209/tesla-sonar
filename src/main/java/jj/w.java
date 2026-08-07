package jj;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class w<Data> implements o<String, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o<Uri, Data> f83909a;

    public w(o<Uri, Data> oVar) {
        this.f83909a = oVar;
    }

    private static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return f(str);
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() == null ? f(str) : uri;
    }

    private static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // jj.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(@NonNull String str, int i11, int i12, @NonNull dj.h hVar) {
        Uri uriE = e(str);
        if (uriE == null || !this.f83909a.a(uriE)) {
            return null;
        }
        return this.f83909a.b(uriE, i11, i12, hVar);
    }

    @Override // jj.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull String str) {
        return true;
    }

    public static final class a implements p<String, AssetFileDescriptor> {
        @Override // jj.p
        public o<String, AssetFileDescriptor> e(@NonNull s sVar) {
            return new w(sVar.d(Uri.class, AssetFileDescriptor.class));
        }

        @Override // jj.p
        public void d() {
        }
    }

    public static class b implements p<String, ParcelFileDescriptor> {
        @Override // jj.p
        @NonNull
        public o<String, ParcelFileDescriptor> e(@NonNull s sVar) {
            return new w(sVar.d(Uri.class, ParcelFileDescriptor.class));
        }

        @Override // jj.p
        public void d() {
        }
    }

    public static class c implements p<String, InputStream> {
        @Override // jj.p
        @NonNull
        public o<String, InputStream> e(@NonNull s sVar) {
            return new w(sVar.d(Uri.class, InputStream.class));
        }

        @Override // jj.p
        public void d() {
        }
    }
}
