package com.fourthline.orca.core.flavor;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\t\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u001dR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u001d¨\u0006$"}, d2 = {"Lcom/fourthline/orca/core/flavor/OrcaScannerConfirmation;", "Lcom/fourthline/orca/core/flavor/OrcaElement;", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "textColor", "backgroundColor", "bulletListColor", "<init>", "(Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;)V", "component1", "()Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "component2", "component3", "copy", "(Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;)Lcom/fourthline/orca/core/flavor/OrcaScannerConfirmation;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "getTextColor", "setTextColor", "(Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;)V", "b", "getBackgroundColor", "setBackgroundColor", "c", "getBulletListColor", "setBulletListColor", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OrcaScannerConfirmation implements OrcaElement {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private OrcaColors.OrcaColor textColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private OrcaColors.OrcaColor backgroundColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private OrcaColors.OrcaColor bulletListColor;

    public OrcaScannerConfirmation(OrcaColors.OrcaColor textColor, OrcaColors.OrcaColor backgroundColor, OrcaColors.OrcaColor bulletListColor) {
        s.k(textColor, "textColor");
        s.k(backgroundColor, "backgroundColor");
        s.k(bulletListColor, "bulletListColor");
        this.textColor = textColor;
        this.backgroundColor = backgroundColor;
        this.bulletListColor = bulletListColor;
    }

    public static /* synthetic */ OrcaScannerConfirmation copy$default(OrcaScannerConfirmation orcaScannerConfirmation, OrcaColors.OrcaColor orcaColor, OrcaColors.OrcaColor orcaColor2, OrcaColors.OrcaColor orcaColor3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            orcaColor = orcaScannerConfirmation.textColor;
        }
        if ((i11 & 2) != 0) {
            orcaColor2 = orcaScannerConfirmation.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            orcaColor3 = orcaScannerConfirmation.bulletListColor;
        }
        return orcaScannerConfirmation.copy(orcaColor, orcaColor2, orcaColor3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OrcaColors.OrcaColor getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OrcaColors.OrcaColor getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OrcaColors.OrcaColor getBulletListColor() {
        return this.bulletListColor;
    }

    public final OrcaScannerConfirmation copy(OrcaColors.OrcaColor textColor, OrcaColors.OrcaColor backgroundColor, OrcaColors.OrcaColor bulletListColor) {
        s.k(textColor, "textColor");
        s.k(backgroundColor, "backgroundColor");
        s.k(bulletListColor, "bulletListColor");
        return new OrcaScannerConfirmation(textColor, backgroundColor, bulletListColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrcaScannerConfirmation)) {
            return false;
        }
        OrcaScannerConfirmation orcaScannerConfirmation = (OrcaScannerConfirmation) other;
        return s.f(this.textColor, orcaScannerConfirmation.textColor) && s.f(this.backgroundColor, orcaScannerConfirmation.backgroundColor) && s.f(this.bulletListColor, orcaScannerConfirmation.bulletListColor);
    }

    public final OrcaColors.OrcaColor getBackgroundColor() {
        return this.backgroundColor;
    }

    public final OrcaColors.OrcaColor getBulletListColor() {
        return this.bulletListColor;
    }

    public final OrcaColors.OrcaColor getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        return (((this.textColor.hashCode() * 31) + this.backgroundColor.hashCode()) * 31) + this.bulletListColor.hashCode();
    }

    public final void setBackgroundColor(OrcaColors.OrcaColor orcaColor) {
        s.k(orcaColor, "<set-?>");
        this.backgroundColor = orcaColor;
    }

    public final void setBulletListColor(OrcaColors.OrcaColor orcaColor) {
        s.k(orcaColor, "<set-?>");
        this.bulletListColor = orcaColor;
    }

    public final void setTextColor(OrcaColors.OrcaColor orcaColor) {
        s.k(orcaColor, "<set-?>");
        this.textColor = orcaColor;
    }

    public String toString() {
        return "OrcaScannerConfirmation(textColor=" + this.textColor + ", backgroundColor=" + this.backgroundColor + ", bulletListColor=" + this.bulletListColor + ")";
    }
}
