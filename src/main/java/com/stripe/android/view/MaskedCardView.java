package com.stripe.android.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.PaymentMethod;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR(\u0010%\u001a\u0004\u0018\u00010!2\b\u0010\u001c\u001a\u0004\u0018\u00010!8G@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010*\u001a\u00020&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/stripe/android/view/MaskedCardView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/ImageView;", "imageView", "Ljn0/h0;", "a", "(Landroid/widget/ImageView;)V", DateTokenConverter.CONVERTER_KEY, "()V", "b", "c", "", "selected", "setSelected", "(Z)V", "Lcom/stripe/android/model/v0;", "paymentMethod", "setPaymentMethod", "(Lcom/stripe/android/model/v0;)V", "Lcom/stripe/android/model/h;", "<set-?>", "Lcom/stripe/android/model/h;", "getCardBrand", "()Lcom/stripe/android/model/h;", "cardBrand", "", "Ljava/lang/String;", "getLast4", "()Ljava/lang/String;", "last4", "Lh40/r;", "Lh40/r;", "getViewBinding$payments_core_release", "()Lh40/r;", "viewBinding", "Lcom/stripe/android/view/x2;", "Lcom/stripe/android/view/x2;", "themeConfig", "Lcom/stripe/android/view/y;", "e", "Lcom/stripe/android/view/y;", "cardDisplayFactory", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MaskedCardView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private com.stripe.android.model.h cardBrand;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String last4;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h40.r viewBinding;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final x2 themeConfig;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final y cardDisplayFactory;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f54585a;

        static {
            int[] iArr = new int[com.stripe.android.model.h.values().length];
            try {
                iArr[com.stripe.android.model.h.AmericanExpress.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.stripe.android.model.h.Discover.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.stripe.android.model.h.JCB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.stripe.android.model.h.DinersClub.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.stripe.android.model.h.Visa.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[com.stripe.android.model.h.MasterCard.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[com.stripe.android.model.h.UnionPay.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[com.stripe.android.model.h.CartesBancaires.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[com.stripe.android.model.h.Unknown.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f54585a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaskedCardView(Context context) {
        this(context, null, 0, 6, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    private final void a(ImageView imageView) {
        androidx.core.widget.i.c(imageView, ColorStateList.valueOf(this.themeConfig.d(true)));
    }

    private final void b() {
        int i11;
        AppCompatImageView appCompatImageView = this.viewBinding.f70746b;
        Context context = getContext();
        switch (a.f54585a[this.cardBrand.ordinal()]) {
            case 1:
                i11 = f30.y.f64222d;
                break;
            case 2:
                i11 = f30.y.Q;
                break;
            case 3:
                i11 = f30.y.R;
                break;
            case 4:
                i11 = f30.y.P;
                break;
            case 5:
                i11 = f30.y.V;
                break;
            case 6:
                i11 = f30.y.S;
                break;
            case 7:
                i11 = f30.y.U;
                break;
            case 8:
                i11 = f30.y.M;
                break;
            case 9:
                i11 = v90.a.f118495r;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        appCompatImageView.setImageDrawable(androidx.core.content.b.getDrawable(context, i11));
    }

    private final void c() {
        this.viewBinding.f70747c.setVisibility(isSelected() ? 0 : 4);
    }

    private final void d() {
        b();
        this.viewBinding.f70748d.setText(this.cardDisplayFactory.a(this.cardBrand, this.last4, isSelected()));
    }

    public final com.stripe.android.model.h getCardBrand() {
        return this.cardBrand;
    }

    public final String getLast4() {
        return this.last4;
    }

    /* JADX INFO: renamed from: getViewBinding$payments_core_release, reason: from getter */
    public final h40.r getViewBinding() {
        return this.viewBinding;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0025 A[PHI: r0
      0x0025: PHI (r0v4 com.stripe.android.model.h) = (r0v3 com.stripe.android.model.h), (r0v6 com.stripe.android.model.h) binds: [B:10:0x001a, B:14:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    public final void setPaymentMethod(PaymentMethod paymentMethod) {
        p013kotlin.jvm.internal.s.k(paymentMethod, "paymentMethod");
        PaymentMethod.Card card = paymentMethod.card;
        com.stripe.android.model.h hVarB = com.stripe.android.model.h.INSTANCE.b(card != null ? card.displayBrand : null);
        com.stripe.android.model.h hVar = com.stripe.android.model.h.Unknown;
        if (hVarB == hVar) {
            hVarB = null;
        }
        if (hVarB != null) {
            hVar = hVarB;
        } else {
            hVarB = card != null ? card.brand : null;
            if (hVarB != null) {
                hVar = hVarB;
            }
        }
        this.cardBrand = hVar;
        this.last4 = card != null ? card.last4 : null;
        d();
    }

    @Override // android.view.View
    public void setSelected(boolean selected) {
        super.setSelected(selected);
        c();
        d();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaskedCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public /* synthetic */ MaskedCardView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaskedCardView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        p013kotlin.jvm.internal.s.k(context, "context");
        this.cardBrand = com.stripe.android.model.h.Unknown;
        h40.r rVarB = h40.r.b(LayoutInflater.from(context), this);
        p013kotlin.jvm.internal.s.j(rVarB, "inflate(...)");
        this.viewBinding = rVarB;
        x2 x2Var = new x2(context);
        this.themeConfig = x2Var;
        Resources resources = getResources();
        p013kotlin.jvm.internal.s.j(resources, "getResources(...)");
        this.cardDisplayFactory = new y(resources, x2Var);
        AppCompatImageView brandIcon = rVarB.f70746b;
        p013kotlin.jvm.internal.s.j(brandIcon, "brandIcon");
        a(brandIcon);
        AppCompatImageView checkIcon = rVarB.f70747c;
        p013kotlin.jvm.internal.s.j(checkIcon, "checkIcon");
        a(checkIcon);
    }
}
