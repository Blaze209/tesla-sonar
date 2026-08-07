package expo.modules.imageloader;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.c;
import com.google.android.gms.common.internal.ImagesContract;
import expo.modules.core.interfaces.InternalModule;
import expo.modules.interfaces.imageloader.ImageLoaderInterface;
import fj.a;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import vj.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0011\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0011\u0010\u0016J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lexpo/modules/imageloader/ImageLoaderModule;", "Lexpo/modules/core/interfaces/InternalModule;", "Lexpo/modules/interfaces/imageloader/ImageLoaderInterface;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", ImagesContract.URL, "normalizeAssetsUrl", "(Ljava/lang/String;)Ljava/lang/String;", "", "Ljava/lang/Class;", "getExportedInterfaces", "()Ljava/util/List;", "Ljava/util/concurrent/Future;", "Landroid/graphics/Bitmap;", "loadImageForDisplayFromURL", "(Ljava/lang/String;)Ljava/util/concurrent/Future;", "Lexpo/modules/interfaces/imageloader/ImageLoaderInterface$ResultListener;", "resultListener", "Ljn0/h0;", "(Ljava/lang/String;Lexpo/modules/interfaces/imageloader/ImageLoaderInterface$ResultListener;)V", "loadImageForManipulationFromURL", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "expo-image-loader_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ImageLoaderModule implements InternalModule, ImageLoaderInterface {
    private final Context context;

    public ImageLoaderModule(Context context) {
        s.k(context, "context");
        this.context = context;
    }

    private final String normalizeAssetsUrl(String url) {
        if (!t.b0(url, "asset:///", false, 2, null)) {
            return url;
        }
        return "file:///android_asset/" + v.A0(t.f1(url, new String[]{"/"}, false, 0, 6, null));
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // expo.modules.core.interfaces.InternalModule
    public List<Class<?>> getExportedInterfaces() {
        return v.e(ImageLoaderInterface.class);
    }

    @Override // expo.modules.interfaces.imageloader.ImageLoaderInterface
    public Future<Bitmap> loadImageForDisplayFromURL(String url) {
        s.k(url, "url");
        final SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
        loadImageForDisplayFromURL(url, new ImageLoaderInterface.ResultListener() { // from class: expo.modules.imageloader.ImageLoaderModule.loadImageForDisplayFromURL.1
            @Override // expo.modules.interfaces.imageloader.ImageLoaderInterface.ResultListener
            public void onFailure(Throwable cause) {
                simpleSettableFuture.setException(new ExecutionException(cause));
            }

            @Override // expo.modules.interfaces.imageloader.ImageLoaderInterface.ResultListener
            public void onSuccess(Bitmap bitmap) {
                s.k(bitmap, "bitmap");
                simpleSettableFuture.set(bitmap);
            }
        });
        return simpleSettableFuture;
    }

    @Override // expo.modules.interfaces.imageloader.ImageLoaderInterface
    public Future<Bitmap> loadImageForManipulationFromURL(String url) {
        s.k(url, "url");
        final SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
        loadImageForManipulationFromURL(url, new ImageLoaderInterface.ResultListener() { // from class: expo.modules.imageloader.ImageLoaderModule.loadImageForManipulationFromURL.1
            @Override // expo.modules.interfaces.imageloader.ImageLoaderInterface.ResultListener
            public void onFailure(Throwable cause) {
                simpleSettableFuture.setException(new ExecutionException(cause));
            }

            @Override // expo.modules.interfaces.imageloader.ImageLoaderInterface.ResultListener
            public void onSuccess(Bitmap bitmap) {
                s.k(bitmap, "bitmap");
                simpleSettableFuture.set(bitmap);
            }
        });
        return simpleSettableFuture;
    }

    @Override // expo.modules.interfaces.imageloader.ImageLoaderInterface
    public void loadImageForDisplayFromURL(String url, final ImageLoaderInterface.ResultListener resultListener) {
        s.k(url, "url");
        s.k(resultListener, "resultListener");
        c.C(this.context).asBitmap().mo70load(url).into(new uj.c<Bitmap>() { // from class: expo.modules.imageloader.ImageLoaderModule.loadImageForDisplayFromURL.2
            @Override // uj.j
            public void onLoadCleared(Drawable placeholder) {
            }

            @Override // uj.c, uj.j
            public void onLoadFailed(Drawable errorDrawable) {
                super.onLoadFailed(errorDrawable);
                resultListener.onFailure(new Exception("Loading bitmap failed"));
            }

            @Override // uj.j
            public /* bridge */ /* synthetic */ void onResourceReady(Object obj, b bVar) {
                onResourceReady((Bitmap) obj, (b<? super Bitmap>) bVar);
            }

            public void onResourceReady(Bitmap resource, b<? super Bitmap> transition) {
                s.k(resource, "resource");
                resultListener.onSuccess(resource);
            }
        });
    }

    @Override // expo.modules.interfaces.imageloader.ImageLoaderInterface
    public void loadImageForManipulationFromURL(String url, final ImageLoaderInterface.ResultListener resultListener) {
        s.k(url, "url");
        s.k(resultListener, "resultListener");
        c.C(this.context).asBitmap().diskCacheStrategy(a.f66013b).skipMemoryCache(true).mo70load(normalizeAssetsUrl(url)).into(new uj.c<Bitmap>() { // from class: expo.modules.imageloader.ImageLoaderModule.loadImageForManipulationFromURL.2
            @Override // uj.j
            public void onLoadCleared(Drawable placeholder) {
            }

            @Override // uj.c, uj.j
            public void onLoadFailed(Drawable errorDrawable) {
                super.onLoadFailed(errorDrawable);
                resultListener.onFailure(new Exception("Loading bitmap failed"));
            }

            @Override // uj.j
            public /* bridge */ /* synthetic */ void onResourceReady(Object obj, b bVar) {
                onResourceReady((Bitmap) obj, (b<? super Bitmap>) bVar);
            }

            public void onResourceReady(Bitmap resource, b<? super Bitmap> transition) {
                s.k(resource, "resource");
                resultListener.onSuccess(resource);
            }
        });
    }
}
