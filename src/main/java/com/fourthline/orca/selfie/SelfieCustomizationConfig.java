package com.fourthline.orca.selfie;

import com.fourthline.orca.core.ProductCustomization;
import com.fourthline.orca.core.flavor.OrcaFlavor;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/fourthline/orca/selfie/SelfieCustomizationConfig;", "Lcom/fourthline/orca/core/ProductCustomization;", "Lcom/fourthline/orca/core/flavor/OrcaFlavor;", "flavor", "<init>", "(Lcom/fourthline/orca/core/flavor/OrcaFlavor;)V", "component1", "()Lcom/fourthline/orca/core/flavor/OrcaFlavor;", "copy", "(Lcom/fourthline/orca/core/flavor/OrcaFlavor;)Lcom/fourthline/orca/selfie/SelfieCustomizationConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/orca/core/flavor/OrcaFlavor;", "getFlavor", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SelfieCustomizationConfig implements ProductCustomization {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrcaFlavor flavor;

    public SelfieCustomizationConfig(OrcaFlavor flavor) {
        s.k(flavor, "flavor");
        this.flavor = flavor;
    }

    public static /* synthetic */ SelfieCustomizationConfig copy$default(SelfieCustomizationConfig selfieCustomizationConfig, OrcaFlavor orcaFlavor, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            orcaFlavor = selfieCustomizationConfig.flavor;
        }
        return selfieCustomizationConfig.copy(orcaFlavor);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OrcaFlavor getFlavor() {
        return this.flavor;
    }

    public final SelfieCustomizationConfig copy(OrcaFlavor flavor) {
        s.k(flavor, "flavor");
        return new SelfieCustomizationConfig(flavor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SelfieCustomizationConfig) && s.f(this.flavor, ((SelfieCustomizationConfig) other).flavor);
    }

    @Override // com.fourthline.orca.core.ProductCustomization
    public OrcaFlavor getFlavor() {
        return this.flavor;
    }

    public int hashCode() {
        return this.flavor.hashCode();
    }

    public String toString() {
        return "SelfieCustomizationConfig(flavor=" + this.flavor + ")";
    }
}
