package com.fourthline.vision.internal;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes4.dex */
public class K2 implements InterfaceC4306w0, CoroutineScope, F5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageReader f37800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f37801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CoroutineContext f37802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private wn0.p f37803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Job f37804e;

    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f37805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f37806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Image f37807c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ K2 f37808d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Image image, K2 k11, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f37807c = image;
            this.f37808d = k11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f37807c, this.f37808d, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            AutoCloseable autoCloseable;
            Throwable th2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f37806b;
            if (i11 == 0) {
                jn0.t.b(obj);
                Image image = this.f37807c;
                if (image != null) {
                    try {
                        wn0.p pVar = this.f37808d.f37803d;
                        if (pVar != null) {
                            this.f37805a = image;
                            this.f37806b = 1;
                            if (pVar.invoke(image, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        autoCloseable = image;
                    } catch (Throwable th3) {
                        autoCloseable = image;
                        th2 = th3;
                        throw th2;
                    }
                }
                return jn0.h0.f84049a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            autoCloseable = (AutoCloseable) this.f37805a;
            try {
                jn0.t.b(obj);
            } catch (Throwable th4) {
                th2 = th4;
                try {
                    throw th2;
                } catch (Throwable th5) {
                    un0.a.a(autoCloseable, th2);
                    throw th5;
                }
            }
            jn0.h0 h0Var = jn0.h0.f84049a;
            un0.a.a(autoCloseable, null);
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public K2(ImageReader imageReader, Handler handler, CoroutineContext coroutineContext) {
        p013kotlin.jvm.internal.s.k(imageReader, "imageReader");
        p013kotlin.jvm.internal.s.k(handler, "handler");
        p013kotlin.jvm.internal.s.k(coroutineContext, "coroutineContext");
        this.f37800a = imageReader;
        this.f37801b = handler;
        this.f37802c = coroutineContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$2(K2 k11, ImageReader imageReader) {
        Objects.toString(imageReader);
        final Image imageAcquireLatestImage = imageReader != null ? imageReader.acquireLatestImage() : null;
        Job job = k11.f37804e;
        if (p013kotlin.jvm.internal.s.f(job != null ? Boolean.valueOf(job.isActive()) : null, Boolean.TRUE)) {
            if (imageAcquireLatestImage != null) {
                imageAcquireLatestImage.close();
            }
        } else {
            Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(k11, k11.getCoroutineContext(), null, new a(imageAcquireLatestImage, k11, null), 2, null);
            jobLaunch$default.invokeOnCompletion(new wn0.l() { // from class: com.fourthline.vision.internal.f8
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return K2.start$lambda$2$lambda$1$lambda$0(imageAcquireLatestImage, (Throwable) obj);
                }
            });
            k11.f37804e = jobLaunch$default;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 start$lambda$2$lambda$1$lambda$0(Image image, Throwable th2) {
        if (image != null) {
            image.close();
        }
        return jn0.h0.f84049a;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f37802c;
    }

    public final ImageReader getImageReader() {
        return this.f37800a;
    }

    public final Surface getSurface() {
        Surface surface = this.f37800a.getSurface();
        p013kotlin.jvm.internal.s.j(surface, "getSurface(...)");
        return surface;
    }

    @Override // com.fourthline.vision.internal.F5
    public void start() {
        this.f37800a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: com.fourthline.vision.internal.e8
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) {
                K2.start$lambda$2(this.f38302a, imageReader);
            }
        }, this.f37801b);
    }

    @Override // com.fourthline.vision.internal.F5
    public void stop() {
        Job job = this.f37804e;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f37800a.setOnImageAvailableListener(null, null);
    }

    @Override // com.fourthline.vision.internal.InterfaceC4306w0
    public void subscribe(wn0.p<? super Image, ? super Continuation<? super jn0.h0>, ? extends Object> pVar) {
        Objects.toString(pVar);
        this.f37803d = pVar;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4306w0
    public Image get() {
        return this.f37800a.acquireLatestImage();
    }
}
