package com.fourthline.scanners.config.orca.flavor.extensions;

import com.fourthline.orca.core.flavor.OrcaLayouts;
import com.fourthline.scanners.config.orca.flavor.OrcaLayoutsConfig;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0004H\u0002¨\u0006\u0005"}, d2 = {"toOrcaLayouts", "Lcom/fourthline/orca/core/flavor/OrcaLayouts;", "Lcom/fourthline/scanners/config/orca/flavor/OrcaLayoutsConfig;", "mapCornerRadius", "", "fourthline-adapters-json_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class OrcaLayoutsConfigExtensionsKt {
    private static final int mapCornerRadius(int i11) {
        if (i11 < 0) {
            return Integer.MAX_VALUE;
        }
        return i11;
    }

    public static final OrcaLayouts toOrcaLayouts(OrcaLayoutsConfig orcaLayoutsConfig) {
        s.k(orcaLayoutsConfig, "<this>");
        OrcaLayouts orcaLayouts = new OrcaLayouts(0, 1, null);
        Integer primaryButtonCornerRadius = orcaLayoutsConfig.getPrimaryButtonCornerRadius();
        return new OrcaLayouts(primaryButtonCornerRadius != null ? mapCornerRadius(primaryButtonCornerRadius.intValue()) : orcaLayouts.getPrimaryButtonCornerRadius());
    }
}
