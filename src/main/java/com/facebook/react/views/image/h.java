package com.facebook.react.views.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.p;
import com.facebook.react.uimanager.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.List;
import ll.s;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import pm.n;
import um.m;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u0099\u00012\u00020\u0001:\u0004\u009a\u0001\u009b\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0014¢\u0006\u0004\b%\u0010\u0018J\u0015\u0010(\u001a\u00020\u00162\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00162\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020\u00162\u0006\u0010.\u001a\u00020*¢\u0006\u0004\b/\u0010-J\u0015\u00101\u001a\u00020\u00162\u0006\u00100\u001a\u00020*¢\u0006\u0004\b1\u0010-J\u0015\u00103\u001a\u00020\u00162\u0006\u00102\u001a\u00020&¢\u0006\u0004\b3\u0010)J\u0015\u00105\u001a\u00020\u00162\u0006\u00104\u001a\u00020&¢\u0006\u0004\b5\u0010)J\u001d\u00105\u001a\u00020\u00162\u0006\u00104\u001a\u00020&2\u0006\u00106\u001a\u00020*¢\u0006\u0004\b5\u00107J\u0015\u0010:\u001a\u00020\u00162\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\u0015\u0010>\u001a\u00020\u00162\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b>\u0010?J\u0015\u0010B\u001a\u00020\u00162\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CJ\u0015\u0010E\u001a\u00020\u00162\u0006\u0010D\u001a\u00020&¢\u0006\u0004\bE\u0010)J\u0017\u0010H\u001a\u00020\u00162\b\u0010G\u001a\u0004\u0018\u00010F¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020\u00162\b\u0010J\u001a\u0004\u0018\u00010\f¢\u0006\u0004\bK\u0010#J\u0017\u0010L\u001a\u00020\u00162\b\u0010J\u001a\u0004\u0018\u00010\f¢\u0006\u0004\bL\u0010#J\u0015\u0010N\u001a\u00020\u00162\u0006\u0010M\u001a\u00020\u0014¢\u0006\u0004\bN\u0010\u0018J\u0015\u0010P\u001a\u00020\u00162\u0006\u0010O\u001a\u00020*¢\u0006\u0004\bP\u0010-J\u0017\u0010S\u001a\u00020\u00162\b\u0010R\u001a\u0004\u0018\u00010Q¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u0014H\u0016¢\u0006\u0004\bU\u0010\u001aJ\u0017\u0010X\u001a\u00020\u00162\u0006\u0010W\u001a\u00020VH\u0016¢\u0006\u0004\bX\u0010YJ\r\u0010Z\u001a\u00020\u0016¢\u0006\u0004\bZ\u0010\u001cJ\u001f\u0010^\u001a\u00020\u00162\u000e\u0010]\u001a\n\u0012\u0004\u0012\u00020\\\u0018\u00010[H\u0007¢\u0006\u0004\b^\u0010_J/\u0010d\u001a\u00020\u00162\u0006\u0010`\u001a\u00020*2\u0006\u0010a\u001a\u00020*2\u0006\u0010b\u001a\u00020*2\u0006\u0010c\u001a\u00020*H\u0014¢\u0006\u0004\bd\u0010eR$\u0010\u0005\u001a\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010fR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001d0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u0018\u0010q\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010lR\u0018\u0010t\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010sR\u0018\u0010v\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010sR\u0016\u00100\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010wR\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010xR\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010yR\u0016\u0010{\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010zR\u001c\u0010~\u001a\b\u0018\u00010|R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010}R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\"\u0010\u0086\u0001\u001a\u000b\u0012\u0004\u0012\u00020\\\u0018\u00010\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R!\u0010\u0089\u0001\u001a\n\u0012\u0004\u0012\u00020\\\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0017\u0010\u008a\u0001\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010wR\u0018\u0010\u008c\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010zR\u001a\u0010R\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0019\u0010\u0091\u0001\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010A\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0015\u0010\u0094\u0001\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bu\u0010\u001aR\u001a\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0095\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001¨\u0006\u009c\u0001"}, d2 = {"Lcom/facebook/react/views/image/h;", "Lpl/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lil/b;", "draweeControllerBuilder", "Lcom/facebook/react/views/image/a;", "globalImageLoadListener", "", "callerContext", "<init>", "(Landroid/content/Context;Lil/b;Lcom/facebook/react/views/image/a;Ljava/lang/Object;)V", "", "cacheControl", "Lgo/a;", "k", "(Ljava/lang/String;)Lgo/a;", "Lcom/facebook/imagepipeline/request/a$c;", "l", "(Lgo/a;)Lcom/facebook/imagepipeline/request/a$c;", "", "doResize", "Ljn0/h0;", "p", "(Z)V", "m", "()Z", "q", "()V", "Lyo/a;", "imageSource", "r", "(Lyo/a;)Z", "uri", "s", "(Ljava/lang/String;)V", "shouldNotify", "setShouldNotifyLoadEvents", "", "blurRadius", "setBlurRadius", "(F)V", "", "backgroundColor", "setBackgroundColor", "(I)V", "borderColor", "setBorderColor", "overlayColor", "setOverlayColor", "borderWidth", "setBorderWidth", Snapshot.BORDER_RADIUS, "setBorderRadius", "position", "(FI)V", "Lll/s;", "scaleType", "setScaleType", "(Lll/s;)V", "Landroid/graphics/Shader$TileMode;", "tileMode", "setTileMode", "(Landroid/graphics/Shader$TileMode;)V", "Lcom/facebook/react/views/image/c;", "resizeMethod", "setResizeMethod", "(Lcom/facebook/react/views/image/c;)V", "multiplier", "setResizeMultiplier", "Lcom/facebook/react/bridge/ReadableArray;", "sources", "setSource", "(Lcom/facebook/react/bridge/ReadableArray;)V", "name", "setDefaultSource", "setLoadingIndicatorSource", "enabled", "setProgressiveRenderingEnabled", "durationMs", "setFadeDuration", "Lcom/facebook/react/bridge/ReadableMap;", "headers", "setHeaders", "(Lcom/facebook/react/bridge/ReadableMap;)V", "hasOverlappingRendering", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "o", "Lil/d;", "Lum/m;", "controllerListener", "setControllerListener", "(Lil/d;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Lil/b;", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/Object;", "", "j", "Ljava/util/List;", "Lyo/a;", "getImageSource$ReactAndroid_release", "()Lyo/a;", "setImageSource$ReactAndroid_release", "(Lyo/a;)V", "cachedImageSource", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable;", "defaultImageDrawable", "n", "loadingImageDrawable", "I", "Lll/s;", "Landroid/graphics/Shader$TileMode;", "Z", "isDirty", "Lcom/facebook/react/views/image/h$b;", "Lcom/facebook/react/views/image/h$b;", "tilePostprocessor", "Lzm/a;", "t", "Lzm/a;", "iterativeBoxBlurPostProcessor", "Lcom/facebook/react/views/image/g;", "u", "Lcom/facebook/react/views/image/g;", "downloadListener", "v", "Lil/d;", "controllerForTesting", "fadeDurationMs", "x", "progressiveRenderingEnabled", "y", "Lcom/facebook/react/bridge/ReadableMap;", "z", Gender.FEMALE, "resizeMultiplier", "A", "Lcom/facebook/react/views/image/c;", "isTiled", "Lom/f;", "getResizeOptions", "()Lom/f;", "resizeOptions", "B", "b", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h extends pl.d {

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Matrix C = new Matrix();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private com.facebook.react.views.image.c resizeMethod;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final il.b<?, ?, ?, ?> draweeControllerBuilder;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Object callerContext;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List<yo.a> sources;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private yo.a imageSource;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private yo.a cachedImageSource;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private Drawable defaultImageDrawable;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Drawable loadingImageDrawable;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int overlayColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private s scaleType;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private Shader.TileMode tileMode;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean isDirty;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private b tilePostprocessor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private zm.a iterativeBoxBlurPostProcessor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private g<m> downloadListener;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private il.d<m> controllerForTesting;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private int fadeDurationMs;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean progressiveRenderingEnabled;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private ReadableMap headers;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private float resizeMultiplier;

    /* JADX INFO: renamed from: com.facebook.react.views.image.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/views/image/h$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lml/a;", "b", "(Landroid/content/Context;)Lml/a;", "", "REMOTE_IMAGE_FADE_DURATION_MS", "I", "Landroid/graphics/Matrix;", "tileMatrix", "Landroid/graphics/Matrix;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ml.a b(Context context) {
            ml.b bVar = new ml.b(context.getResources());
            ml.e eVarA = ml.e.a(BitmapDescriptorFactory.HUE_RED);
            eVarA.s(true);
            ml.a aVarA = bVar.J(eVarA).a();
            p013kotlin.jvm.internal.s.j(aVarA, "build(...)");
            return aVarA;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/views/image/h$b;", "Lan/a;", "<init>", "(Lcom/facebook/react/views/image/h;)V", "Landroid/graphics/Bitmap;", "source", "Lmm/d;", "bitmapFactory", "Ltk/a;", "b", "(Landroid/graphics/Bitmap;Lmm/d;)Ltk/a;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class b extends an.a {
        public b() {
        }

        @Override // an.a, an.b
        public tk.a<Bitmap> b(Bitmap source, mm.d bitmapFactory) {
            p013kotlin.jvm.internal.s.k(source, "source");
            p013kotlin.jvm.internal.s.k(bitmapFactory, "bitmapFactory");
            Rect rect = new Rect(0, 0, h.this.getWidth(), h.this.getHeight());
            h.this.scaleType.a(h.C, rect, source.getWidth(), source.getHeight(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            BitmapShader bitmapShader = new BitmapShader(source, h.this.tileMode, h.this.tileMode);
            bitmapShader.setLocalMatrix(h.C);
            paint.setShader(bitmapShader);
            tk.a<Bitmap> aVarA = bitmapFactory.a(h.this.getWidth(), h.this.getHeight());
            p013kotlin.jvm.internal.s.j(aVarA, "createBitmap(...)");
            try {
                new Canvas(aVarA.H()).drawRect(rect, paint);
                tk.a<Bitmap> aVarClone = aVarA.clone();
                p013kotlin.jvm.internal.s.j(aVarClone, "clone(...)");
                return aVarClone;
            } finally {
                tk.a.C(aVarA);
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f23484b;

        static {
            int[] iArr = new int[go.a.values().length];
            try {
                iArr[go.a.ONLY_IF_CACHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f23483a = iArr;
            int[] iArr2 = new int[com.facebook.react.views.image.c.values().length];
            try {
                iArr2[com.facebook.react.views.image.c.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[com.facebook.react.views.image.c.RESIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            f23484b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/facebook/react/views/image/h$d", "Lcom/facebook/react/views/image/g;", "Lum/m;", "", "loaded", "total", "Ljn0/h0;", "y", "(II)V", "", "id", "", "callerContext", "l", "(Ljava/lang/String;Ljava/lang/Object;)V", "imageInfo", "Landroid/graphics/drawable/Animatable;", "animatable", "z", "(Ljava/lang/String;Lum/m;Landroid/graphics/drawable/Animatable;)V", "", "throwable", "n", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends g<m> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ EventDispatcher f23485f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ h f23486g;

        d(EventDispatcher eventDispatcher, h hVar) {
            this.f23485f = eventDispatcher;
            this.f23486g = hVar;
        }

        @Override // il.d
        public void l(String id2, Object callerContext) {
            p013kotlin.jvm.internal.s.k(id2, "id");
            EventDispatcher eventDispatcher = this.f23485f;
            if (eventDispatcher == null) {
                return;
            }
            eventDispatcher.h(com.facebook.react.views.image.b.INSTANCE.d(b1.f(this.f23486g), this.f23486g.getId()));
        }

        @Override // il.d
        public void n(String id2, Throwable throwable) {
            p013kotlin.jvm.internal.s.k(id2, "id");
            p013kotlin.jvm.internal.s.k(throwable, "throwable");
            EventDispatcher eventDispatcher = this.f23485f;
            if (eventDispatcher == null) {
                return;
            }
            eventDispatcher.h(com.facebook.react.views.image.b.INSTANCE.a(b1.f(this.f23486g), this.f23486g.getId(), throwable));
        }

        @Override // com.facebook.react.views.image.g
        public void y(int loaded, int total) {
            if (this.f23485f == null || this.f23486g.getImageSource() == null) {
                return;
            }
            EventDispatcher eventDispatcher = this.f23485f;
            com.facebook.react.views.image.b.Companion companion = com.facebook.react.views.image.b.INSTANCE;
            int iF = b1.f(this.f23486g);
            int id2 = this.f23486g.getId();
            yo.a imageSource = this.f23486g.getImageSource();
            eventDispatcher.h(companion.e(iF, id2, imageSource != null ? imageSource.getSource() : null, loaded, total));
        }

        @Override // il.d
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public void p(String id2, m imageInfo, Animatable animatable) {
            EventDispatcher eventDispatcher;
            p013kotlin.jvm.internal.s.k(id2, "id");
            if (imageInfo == null || this.f23486g.getImageSource() == null || (eventDispatcher = this.f23485f) == null) {
                return;
            }
            com.facebook.react.views.image.b.Companion companion = com.facebook.react.views.image.b.INSTANCE;
            int iF = b1.f(this.f23486g);
            int id3 = this.f23486g.getId();
            yo.a imageSource = this.f23486g.getImageSource();
            eventDispatcher.h(companion.c(iF, id3, imageSource != null ? imageSource.getSource() : null, imageInfo.getWidth(), imageInfo.getHeight()));
            this.f23485f.h(companion.b(b1.f(this.f23486g), this.f23486g.getId()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, il.b<?, ?, ?, ?> draweeControllerBuilder, a aVar, Object obj) {
        super(context, INSTANCE.b(context));
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(draweeControllerBuilder, "draweeControllerBuilder");
        this.draweeControllerBuilder = draweeControllerBuilder;
        this.callerContext = obj;
        this.sources = new ArrayList();
        this.scaleType = com.facebook.react.views.image.d.b();
        this.tileMode = com.facebook.react.views.image.d.a();
        this.fadeDurationMs = -1;
        this.resizeMultiplier = 1.0f;
        this.resizeMethod = com.facebook.react.views.image.c.AUTO;
        setLegacyVisibilityHandlingEnabled(true);
    }

    private final om.f getResizeOptions() {
        int iRound = Math.round(getWidth() * this.resizeMultiplier);
        int iRound2 = Math.round(getHeight() * this.resizeMultiplier);
        if (iRound <= 0 || iRound2 <= 0) {
            return null;
        }
        return new om.f(iRound, iRound2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        if (r2.equals("default") == false) goto L21;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final go.a k(java.lang.String r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L39
            int r0 = r2.hashCode()
            switch(r0) {
                case -1564134880: goto L2b;
                case -934641255: goto L1f;
                case 706834161: goto L13;
                case 1544803905: goto La;
                default: goto L9;
            }
        L9:
            goto L33
        La:
            java.lang.String r0 = "default"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L39
            goto L33
        L13:
            java.lang.String r0 = "only-if-cached"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1c
            goto L33
        L1c:
            go.a r2 = go.a.ONLY_IF_CACHED
            return r2
        L1f:
            java.lang.String r0 = "reload"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L28
            goto L33
        L28:
            go.a r2 = go.a.RELOAD
            return r2
        L2b:
            java.lang.String r0 = "force-cache"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L36
        L33:
            go.a r2 = go.a.DEFAULT
            return r2
        L36:
            go.a r2 = go.a.FORCE_CACHE
            return r2
        L39:
            go.a r2 = go.a.DEFAULT
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.image.h.k(java.lang.String):go.a");
    }

    private final com.facebook.imagepipeline.request.a.c l(go.a cacheControl) {
        return c.f23483a[cacheControl.ordinal()] == 1 ? com.facebook.imagepipeline.request.a.c.DISK_CACHE : com.facebook.imagepipeline.request.a.c.FULL_FETCH;
    }

    private final boolean m() {
        return this.sources.size() > 1;
    }

    private final boolean n() {
        return this.tileMode != Shader.TileMode.CLAMP;
    }

    private final void p(boolean doResize) {
        yo.a aVar = this.imageSource;
        if (aVar == null) {
            return;
        }
        Uri uri = aVar.getUri();
        go.a cacheControl = aVar.getCacheControl();
        com.facebook.imagepipeline.request.a.c cVarL = l(cacheControl);
        ArrayList arrayList = new ArrayList();
        zm.a aVar2 = this.iterativeBoxBlurPostProcessor;
        if (aVar2 != null) {
            arrayList.add(aVar2);
        }
        b bVar = this.tilePostprocessor;
        if (bVar != null) {
            arrayList.add(bVar);
        }
        an.b bVarA = e.INSTANCE.a(arrayList);
        om.f resizeOptions = doResize ? getResizeOptions() : null;
        if (cacheControl == go.a.RELOAD) {
            el.d.a().g(uri);
        }
        ImageRequestBuilder imageRequestBuilderI = ImageRequestBuilder.x(uri).J(bVarA).N(resizeOptions).y(true).K(this.progressiveRenderingEnabled).I(cVarL);
        com.facebook.react.views.image.c cVar = this.resizeMethod;
        com.facebook.react.views.image.c cVar2 = com.facebook.react.views.image.c.NONE;
        if (cVar == cVar2) {
            imageRequestBuilderI.E(n.NEVER);
        }
        go.b.Companion aVar3 = go.b.INSTANCE;
        p013kotlin.jvm.internal.s.h(imageRequestBuilderI);
        go.b bVarB = aVar3.b(imageRequestBuilderI, this.headers, cacheControl);
        il.b<?, ?, ?, ?> bVar2 = this.draweeControllerBuilder;
        p013kotlin.jvm.internal.s.i(bVar2, "null cannot be cast to non-null type com.facebook.drawee.controller.AbstractDraweeControllerBuilder<*, com.facebook.imagepipeline.request.ImageRequest, com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.CloseableImage>, com.facebook.imagepipeline.image.ImageInfo>");
        bVar2.z();
        bVar2.D(bVarB).A(true).a(getController());
        Object obj = this.callerContext;
        if (obj != null) {
            p013kotlin.jvm.internal.s.j(bVar2.B(obj), "setCallerContext(...)");
        }
        yo.a aVar4 = this.cachedImageSource;
        if (aVar4 != null) {
            ImageRequestBuilder imageRequestBuilderK = ImageRequestBuilder.x(aVar4.getUri()).J(bVarA).N(resizeOptions).y(true).K(this.progressiveRenderingEnabled);
            if (this.resizeMethod == cVar2) {
                imageRequestBuilderK.E(n.NEVER);
            }
            p013kotlin.jvm.internal.s.j(bVar2.E(imageRequestBuilderK.a()), "setLowResImageRequest(...)");
        }
        g<m> gVar = this.downloadListener;
        if (gVar == null || this.controllerForTesting == null) {
            il.d<m> dVar = this.controllerForTesting;
            if (dVar != null) {
                bVar2.C(dVar);
            } else if (gVar != null) {
                bVar2.C(gVar);
            }
        } else {
            il.f fVar = new il.f();
            fVar.a(this.downloadListener);
            fVar.a(this.controllerForTesting);
            bVar2.C(fVar);
        }
        if (this.downloadListener != null) {
            getHierarchy().B(this.downloadListener);
        }
        setController(bVar2.build());
        bVar2.z();
    }

    private final void q() {
        this.imageSource = null;
        if (this.sources.isEmpty()) {
            List<yo.a> list = this.sources;
            yo.a.Companion companion = yo.a.INSTANCE;
            Context context = getContext();
            p013kotlin.jvm.internal.s.j(context, "getContext(...)");
            list.add(companion.a(context));
        } else if (m()) {
            yo.b.a aVarA = yo.b.a(getWidth(), getHeight(), this.sources);
            this.imageSource = aVarA.bestResult;
            this.cachedImageSource = aVarA.bestResultInCache;
            return;
        }
        this.imageSource = this.sources.get(0);
    }

    private final boolean r(yo.a imageSource) {
        int i11 = c.f23484b[this.resizeMethod.ordinal()];
        if (i11 != 1) {
            return i11 == 2;
        }
        return xk.e.l(imageSource.getUri()) || xk.e.m(imageSource.getUri());
    }

    private final void s(String uri) {
        if (!ln.a.DEBUG || tn.b.c()) {
            return;
        }
        Context context = getContext();
        p013kotlin.jvm.internal.s.i(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        uo.c.e((ReactContext) context, "ReactImageView: Image source \"" + uri + "\" doesn't exist");
    }

    /* JADX INFO: renamed from: getImageSource$ReactAndroid_release, reason: from getter */
    public final yo.a getImageSource() {
        return this.imageSource;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public final void o() {
        if (this.isDirty) {
            if (!m() || (getWidth() > 0 && getHeight() > 0)) {
                q();
                yo.a aVar = this.imageSource;
                if (aVar == null) {
                    return;
                }
                boolean zR = r(aVar);
                if (!zR || (getWidth() > 0 && getHeight() > 0)) {
                    if (!n() || (getWidth() > 0 && getHeight() > 0)) {
                        ml.a hierarchy = getHierarchy();
                        hierarchy.v(this.scaleType);
                        Drawable drawable = this.defaultImageDrawable;
                        if (drawable != null) {
                            hierarchy.z(drawable, this.scaleType);
                        }
                        Drawable drawable2 = this.loadingImageDrawable;
                        if (drawable2 != null) {
                            hierarchy.z(drawable2, s.f90219g);
                        }
                        ml.e eVarQ = hierarchy.q();
                        if (eVarQ != null) {
                            int i11 = this.overlayColor;
                            if (i11 != 0) {
                                eVarQ.q(i11);
                            } else {
                                eVarQ.u(ml.e.a.BITMAP_ONLY);
                            }
                            hierarchy.C(eVarQ);
                        }
                        int i12 = this.fadeDurationMs;
                        if (i12 < 0) {
                            i12 = aVar.get_isResource() ? 0 : 300;
                        }
                        hierarchy.y(i12);
                        p(zR);
                        this.isDirty = false;
                    }
                }
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        p013kotlin.jvm.internal.s.k(canvas, "canvas");
        com.facebook.react.uimanager.a.a(this, canvas);
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e11) {
            if (this.downloadListener != null) {
                Context context = getContext();
                p013kotlin.jvm.internal.s.i(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                EventDispatcher eventDispatcherC = b1.c((ReactContext) context, getId());
                if (eventDispatcherC != null) {
                    eventDispatcherC.h(com.facebook.react.views.image.b.INSTANCE.a(b1.f(this), getId(), e11));
                }
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        if (w11 <= 0 || h11 <= 0) {
            return;
        }
        this.isDirty = this.isDirty || m() || n();
        o();
    }

    @Override // android.view.View
    public void setBackgroundColor(int backgroundColor) {
        com.facebook.react.uimanager.a.o(this, Integer.valueOf(backgroundColor));
    }

    public final void setBlurRadius(float blurRadius) {
        int iB = ((int) w.f23413a.b(blurRadius)) / 2;
        this.iterativeBoxBlurPostProcessor = iB == 0 ? null : new zm.a(2, iB);
        this.isDirty = true;
    }

    public final void setBorderColor(int borderColor) {
        com.facebook.react.uimanager.a.q(this, so.n.ALL, Integer.valueOf(borderColor));
    }

    public final void setBorderRadius(float borderRadius) {
        com.facebook.react.uimanager.a.r(this, so.d.BORDER_RADIUS, Float.isNaN(borderRadius) ? null : new LengthPercentage(w.f23413a.d(borderRadius), p.POINT));
    }

    public final void setBorderWidth(float borderWidth) {
        com.facebook.react.uimanager.a.t(this, so.n.ALL, Float.valueOf(borderWidth));
    }

    public final void setControllerListener(il.d<m> controllerListener) {
        this.controllerForTesting = controllerListener;
        this.isDirty = true;
        o();
    }

    public final void setDefaultSource(String name) {
        yo.c cVarA = yo.c.INSTANCE.a();
        Context context = getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        Drawable drawableE = cVarA.e(context, name);
        if (p013kotlin.jvm.internal.s.f(this.defaultImageDrawable, drawableE)) {
            return;
        }
        this.defaultImageDrawable = drawableE;
        this.isDirty = true;
    }

    public final void setFadeDuration(int durationMs) {
        this.fadeDurationMs = durationMs;
    }

    public final void setHeaders(ReadableMap headers) {
        this.headers = headers;
    }

    public final void setImageSource$ReactAndroid_release(yo.a aVar) {
        this.imageSource = aVar;
    }

    public final void setLoadingIndicatorSource(String name) {
        yo.c cVarA = yo.c.INSTANCE.a();
        Context context = getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        Drawable drawableE = cVarA.e(context, name);
        ll.b bVar = drawableE != null ? new ll.b(drawableE, 1000) : null;
        if (p013kotlin.jvm.internal.s.f(this.loadingImageDrawable, bVar)) {
            return;
        }
        this.loadingImageDrawable = bVar;
        this.isDirty = true;
    }

    public final void setOverlayColor(int overlayColor) {
        if (this.overlayColor != overlayColor) {
            this.overlayColor = overlayColor;
            this.isDirty = true;
        }
    }

    public final void setProgressiveRenderingEnabled(boolean enabled) {
        this.progressiveRenderingEnabled = enabled;
    }

    public final void setResizeMethod(com.facebook.react.views.image.c resizeMethod) {
        p013kotlin.jvm.internal.s.k(resizeMethod, "resizeMethod");
        if (this.resizeMethod != resizeMethod) {
            this.resizeMethod = resizeMethod;
            this.isDirty = true;
        }
    }

    public final void setResizeMultiplier(float multiplier) {
        if (Math.abs(this.resizeMultiplier - multiplier) > 9.999999747378752E-5d) {
            this.resizeMultiplier = multiplier;
            this.isDirty = true;
        }
    }

    public final void setScaleType(s scaleType) {
        p013kotlin.jvm.internal.s.k(scaleType, "scaleType");
        if (this.scaleType != scaleType) {
            this.scaleType = scaleType;
            this.isDirty = true;
        }
    }

    public final void setShouldNotifyLoadEvents(boolean shouldNotify) {
        if (shouldNotify == (this.downloadListener != null)) {
            return;
        }
        if (shouldNotify) {
            Context context = getContext();
            p013kotlin.jvm.internal.s.i(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            this.downloadListener = new d(b1.c((ReactContext) context, getId()), this);
        } else {
            this.downloadListener = null;
        }
        this.isDirty = true;
    }

    public final void setSource(ReadableArray sources) {
        ArrayList arrayList = new ArrayList();
        if (sources == null || sources.size() == 0) {
            yo.a.Companion companion = yo.a.INSTANCE;
            Context context = getContext();
            p013kotlin.jvm.internal.s.j(context, "getContext(...)");
            arrayList.add(companion.a(context));
        } else {
            if (sources.size() == 1) {
                ReadableMap map = sources.getMap(0);
                if (map == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                go.a aVarK = k(map.getString("cache"));
                Context context2 = getContext();
                p013kotlin.jvm.internal.s.j(context2, "getContext(...)");
                yo.a aVar = new yo.a(context2, map.getString("uri"), 0.0d, 0.0d, aVarK, 12, null);
                if (p013kotlin.jvm.internal.s.f(Uri.EMPTY, aVar.getUri())) {
                    s(map.getString("uri"));
                    yo.a.Companion companion2 = yo.a.INSTANCE;
                    Context context3 = getContext();
                    p013kotlin.jvm.internal.s.j(context3, "getContext(...)");
                    aVar = companion2.a(context3);
                }
                arrayList.add(aVar);
            } else {
                int size = sources.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ReadableMap map2 = sources.getMap(i11);
                    if (map2 != null) {
                        go.a aVarK2 = k(map2.getString("cache"));
                        Context context4 = getContext();
                        p013kotlin.jvm.internal.s.j(context4, "getContext(...)");
                        yo.a aVar2 = new yo.a(context4, map2.getString("uri"), map2.getDouble(Snapshot.WIDTH), map2.getDouble(Snapshot.HEIGHT), aVarK2);
                        if (p013kotlin.jvm.internal.s.f(Uri.EMPTY, aVar2.getUri())) {
                            s(map2.getString("uri"));
                            yo.a.Companion companion3 = yo.a.INSTANCE;
                            Context context5 = getContext();
                            p013kotlin.jvm.internal.s.j(context5, "getContext(...)");
                            aVar2 = companion3.a(context5);
                        }
                        arrayList.add(aVar2);
                    }
                }
            }
        }
        if (p013kotlin.jvm.internal.s.f(this.sources, arrayList)) {
            return;
        }
        this.sources.clear();
        this.sources.addAll(arrayList);
        this.isDirty = true;
    }

    public final void setTileMode(Shader.TileMode tileMode) {
        p013kotlin.jvm.internal.s.k(tileMode, "tileMode");
        if (this.tileMode != tileMode) {
            this.tileMode = tileMode;
            this.tilePostprocessor = n() ? new b() : null;
            this.isDirty = true;
        }
    }

    public final void setBorderRadius(float borderRadius, int position) {
        com.facebook.react.uimanager.a.r(this, so.d.values()[position], Float.isNaN(borderRadius) ? null : new LengthPercentage(w.f23413a.d(borderRadius), p.POINT));
    }
}
