package com.content;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.uimanager.v0;
import com.facebook.react.uimanager.w;
import com.google.android.gms.wallet.button.ButtonOptions;
import com.google.android.gms.wallet.button.PayButton;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import f30.i;
import org.json.JSONArray;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0016\u0010\u0019\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/reactnativestripesdk/j0;", "Landroid/widget/FrameLayout;", "Lcom/facebook/react/uimanager/v0;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/uimanager/v0;)V", "Lcom/google/android/gms/wallet/button/PayButton;", "e", "()Lcom/google/android/gms/wallet/button/PayButton;", "Lcom/google/android/gms/wallet/button/ButtonOptions;", DateTokenConverter.CONVERTER_KEY, "()Lcom/google/android/gms/wallet/button/ButtonOptions;", "", "getButtonType", "()Ljava/lang/Integer;", "getButtonTheme", "Ljn0/h0;", "g", "()V", "requestLayout", "type", "setType", "(I)V", "appearance", "setAppearance", Snapshot.BORDER_RADIUS, "setBorderRadius", "a", "Lcom/facebook/react/uimanager/v0;", "b", "Ljava/lang/Integer;", "c", "I", "Lcom/google/android/gms/wallet/button/PayButton;", "button", "Ljava/lang/Runnable;", "f", "Ljava/lang/Runnable;", "mLayoutRunnable", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j0 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v0 context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Integer type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Integer appearance;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int borderRadius;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private PayButton button;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Runnable mLayoutRunnable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(v0 context) {
        super(context);
        s.k(context, "context");
        this.context = context;
        this.borderRadius = 4;
        this.mLayoutRunnable = new Runnable() { // from class: com.reactnativestripesdk.h0
            @Override // java.lang.Runnable
            public final void run() {
                j0.i(this.f48811a);
            }
        };
    }

    @SuppressLint({"RestrictedApi"})
    private final ButtonOptions d() {
        String string = new JSONArray().put(new i(this.context, false, 2, null).b(null, null)).toString();
        s.j(string, "toString(...)");
        ButtonOptions.Builder allowedPaymentMethods = ButtonOptions.newBuilder().setAllowedPaymentMethods(string);
        s.j(allowedPaymentMethods, "setAllowedPaymentMethods(...)");
        Integer buttonType = getButtonType();
        if (buttonType != null) {
            allowedPaymentMethods.setButtonType(buttonType.intValue());
        }
        Integer buttonTheme = getButtonTheme();
        if (buttonTheme != null) {
            allowedPaymentMethods.setButtonTheme(buttonTheme.intValue());
        }
        allowedPaymentMethods.setCornerRadius((int) w.g(this.borderRadius));
        ButtonOptions buttonOptionsBuild = allowedPaymentMethods.build();
        s.j(buttonOptionsBuild, "build(...)");
        return buttonOptionsBuild;
    }

    private final PayButton e() {
        PayButton payButton = new PayButton(this.context);
        payButton.initialize(d());
        payButton.setOnClickListener(new View.OnClickListener() { // from class: com.reactnativestripesdk.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j0.f(this.f48813a, view);
            }
        });
        return payButton;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(j0 j0Var, View view) {
        Object parent = j0Var.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view2.performClick();
        } else {
            Log.e("StripeReactNative", "Unable to find parent of GooglePayButtonView.");
        }
    }

    private final Integer getButtonTheme() {
        Integer num = this.appearance;
        if ((num != null && num.intValue() == 0) || (num != null && num.intValue() == 1)) {
            return 2;
        }
        return (num != null && num.intValue() == 2) ? 1 : null;
    }

    private final Integer getButtonType() {
        Integer num = this.type;
        if ((num != null && num.intValue() == 0) || (num != null && num.intValue() == 1)) {
            return 1;
        }
        if (num != null && num.intValue() == 6) {
            return 2;
        }
        if (num != null && num.intValue() == 5) {
            return 3;
        }
        if (num != null && num.intValue() == 4) {
            return 4;
        }
        if (num != null && num.intValue() == 11) {
            return 5;
        }
        if (num != null && num.intValue() == 7) {
            return 7;
        }
        if (num != null && num.intValue() == 1000) {
            return 6;
        }
        return (num != null && num.intValue() == 1001) ? 8 : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(j0 j0Var) {
        j0Var.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(j0 j0Var) {
        j0Var.measure(View.MeasureSpec.makeMeasureSpec(j0Var.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(j0Var.getHeight(), 1073741824));
        PayButton payButton = j0Var.button;
        if (payButton != null) {
            payButton.layout(j0Var.getLeft(), j0Var.getTop(), j0Var.getRight(), j0Var.getBottom());
        }
    }

    public final void g() {
        PayButton payButton = this.button;
        if (payButton != null) {
            removeView(payButton);
        }
        PayButton payButtonE = e();
        this.button = payButtonE;
        addView(payButtonE);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.reactnativestripesdk.g0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                j0.h(this.f48809a);
            }
        });
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.mLayoutRunnable);
    }

    public final void setAppearance(int appearance) {
        this.appearance = Integer.valueOf(appearance);
    }

    public final void setBorderRadius(int borderRadius) {
        this.borderRadius = borderRadius;
    }

    public final void setType(int type) {
        this.type = Integer.valueOf(type);
    }
}
