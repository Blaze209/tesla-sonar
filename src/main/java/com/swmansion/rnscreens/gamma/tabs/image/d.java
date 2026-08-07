package com.swmansion.rnscreens.gamma.tabs.image;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import um.e;
import um.f;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\tH\u0002¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "uri", "Lcom/swmansion/rnscreens/gamma/tabs/a;", "view", "Ljn0/h0;", "loadTabImage", "(Landroid/content/Context;Ljava/lang/String;Lcom/swmansion/rnscreens/gamma/tabs/a;)V", "Lkotlin/Function1;", "Landroid/graphics/drawable/Drawable;", "onLoaded", "loadTabImageInternal", "(Landroid/content/Context;Ljava/lang/String;Lwn0/l;)V", "Lcom/swmansion/rnscreens/gamma/tabs/image/a;", "resolveTabImageSource", "(Landroid/content/Context;Ljava/lang/String;)Lcom/swmansion/rnscreens/gamma/tabs/image/a;", "react-native-screens_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class d {

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J%\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\t\u001a\u00020\u00062\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"com/swmansion/rnscreens/gamma/tabs/image/d$a", "Lcom/facebook/datasource/b;", "Ltk/a;", "Lum/e;", "Lcom/facebook/datasource/c;", "dataSource", "Ljn0/h0;", "onNewResultImpl", "(Lcom/facebook/datasource/c;)V", "onFailureImpl", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends com.facebook.datasource.b<tk.a<e>> {
        final /* synthetic */ Context $context;
        final /* synthetic */ l<Drawable, h0> $onLoaded;
        final /* synthetic */ String $uri;

        /* JADX WARN: Multi-variable type inference failed */
        a(Context context, l<? super Drawable, h0> lVar, String str) {
            this.$context = context;
            this.$onLoaded = lVar;
            this.$uri = str;
        }

        @Override // com.facebook.datasource.b
        protected void onFailureImpl(com.facebook.datasource.c<tk.a<e>> dataSource) {
            s.k(dataSource, "dataSource");
            Log.e("[RNScreens]", "Error loading image: " + this.$uri, dataSource.b());
        }

        @Override // com.facebook.datasource.b
        protected void onNewResultImpl(com.facebook.datasource.c<tk.a<e>> dataSource) {
            tk.a<e> result;
            s.k(dataSource, "dataSource");
            if (dataSource.isFinished() && (result = dataSource.getResult()) != null) {
                e eVarH = result.H();
                s.j(eVarH, "get(...)");
                e eVar = eVarH;
                if (eVar instanceof f) {
                    Bitmap bitmapT3 = ((f) eVar).t3();
                    s.j(bitmapT3, "getUnderlyingBitmap(...)");
                    Resources resources = this.$context.getResources();
                    s.j(resources, "getResources(...)");
                    this.$onLoaded.invoke(new BitmapDrawable(resources, bitmapT3));
                }
                result.close();
            }
        }
    }

    public static final void loadTabImage(Context context, String uri, final com.swmansion.rnscreens.gamma.tabs.a view) {
        s.k(context, "context");
        s.k(uri, "uri");
        s.k(view, "view");
        loadTabImageInternal(context, uri, new l() { // from class: com.swmansion.rnscreens.gamma.tabs.image.b
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d.loadTabImage$lambda$1(view, (Drawable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 loadTabImage$lambda$1(final com.swmansion.rnscreens.gamma.tabs.a aVar, final Drawable drawable) {
        s.k(drawable, "drawable");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.swmansion.rnscreens.gamma.tabs.image.c
            @Override // java.lang.Runnable
            public final void run() {
                aVar.setIcon(drawable);
            }
        });
        return h0.f84049a;
    }

    private static final void loadTabImageInternal(Context context, String str, l<? super Drawable, h0> lVar) {
        Uri uri;
        com.swmansion.rnscreens.gamma.tabs.image.a aVarResolveTabImageSource = resolveTabImageSource(context, str);
        if (aVarResolveTabImageSource == null) {
            return;
        }
        if (aVarResolveTabImageSource instanceof com.swmansion.rnscreens.gamma.tabs.image.a.DrawableRes) {
            uri = Uri.parse("res://" + context.getPackageName() + "/" + ((com.swmansion.rnscreens.gamma.tabs.image.a.DrawableRes) aVarResolveTabImageSource).getResId());
        } else {
            if (!(aVarResolveTabImageSource instanceof com.swmansion.rnscreens.gamma.tabs.image.a.UriString)) {
                throw new NoWhenBranchMatchedException();
            }
            uri = Uri.parse(((com.swmansion.rnscreens.gamma.tabs.image.a.UriString) aVarResolveTabImageSource).getUri());
        }
        el.d.a().k(ImageRequestBuilder.x(uri).a(), context).c(new a(context, lVar, str), nk.a.a());
    }

    private static final com.swmansion.rnscreens.gamma.tabs.image.a resolveTabImageSource(Context context, String str) {
        if (!t.b0(str, "_", false, 2, null)) {
            return new com.swmansion.rnscreens.gamma.tabs.image.a.UriString(str);
        }
        int identifier = context.getResources().getIdentifier(str, "drawable", context.getPackageName());
        if (identifier != 0) {
            return new com.swmansion.rnscreens.gamma.tabs.image.a.DrawableRes(identifier);
        }
        int identifier2 = context.getResources().getIdentifier(str, "raw", context.getPackageName());
        if (identifier2 != 0) {
            return new com.swmansion.rnscreens.gamma.tabs.image.a.DrawableRes(identifier2);
        }
        Log.e("[RNScreens]", "Resource not found in drawable or raw: " + str);
        return null;
    }
}
