package com.fourthline.orca.kyc.internal.flow.document;

import com.fourthline.core.FeatureConfig;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import ro0.d;
import ro0.p;
import to0.f;
import vo0.v1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\u0003\u0010\u0015¨\u0006$"}, d2 = {"Lcom/fourthline/orca/kyc/internal/flow/document/DocumentFlowFeatureConfig;", "Lcom/fourthline/core/FeatureConfig;", "", "isPlaceOfBirthEnabled", "<init>", "(Z)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(IZLvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "write$Self$fourthline_sdk_release", "(Lcom/fourthline/orca/kyc/internal/flow/document/DocumentFlowFeatureConfig;Luo0/d;Lto0/f;)V", "write$Self", "component1", "()Z", "copy", "(Z)Lcom/fourthline/orca/kyc/internal/flow/document/DocumentFlowFeatureConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Companion", "a", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@p
public final /* data */ class DocumentFlowFeatureConfig implements FeatureConfig {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isPlaceOfBirthEnabled;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/fourthline/orca/kyc/internal/flow/document/DocumentFlowFeatureConfig$Companion;", "", "<init>", "()V", "Lro0/d;", "Lcom/fourthline/orca/kyc/internal/flow/document/DocumentFlowFeatureConfig;", "serializer", "()Lro0/d;", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final d<DocumentFlowFeatureConfig> serializer() {
            return a.f37388a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DocumentFlowFeatureConfig() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ DocumentFlowFeatureConfig copy$default(DocumentFlowFeatureConfig documentFlowFeatureConfig, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = documentFlowFeatureConfig.isPlaceOfBirthEnabled;
        }
        return documentFlowFeatureConfig.copy(z11);
    }

    public static final /* synthetic */ void write$Self$fourthline_sdk_release(DocumentFlowFeatureConfig self, uo0.d output, f serialDesc) {
        if (!output.G(serialDesc, 0) && self.isPlaceOfBirthEnabled) {
            return;
        }
        output.A(serialDesc, 0, self.isPlaceOfBirthEnabled);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsPlaceOfBirthEnabled() {
        return this.isPlaceOfBirthEnabled;
    }

    public final DocumentFlowFeatureConfig copy(boolean isPlaceOfBirthEnabled) {
        return new DocumentFlowFeatureConfig(isPlaceOfBirthEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DocumentFlowFeatureConfig) && this.isPlaceOfBirthEnabled == ((DocumentFlowFeatureConfig) other).isPlaceOfBirthEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isPlaceOfBirthEnabled);
    }

    public final boolean isPlaceOfBirthEnabled() {
        return this.isPlaceOfBirthEnabled;
    }

    public String toString() {
        return "DocumentFlowFeatureConfig(isPlaceOfBirthEnabled=" + this.isPlaceOfBirthEnabled + ")";
    }

    public /* synthetic */ DocumentFlowFeatureConfig(int i11, boolean z11, v1 v1Var) {
        if ((i11 & 1) == 0) {
            this.isPlaceOfBirthEnabled = true;
        } else {
            this.isPlaceOfBirthEnabled = z11;
        }
    }

    public DocumentFlowFeatureConfig(boolean z11) {
        this.isPlaceOfBirthEnabled = z11;
    }

    public /* synthetic */ DocumentFlowFeatureConfig(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z11);
    }
}
