package o90;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import jn0.h0;
import jn0.s;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.CancellableContinuationImpl;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0016\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lo90/e;", "", "<init>", "()V", "Landroid/graphics/BitmapFactory$Options;", "", ImagesContract.URL, "Landroid/graphics/Bitmap;", "e", "(Landroid/graphics/BitmapFactory$Options;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/net/URL;", "Ljava/io/InputStream;", "f", "(Ljava/net/URL;)Ljava/io/InputStream;", "options", "", "reqWidth", "reqHeight", "b", "(Landroid/graphics/BitmapFactory$Options;II)I", Snapshot.WIDTH, Snapshot.HEIGHT, "c", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f96983a = new a(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo90/e$a;", "", "<init>", "()V", "", "IMAGE_STREAM_TIMEOUT", "I", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.uicore.image.NetworkImageDecoder", f = "NetworkImageDecoder.kt", i = {0, 0, 0, 0, 0}, l = {28, 33}, m = "decode", n = {"this", ImagesContract.URL, "$this$decode_u24lambda_u240", Snapshot.WIDTH, Snapshot.HEIGHT}, s = {"L$0", "L$1", "L$2", "I$0", "I$1"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f96984n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f96985o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f96986p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f96987q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f96988r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f96989s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f96991u;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f96989s = obj;
            this.f96991u |= Integer.MIN_VALUE;
            return e.this.c(null, 0, 0, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements l<Throwable, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BitmapFactory.Options f96992c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ InputStream f96993d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(BitmapFactory.Options options, InputStream inputStream) {
            super(1);
            this.f96992c = options;
            this.f96993d = inputStream;
        }

        public final void a(Throwable th2) {
            InputStream inputStream = this.f96993d;
            try {
                s.Companion companion = s.INSTANCE;
                inputStream.close();
                s.b(h0.f84049a);
            } catch (Throwable th3) {
                s.Companion companion2 = s.INSTANCE;
                s.b(t.a(th3));
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
            a(th2);
            return h0.f84049a;
        }
    }

    private final int b(BitmapFactory.Options options, int reqWidth, int reqHeight) {
        Pair pairA = x.a(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int iIntValue = ((Number) pairA.a()).intValue();
        int iIntValue2 = ((Number) pairA.b()).intValue();
        int i11 = 1;
        if (iIntValue <= reqHeight && iIntValue2 <= reqWidth) {
            return 1;
        }
        int i12 = iIntValue / 2;
        int i13 = iIntValue2 / 2;
        while (i12 / i11 >= reqHeight && i13 / i11 >= reqWidth) {
            i11 *= 2;
        }
        return i11;
    }

    private final Object e(BitmapFactory.Options options, String str, Continuation<? super Bitmap> continuation) {
        Object objB;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        try {
            s.Companion companion = s.INSTANCE;
            InputStream inputStreamF = f(new URL(str));
            cancellableContinuationImpl.invokeOnCancellation(new c(options, inputStreamF));
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamF, null, options);
                sn0.b.a(inputStreamF, null);
                objB = s.b(bitmapDecodeStream);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(inputStreamF, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            s.Companion companion2 = s.INSTANCE;
            objB = s.b(t.a(th4));
        }
        Throwable thE = s.e(objB);
        if (thE == null) {
            cancellableContinuationImpl.resumeWith(s.b((Bitmap) objB));
        } else {
            cancellableContinuationImpl.resumeWith(s.b(t.a(thE)));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InputStream f(URL url) throws IOException {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
        p013kotlin.jvm.internal.s.j(uRLConnection, "openConnection(...)");
        uRLConnection.setConnectTimeout(10000);
        uRLConnection.setReadTimeout(10000);
        InputStream inputStream = uRLConnection.getInputStream();
        p013kotlin.jvm.internal.s.j(inputStream, "getInputStream(...)");
        return inputStream;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        if (r9 == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r6, int r7, int r8, p013kotlin.coroutines.Continuation<? super android.graphics.Bitmap> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof o90.e.b
            if (r0 == 0) goto L13
            r0 = r9
            o90.e$b r0 = (o90.e.b) r0
            int r1 = r0.f96991u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f96991u = r1
            goto L18
        L13:
            o90.e$b r0 = new o90.e$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f96989s
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f96991u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            jn0.t.b(r9)
            goto L81
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            int r8 = r0.f96988r
            int r7 = r0.f96987q
            java.lang.Object r6 = r0.f96986p
            android.graphics.BitmapFactory$Options r6 = (android.graphics.BitmapFactory.Options) r6
            java.lang.Object r2 = r0.f96985o
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.f96984n
            o90.e r4 = (o90.e) r4
            jn0.t.b(r9)
            goto L68
        L48:
            jn0.t.b(r9)
            android.graphics.BitmapFactory$Options r9 = new android.graphics.BitmapFactory$Options
            r9.<init>()
            r9.inJustDecodeBounds = r4
            r0.f96984n = r5
            r0.f96985o = r6
            r0.f96986p = r9
            r0.f96987q = r7
            r0.f96988r = r8
            r0.f96991u = r4
            java.lang.Object r2 = r5.e(r9, r6, r0)
            if (r2 != r1) goto L65
            goto L80
        L65:
            r4 = r5
            r2 = r6
            r6 = r9
        L68:
            int r7 = r4.b(r6, r7, r8)
            r6.inSampleSize = r7
            r7 = 0
            r6.inJustDecodeBounds = r7
            r7 = 0
            r0.f96984n = r7
            r0.f96985o = r7
            r0.f96986p = r7
            r0.f96991u = r3
            java.lang.Object r9 = r4.e(r6, r2, r0)
            if (r9 != r1) goto L81
        L80:
            return r1
        L81:
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o90.e.c(java.lang.String, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object d(String str, Continuation<? super Bitmap> continuation) {
        Object objE = e(new BitmapFactory.Options(), str, continuation);
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : (Bitmap) objE;
    }
}
