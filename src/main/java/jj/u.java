package jj;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class u<DataT> implements o<Uri, DataT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f83904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o<Integer, DataT> f83905b;

    u(Context context, o<Integer, DataT> oVar) {
        this.f83904a = context.getApplicationContext();
        this.f83905b = oVar;
    }

    public static p<Uri, AssetFileDescriptor> e(Context context) {
        return new a(context);
    }

    public static p<Uri, InputStream> f(Context context) {
        return new b(context);
    }

    private o.a<DataT> g(@NonNull Uri uri, int i11, int i12, @NonNull dj.h hVar) {
        try {
            int i13 = Integer.parseInt(uri.getPathSegments().get(0));
            if (i13 != 0) {
                return this.f83905b.b(Integer.valueOf(i13), i11, i12, hVar);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
            }
            return null;
        } catch (NumberFormatException e11) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri, e11);
            }
            return null;
        }
    }

    private o.a<DataT> h(@NonNull Uri uri, int i11, int i12, @NonNull dj.h hVar) {
        List<String> pathSegments = uri.getPathSegments();
        int identifier = this.f83904a.getResources().getIdentifier(pathSegments.get(1), pathSegments.get(0), this.f83904a.getPackageName());
        if (identifier != 0) {
            return this.f83905b.b(Integer.valueOf(identifier), i11, i12, hVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
        return null;
    }

    @Override // jj.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<DataT> b(@NonNull Uri uri, int i11, int i12, @NonNull dj.h hVar) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return g(uri, i11, i12, hVar);
        }
        if (pathSegments.size() == 2) {
            return h(uri, i11, i12, hVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
        return null;
    }

    @Override // jj.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.f83904a.getPackageName().equals(uri.getAuthority());
    }

    private static final class a implements p<Uri, AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f83906a;

        a(Context context) {
            this.f83906a = context;
        }

        @Override // jj.p
        @NonNull
        public o<Uri, AssetFileDescriptor> e(@NonNull s sVar) {
            return new u(this.f83906a, sVar.d(Integer.class, AssetFileDescriptor.class));
        }

        @Override // jj.p
        public void d() {
        }
    }

    private static final class b implements p<Uri, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f83907a;

        b(Context context) {
            this.f83907a = context;
        }

        @Override // jj.p
        @NonNull
        public o<Uri, InputStream> e(@NonNull s sVar) {
            return new u(this.f83907a, sVar.d(Integer.class, InputStream.class));
        }

        @Override // jj.p
        public void d() {
        }
    }
}
