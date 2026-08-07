package com.fourthline.scanners.config.orca.flavor;

import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ro0.d;
import ro0.p;
import vo0.h1;
import vo0.v1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\tJ'\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006$"}, d2 = {"Lcom/fourthline/scanners/config/orca/flavor/OrcaLayoutsConfig;", "", "", OrcaFlavourKeys.PRIMARY_BUTTON_CORNER_RADIUS, "<init>", "(Ljava/lang/Integer;)V", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "write$Self$fourthline_adapters_json_release", "(Lcom/fourthline/scanners/config/orca/flavor/OrcaLayoutsConfig;Luo0/d;Lto0/f;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/Integer;)Lcom/fourthline/scanners/config/orca/flavor/OrcaLayoutsConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getPrimaryButtonCornerRadius", "Companion", "$serializer", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@p
public final /* data */ class OrcaLayoutsConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Integer primaryButtonCornerRadius;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/fourthline/scanners/config/orca/flavor/OrcaLayoutsConfig$Companion;", "", "<init>", "()V", "Lro0/d;", "Lcom/fourthline/scanners/config/orca/flavor/OrcaLayoutsConfig;", "serializer", "()Lro0/d;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final d<OrcaLayoutsConfig> serializer() {
            return OrcaLayoutsConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ OrcaLayoutsConfig(int i11, Integer num, v1 v1Var) {
        if (1 != (i11 & 1)) {
            h1.b(i11, 1, OrcaLayoutsConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.primaryButtonCornerRadius = num;
    }

    public static /* synthetic */ OrcaLayoutsConfig copy$default(OrcaLayoutsConfig orcaLayoutsConfig, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = orcaLayoutsConfig.primaryButtonCornerRadius;
        }
        return orcaLayoutsConfig.copy(num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getPrimaryButtonCornerRadius() {
        return this.primaryButtonCornerRadius;
    }

    public final OrcaLayoutsConfig copy(Integer primaryButtonCornerRadius) {
        return new OrcaLayoutsConfig(primaryButtonCornerRadius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OrcaLayoutsConfig) && s.f(this.primaryButtonCornerRadius, ((OrcaLayoutsConfig) other).primaryButtonCornerRadius);
    }

    public final Integer getPrimaryButtonCornerRadius() {
        return this.primaryButtonCornerRadius;
    }

    public int hashCode() {
        Integer num = this.primaryButtonCornerRadius;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        return "OrcaLayoutsConfig(primaryButtonCornerRadius=" + this.primaryButtonCornerRadius + ")";
    }

    public OrcaLayoutsConfig(Integer num) {
        this.primaryButtonCornerRadius = num;
    }
}
