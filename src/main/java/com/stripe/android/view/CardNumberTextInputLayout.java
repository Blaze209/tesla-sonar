package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.textfield.TextInputLayout;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.properties.ObservableProperty;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR+\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/view/CardNumberTextInputLayout;", "Lcom/google/android/material/textfield/TextInputLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ljn0/h0;", "C0", "()V", "Lcom/stripe/android/view/y0;", "E0", "Lcom/stripe/android/view/y0;", "progressView", "", "<set-?>", "F0", "Lkotlin/properties/d;", "isLoading$payments_core_release", "()Z", "setLoading$payments_core_release", "(Z)V", "isLoading", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CardNumberTextInputLayout extends TextInputLayout {
    static final /* synthetic */ co0.m<Object>[] G0 = {p013kotlin.jvm.internal.o0.f(new p013kotlin.jvm.internal.z(CardNumberTextInputLayout.class, "isLoading", "isLoading$payments_core_release()Z", 0))};
    public static final int H0 = 8;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    private final y0 progressView;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    private final p013kotlin.properties.d isLoading;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"com/stripe/android/view/CardNumberTextInputLayout$a", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Ljn0/h0;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            view.removeOnLayoutChangeListener(this);
            CardNumberTextInputLayout.this.C0();
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/stripe/android/view/CardNumberTextInputLayout$b", "Lkotlin/properties/b;", "Lco0/m;", "property", "oldValue", "newValue", "Ljn0/h0;", "afterChange", "(Lco0/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends ObservableProperty<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CardNumberTextInputLayout f54550a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, CardNumberTextInputLayout cardNumberTextInputLayout) {
            super(obj);
            this.f54550a = cardNumberTextInputLayout;
        }

        @Override // p013kotlin.properties.ObservableProperty
        protected void afterChange(co0.m<?> property, Boolean oldValue, Boolean newValue) {
            p013kotlin.jvm.internal.s.k(property, "property");
            boolean zBooleanValue = newValue.booleanValue();
            if (oldValue.booleanValue() != zBooleanValue) {
                if (zBooleanValue) {
                    this.f54550a.progressView.b();
                } else {
                    this.f54550a.progressView.a();
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardNumberTextInputLayout(Context context) {
        this(context, null, 0, 6, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C0() {
        ViewParent parent = this.progressView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.progressView);
        }
        Object objL = ho0.l.L(androidx.core.view.s0.a(this));
        p013kotlin.jvm.internal.s.i(objL, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) objL;
        frameLayout.addView(this.progressView);
        y0 y0Var = this.progressView;
        ViewGroup.LayoutParams layoutParams = y0Var.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginStart(frameLayout.getWidth() - getResources().getDimensionPixelSize(f30.x.f64214g));
        layoutParams2.topMargin = getResources().getDimensionPixelSize(f30.x.f64215h);
        y0Var.setLayoutParams(layoutParams2);
    }

    public final void setLoading$payments_core_release(boolean z11) {
        this.isLoading.setValue(this, G0[0], Boolean.valueOf(z11));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardNumberTextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public /* synthetic */ CardNumberTextInputLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? zs.c.A0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardNumberTextInputLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        p013kotlin.jvm.internal.s.k(context, "context");
        this.progressView = new y0(context, attributeSet, i11);
        p013kotlin.properties.a aVar = p013kotlin.properties.a.f86546a;
        this.isLoading = new b(Boolean.FALSE, this);
        addOnLayoutChangeListener(new a());
        setPlaceholderText(getResources().getString(f30.d0.f63937b0));
    }
}
