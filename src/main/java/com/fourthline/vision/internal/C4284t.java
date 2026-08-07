package com.fourthline.vision.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.fourthline.vision.internal.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4284t implements CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f38871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4257p f38872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f38873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f38874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Matrix f38875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private wn0.a f38876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Job f38877g;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.t$a */
    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f38879b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a f38881d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(wn0.a<Rect> aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f38881d = aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            a aVar = C4284t.this.new a(this.f38881d, continuation);
            aVar.f38879b = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0029  */
        /* JADX WARN: Code duplicated, block: B:13:0x0035 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0033 -> B:14:0x0036). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f38878a
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r1 = r5.f38879b
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                jn0.t.b(r6)
                goto L36
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                jn0.t.b(r6)
                java.lang.Object r6 = r5.f38879b
                kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
                r1 = r6
            L23:
                boolean r6 = kotlinx.coroutines.CoroutineScopeKt.isActive(r1)
                if (r6 == 0) goto L6e
                r5.f38879b = r1
                r5.f38878a = r2
                r3 = 500(0x1f4, double:2.47E-321)
                java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r5)
                if (r6 != r0) goto L36
                return r0
            L36:
                com.fourthline.vision.internal.t r6 = com.fourthline.vision.internal.C4284t.this
                android.graphics.Matrix r6 = com.fourthline.vision.internal.C4284t.access$getCameraPreviewToScreenCoordsMatrix$p(r6)
                wn0.a r3 = r5.f38881d
                java.lang.Object r3 = r3.invoke()
                android.graphics.Rect r3 = (android.graphics.Rect) r3
                android.graphics.Rect r6 = com.fourthline.vision.internal.AbstractC4188f3.copyAndMapRect(r6, r3)
                com.fourthline.vision.internal.t r3 = com.fourthline.vision.internal.C4284t.this
                com.fourthline.vision.internal.C4284t.access$get_TAG$p(r3)
                wn0.a r3 = r5.f38881d
                java.lang.Object r3 = r3.invoke()
                java.util.Objects.toString(r3)
                com.fourthline.vision.internal.t r3 = com.fourthline.vision.internal.C4284t.this
                com.fourthline.vision.internal.C4284t.access$get_TAG$p(r3)
                java.util.Objects.toString(r6)
                com.fourthline.vision.internal.t r3 = com.fourthline.vision.internal.C4284t.this
                com.fourthline.vision.internal.p r3 = com.fourthline.vision.internal.C4284t.access$getCamera2$p(r3)
                com.fourthline.vision.internal.t r4 = com.fourthline.vision.internal.C4284t.this
                android.graphics.Rect r4 = com.fourthline.vision.internal.C4284t.access$getCameraPreviewRect$p(r4)
                r3.changeFocusArea$fourthline_vision_release(r6, r4)
                goto L23
            L6e:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.C4284t.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public C4284t(C4257p camera2, CoroutineScope coroutineScope) {
        String simpleName;
        p013kotlin.jvm.internal.s.k(camera2, "camera2");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f38871a = coroutineScope;
        this.f38872b = camera2;
        if (C4284t.class.isAnonymousClass()) {
            simpleName = C4284t.class.getName();
            int length = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length > 23) {
                simpleName = simpleName.substring(simpleName.length() - 23, simpleName.length());
                p013kotlin.jvm.internal.s.j(simpleName, "substring(...)");
            }
        } else {
            simpleName = C4284t.class.getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                simpleName = simpleName.substring(0, 23);
                p013kotlin.jvm.internal.s.j(simpleName, "substring(...)");
            }
        }
        this.f38873c = simpleName;
        this.f38874d = new Rect();
        this.f38875e = new Matrix();
        this.f38876f = new wn0.a() { // from class: com.fourthline.vision.internal.kb
            @Override // wn0.a
            public final Object invoke() {
                return C4284t.contentDetectionAreaProvider$lambda$0();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect contentDetectionAreaProvider$lambda$0() {
        return new Rect();
    }

    private final void onContentDetectionAreaFactoryChange(wn0.a<Rect> aVar) {
        stop();
        this.f38877g = BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(aVar, null), 3, null);
    }

    public final wn0.a<Rect> getContentDetectionAreaProvider() {
        return this.f38876f;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f38871a.getCoroutineContext();
    }

    public final void setContentDetectionAreaProvider(wn0.a<Rect> value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        this.f38876f = value;
        onContentDetectionAreaFactoryChange(value);
    }

    public final void setup(Rect screenRect, Rect cameraPreviewRect) {
        p013kotlin.jvm.internal.s.k(screenRect, "screenRect");
        p013kotlin.jvm.internal.s.k(cameraPreviewRect, "cameraPreviewRect");
        this.f38874d.set(cameraPreviewRect);
        this.f38875e.setTranslate((cameraPreviewRect.width() - screenRect.width()) * 0.5f, (cameraPreviewRect.height() - screenRect.height()) * 0.5f);
    }

    public final void stop() {
        Job job = this.f38877g;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }
}
