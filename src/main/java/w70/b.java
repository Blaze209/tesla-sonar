package w70;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\u0011J\u0017\u0010#\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\u00162\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010*\u001a\u00020\u00162\b\u0010)\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b*\u0010+J\u0019\u0010.\u001a\u00020\u00162\b\u0010-\u001a\u0004\u0018\u00010,H\u0017¢\u0006\u0004\b.\u0010/J\u0011\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0016H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u00192\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u000205H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0016H\u0016¢\u0006\u0004\b;\u00104J\u000f\u0010<\u001a\u00020\u0001H\u0016¢\u0006\u0004\b<\u0010=J\u001b\u0010A\u001a\u00020\u00162\n\u0010@\u001a\u00060>R\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0019H\u0016¢\u0006\u0004\bC\u0010 J\u0011\u0010E\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010I\u001a\u00020\u00162\u0006\u0010H\u001a\u00020GH\u0014¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u000fH\u0016¢\u0006\u0004\bK\u0010\u0011J\u000f\u0010L\u001a\u00020\u000fH\u0016¢\u0006\u0004\bL\u0010\u0011J\u0017\u0010N\u001a\u00020\u00192\u0006\u0010M\u001a\u00020GH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010Q\u001a\u00020PH\u0017¢\u0006\u0004\bQ\u0010RJ\u0017\u0010U\u001a\u00020\u00162\u0006\u0010T\u001a\u00020SH\u0016¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\u0001H\u0016¢\u0006\u0004\bW\u0010=J\u0017\u0010Z\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020XH\u0016¢\u0006\u0004\bZ\u0010[J\u0017\u0010]\u001a\u00020\u00162\u0006\u0010\\\u001a\u00020\u000fH\u0016¢\u0006\u0004\b]\u0010$J\u0019\u0010\u0017\u001a\u00020\u00162\b\u0010^\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b\u0017\u0010_J\u000f\u0010`\u001a\u00020\u000fH\u0017¢\u0006\u0004\b`\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR0\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010f¨\u0006g"}, d2 = {"Lw70/b;", "Landroid/graphics/drawable/Drawable;", "delegate", "Lkotlin/Function2;", "Lw70/g;", "Lkotlin/coroutines/Continuation;", "", "imageLoader", "paymentOption", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Landroid/graphics/drawable/Drawable;Lwn0/p;Lw70/g;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "getIntrinsicHeight", "()I", "getIntrinsicWidth", "color", "Landroid/graphics/PorterDuff$Mode;", "mode", "Ljn0/h0;", "setColorFilter", "(ILandroid/graphics/PorterDuff$Mode;)V", "", "dither", "setDither", "(Z)V", "filter", "setFilterBitmap", "isFilterBitmap", "()Z", "getAlpha", "tintColor", "setTint", "(I)V", "Landroid/content/res/ColorStateList;", "tint", "setTintList", "(Landroid/content/res/ColorStateList;)V", "tintMode", "setTintMode", "(Landroid/graphics/PorterDuff$Mode;)V", "Landroid/graphics/BlendMode;", "blendMode", "setTintBlendMode", "(Landroid/graphics/BlendMode;)V", "Landroid/graphics/ColorFilter;", "getColorFilter", "()Landroid/graphics/ColorFilter;", "clearColorFilter", "()V", "", "stateSet", "setState", "([I)Z", "getState", "()[I", "jumpToCurrentState", "getCurrent", "()Landroid/graphics/drawable/Drawable;", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "t", "applyTheme", "(Landroid/content/res/Resources$Theme;)V", "canApplyTheme", "Landroid/graphics/Region;", "getTransparentRegion", "()Landroid/graphics/Region;", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "getMinimumWidth", "getMinimumHeight", "padding", "getPadding", "(Landroid/graphics/Rect;)Z", "Landroid/graphics/Insets;", "getOpticalInsets", "()Landroid/graphics/Insets;", "Landroid/graphics/Outline;", "outline", "getOutline", "(Landroid/graphics/Outline;)V", "mutate", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "alpha", "setAlpha", "colorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "a", "Landroid/graphics/drawable/Drawable;", "b", "Lwn0/p;", "c", "Lw70/g;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class b extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private volatile Drawable delegate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.p<PaymentOption, Continuation<? super Drawable>, Object> imageLoader;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final PaymentOption paymentOption;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.model.DelegateDrawable$1", f = "PaymentOption.kt", i = {}, l = {98, 99}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f121109n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f121110o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ CoroutineDispatcher f121112q;

        /* JADX INFO: renamed from: w70.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.paymentsheet.model.DelegateDrawable$1$1", f = "PaymentOption.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C2593a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f121113n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ b f121114o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2593a(b bVar, Continuation<? super C2593a> continuation) {
                super(2, continuation);
                this.f121114o = bVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new C2593a(this.f121114o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f121113n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                b bVar = this.f121114o;
                b.super.setBounds(0, 0, bVar.delegate.getIntrinsicWidth(), this.f121114o.delegate.getIntrinsicHeight());
                this.f121114o.invalidateSelf();
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((C2593a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CoroutineDispatcher coroutineDispatcher, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f121112q = coroutineDispatcher;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new a(this.f121112q, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r6, r1, r5) == r0) goto L15;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f121110o
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r6)
                goto L56
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f121109n
                w70.b r1 = (w70.b) r1
                jn0.t.b(r6)
                goto L3c
            L22:
                jn0.t.b(r6)
                w70.b r1 = w70.b.this
                wn0.p r6 = w70.b.b(r1)
                w70.b r4 = w70.b.this
                w70.g r4 = w70.b.c(r4)
                r5.f121109n = r1
                r5.f121110o = r3
                java.lang.Object r6 = r6.invoke(r4, r5)
                if (r6 != r0) goto L3c
                goto L55
            L3c:
                android.graphics.drawable.Drawable r6 = (android.graphics.drawable.Drawable) r6
                w70.b.e(r1, r6)
                kotlinx.coroutines.CoroutineDispatcher r6 = r5.f121112q
                w70.b$a$a r1 = new w70.b$a$a
                w70.b r3 = w70.b.this
                r4 = 0
                r1.<init>(r3, r4)
                r5.f121109n = r4
                r5.f121110o = r2
                java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r6, r1, r5)
                if (r6 != r0) goto L56
            L55:
                return r0
            L56:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: w70.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(Drawable delegate, wn0.p<? super PaymentOption, ? super Continuation<? super Drawable>, ? extends Object> imageLoader, PaymentOption paymentOption, CoroutineScope scope, CoroutineDispatcher dispatcher) {
        s.k(delegate, "delegate");
        s.k(imageLoader, "imageLoader");
        s.k(paymentOption, "paymentOption");
        s.k(scope, "scope");
        s.k(dispatcher, "dispatcher");
        this.delegate = delegate;
        this.imageLoader = imageLoader;
        this.paymentOption = paymentOption;
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new a(dispatcher, null), 3, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme t11) {
        s.k(t11, "t");
        this.delegate.applyTheme(t11);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.delegate.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.delegate.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        s.k(canvas, "canvas");
        this.delegate.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.delegate.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.delegate.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.delegate;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.delegate.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.delegate.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.delegate.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.delegate.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    @jn0.e
    public int getOpacity() {
        return this.delegate.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public Insets getOpticalInsets() {
        Insets opticalInsets = this.delegate.getOpticalInsets();
        s.j(opticalInsets, "getOpticalInsets(...)");
        return opticalInsets;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        s.k(outline, "outline");
        this.delegate.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect padding) {
        s.k(padding, "padding");
        return this.delegate.getPadding(padding);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        int[] state = this.delegate.getState();
        s.j(state, "getState(...)");
        return state;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.delegate.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isFilterBitmap() {
        return this.delegate.isFilterBitmap();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.delegate.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        s.k(bounds, "bounds");
        this.delegate.setBounds(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.delegate.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    @jn0.e
    public void setColorFilter(int color, PorterDuff.Mode mode) {
        s.k(mode, "mode");
        this.delegate.setColorFilter(color, mode);
    }

    @Override // android.graphics.drawable.Drawable
    @jn0.e
    public void setDither(boolean dither) {
        this.delegate.setDither(dither);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean filter) {
        this.delegate.setFilterBitmap(filter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] stateSet) {
        s.k(stateSet, "stateSet");
        return this.delegate.setState(stateSet);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int tintColor) {
        this.delegate.setTint(tintColor);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintBlendMode(BlendMode blendMode) {
        this.delegate.setTintBlendMode(blendMode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList tint) {
        this.delegate.setTintList(tint);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode tintMode) {
        this.delegate.setTintMode(tintMode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.delegate.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        return this;
    }
}
