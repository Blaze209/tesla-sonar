package com.fourthline.nfc;

import com.fourthline.adapters.serialization.OrcaKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003J\u001b\u0010\u0013\u001a\u0004\u0018\u0001H\u0014\"\u0004\b\u0000\u0010\u00142\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bHÀ\u0003¢\u0006\u0002\b\u001bJ/\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, d2 = {"Lcom/fourthline/nfc/NfcScannerResult;", "", "retrievedData", "", "Lcom/fourthline/nfc/NfcData;", OrcaKeys.METADATA, "Lcom/fourthline/nfc/NfcScannerMetadata;", "isClonedCheck", "Lcom/fourthline/nfc/NfcSecurityCheck;", "<init>", "(Ljava/util/List;Lcom/fourthline/nfc/NfcScannerMetadata;Lcom/fourthline/nfc/NfcSecurityCheck;)V", "getRetrievedData", "()Ljava/util/List;", "getMetadata", "()Lcom/fourthline/nfc/NfcScannerMetadata;", "isClonedCheck$fourthline_nfc_release", "()Lcom/fourthline/nfc/NfcSecurityCheck;", "getDataGroups", "Lcom/fourthline/nfc/NfcDataGroup;", "getData", "T", "type", "Lcom/fourthline/nfc/NfcData$NfcDataType;", "(Lcom/fourthline/nfc/NfcData$NfcDataType;)Ljava/lang/Object;", "component1", "component2", "component3", "component3$fourthline_nfc_release", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fourthline-nfc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NfcScannerResult {
    public static final int $stable = 8;
    private final NfcSecurityCheck isClonedCheck;
    private final NfcScannerMetadata metadata;
    private final List<NfcData> retrievedData;

    /* JADX WARN: Multi-variable type inference failed */
    public NfcScannerResult(List<? extends NfcData> retrievedData, NfcScannerMetadata metadata, NfcSecurityCheck nfcSecurityCheck) {
        s.k(retrievedData, "retrievedData");
        s.k(metadata, "metadata");
        this.retrievedData = retrievedData;
        this.metadata = metadata;
        this.isClonedCheck = nfcSecurityCheck;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NfcScannerResult copy$default(NfcScannerResult nfcScannerResult, List list, NfcScannerMetadata nfcScannerMetadata, NfcSecurityCheck nfcSecurityCheck, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = nfcScannerResult.retrievedData;
        }
        if ((i11 & 2) != 0) {
            nfcScannerMetadata = nfcScannerResult.metadata;
        }
        if ((i11 & 4) != 0) {
            nfcSecurityCheck = nfcScannerResult.isClonedCheck;
        }
        return nfcScannerResult.copy(list, nfcScannerMetadata, nfcSecurityCheck);
    }

    public final List<NfcData> component1() {
        return this.retrievedData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NfcScannerMetadata getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: component3$fourthline_nfc_release, reason: from getter */
    public final NfcSecurityCheck getIsClonedCheck() {
        return this.isClonedCheck;
    }

    public final NfcScannerResult copy(List<? extends NfcData> retrievedData, NfcScannerMetadata metadata, NfcSecurityCheck isClonedCheck) {
        s.k(retrievedData, "retrievedData");
        s.k(metadata, "metadata");
        return new NfcScannerResult(retrievedData, metadata, isClonedCheck);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcScannerResult)) {
            return false;
        }
        NfcScannerResult nfcScannerResult = (NfcScannerResult) other;
        return s.f(this.retrievedData, nfcScannerResult.retrievedData) && s.f(this.metadata, nfcScannerResult.metadata) && s.f(this.isClonedCheck, nfcScannerResult.isClonedCheck);
    }

    public final <T> T getData(NfcData.NfcDataType type) {
        T next;
        s.k(type, "type");
        Iterator<T> it = this.retrievedData.iterator();
        do {
            if (!it.hasNext()) {
                next = (T) null;
                break;
            }
            next = it.next();
        } while (((NfcData) next).getType() != type);
        NfcData nfcData = next;
        T t11 = nfcData != null ? (T) nfcData.getData() : null;
        if (t11 == null) {
            return null;
        }
        return t11;
    }

    public final List<NfcDataGroup> getDataGroups() {
        List<NfcData> list = this.retrievedData;
        ArrayList arrayList = new ArrayList();
        for (NfcData nfcData : list) {
            NfcDataGroup nfcDataGroup = nfcData instanceof NfcDataGroup ? (NfcDataGroup) nfcData : null;
            if (nfcDataGroup != null) {
                arrayList.add(nfcDataGroup);
            }
        }
        return arrayList;
    }

    public final NfcScannerMetadata getMetadata() {
        return this.metadata;
    }

    public final List<NfcData> getRetrievedData() {
        return this.retrievedData;
    }

    public int hashCode() {
        int iHashCode = ((this.retrievedData.hashCode() * 31) + this.metadata.hashCode()) * 31;
        NfcSecurityCheck nfcSecurityCheck = this.isClonedCheck;
        return iHashCode + (nfcSecurityCheck == null ? 0 : nfcSecurityCheck.hashCode());
    }

    public final NfcSecurityCheck isClonedCheck$fourthline_nfc_release() {
        return this.isClonedCheck;
    }

    public String toString() {
        return "NfcScannerResult(retrievedData=" + this.retrievedData + ", metadata=" + this.metadata + ", isClonedCheck=" + this.isClonedCheck + ")";
    }

    public /* synthetic */ NfcScannerResult(List list, NfcScannerMetadata nfcScannerMetadata, NfcSecurityCheck nfcSecurityCheck, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, nfcScannerMetadata, (i11 & 4) != 0 ? null : nfcSecurityCheck);
    }
}
