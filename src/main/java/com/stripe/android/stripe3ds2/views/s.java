package com.stripe.android.stripe3ds2.views;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.InputStream;
import jn0.h0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/s;", "", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lv80/b;", "imageCache", "Lcom/stripe/android/stripe3ds2/views/s$a;", "imageSupplier", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lv80/b;Lcom/stripe/android/stripe3ds2/views/s$a;)V", "Lr80/c;", "errorReporter", "(Lr80/c;Lkotlin/coroutines/CoroutineContext;)V", "", "imageUrl", "Landroid/graphics/Bitmap;", "f", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "g", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "image", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", "e", "a", "Lkotlin/coroutines/CoroutineContext;", "b", "Lv80/b;", "c", "Lcom/stripe/android/stripe3ds2/views/s$a;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v80.b imageCache;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a imageSupplier;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/s$a;", "", "", ImagesContract.URL, "Landroid/graphics/Bitmap;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.views.s$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/s$a$a;", "Lcom/stripe/android/stripe3ds2/views/s$a;", "Lr80/c;", "errorReporter", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Lr80/c;Lkotlin/coroutines/CoroutineContext;)V", "", ImagesContract.URL, "Landroid/graphics/Bitmap;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lr80/c;", "b", "Lkotlin/coroutines/CoroutineContext;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class C1088a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final r80.c errorReporter;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final CoroutineContext workContext;

            /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.views.s$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.stripe.android.stripe3ds2.views.ImageRepository$ImageSupplier$Default", f = "ImageRepository.kt", i = {0, 0}, l = {60}, m = "getBitmap", n = {"this", ImagesContract.URL}, s = {"L$0", "L$1"})
            static final class C1089a extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                Object f54333n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                Object f54334o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                /* synthetic */ Object f54335p;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f54337r;

                C1089a(Continuation<? super C1089a> continuation) {
                    super(continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f54335p = obj;
                    this.f54337r |= Integer.MIN_VALUE;
                    return C1088a.this.a(null, this);
                }
            }

            public C1088a(r80.c errorReporter, CoroutineContext workContext) {
                p013kotlin.jvm.internal.s.k(errorReporter, "errorReporter");
                p013kotlin.jvm.internal.s.k(workContext, "workContext");
                this.errorReporter = errorReporter;
                this.workContext = workContext;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // com.stripe.android.stripe3ds2.views.s.a
            public Object a(String str, Continuation<? super Bitmap> continuation) {
                C1089a c1089a;
                Throwable th2;
                C1088a c1088a;
                Object objB;
                Bitmap bitmapDecodeStream;
                if (continuation instanceof C1089a) {
                    c1089a = (C1089a) continuation;
                    int i11 = c1089a.f54337r;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c1089a.f54337r = i11 - Integer.MIN_VALUE;
                    } else {
                        c1089a = new C1089a(continuation);
                    }
                } else {
                    c1089a = new C1089a(continuation);
                }
                Object objH = c1089a.f54335p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = c1089a.f54337r;
                if (i12 == 0) {
                    jn0.t.b(objH);
                    try {
                        jn0.s.Companion companion = jn0.s.INSTANCE;
                        try {
                            com.stripe.android.stripe3ds2.transaction.r rVar = new com.stripe.android.stripe3ds2.transaction.r(str, null, this.errorReporter, this.workContext, 2, null);
                            c1089a.f54333n = this;
                            c1089a.f54334o = str;
                            c1089a.f54337r = 1;
                            objH = rVar.h(c1089a);
                            if (objH == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            c1088a = this;
                            str = str;
                        } catch (Throwable th3) {
                            th2 = th3;
                            c1088a = this;
                            str = str;
                            jn0.s.Companion companion2 = jn0.s.INSTANCE;
                            objB = jn0.s.b(jn0.t.a(th2));
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        c1088a = this;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) c1089a.f54334o;
                    c1088a = (C1088a) c1089a.f54333n;
                    try {
                        jn0.t.b(objH);
                    } catch (Throwable th5) {
                        th2 = th5;
                        jn0.s.Companion companion3 = jn0.s.INSTANCE;
                        objB = jn0.s.b(jn0.t.a(th2));
                    }
                }
                InputStream inputStream = (InputStream) objH;
                if (inputStream != null) {
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
                        sn0.b.a(inputStream, null);
                    } catch (Throwable th6) {
                        try {
                            throw th6;
                        } catch (Throwable th7) {
                            sn0.b.a(inputStream, th6);
                            throw th7;
                        }
                    }
                } else {
                    bitmapDecodeStream = null;
                }
                objB = jn0.s.b(bitmapDecodeStream);
                Throwable thE = jn0.s.e(objB);
                if (thE != null) {
                    c1088a.errorReporter.Y0(new RuntimeException("Could not get bitmap from url: " + str + ".", thE));
                }
                if (jn0.s.g(objB)) {
                    return null;
                }
                return objB;
            }
        }

        Object a(String str, Continuation<? super Bitmap> continuation);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.stripe3ds2.views.ImageRepository$getImage$2", f = "ImageRepository.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super Bitmap>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f54338n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f54339o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f54340p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f54341q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ s f54342r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, s sVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f54341q = str;
            this.f54342r = sVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new b(this.f54341q, this.f54342r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            s sVar;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f54340p;
            if (i11 == 0) {
                jn0.t.b(obj);
                String str2 = this.f54341q;
                if (str2 == null) {
                    return null;
                }
                sVar = this.f54342r;
                Bitmap bitmapF = sVar.f(str2);
                if (bitmapF != null) {
                    return bitmapF;
                }
                this.f54338n = sVar;
                this.f54339o = str2;
                this.f54340p = 1;
                Object objG = sVar.g(str2, this);
                if (objG == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = str2;
                obj = objG;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.f54339o;
                sVar = (s) this.f54338n;
                jn0.t.b(obj);
            }
            Bitmap bitmap = (Bitmap) obj;
            sVar.d(str, bitmap);
            return bitmap;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public s(CoroutineContext workContext, v80.b imageCache, a imageSupplier) {
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        p013kotlin.jvm.internal.s.k(imageCache, "imageCache");
        p013kotlin.jvm.internal.s.k(imageSupplier, "imageSupplier");
        this.workContext = workContext;
        this.imageCache = imageCache;
        this.imageSupplier = imageSupplier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(String imageUrl, Bitmap image) {
        if (image != null) {
            this.imageCache.a(imageUrl, image);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap f(String imageUrl) {
        return this.imageCache.get(imageUrl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(String str, Continuation<? super Bitmap> continuation) {
        return this.imageSupplier.a(str, continuation);
    }

    public final Object e(String str, Continuation<? super Bitmap> continuation) {
        return BuildersKt.withContext(this.workContext, new b(str, this, null), continuation);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(r80.c errorReporter, CoroutineContext workContext) {
        this(workContext, v80.b.a.f118418a, new a.C1088a(errorReporter, workContext));
        p013kotlin.jvm.internal.s.k(errorReporter, "errorReporter");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
    }
}
