package com.fourthline.nfc;

import expo.modules.interfaces.permissions.PermissionsResponse;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/fourthline/nfc/NfcSecurityCheck;", "", "Lcom/fourthline/nfc/NfcSecurityCheckType;", "type", "Lcom/fourthline/nfc/NfcSecurityCheckStatus;", PermissionsResponse.STATUS_KEY, "<init>", "(Lcom/fourthline/nfc/NfcSecurityCheckType;Lcom/fourthline/nfc/NfcSecurityCheckStatus;)V", "component1", "()Lcom/fourthline/nfc/NfcSecurityCheckType;", "component2", "()Lcom/fourthline/nfc/NfcSecurityCheckStatus;", "copy", "(Lcom/fourthline/nfc/NfcSecurityCheckType;Lcom/fourthline/nfc/NfcSecurityCheckStatus;)Lcom/fourthline/nfc/NfcSecurityCheck;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/nfc/NfcSecurityCheckType;", "getType", "b", "Lcom/fourthline/nfc/NfcSecurityCheckStatus;", "getStatus", "fourthline-nfc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NfcSecurityCheck {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final NfcSecurityCheckType type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final NfcSecurityCheckStatus status;

    public NfcSecurityCheck(NfcSecurityCheckType type, NfcSecurityCheckStatus status) {
        s.k(type, "type");
        s.k(status, "status");
        this.type = type;
        this.status = status;
    }

    public static /* synthetic */ NfcSecurityCheck copy$default(NfcSecurityCheck nfcSecurityCheck, NfcSecurityCheckType nfcSecurityCheckType, NfcSecurityCheckStatus nfcSecurityCheckStatus, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            nfcSecurityCheckType = nfcSecurityCheck.type;
        }
        if ((i11 & 2) != 0) {
            nfcSecurityCheckStatus = nfcSecurityCheck.status;
        }
        return nfcSecurityCheck.copy(nfcSecurityCheckType, nfcSecurityCheckStatus);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NfcSecurityCheckType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NfcSecurityCheckStatus getStatus() {
        return this.status;
    }

    public final NfcSecurityCheck copy(NfcSecurityCheckType type, NfcSecurityCheckStatus status) {
        s.k(type, "type");
        s.k(status, "status");
        return new NfcSecurityCheck(type, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcSecurityCheck)) {
            return false;
        }
        NfcSecurityCheck nfcSecurityCheck = (NfcSecurityCheck) other;
        return this.type == nfcSecurityCheck.type && this.status == nfcSecurityCheck.status;
    }

    public final NfcSecurityCheckStatus getStatus() {
        return this.status;
    }

    public final NfcSecurityCheckType getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.status.hashCode();
    }

    public String toString() {
        return "NfcSecurityCheck(type=" + this.type + ", status=" + this.status + ")";
    }
}
