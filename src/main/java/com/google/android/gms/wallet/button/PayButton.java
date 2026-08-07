package com.google.android.gms.wallet.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.wallet.R;

/* JADX INFO: loaded from: classes5.dex */
public final class PayButton extends FrameLayout implements View.OnClickListener {
    private View.OnClickListener zza;
    private ButtonOptions.Builder zzb;
    private View zzc;
    private final zzf zzd;

    public PayButton(@NonNull Context context) {
        this(context, null);
    }

    private final void zza(ButtonOptions buttonOptions) {
        Drawable rippleDrawable;
        removeAllViews();
        zzg zzgVar = new zzg(new ContextThemeWrapper(getContext(), buttonOptions.getButtonTheme() == 2 ? R.style.PayButtonGenericLightTheme : R.style.PayButtonGenericDarkTheme), null);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(zzgVar.getContext()).inflate(R.layout.paybutton_generic, (ViewGroup) zzgVar, true).findViewById(R.id.pay_button_view);
        Context context = zzgVar.getContext();
        int cornerRadius = buttonOptions.getCornerRadius();
        GradientDrawable gradientDrawable = (GradientDrawable) zzh.zza(context, R.attr.payButtonGenericBackground).mutate();
        float f11 = cornerRadius;
        gradientDrawable.setCornerRadius(f11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.payButtonGenericRippleColor});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(color);
        if (PlatformVersion.isAtLeastLollipop()) {
            rippleDrawable = new RippleDrawable(colorStateListValueOf, gradientDrawable, null);
        } else {
            GradientDrawable gradientDrawable2 = (GradientDrawable) zzh.zza(context, R.attr.payButtonGenericRippleMask).mutate();
            gradientDrawable2.setCornerRadius(f11);
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, gradientDrawable2});
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, layerDrawable);
            stateListDrawable.addState(new int[0], gradientDrawable);
            rippleDrawable = stateListDrawable;
        }
        linearLayout.setBackground(rippleDrawable);
        zzgVar.setContentDescription(zzgVar.getContext().getString(R.string.gpay_logo_description));
        this.zzc = zzgVar;
        addView(zzgVar);
        this.zzc.setOnClickListener(this);
    }

    public void initialize(@NonNull ButtonOptions buttonOptions) {
        ButtonOptions.Builder builder = this.zzb;
        if (buttonOptions.getButtonType() != 0) {
            ButtonOptions.this.zza = buttonOptions.getButtonType();
        }
        if (buttonOptions.getButtonTheme() != 0) {
            ButtonOptions.this.zzb = buttonOptions.getButtonTheme();
        }
        if (buttonOptions.zze) {
            builder.setCornerRadius(buttonOptions.getCornerRadius());
        }
        if (buttonOptions.getAllowedPaymentMethods() != null) {
            ButtonOptions.this.zzd = buttonOptions.getAllowedPaymentMethods();
        }
        if (isInEditMode()) {
            zza(this.zzb.build());
            return;
        }
        removeAllViews();
        ButtonOptions buttonOptionsBuild = this.zzb.build();
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(getContext(), 232100000) != 0) {
            zza(buttonOptionsBuild);
            Log.e("PayButton", "Failed to create latest buttonView: Google Play Services version is outdated.");
        } else {
            if (TextUtils.isEmpty(buttonOptionsBuild.getAllowedPaymentMethods())) {
                Log.e("PayButton", "Failed to create buttonView: allowedPaymentMethods cannot be empty.");
                return;
            }
            View viewZza = zzf.zza((Context) Preconditions.checkNotNull(getContext()), buttonOptionsBuild);
            this.zzc = viewZza;
            if (viewZza == null) {
                Log.e("PayButton", "Failed to create buttonView");
            } else {
                addView(viewZza);
                this.zzc.setOnClickListener(this);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NonNull View view) {
        View.OnClickListener onClickListener = this.zza;
        if (onClickListener == null || view != this.zzc) {
            return;
        }
        onClickListener.onClick(this);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.zza = onClickListener;
    }

    public PayButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PayButton(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        ButtonOptions.Builder builderNewBuilder = ButtonOptions.newBuilder();
        this.zzb = builderNewBuilder;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PayButtonAttributes);
        int i12 = typedArrayObtainStyledAttributes.getInt(R.styleable.PayButtonAttributes_buttonTheme, 1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.PayButtonAttributes_cornerRadius, (int) TypedValue.applyDimension(1, 100.0f, Resources.getSystem().getDisplayMetrics()));
        ButtonOptions buttonOptions = ButtonOptions.this;
        buttonOptions.zzb = i12;
        buttonOptions.zzc = dimensionPixelSize;
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.PayButtonAttributes_cornerRadius)) {
            ButtonOptions.this.zze = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        builderNewBuilder.setButtonType(1);
        this.zzd = new zzf();
        if (isInEditMode()) {
            zza(this.zzb.build());
        }
    }
}
