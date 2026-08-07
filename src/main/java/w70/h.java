package w70;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import f30.d0;
import jn0.t;
import n70.u;
import p008h80.b0;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendFunction;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u001dB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0081@¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010 ¨\u0006!"}, d2 = {"Lw70/h;", "", "Landroid/content/res/Resources;", "resources", "Lo90/f;", "imageLoader", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/res/Resources;Lo90/f;Landroid/content/Context;)V", "", "e", "()Z", "Lw70/j$f;", "selection", "Lx30/c;", DateTokenConverter.CONVERTER_KEY, "(Lw70/j$f;)Lx30/c;", "", "c", "(Lw70/j$f;)I", "Lw70/g;", "paymentOption", "Landroid/graphics/drawable/Drawable;", "h", "(Lw70/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lw70/j;", "b", "(Lw70/j;)Lw70/g;", "a", "Landroid/content/res/Resources;", "Lo90/f;", "Landroid/content/Context;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f121126e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ShapeDrawable f121127f = new ShapeDrawable();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Resources resources;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o90.f imageLoader;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f121131a;

        static {
            int[] iArr = new int[w70.j.Saved.b.values().length];
            try {
                iArr[w70.j.Saved.b.Link.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w70.j.Saved.b.GooglePay.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f121131a = iArr;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class c extends p013kotlin.jvm.internal.p implements wn0.p<PaymentOption, Continuation<? super Drawable>, Object>, SuspendFunction {
        c(Object obj) {
            super(2, obj, h.class, "loadPaymentOption", "loadPaymentOption$paymentsheet_release(Lcom/stripe/android/paymentsheet/model/PaymentOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PaymentOption paymentOption, Continuation<? super Drawable> continuation) {
            return ((h) this.receiver).h(paymentOption, continuation);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class d extends p013kotlin.jvm.internal.p implements wn0.p<PaymentOption, Continuation<? super Drawable>, Object>, SuspendFunction {
        d(Object obj) {
            super(2, obj, h.class, "loadPaymentOption", "loadPaymentOption$paymentsheet_release(Lcom/stripe/android/paymentsheet/model/PaymentOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PaymentOption paymentOption, Continuation<? super Drawable> continuation) {
            return ((h) this.receiver).h(paymentOption, continuation);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class e extends p013kotlin.jvm.internal.p implements wn0.p<PaymentOption, Continuation<? super Drawable>, Object>, SuspendFunction {
        e(Object obj) {
            super(2, obj, h.class, "loadPaymentOption", "loadPaymentOption$paymentsheet_release(Lcom/stripe/android/paymentsheet/model/PaymentOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PaymentOption paymentOption, Continuation<? super Drawable> continuation) {
            return ((h) this.receiver).h(paymentOption, continuation);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class f extends p013kotlin.jvm.internal.p implements wn0.p<PaymentOption, Continuation<? super Drawable>, Object>, SuspendFunction {
        f(Object obj) {
            super(2, obj, h.class, "loadPaymentOption", "loadPaymentOption$paymentsheet_release(Lcom/stripe/android/paymentsheet/model/PaymentOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PaymentOption paymentOption, Continuation<? super Drawable> continuation) {
            return ((h) this.receiver).h(paymentOption, continuation);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class g extends p013kotlin.jvm.internal.p implements wn0.p<PaymentOption, Continuation<? super Drawable>, Object>, SuspendFunction {
        g(Object obj) {
            super(2, obj, h.class, "loadPaymentOption", "loadPaymentOption$paymentsheet_release(Lcom/stripe/android/paymentsheet/model/PaymentOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PaymentOption paymentOption, Continuation<? super Drawable> continuation) {
            return ((h) this.receiver).h(paymentOption, continuation);
        }
    }

    /* JADX INFO: renamed from: w70.h$h, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class C2594h extends p013kotlin.jvm.internal.p implements wn0.p<PaymentOption, Continuation<? super Drawable>, Object>, SuspendFunction {
        C2594h(Object obj) {
            super(2, obj, h.class, "loadPaymentOption", "loadPaymentOption$paymentsheet_release(Lcom/stripe/android/paymentsheet/model/PaymentOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PaymentOption paymentOption, Continuation<? super Drawable> continuation) {
            return ((h) this.receiver).h(paymentOption, continuation);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class i extends p013kotlin.jvm.internal.p implements wn0.p<PaymentOption, Continuation<? super Drawable>, Object>, SuspendFunction {
        i(Object obj) {
            super(2, obj, h.class, "loadPaymentOption", "loadPaymentOption$paymentsheet_release(Lcom/stripe/android/paymentsheet/model/PaymentOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PaymentOption paymentOption, Continuation<? super Drawable> continuation) {
            return ((h) this.receiver).h(paymentOption, continuation);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class j extends p013kotlin.jvm.internal.p implements wn0.p<PaymentOption, Continuation<? super Drawable>, Object>, SuspendFunction {
        j(Object obj) {
            super(2, obj, h.class, "loadPaymentOption", "loadPaymentOption$paymentsheet_release(Lcom/stripe/android/paymentsheet/model/PaymentOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PaymentOption paymentOption, Continuation<? super Drawable> continuation) {
            return ((h) this.receiver).h(paymentOption, continuation);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.model.PaymentOptionFactory", f = "PaymentOptionFactory.kt", i = {0, 0}, l = {46}, m = "loadPaymentOption$loadIcon", n = {"this$0", "$paymentOption"}, s = {"L$0", "L$1"})
    static final class k extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f121132n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f121133o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f121134p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f121135q;

        k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f121134p = obj;
            this.f121135q |= Integer.MIN_VALUE;
            return h.f(null, null, null, this);
        }
    }

    public h(Resources resources, o90.f imageLoader, Context context) {
        s.k(resources, "resources");
        s.k(imageLoader, "imageLoader");
        s.k(context, "context");
        this.resources = resources;
        this.imageLoader = imageLoader;
        this.context = context;
    }

    private final int c(w70.j.Saved selection) {
        int iG = b0.g(selection.getPaymentMethod(), false, 1, null);
        if (iG == u.f93484p) {
            w70.j.Saved.b walletType = selection.getWalletType();
            int i11 = walletType == null ? -1 : b.f121131a[walletType.ordinal()];
            if (i11 == 1) {
                return u.f93489u;
            }
            if (i11 == 2) {
                return u.f93470b;
            }
        }
        return iG;
    }

    private final x30.c d(w70.j.Saved selection) {
        x30.c cVarD = b0.d(selection.getPaymentMethod());
        if (cVarD != null) {
            return cVarD;
        }
        w70.j.Saved.b walletType = selection.getWalletType();
        int i11 = walletType == null ? -1 : b.f121131a[walletType.ordinal()];
        if (i11 == 1) {
            return x30.d.a(d0.B0);
        }
        if (i11 != 2) {
            return null;
        }
        return x30.d.a(d0.f63973t0);
    }

    private final boolean e() {
        Configuration configuration = this.resources.getConfiguration();
        return configuration != null && (configuration.uiMode & 48) == 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object f(h hVar, PaymentOption paymentOption, String str, Continuation<? super Drawable> continuation) {
        k kVar;
        Object objH;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i11 = kVar.f121135q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f121135q = i11 - Integer.MIN_VALUE;
            } else {
                kVar = new k(continuation);
            }
        } else {
            kVar = new k(continuation);
        }
        Object obj = kVar.f121134p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kVar.f121135q;
        if (i12 == 0) {
            t.b(obj);
            o90.f fVar = hVar.imageLoader;
            kVar.f121132n = hVar;
            kVar.f121133o = paymentOption;
            kVar.f121135q = 1;
            objH = fVar.h(str, kVar);
            if (objH == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paymentOption = (PaymentOption) kVar.f121133o;
            hVar = (h) kVar.f121132n;
            t.b(obj);
            objH = ((jn0.s) obj).getValue();
        }
        if (jn0.s.g(objH)) {
            objH = null;
        }
        Bitmap bitmap = (Bitmap) objH;
        return bitmap != null ? new BitmapDrawable(hVar.resources, bitmap) : g(hVar, paymentOption);
    }

    private static final Drawable g(h hVar, PaymentOption paymentOption) {
        Object objB;
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(j5.h.f(hVar.resources, paymentOption.getDrawableResourceId(), null));
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        Drawable drawable = (Drawable) (jn0.s.g(objB) ? null : objB);
        return drawable == null ? f121127f : drawable;
    }

    public final PaymentOption b(w70.j selection) {
        String strB2;
        s.k(selection, "selection");
        if (s.f(selection, w70.j.c.f121146b)) {
            int i11 = u.f93470b;
            String string = this.resources.getString(d0.f63973t0);
            c cVar = new c(this);
            s.h(string);
            return new PaymentOption(i11, string, null, null, cVar, null, null, 96, null);
        }
        if (s.f(selection, w70.j.d.f121147b)) {
            int i12 = u.f93489u;
            String string2 = this.resources.getString(d0.B0);
            d dVar = new d(this);
            s.h(string2);
            return new PaymentOption(i12, string2, null, null, dVar, null, null, 96, null);
        }
        if (selection instanceof w70.j.Saved) {
            w70.j.Saved saved = (w70.j.Saved) selection;
            int iC = c(saved);
            x30.c cVarD = d(saved);
            strB2 = cVarD != null ? cVarD.B2(this.context) : null;
            return new PaymentOption(iC, strB2 == null ? "" : strB2, null, null, new e(this), null, null, 96, null);
        }
        if (selection instanceof w70.j.e.Card) {
            w70.j.e.Card card = (w70.j.e.Card) selection;
            int iB = b0.b(card.getBrand());
            x30.c cVarA = b0.a(card.getLast4());
            strB2 = cVarA != null ? cVarA.B2(this.context) : null;
            return new PaymentOption(iB, strB2 == null ? "" : strB2, null, null, new f(this), null, null, 96, null);
        }
        if (selection instanceof w70.j.e.LinkInline) {
            w70.j.e.LinkInline linkInline = (w70.j.e.LinkInline) selection;
            return new PaymentOption(linkInline.getIconResource(), linkInline.getLabel(), null, null, new g(this), null, null, 96, null);
        }
        if (selection instanceof w70.j.e.GenericPaymentMethod) {
            w70.j.e.GenericPaymentMethod genericPaymentMethod = (w70.j.e.GenericPaymentMethod) selection;
            return new PaymentOption(genericPaymentMethod.getIconResource(), genericPaymentMethod.getLabel().B2(this.context), genericPaymentMethod.getLightThemeIconUrl(), genericPaymentMethod.getDarkThemeIconUrl(), new C2594h(this), null, null, 96, null);
        }
        if (selection instanceof w70.j.e.USBankAccount) {
            w70.j.e.USBankAccount uSBankAccount = (w70.j.e.USBankAccount) selection;
            return new PaymentOption(uSBankAccount.getIconResource(), uSBankAccount.getLabelResource(), null, null, new i(this), null, null, 96, null);
        }
        if (!(selection instanceof w70.j.ExternalPaymentMethod)) {
            throw new NoWhenBranchMatchedException();
        }
        w70.j.ExternalPaymentMethod externalPaymentMethod = (w70.j.ExternalPaymentMethod) selection;
        return new PaymentOption(externalPaymentMethod.getIconResource(), externalPaymentMethod.getLabel().B2(this.context), externalPaymentMethod.getLightThemeIconUrl(), externalPaymentMethod.getDarkThemeIconUrl(), new j(this), null, null, 96, null);
    }

    public final Object h(PaymentOption paymentOption, Continuation<? super Drawable> continuation) {
        String lightThemeIconUrl = paymentOption.getLightThemeIconUrl();
        String darkThemeIconUrl = paymentOption.getDarkThemeIconUrl();
        if (!e() || darkThemeIconUrl == null) {
            return lightThemeIconUrl != null ? f(this, paymentOption, lightThemeIconUrl, continuation) : g(this, paymentOption);
        }
        return f(this, paymentOption, darkThemeIconUrl, continuation);
    }
}
