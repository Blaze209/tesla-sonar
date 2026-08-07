package nj;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import dj.j;
import java.util.List;
import xj.k;

/* JADX INFO: loaded from: classes3.dex */
public class g implements j<Uri, Drawable> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final dj.g<Resources.Theme> f95062b = dj.g.e("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f95063a;

    public g(Context context) {
        this.f95063a = context.getApplicationContext();
    }

    @NonNull
    private Context d(Uri uri, @NonNull String str) {
        if (str.equals(this.f95063a.getPackageName())) {
            return this.f95063a;
        }
        try {
            return this.f95063a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e11) {
            if (str.contains(this.f95063a.getPackageName())) {
                return this.f95063a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e11);
        }
    }

    private int e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e11) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e11);
        }
    }

    private int f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    private int g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // dj.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public fj.c<Drawable> a(@NonNull Uri uri, int i11, int i12, @NonNull dj.h hVar) {
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context contextD = d(uri, authority);
            int iG = g(contextD, uri);
            Resources.Theme theme = ((String) k.d(authority)).equals(this.f95063a.getPackageName()) ? (Resources.Theme) hVar.c(f95062b) : null;
            return f.c(theme == null ? d.b(this.f95063a, contextD, iG) : d.a(this.f95063a, iG, theme));
        }
        throw new IllegalStateException("Package name for " + uri + " is null or empty");
    }

    @Override // dj.j
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull Uri uri, @NonNull dj.h hVar) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }
}
