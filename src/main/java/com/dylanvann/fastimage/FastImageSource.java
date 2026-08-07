package com.dylanvann.fastimage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import jj.h;
import jj.i;

/* JADX INFO: loaded from: classes3.dex */
public class FastImageSource extends yo.a {
    private static final String ANDROID_ASSET_FILE_PREFIX = "file:///android_asset";
    private static final String ANDROID_ASSET_SCHEME = "asset";
    private static final String ANDROID_CONTENT_SCHEME = "content";
    private static final String ANDROID_RESOURCE_SCHEME = "android.resource";
    private static final String DATA_SCHEME = "data";
    private static final String LOCAL_FILE_SCHEME = "file";
    private static final String LOCAL_RESOURCE_SCHEME = "res";
    private final i mHeaders;
    private Uri mUri;

    public FastImageSource(Context context, String str) {
        this(context, str, null);
    }

    public static boolean isBase64Uri(Uri uri) {
        return DATA_SCHEME.equals(uri.getScheme());
    }

    public static boolean isContentUri(Uri uri) {
        return ANDROID_CONTENT_SCHEME.equals(uri.getScheme());
    }

    public static boolean isLocalFileUri(Uri uri) {
        return "file".equals(uri.getScheme());
    }

    public static boolean isLocalResourceUri(Uri uri) {
        return LOCAL_RESOURCE_SCHEME.equals(uri.getScheme());
    }

    public static boolean isResourceUri(Uri uri) {
        return ANDROID_RESOURCE_SCHEME.equals(uri.getScheme());
    }

    public h getGlideUrl() {
        return new h(getUri().toString(), getHeaders());
    }

    public i getHeaders() {
        return this.mHeaders;
    }

    public Object getSourceForLoad() {
        if (isContentUri()) {
            return getSource();
        }
        if (isBase64Resource()) {
            return getSource();
        }
        if (get_isResource()) {
            return getUri();
        }
        return isLocalFile() ? getUri().toString() : getGlideUrl();
    }

    @Override // yo.a
    public Uri getUri() {
        return this.mUri;
    }

    public boolean isBase64Resource() {
        Uri uri = this.mUri;
        return uri != null && isBase64Uri(uri);
    }

    public boolean isLocalFile() {
        Uri uri = this.mUri;
        return uri != null && isLocalFileUri(uri);
    }

    @Override // yo.a
    /* JADX INFO: renamed from: isResource */
    public boolean get_isResource() {
        Uri uri = this.mUri;
        return uri != null && isResourceUri(uri);
    }

    public FastImageSource(Context context, String str, i iVar) {
        this(context, str, 0.0d, 0.0d, iVar);
    }

    public boolean isContentUri() {
        Uri uri = this.mUri;
        return uri != null && isContentUri(uri);
    }

    public FastImageSource(Context context, String str, double d11, double d12, i iVar) {
        super(context, str, d11, d12);
        this.mHeaders = iVar == null ? i.f83854b : iVar;
        this.mUri = super.getUri();
        if (get_isResource() && TextUtils.isEmpty(this.mUri.toString())) {
            throw new Resources.NotFoundException("Local Resource Not Found. Resource: '" + getSource() + "'.");
        }
        if (isLocalResourceUri(this.mUri)) {
            this.mUri = Uri.parse(this.mUri.toString().replace("res:/", "android.resource://" + context.getPackageName() + "/"));
        }
        if (ANDROID_ASSET_SCHEME.equals(this.mUri.getScheme())) {
            this.mUri = Uri.parse(this.mUri.toString().replace("asset:/", "file:///android_asset/"));
        }
    }
}
