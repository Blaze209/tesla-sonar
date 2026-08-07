package androidx.core.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.wallet.WalletConstants;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, d2 = {"Landroid/view/View;", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/Bitmap;", "a", "(Landroid/view/View;Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "Lho0/i;", "Landroid/view/ViewParent;", "c", "(Landroid/view/View;)Lho0/i;", "ancestors", "b", "allViews", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class t0 {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lho0/k;", "Landroid/view/View;", "Ljn0/h0;", "<anonymous>", "(Lho0/k;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", i = {0}, l = {WalletConstants.ERROR_CODE_INVALID_TRANSACTION, WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"})
    static final class a extends RestrictedSuspendLambda implements wn0.p<ho0.k<? super View>, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f7854n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f7855o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ View f7856p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f7856p = view;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f7856p, continuation);
            aVar.f7855o = obj;
            return aVar;
        }

        @Override // wn0.p
        public final Object invoke(ho0.k<? super View> kVar, Continuation<? super jn0.h0> continuation) {
            return ((a) create(kVar, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        
            if (r1.d(r5, r4) == r0) goto L17;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.f7854n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r5)
                goto L4f
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                java.lang.Object r1 = r4.f7855o
                ho0.k r1 = (ho0.k) r1
                jn0.t.b(r5)
                goto L37
            L22:
                jn0.t.b(r5)
                java.lang.Object r5 = r4.f7855o
                r1 = r5
                ho0.k r1 = (ho0.k) r1
                android.view.View r5 = r4.f7856p
                r4.f7855o = r1
                r4.f7854n = r3
                java.lang.Object r5 = r1.b(r5, r4)
                if (r5 != r0) goto L37
                goto L4e
            L37:
                android.view.View r5 = r4.f7856p
                boolean r3 = r5 instanceof android.view.ViewGroup
                if (r3 == 0) goto L4f
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                ho0.i r5 = androidx.core.view.s0.b(r5)
                r3 = 0
                r4.f7855o = r3
                r4.f7854n = r2
                java.lang.Object r5 = r1.d(r5, r4)
                if (r5 != r0) goto L4f
            L4e:
                return r0
            L4f:
                jn0.h0 r5 = jn0.h0.f84049a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.t0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.l<ViewParent, ViewParent> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f7857a = new b();

        b() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewParent invoke(ViewParent viewParent) {
            return viewParent.getParent();
        }
    }

    public static final Bitmap a(View view, Bitmap.Config config) {
        if (!view.isLaidOut()) {
            throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static final ho0.i<View> b(View view) {
        return ho0.l.b(new a(view, null));
    }

    public static final ho0.i<ViewParent> c(View view) {
        return ho0.l.q(view.getParent(), b.f7857a);
    }
}
