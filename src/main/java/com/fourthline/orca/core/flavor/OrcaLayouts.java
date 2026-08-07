package com.fourthline.orca.core.flavor;

import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/fourthline/orca/core/flavor/OrcaLayouts;", "", "", OrcaFlavourKeys.PRIMARY_BUTTON_CORNER_RADIUS, "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/fourthline/orca/core/flavor/OrcaLayouts;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getPrimaryButtonCornerRadius", "CornerRadius", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OrcaLayouts {
    public static final int $stable = 0;
    public static final int Round = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int primaryButtonCornerRadius;

    public OrcaLayouts() {
        this(0, 1, null);
    }

    public static /* synthetic */ OrcaLayouts copy$default(OrcaLayouts orcaLayouts, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = orcaLayouts.primaryButtonCornerRadius;
        }
        return orcaLayouts.copy(i11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPrimaryButtonCornerRadius() {
        return this.primaryButtonCornerRadius;
    }

    public final OrcaLayouts copy(int primaryButtonCornerRadius) {
        return new OrcaLayouts(primaryButtonCornerRadius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OrcaLayouts) && this.primaryButtonCornerRadius == ((OrcaLayouts) other).primaryButtonCornerRadius;
    }

    public final int getPrimaryButtonCornerRadius() {
        return this.primaryButtonCornerRadius;
    }

    public int hashCode() {
        return Integer.hashCode(this.primaryButtonCornerRadius);
    }

    public String toString() {
        return "OrcaLayouts(primaryButtonCornerRadius=" + this.primaryButtonCornerRadius + ")";
    }

    public OrcaLayouts(int i11) {
        this.primaryButtonCornerRadius = i11;
    }

    public /* synthetic */ OrcaLayouts(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 4 : i11);
    }
}
