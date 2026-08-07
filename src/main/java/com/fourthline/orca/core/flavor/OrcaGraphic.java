package com.fourthline.orca.core.flavor;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\b\"\u0004\b\u001e\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/fourthline/orca/core/flavor/OrcaGraphic;", "Lcom/fourthline/orca/core/flavor/OrcaElement;", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "backgroundColor", "primaryColor", "<init>", "(Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;)V", "component1", "()Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "component2", "copy", "(Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;)Lcom/fourthline/orca/core/flavor/OrcaGraphic;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "getBackgroundColor", "setBackgroundColor", "(Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;)V", "b", "getPrimaryColor", "setPrimaryColor", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OrcaGraphic implements OrcaElement {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private OrcaColors.OrcaColor backgroundColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private OrcaColors.OrcaColor primaryColor;

    public OrcaGraphic(OrcaColors.OrcaColor backgroundColor, OrcaColors.OrcaColor primaryColor) {
        s.k(backgroundColor, "backgroundColor");
        s.k(primaryColor, "primaryColor");
        this.backgroundColor = backgroundColor;
        this.primaryColor = primaryColor;
    }

    public static /* synthetic */ OrcaGraphic copy$default(OrcaGraphic orcaGraphic, OrcaColors.OrcaColor orcaColor, OrcaColors.OrcaColor orcaColor2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            orcaColor = orcaGraphic.backgroundColor;
        }
        if ((i11 & 2) != 0) {
            orcaColor2 = orcaGraphic.primaryColor;
        }
        return orcaGraphic.copy(orcaColor, orcaColor2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OrcaColors.OrcaColor getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OrcaColors.OrcaColor getPrimaryColor() {
        return this.primaryColor;
    }

    public final OrcaGraphic copy(OrcaColors.OrcaColor backgroundColor, OrcaColors.OrcaColor primaryColor) {
        s.k(backgroundColor, "backgroundColor");
        s.k(primaryColor, "primaryColor");
        return new OrcaGraphic(backgroundColor, primaryColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrcaGraphic)) {
            return false;
        }
        OrcaGraphic orcaGraphic = (OrcaGraphic) other;
        return s.f(this.backgroundColor, orcaGraphic.backgroundColor) && s.f(this.primaryColor, orcaGraphic.primaryColor);
    }

    public final OrcaColors.OrcaColor getBackgroundColor() {
        return this.backgroundColor;
    }

    public final OrcaColors.OrcaColor getPrimaryColor() {
        return this.primaryColor;
    }

    public int hashCode() {
        return (this.backgroundColor.hashCode() * 31) + this.primaryColor.hashCode();
    }

    public final void setBackgroundColor(OrcaColors.OrcaColor orcaColor) {
        s.k(orcaColor, "<set-?>");
        this.backgroundColor = orcaColor;
    }

    public final void setPrimaryColor(OrcaColors.OrcaColor orcaColor) {
        s.k(orcaColor, "<set-?>");
        this.primaryColor = orcaColor;
    }

    public String toString() {
        return "OrcaGraphic(backgroundColor=" + this.backgroundColor + ", primaryColor=" + this.primaryColor + ")";
    }
}
