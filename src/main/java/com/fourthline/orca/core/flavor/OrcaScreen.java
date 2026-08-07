package com.fourthline.orca.core.flavor;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JL\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010%R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010\r\"\u0004\b(\u0010%R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010\r\"\u0004\b+\u0010%R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010\r\"\u0004\b.\u0010%R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\"\u001a\u0004\b0\u0010\r\"\u0004\b1\u0010%R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u0013\"\u0004\b5\u00106¨\u00067"}, d2 = {"Lcom/fourthline/orca/core/flavor/OrcaScreen;", "Lcom/fourthline/orca/core/flavor/OrcaElement;", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "backgroundColor", "headerColor", "titleColor", "messageColor", "dividerColor", "Lcom/fourthline/orca/core/flavor/OrcaCells;", "tableCells", "<init>", "(Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaCells;)V", "component1", "()Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "component2", "component3", "component4", "component5", "component6", "()Lcom/fourthline/orca/core/flavor/OrcaCells;", "copy", "(Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;Lcom/fourthline/orca/core/flavor/OrcaCells;)Lcom/fourthline/orca/core/flavor/OrcaScreen;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;", "getBackgroundColor", "setBackgroundColor", "(Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor;)V", "b", "getHeaderColor", "setHeaderColor", "c", "getTitleColor", "setTitleColor", DateTokenConverter.CONVERTER_KEY, "getMessageColor", "setMessageColor", "e", "getDividerColor", "setDividerColor", "f", "Lcom/fourthline/orca/core/flavor/OrcaCells;", "getTableCells", "setTableCells", "(Lcom/fourthline/orca/core/flavor/OrcaCells;)V", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OrcaScreen implements OrcaElement {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private OrcaColors.OrcaColor backgroundColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private OrcaColors.OrcaColor headerColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private OrcaColors.OrcaColor titleColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private OrcaColors.OrcaColor messageColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private OrcaColors.OrcaColor dividerColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private OrcaCells tableCells;

    public OrcaScreen(OrcaColors.OrcaColor backgroundColor, OrcaColors.OrcaColor headerColor, OrcaColors.OrcaColor titleColor, OrcaColors.OrcaColor messageColor, OrcaColors.OrcaColor dividerColor, OrcaCells tableCells) {
        s.k(backgroundColor, "backgroundColor");
        s.k(headerColor, "headerColor");
        s.k(titleColor, "titleColor");
        s.k(messageColor, "messageColor");
        s.k(dividerColor, "dividerColor");
        s.k(tableCells, "tableCells");
        this.backgroundColor = backgroundColor;
        this.headerColor = headerColor;
        this.titleColor = titleColor;
        this.messageColor = messageColor;
        this.dividerColor = dividerColor;
        this.tableCells = tableCells;
    }

    public static /* synthetic */ OrcaScreen copy$default(OrcaScreen orcaScreen, OrcaColors.OrcaColor orcaColor, OrcaColors.OrcaColor orcaColor2, OrcaColors.OrcaColor orcaColor3, OrcaColors.OrcaColor orcaColor4, OrcaColors.OrcaColor orcaColor5, OrcaCells orcaCells, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            orcaColor = orcaScreen.backgroundColor;
        }
        if ((i11 & 2) != 0) {
            orcaColor2 = orcaScreen.headerColor;
        }
        if ((i11 & 4) != 0) {
            orcaColor3 = orcaScreen.titleColor;
        }
        if ((i11 & 8) != 0) {
            orcaColor4 = orcaScreen.messageColor;
        }
        if ((i11 & 16) != 0) {
            orcaColor5 = orcaScreen.dividerColor;
        }
        if ((i11 & 32) != 0) {
            orcaCells = orcaScreen.tableCells;
        }
        OrcaColors.OrcaColor orcaColor6 = orcaColor5;
        OrcaCells orcaCells2 = orcaCells;
        return orcaScreen.copy(orcaColor, orcaColor2, orcaColor3, orcaColor4, orcaColor6, orcaCells2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OrcaColors.OrcaColor getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OrcaColors.OrcaColor getHeaderColor() {
        return this.headerColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OrcaColors.OrcaColor getTitleColor() {
        return this.titleColor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OrcaColors.OrcaColor getMessageColor() {
        return this.messageColor;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OrcaColors.OrcaColor getDividerColor() {
        return this.dividerColor;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final OrcaCells getTableCells() {
        return this.tableCells;
    }

    public final OrcaScreen copy(OrcaColors.OrcaColor backgroundColor, OrcaColors.OrcaColor headerColor, OrcaColors.OrcaColor titleColor, OrcaColors.OrcaColor messageColor, OrcaColors.OrcaColor dividerColor, OrcaCells tableCells) {
        s.k(backgroundColor, "backgroundColor");
        s.k(headerColor, "headerColor");
        s.k(titleColor, "titleColor");
        s.k(messageColor, "messageColor");
        s.k(dividerColor, "dividerColor");
        s.k(tableCells, "tableCells");
        return new OrcaScreen(backgroundColor, headerColor, titleColor, messageColor, dividerColor, tableCells);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrcaScreen)) {
            return false;
        }
        OrcaScreen orcaScreen = (OrcaScreen) other;
        return s.f(this.backgroundColor, orcaScreen.backgroundColor) && s.f(this.headerColor, orcaScreen.headerColor) && s.f(this.titleColor, orcaScreen.titleColor) && s.f(this.messageColor, orcaScreen.messageColor) && s.f(this.dividerColor, orcaScreen.dividerColor) && s.f(this.tableCells, orcaScreen.tableCells);
    }

    public final OrcaColors.OrcaColor getBackgroundColor() {
        return this.backgroundColor;
    }

    public final OrcaColors.OrcaColor getDividerColor() {
        return this.dividerColor;
    }

    public final OrcaColors.OrcaColor getHeaderColor() {
        return this.headerColor;
    }

    public final OrcaColors.OrcaColor getMessageColor() {
        return this.messageColor;
    }

    public final OrcaCells getTableCells() {
        return this.tableCells;
    }

    public final OrcaColors.OrcaColor getTitleColor() {
        return this.titleColor;
    }

    public int hashCode() {
        return (((((((((this.backgroundColor.hashCode() * 31) + this.headerColor.hashCode()) * 31) + this.titleColor.hashCode()) * 31) + this.messageColor.hashCode()) * 31) + this.dividerColor.hashCode()) * 31) + this.tableCells.hashCode();
    }

    public final void setBackgroundColor(OrcaColors.OrcaColor orcaColor) {
        s.k(orcaColor, "<set-?>");
        this.backgroundColor = orcaColor;
    }

    public final void setDividerColor(OrcaColors.OrcaColor orcaColor) {
        s.k(orcaColor, "<set-?>");
        this.dividerColor = orcaColor;
    }

    public final void setHeaderColor(OrcaColors.OrcaColor orcaColor) {
        s.k(orcaColor, "<set-?>");
        this.headerColor = orcaColor;
    }

    public final void setMessageColor(OrcaColors.OrcaColor orcaColor) {
        s.k(orcaColor, "<set-?>");
        this.messageColor = orcaColor;
    }

    public final void setTableCells(OrcaCells orcaCells) {
        s.k(orcaCells, "<set-?>");
        this.tableCells = orcaCells;
    }

    public final void setTitleColor(OrcaColors.OrcaColor orcaColor) {
        s.k(orcaColor, "<set-?>");
        this.titleColor = orcaColor;
    }

    public String toString() {
        return "OrcaScreen(backgroundColor=" + this.backgroundColor + ", headerColor=" + this.headerColor + ", titleColor=" + this.titleColor + ", messageColor=" + this.messageColor + ", dividerColor=" + this.dividerColor + ", tableCells=" + this.tableCells + ")";
    }
}
