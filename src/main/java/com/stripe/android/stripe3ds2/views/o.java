package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010!\u001a\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/o;", "Landroid/widget/LinearLayout;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", AnnotatedPrivateKey.LABEL, "Ljn0/h0;", "setTextEntryLabel", "(Ljava/lang/String;)V", "text", "setText", "Lq80/o;", "textBoxCustomization", "setTextBoxCustomization", "(Lq80/o;)V", "Lcom/google/android/material/textfield/TextInputLayout;", "a", "Lcom/google/android/material/textfield/TextInputLayout;", "getInfoLabel$3ds2sdk_release", "()Lcom/google/android/material/textfield/TextInputLayout;", "infoLabel", "Lcom/google/android/material/textfield/TextInputEditText;", "b", "Lcom/google/android/material/textfield/TextInputEditText;", "getTextEntryView$3ds2sdk_release", "()Lcom/google/android/material/textfield/TextInputEditText;", "textEntryView", "getUserEntry", "()Ljava/lang/String;", "userEntry", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class o extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TextInputLayout infoLabel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TextInputEditText textEntryView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(Context context) {
        this(context, null, 0, 6, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    /* JADX INFO: renamed from: getInfoLabel$3ds2sdk_release, reason: from getter */
    public final TextInputLayout getInfoLabel() {
        return this.infoLabel;
    }

    /* JADX INFO: renamed from: getTextEntryView$3ds2sdk_release, reason: from getter */
    public final TextInputEditText getTextEntryView() {
        return this.textEntryView;
    }

    public String getUserEntry() {
        Editable text = this.textEntryView.getText();
        String string = text != null ? text.toString() : null;
        return string == null ? "" : string;
    }

    public final void setText(String text) {
        p013kotlin.jvm.internal.s.k(text, "text");
        this.textEntryView.setText(text);
    }

    public final void setTextBoxCustomization(q80.o textBoxCustomization) {
        if (textBoxCustomization == null) {
            return;
        }
        String strF = textBoxCustomization.f();
        if (strF != null) {
            this.textEntryView.setTextColor(Color.parseColor(strF));
        }
        Integer numValueOf = Integer.valueOf(textBoxCustomization.v());
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            this.textEntryView.setTextSize(2, numValueOf.intValue());
        }
        if (textBoxCustomization.b() >= 0) {
            float fB = textBoxCustomization.b();
            this.infoLabel.setBoxCornerRadii(fB, fB, fB, fB);
        }
        String strJ = textBoxCustomization.j();
        if (strJ != null) {
            this.infoLabel.setBoxBackgroundMode(2);
            this.infoLabel.setBoxStrokeColor(Color.parseColor(strJ));
        }
        String strS = textBoxCustomization.s();
        if (strS != null) {
            this.infoLabel.setDefaultHintTextColor(ColorStateList.valueOf(Color.parseColor(strS)));
        }
    }

    public final void setTextEntryLabel(String label) {
        this.infoLabel.setHint(label);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public /* synthetic */ o(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        p013kotlin.jvm.internal.s.k(context, "context");
        o80.g gVarC = o80.g.c(LayoutInflater.from(context), this, true);
        p013kotlin.jvm.internal.s.j(gVarC, "inflate(...)");
        TextInputLayout label = gVarC.f96861b;
        p013kotlin.jvm.internal.s.j(label, "label");
        this.infoLabel = label;
        TextInputEditText textEntry = gVarC.f96862c;
        p013kotlin.jvm.internal.s.j(textEntry, "textEntry");
        this.textEntryView = textEntry;
    }
}
