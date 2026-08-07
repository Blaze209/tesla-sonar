package com.withpersona.sdk2.inquiry.shared.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import bi0.d;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.button.MaterialButton;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0010J\u0019\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001cR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u0016\u0010\u001d\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\"R\u0017\u0010&\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0014\u0010#\u001a\u0004\b$\u0010%R\u0011\u0010*\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b(\u0010)R$\u00101\u001a\u00020+2\u0006\u0010,\u001a\u00020+8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "buttonStyleAttr", "<init>", "(Landroid/content/Context;I)V", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ljn0/h0;", "b", "()V", "Lcom/google/android/material/button/MaterialButton;", "a", "(Ljava/lang/Integer;)Lcom/google/android/material/button/MaterialButton;", "c", "Landroid/view/View$OnClickListener;", "l", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "", "enabled", "setEnabled", "(Z)V", "isLoading", "setIsLoading", "Lbi0/d;", "Lbi0/d;", "binding", "Z", "Lcom/google/android/material/button/MaterialButton;", "getButton", "()Lcom/google/android/material/button/MaterialButton;", "button", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "progressBar", "", "value", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "text", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ButtonWithLoadingIndicator extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d binding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isLoading;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final MaterialButton button;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonWithLoadingIndicator(Context context, int i11) {
        super(context);
        s.k(context, "context");
        d dVarB = d.b(LayoutInflater.from(getContext()), this);
        s.j(dVarB, "inflate(...)");
        this.binding = dVarB;
        this.button = a(Integer.valueOf(i11));
        b();
    }

    private final MaterialButton a(Integer buttonStyleAttr) {
        MaterialButton materialButton = (buttonStyleAttr == null || buttonStyleAttr.intValue() == 0) ? new MaterialButton(getContext()) : new MaterialButton(getContext(), null, buttonStyleAttr.intValue());
        addView(materialButton, 0);
        return materialButton;
    }

    private final void b() {
        getProgressBar().setIndeterminateTintList(ColorStateList.valueOf(this.button.getCurrentTextColor()));
    }

    private final void c() {
        if (this.isLoading) {
            this.button.setTextScaleX(BitmapDescriptorFactory.HUE_RED);
            getProgressBar().setVisibility(0);
        } else {
            this.button.setTextScaleX(1.0f);
            getProgressBar().setVisibility(8);
        }
    }

    public final MaterialButton getButton() {
        return this.button;
    }

    public final ProgressBar getProgressBar() {
        ProgressBar progressBar = this.binding.f17429b;
        s.j(progressBar, "progressBar");
        return progressBar;
    }

    public final CharSequence getText() {
        CharSequence text = this.button.getText();
        s.j(text, "getText(...)");
        return text;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        if (isEnabled() == enabled) {
            return;
        }
        super.setEnabled(enabled);
        this.button.setEnabled(enabled);
        c();
    }

    public final void setIsLoading(boolean isLoading) {
        if (this.isLoading == isLoading) {
            return;
        }
        this.isLoading = isLoading;
        this.button.setActivated(isLoading);
        c();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener l11) {
        this.button.setOnClickListener(l11);
    }

    public final void setText(CharSequence value) {
        s.k(value, "value");
        this.button.setText(value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonWithLoadingIndicator(Context context) {
        super(context);
        s.k(context, "context");
        d dVarB = d.b(LayoutInflater.from(getContext()), this);
        s.j(dVarB, "inflate(...)");
        this.binding = dVarB;
        this.button = a(0);
        b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonWithLoadingIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s.k(context, "context");
        d dVarB = d.b(LayoutInflater.from(getContext()), this);
        s.j(dVarB, "inflate(...)");
        this.binding = dVarB;
        this.button = a(0);
        b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonWithLoadingIndicator(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.k(context, "context");
        d dVarB = d.b(LayoutInflater.from(getContext()), this);
        s.j(dVarB, "inflate(...)");
        this.binding = dVarB;
        this.button = a(0);
        b();
    }
}
