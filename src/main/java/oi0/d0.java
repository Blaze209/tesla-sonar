package oi0;

import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0011\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001c"}, d2 = {"Loi0/d0;", "", "Lcom/google/android/material/textfield/TextInputLayout;", "cardAccessNumber", "documentNumber", "Lri0/f;", "dateOfBirthBinding", "expirationDateBinding", "Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "launchButton", "Landroid/widget/TextView;", "errorLabel", "<init>", "(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lri0/f;Lri0/f;Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;Landroid/widget/TextView;)V", "a", "Lcom/google/android/material/textfield/TextInputLayout;", "()Lcom/google/android/material/textfield/TextInputLayout;", "b", "c", "Lri0/f;", "()Lri0/f;", DateTokenConverter.CONVERTER_KEY, "e", "Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "f", "()Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "Landroid/widget/TextView;", "()Landroid/widget/TextView;", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TextInputLayout cardAccessNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TextInputLayout documentNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ri0.f dateOfBirthBinding;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ri0.f expirationDateBinding;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ButtonWithLoadingIndicator launchButton;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final TextView errorLabel;

    public d0(TextInputLayout cardAccessNumber, TextInputLayout documentNumber, ri0.f dateOfBirthBinding, ri0.f expirationDateBinding, ButtonWithLoadingIndicator launchButton, TextView errorLabel) {
        p013kotlin.jvm.internal.s.k(cardAccessNumber, "cardAccessNumber");
        p013kotlin.jvm.internal.s.k(documentNumber, "documentNumber");
        p013kotlin.jvm.internal.s.k(dateOfBirthBinding, "dateOfBirthBinding");
        p013kotlin.jvm.internal.s.k(expirationDateBinding, "expirationDateBinding");
        p013kotlin.jvm.internal.s.k(launchButton, "launchButton");
        p013kotlin.jvm.internal.s.k(errorLabel, "errorLabel");
        this.cardAccessNumber = cardAccessNumber;
        this.documentNumber = documentNumber;
        this.dateOfBirthBinding = dateOfBirthBinding;
        this.expirationDateBinding = expirationDateBinding;
        this.launchButton = launchButton;
        this.errorLabel = errorLabel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextInputLayout getCardAccessNumber() {
        return this.cardAccessNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ri0.f getDateOfBirthBinding() {
        return this.dateOfBirthBinding;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextInputLayout getDocumentNumber() {
        return this.documentNumber;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextView getErrorLabel() {
        return this.errorLabel;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ri0.f getExpirationDateBinding() {
        return this.expirationDateBinding;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final ButtonWithLoadingIndicator getLaunchButton() {
        return this.launchButton;
    }
}
