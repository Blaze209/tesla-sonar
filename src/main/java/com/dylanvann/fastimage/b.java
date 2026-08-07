package com.dylanvann.fastimage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.h;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.HashMap;
import java.util.Map;
import jj.i;
import jj.k;

/* JADX INFO: loaded from: classes3.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Drawable f21518a = new ColorDrawable(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, FastImageCacheControl> f21519b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, h> f21520c = new C0429b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<String, ImageView.ScaleType> f21521d = new c();

    class a extends HashMap<String, FastImageCacheControl> {
        a() {
            put("immutable", FastImageCacheControl.IMMUTABLE);
            put("web", FastImageCacheControl.WEB);
            put("cacheOnly", FastImageCacheControl.CACHE_ONLY);
        }
    }

    /* JADX INFO: renamed from: com.dylanvann.fastimage.b$b, reason: collision with other inner class name */
    class C0429b extends HashMap<String, h> {
        C0429b() {
            put("low", h.LOW);
            put("normal", h.NORMAL);
            put("high", h.HIGH);
        }
    }

    class c extends HashMap<String, ImageView.ScaleType> {
        c() {
            put("contain", ImageView.ScaleType.FIT_CENTER);
            put("cover", ImageView.ScaleType.CENTER_CROP);
            put("stretch", ImageView.ScaleType.FIT_XY);
            put("center", ImageView.ScaleType.CENTER_INSIDE);
        }
    }

    static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21522a;

        static {
            int[] iArr = new int[FastImageCacheControl.values().length];
            f21522a = iArr;
            try {
                iArr[FastImageCacheControl.WEB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21522a[FastImageCacheControl.CACHE_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21522a[FastImageCacheControl.IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static FastImageCacheControl a(ReadableMap readableMap) {
        return (FastImageCacheControl) h("cache", "immutable", f21519b, readableMap);
    }

    static i b(ReadableMap readableMap) {
        i iVar = i.f83854b;
        if (!readableMap.hasKey("headers")) {
            return iVar;
        }
        ReadableMap map = readableMap.getMap("headers");
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
        k.a aVar = new k.a();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            aVar.a(strNextKey, map.getString(strNextKey));
        }
        return aVar.c();
    }

    static FastImageSource c(Context context, ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        return new FastImageSource(context, readableMap.getString("uri"), b(readableMap));
    }

    static com.bumptech.glide.request.i d(Context context, FastImageSource fastImageSource, ReadableMap readableMap) {
        h hVarE = e(readableMap);
        FastImageCacheControl fastImageCacheControlA = a(readableMap);
        fj.a aVar = fj.a.f66016e;
        int i11 = d.f21522a[fastImageCacheControlA.ordinal()];
        boolean z11 = false;
        boolean z12 = true;
        if (i11 == 1) {
            aVar = fj.a.f66013b;
        } else if (i11 != 2) {
            z12 = false;
        } else {
            z12 = false;
            z11 = true;
        }
        com.bumptech.glide.request.i iVarPlaceholder = new com.bumptech.glide.request.i().diskCacheStrategy(aVar).onlyRetrieveFromCache(z11).skipMemoryCache(z12).priority(hVarE).placeholder(f21518a);
        return fastImageSource.get_isResource() ? iVarPlaceholder.apply(com.bumptech.glide.request.i.signatureOf(wj.b.c(context))) : iVarPlaceholder;
    }

    private static h e(ReadableMap readableMap) {
        return (h) h("priority", "normal", f21520c, readableMap);
    }

    static ImageView.ScaleType f(String str) {
        return (ImageView.ScaleType) g("resizeMode", "cover", f21521d, str);
    }

    private static <T> T g(String str, String str2, Map<String, T> map, String str3) {
        if (str3 != null) {
            str2 = str3;
        }
        T t11 = map.get(str2);
        if (t11 != null) {
            return t11;
        }
        throw new JSApplicationIllegalArgumentException("FastImage, invalid " + str + " : " + str2);
    }

    private static <T> T h(String str, String str2, Map<String, T> map, ReadableMap readableMap) {
        String string = null;
        if (readableMap != null) {
            try {
                string = readableMap.getString(str);
            } catch (NoSuchKeyException unused) {
            }
        }
        return (T) g(str, str2, map, string);
    }
}
