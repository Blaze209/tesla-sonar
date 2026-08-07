package com.fourthline.orca.core.flavor;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000b\"\u0004\b \u0010!R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\r\"\u0004\b%\u0010&R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\r\"\u0004\b)\u0010&R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010#\u001a\u0004\b+\u0010\r\"\u0004\b,\u0010&¨\u0006-"}, d2 = {"Lcom/fourthline/orca/core/flavor/OrcaScanner;", "Lcom/fourthline/orca/core/flavor/OrcaElement;", "Lcom/fourthline/orca/core/flavor/OrcaScannerConfirmation;", "confirmation", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "scannerText", "spinnerColor", "progressColor", "<init>", "(Lcom/fourthline/orca/core/flavor/OrcaScannerConfirmation;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;)V", "component1", "()Lcom/fourthline/orca/core/flavor/OrcaScannerConfirmation;", "component2", "()Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "component3", "component4", "copy", "(Lcom/fourthline/orca/core/flavor/OrcaScannerConfirmation;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;)Lcom/fourthline/orca/core/flavor/OrcaScanner;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/orca/core/flavor/OrcaScannerConfirmation;", "getConfirmation", "setConfirmation", "(Lcom/fourthline/orca/core/flavor/OrcaScannerConfirmation;)V", "b", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "getScannerText", "setScannerText", "(Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;)V", "c", "getSpinnerColor", "setSpinnerColor", DateTokenConverter.CONVERTER_KEY, "getProgressColor", "setProgressColor", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OrcaScanner implements OrcaElement {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private OrcaScannerConfirmation confirmation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private OrcaColors.OrcaColor scannerText;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private OrcaColors.OrcaColor spinnerColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private OrcaColors.OrcaColor progressColor;

    public OrcaScanner(OrcaScannerConfirmation confirmation, OrcaColors.OrcaColor scannerText, OrcaColors.OrcaColor spinnerColor, OrcaColors.OrcaColor progressColor) {
        s.k(confirmation, "confirmation");
        s.k(scannerText, "scannerText");
        s.k(spinnerColor, "spinnerColor");
        s.k(progressColor, "progressColor");
        this.confirmation = confirmation;
        this.scannerText = scannerText;
        this.spinnerColor = spinnerColor;
        this.progressColor = progressColor;
    }

    public static /* synthetic */ OrcaScanner copy$default(OrcaScanner orcaScanner, OrcaScannerConfirmation orcaScannerConfirmation, OrcaColors.OrcaColor orcaColor, OrcaColors.OrcaColor orcaColor2, OrcaColors.OrcaColor orcaColor3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            orcaScannerConfirmation = orcaScanner.confirmation;
        }
        if ((i11 & 2) != 0) {
            orcaColor = orcaScanner.scannerText;
        }
        if ((i11 & 4) != 0) {
            orcaColor2 = orcaScanner.spinnerColor;
        }
        if ((i11 & 8) != 0) {
            orcaColor3 = orcaScanner.progressColor;
        }
        return orcaScanner.copy(orcaScannerConfirmation, orcaColor, orcaColor2, orcaColor3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OrcaScannerConfirmation getConfirmation() {
        return this.confirmation;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OrcaColors.OrcaColor getScannerText() {
        return this.scannerText;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OrcaColors.OrcaColor getSpinnerColor() {
        return this.spinnerColor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OrcaColors.OrcaColor getProgressColor() {
        return this.progressColor;
    }

    public final OrcaScanner copy(OrcaScannerConfirmation confirmation, OrcaColors.OrcaColor scannerText, OrcaColors.OrcaColor spinnerColor, OrcaColors.OrcaColor progressColor) {
        s.k(confirmation, "confirmation");
        s.k(scannerText, "scannerText");
        s.k(spinnerColor, "spinnerColor");
        s.k(progressColor, "progressColor");
        return new OrcaScanner(confirmation, scannerText, spinnerColor, progressColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrcaScanner)) {
            return false;
        }
        OrcaScanner orcaScanner = (OrcaScanner) other;
        return s.f(this.confirmation, orcaScanner.confirmation) && s.f(this.scannerText, orcaScanner.scannerText) && s.f(this.spinnerColor, orcaScanner.spinnerColor) && s.f(this.progressColor, orcaScanner.progressColor);
    }

    public final OrcaScannerConfirmation getConfirmation() {
        return this.confirmation;
    }

    public final OrcaColors.OrcaColor getProgressColor() {
        return this.progressColor;
    }

    public final OrcaColors.OrcaColor getScannerText() {
        return this.scannerText;
    }

    public final OrcaColors.OrcaColor getSpinnerColor() {
        return this.spinnerColor;
    }

    public int hashCode() {
        return (((((this.confirmation.hashCode() * 31) + this.scannerText.hashCode()) * 31) + this.spinnerColor.hashCode()) * 31) + this.progressColor.hashCode();
    }

    public final void setConfirmation(OrcaScannerConfirmation orcaScannerConfirmation) {
        s.k(orcaScannerConfirmation, "<set-?>");
        this.confirmation = orcaScannerConfirmation;
    }

    public final void setProgressColor(OrcaColors.OrcaColor orcaColor) {
        s.k(orcaColor, "<set-?>");
        this.progressColor = orcaColor;
    }

    public final void setScannerText(OrcaColors.OrcaColor orcaColor) {
        s.k(orcaColor, "<set-?>");
        this.scannerText = orcaColor;
    }

    public final void setSpinnerColor(OrcaColors.OrcaColor orcaColor) {
        s.k(orcaColor, "<set-?>");
        this.spinnerColor = orcaColor;
    }

    public String toString() {
        return "OrcaScanner(confirmation=" + this.confirmation + ", scannerText=" + this.scannerText + ", spinnerColor=" + this.spinnerColor + ", progressColor=" + this.progressColor + ")";
    }
}
