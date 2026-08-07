package com.fourthline.orca.core.flavor;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000b\"\u0004\b \u0010!R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u000b\"\u0004\b$\u0010!R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010\u000b\"\u0004\b'\u0010!R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010\u000b\"\u0004\b*\u0010!R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001e\u001a\u0004\b,\u0010\u000b\"\u0004\b-\u0010!¨\u0006."}, d2 = {"Lcom/fourthline/orca/core/flavor/OrcaCell;", "Lcom/fourthline/orca/core/flavor/OrcaElement;", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "backgroundColor", "textColor", "iconColor", "borderColor", "dividerColor", "<init>", "(Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;)V", "component1", "()Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "component2", "component3", "component4", "component5", "copy", "(Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;)Lcom/fourthline/orca/core/flavor/OrcaCell;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "getBackgroundColor", "setBackgroundColor", "(Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;)V", "b", "getTextColor", "setTextColor", "c", "getIconColor", "setIconColor", DateTokenConverter.CONVERTER_KEY, "getBorderColor", "setBorderColor", "e", "getDividerColor", "setDividerColor", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OrcaCell implements OrcaElement {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private OrcaColors.OrcaColor backgroundColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private OrcaColors.OrcaColor textColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private OrcaColors.OrcaColor iconColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private OrcaColors.OrcaColor borderColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private OrcaColors.OrcaColor dividerColor;

    public OrcaCell(OrcaColors.OrcaColor backgroundColor, OrcaColors.OrcaColor textColor, OrcaColors.OrcaColor iconColor, OrcaColors.OrcaColor borderColor, OrcaColors.OrcaColor dividerColor) {
        s.k(backgroundColor, "backgroundColor");
        s.k(textColor, "textColor");
        s.k(iconColor, "iconColor");
        s.k(borderColor, "borderColor");
        s.k(dividerColor, "dividerColor");
        this.backgroundColor = backgroundColor;
        this.textColor = textColor;
        this.iconColor = iconColor;
        this.borderColor = borderColor;
        this.dividerColor = dividerColor;
    }

    public static /* synthetic */ OrcaCell copy$default(OrcaCell orcaCell, OrcaColors.OrcaColor orcaColor, OrcaColors.OrcaColor orcaColor2, OrcaColors.OrcaColor orcaColor3, OrcaColors.OrcaColor orcaColor4, OrcaColors.OrcaColor orcaColor5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            orcaColor = orcaCell.backgroundColor;
        }
        if ((i11 & 2) != 0) {
            orcaColor2 = orcaCell.textColor;
        }
        if ((i11 & 4) != 0) {
            orcaColor3 = orcaCell.iconColor;
        }
        if ((i11 & 8) != 0) {
            orcaColor4 = orcaCell.borderColor;
        }
        if ((i11 & 16) != 0) {
            orcaColor5 = orcaCell.dividerColor;
        }
        OrcaColors.OrcaColor orcaColor6 = orcaColor5;
        OrcaColors.OrcaColor orcaColor7 = orcaColor3;
        return orcaCell.copy(orcaColor, orcaColor2, orcaColor7, orcaColor4, orcaColor6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OrcaColors.OrcaColor getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OrcaColors.OrcaColor getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OrcaColors.OrcaColor getIconColor() {
        return this.iconColor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OrcaColors.OrcaColor getBorderColor() {
        return this.borderColor;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OrcaColors.OrcaColor getDividerColor() {
        return this.dividerColor;
    }

    public final OrcaCell copy(OrcaColors.OrcaColor backgroundColor, OrcaColors.OrcaColor textColor, OrcaColors.OrcaColor iconColor, OrcaColors.OrcaColor borderColor, OrcaColors.OrcaColor dividerColor) {
        s.k(backgroundColor, "backgroundColor");
        s.k(textColor, "textColor");
        s.k(iconColor, "iconColor");
        s.k(borderColor, "borderColor");
        s.k(dividerColor, "dividerColor");
        return new OrcaCell(backgroundColor, textColor, iconColor, borderColor, dividerColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrcaCell)) {
            return false;
        }
        OrcaCell orcaCell = (OrcaCell) other;
        return s.f(this.backgroundColor, orcaCell.backgroundColor) && s.f(this.textColor, orcaCell.textColor) && s.f(this.iconColor, orcaCell.iconColor) && s.f(this.borderColor, orcaCell.borderColor) && s.f(this.dividerColor, orcaCell.dividerColor);
    }

    public final OrcaColors.OrcaColor getBackgroundColor() {
        return this.backgroundColor;
    }

    public final OrcaColors.OrcaColor getBorderColor() {
        return this.borderColor;
    }

    public final OrcaColors.OrcaColor getDividerColor() {
        return this.dividerColor;
    }

    public final OrcaColors.OrcaColor getIconColor() {
        return this.iconColor;
    }

    public final OrcaColors.OrcaColor getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        return (((((((this.backgroundColor.hashCode() * 31) + this.textColor.hashCode()) * 31) + this.iconColor.hashCode()) * 31) + this.borderColor.hashCode()) * 31) + this.dividerColor.hashCode();
    }

    public final void setBackgroundColor(OrcaColors.OrcaColor orcaColor) {
        s.k(orcaColor, "<set-?>");
        this.backgroundColor = orcaColor;
    }

    public final void setBorderColor(OrcaColors.OrcaColor orcaColor) {
        s.k(orcaColor, "<set-?>");
        this.borderColor = orcaColor;
    }

    public final void setDividerColor(OrcaColors.OrcaColor orcaColor) {
        s.k(orcaColor, "<set-?>");
        this.dividerColor = orcaColor;
    }

    public final void setIconColor(OrcaColors.OrcaColor orcaColor) {
        s.k(orcaColor, "<set-?>");
        this.iconColor = orcaColor;
    }

    public final void setTextColor(OrcaColors.OrcaColor orcaColor) {
        s.k(orcaColor, "<set-?>");
        this.textColor = orcaColor;
    }

    public String toString() {
        return "OrcaCell(backgroundColor=" + this.backgroundColor + ", textColor=" + this.textColor + ", iconColor=" + this.iconColor + ", borderColor=" + this.borderColor + ", dividerColor=" + this.dividerColor + ")";
    }
}
