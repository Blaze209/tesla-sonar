package com.fourthline.orca.core.flavor;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\b\"\u0004\b\u001e\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/fourthline/orca/core/flavor/OrcaCells;", "Lcom/fourthline/orca/core/flavor/OrcaElement;", "Lcom/fourthline/orca/core/flavor/OrcaCell;", "cellStyle1", "cellStyle2", "<init>", "(Lcom/fourthline/orca/core/flavor/OrcaCell;Lcom/fourthline/orca/core/flavor/OrcaCell;)V", "component1", "()Lcom/fourthline/orca/core/flavor/OrcaCell;", "component2", "copy", "(Lcom/fourthline/orca/core/flavor/OrcaCell;Lcom/fourthline/orca/core/flavor/OrcaCell;)Lcom/fourthline/orca/core/flavor/OrcaCells;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/orca/core/flavor/OrcaCell;", "getCellStyle1", "setCellStyle1", "(Lcom/fourthline/orca/core/flavor/OrcaCell;)V", "b", "getCellStyle2", "setCellStyle2", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OrcaCells implements OrcaElement {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private OrcaCell cellStyle1;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private OrcaCell cellStyle2;

    public OrcaCells(OrcaCell cellStyle1, OrcaCell cellStyle2) {
        s.k(cellStyle1, "cellStyle1");
        s.k(cellStyle2, "cellStyle2");
        this.cellStyle1 = cellStyle1;
        this.cellStyle2 = cellStyle2;
    }

    public static /* synthetic */ OrcaCells copy$default(OrcaCells orcaCells, OrcaCell orcaCell, OrcaCell orcaCell2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            orcaCell = orcaCells.cellStyle1;
        }
        if ((i11 & 2) != 0) {
            orcaCell2 = orcaCells.cellStyle2;
        }
        return orcaCells.copy(orcaCell, orcaCell2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OrcaCell getCellStyle1() {
        return this.cellStyle1;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OrcaCell getCellStyle2() {
        return this.cellStyle2;
    }

    public final OrcaCells copy(OrcaCell cellStyle1, OrcaCell cellStyle2) {
        s.k(cellStyle1, "cellStyle1");
        s.k(cellStyle2, "cellStyle2");
        return new OrcaCells(cellStyle1, cellStyle2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrcaCells)) {
            return false;
        }
        OrcaCells orcaCells = (OrcaCells) other;
        return s.f(this.cellStyle1, orcaCells.cellStyle1) && s.f(this.cellStyle2, orcaCells.cellStyle2);
    }

    public final OrcaCell getCellStyle1() {
        return this.cellStyle1;
    }

    public final OrcaCell getCellStyle2() {
        return this.cellStyle2;
    }

    public int hashCode() {
        return (this.cellStyle1.hashCode() * 31) + this.cellStyle2.hashCode();
    }

    public final void setCellStyle1(OrcaCell orcaCell) {
        s.k(orcaCell, "<set-?>");
        this.cellStyle1 = orcaCell;
    }

    public final void setCellStyle2(OrcaCell orcaCell) {
        s.k(orcaCell, "<set-?>");
        this.cellStyle2 = orcaCell;
    }

    public String toString() {
        return "OrcaCells(cellStyle1=" + this.cellStyle1 + ", cellStyle2=" + this.cellStyle2 + ")";
    }
}
