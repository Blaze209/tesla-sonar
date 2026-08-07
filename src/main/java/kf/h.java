package kf;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.x;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.ui.core.internal.ui.LogoSize;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.common.internal.ImagesContract;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import me.Environment;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001aA\u0010\u000e\u001a\u00020\b*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aU\u0010\u0014\u001a\u00020\b*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0016\u001a\u00020\u0001*\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a/\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\"\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001b\"\u0018\u0010\u0004\u001a\u00020\u0003*\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Landroid/widget/ImageView;", "", ImagesContract.URL, "Lpe/b;", "imageLoader", "", "placeholder", "errorFallback", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Landroid/widget/ImageView;Ljava/lang/String;Lpe/b;II)V", "Lme/c;", AnalyticsAttribute.Environment, "path", "e", "(Landroid/widget/ImageView;Lme/c;Ljava/lang/String;Lpe/b;II)V", "txVariant", "txSubVariant", "Lcom/adyen/checkout/ui/core/internal/ui/LogoSize;", "size", "h", "(Landroid/widget/ImageView;Lme/c;Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/ui/core/internal/ui/LogoSize;Lpe/b;II)V", "b", "(I)Ljava/lang/String;", "densityExtension", "a", "(Lcom/adyen/checkout/ui/core/internal/ui/LogoSize;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lpe/b;", "localImageLoader", "Landroid/content/Context;", "c", "(Landroid/content/Context;)Lpe/b;", "ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static pe.b f85996a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.adyen.checkout.ui.core.internal.ui.ImageLoadingExtensionsKt$load$1", f = "ImageLoadingExtensions.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f85997n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f85998o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ pe.b f85999p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f86000q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ ImageView f86001r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f86002s;

        /* JADX INFO: renamed from: kf.h$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/graphics/Bitmap;", "it", "Ljn0/h0;", "<anonymous>", "(Landroid/graphics/Bitmap;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.adyen.checkout.ui.core.internal.ui.ImageLoadingExtensionsKt$load$1$1", f = "ImageLoadingExtensions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C1835a extends SuspendLambda implements wn0.p<Bitmap, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f86003n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            /* synthetic */ Object f86004o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ ImageView f86005p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1835a(ImageView imageView, Continuation<? super C1835a> continuation) {
                super(2, continuation);
                this.f86005p = imageView;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Bitmap bitmap, Continuation<? super h0> continuation) {
                return ((C1835a) create(bitmap, continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                C1835a c1835a = new C1835a(this.f86005p, continuation);
                c1835a.f86004o = obj;
                return c1835a;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f86003n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                this.f86005p.setImageBitmap((Bitmap) this.f86004o);
                return h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Ljn0/h0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.adyen.checkout.ui.core.internal.ui.ImageLoadingExtensionsKt$load$1$2", f = "ImageLoadingExtensions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends SuspendLambda implements wn0.p<Throwable, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f86006n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            /* synthetic */ Object f86007o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ CoroutineScope f86008p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ ImageView f86009q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ int f86010r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ String f86011s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(CoroutineScope coroutineScope, ImageView imageView, int i11, String str, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f86008p = coroutineScope;
                this.f86009q = imageView;
                this.f86010r = i11;
                this.f86011s = str;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                b bVar = new b(this.f86008p, this.f86009q, this.f86010r, this.f86011s, continuation);
                bVar.f86007o = obj;
                return bVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f86006n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                Throwable th2 = (Throwable) this.f86007o;
                CoroutineScope coroutineScope = this.f86008p;
                me.a aVar = me.a.WARN;
                String str = this.f86011s;
                me.b.Companion companion = me.b.INSTANCE;
                if (companion.a().a(aVar)) {
                    String name = coroutineScope.getClass().getName();
                    p013kotlin.jvm.internal.s.h(name);
                    String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                    if (strU1.length() != 0) {
                        name = p013kotlin.text.t.W0(strU1, "Kt");
                    }
                    me.b bVarA = companion.a();
                    bVarA.b(aVar, "CO." + name, "Failed loading image for " + str + " - " + o0.b(th2.getClass()).l() + ": " + th2.getMessage(), null);
                }
                this.f86009q.setImageResource(this.f86010r);
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(Throwable th2, Continuation<? super h0> continuation) {
                return ((b) create(th2, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(pe.b bVar, String str, ImageView imageView, int i11, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f85999p = bVar;
            this.f86000q = str;
            this.f86001r = imageView;
            this.f86002s = i11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f85999p, this.f86000q, this.f86001r, this.f86002s, continuation);
            aVar.f85998o = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f85997n;
            if (i11 == 0) {
                t.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f85998o;
                pe.b bVar = this.f85999p;
                String str = this.f86000q;
                C1835a c1835a = new C1835a(this.f86001r, null);
                b bVar2 = new b(coroutineScope, this.f86001r, this.f86002s, this.f86000q, null);
                this.f85997n = 1;
                if (bVar.a(str, c1835a, bVar2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    private static final String a(LogoSize logoSize, String str, String str2, String str3) {
        if (str2.length() != 0) {
            str = str + "/" + str2;
        }
        return "images/logos/" + logoSize + "/" + str + str3 + ".png";
    }

    private static final String b(int i11) {
        if (i11 <= 120) {
            return "-ldpi";
        }
        if (i11 <= 160) {
            return "";
        }
        if (i11 <= 240) {
            return "-hdpi";
        }
        if (i11 <= 320) {
            return "-xhdpi";
        }
        return i11 <= 480 ? "-xxhdpi" : "-xxxhdpi";
    }

    private static final pe.b c(Context context) {
        pe.b bVar = f85996a;
        if (bVar != null) {
            return bVar;
        }
        pe.a aVar = new pe.a(context);
        f85996a = aVar;
        return aVar;
    }

    public static final void d(ImageView imageView, String url, pe.b imageLoader, int i11, int i12) {
        androidx.p003lifecycle.r rVarA;
        p013kotlin.jvm.internal.s.k(imageView, "<this>");
        p013kotlin.jvm.internal.s.k(url, "url");
        p013kotlin.jvm.internal.s.k(imageLoader, "imageLoader");
        imageView.setImageResource(i11);
        LifecycleOwner lifecycleOwnerG = g(imageView.getContext());
        if (lifecycleOwnerG == null || (rVarA = x.a(lifecycleOwnerG)) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(rVarA, null, null, new a(imageLoader, url, imageView, i12, null), 3, null);
    }

    public static final void e(ImageView imageView, Environment environment, String path, pe.b imageLoader, int i11, int i12) {
        p013kotlin.jvm.internal.s.k(imageView, "<this>");
        p013kotlin.jvm.internal.s.k(environment, "environment");
        p013kotlin.jvm.internal.s.k(path, "path");
        p013kotlin.jvm.internal.s.k(imageLoader, "imageLoader");
        d(imageView, environment.getCheckoutShopperBaseUrl().toString() + path, imageLoader, i11, i12);
    }

    public static /* synthetic */ void f(ImageView imageView, String str, pe.b bVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            Context context = imageView.getContext();
            p013kotlin.jvm.internal.s.j(context, "getContext(...)");
            bVar = c(context);
        }
        if ((i13 & 4) != 0) {
            i11 = gf.e.f68799a;
        }
        if ((i13 & 8) != 0) {
            i12 = gf.e.f68799a;
        }
        d(imageView, str, bVar, i11, i12);
    }

    private static final LifecycleOwner g(Context context) {
        Object baseContext = context;
        while (!(baseContext instanceof LifecycleOwner)) {
            if (!(baseContext instanceof ContextWrapper)) {
                return null;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        return (LifecycleOwner) baseContext;
    }

    public static final void h(ImageView imageView, Environment environment, String txVariant, String txSubVariant, LogoSize size, pe.b imageLoader, int i11, int i12) {
        p013kotlin.jvm.internal.s.k(imageView, "<this>");
        p013kotlin.jvm.internal.s.k(environment, "environment");
        p013kotlin.jvm.internal.s.k(txVariant, "txVariant");
        p013kotlin.jvm.internal.s.k(txSubVariant, "txSubVariant");
        p013kotlin.jvm.internal.s.k(size, "size");
        p013kotlin.jvm.internal.s.k(imageLoader, "imageLoader");
        e(imageView, environment, a(size, txVariant, txSubVariant, b(imageView.getResources().getDisplayMetrics().densityDpi)), imageLoader, i11, i12);
    }

    public static /* synthetic */ void i(ImageView imageView, Environment environment, String str, String str2, LogoSize logoSize, pe.b bVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str2 = "";
        }
        String str3 = str2;
        if ((i13 & 8) != 0) {
            logoSize = LogoSize.SMALL;
        }
        LogoSize logoSize2 = logoSize;
        if ((i13 & 16) != 0) {
            Context context = imageView.getContext();
            p013kotlin.jvm.internal.s.j(context, "getContext(...)");
            bVar = c(context);
        }
        pe.b bVar2 = bVar;
        if ((i13 & 32) != 0) {
            i11 = gf.e.f68799a;
        }
        h(imageView, environment, str, str3, logoSize2, bVar2, i11, (i13 & 64) != 0 ? gf.e.f68799a : i12);
    }
}
