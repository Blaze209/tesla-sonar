package com.fourthline.nfc;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Date;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/fourthline/nfc/NfcScannerSecurityKey;", "", "<init>", "()V", "BacKey", "PaceKey", "BapKey", "Companion", "Lcom/fourthline/nfc/NfcScannerSecurityKey$BacKey;", "Lcom/fourthline/nfc/NfcScannerSecurityKey$BapKey;", "Lcom/fourthline/nfc/NfcScannerSecurityKey$PaceKey;", "fourthline-nfc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class NfcScannerSecurityKey {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\f¨\u0006!"}, d2 = {"Lcom/fourthline/nfc/NfcScannerSecurityKey$BacKey;", "Lcom/fourthline/nfc/NfcScannerSecurityKey;", "", "documentNumber", "Ljava/util/Date;", "birthDate", "expiryDate", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Date;", "component3", "copy", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)Lcom/fourthline/nfc/NfcScannerSecurityKey$BacKey;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getDocumentNumber", "b", "Ljava/util/Date;", "getBirthDate", "c", "getExpiryDate", "fourthline-nfc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BacKey extends NfcScannerSecurityKey {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentNumber;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Date birthDate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Date expiryDate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BacKey(String documentNumber, Date birthDate, Date expiryDate) {
            super(null);
            s.k(documentNumber, "documentNumber");
            s.k(birthDate, "birthDate");
            s.k(expiryDate, "expiryDate");
            this.documentNumber = documentNumber;
            this.birthDate = birthDate;
            this.expiryDate = expiryDate;
        }

        public static /* synthetic */ BacKey copy$default(BacKey bacKey, String str, Date date, Date date2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bacKey.documentNumber;
            }
            if ((i11 & 2) != 0) {
                date = bacKey.birthDate;
            }
            if ((i11 & 4) != 0) {
                date2 = bacKey.expiryDate;
            }
            return bacKey.copy(str, date, date2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDocumentNumber() {
            return this.documentNumber;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Date getBirthDate() {
            return this.birthDate;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Date getExpiryDate() {
            return this.expiryDate;
        }

        public final BacKey copy(String documentNumber, Date birthDate, Date expiryDate) {
            s.k(documentNumber, "documentNumber");
            s.k(birthDate, "birthDate");
            s.k(expiryDate, "expiryDate");
            return new BacKey(documentNumber, birthDate, expiryDate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BacKey)) {
                return false;
            }
            BacKey bacKey = (BacKey) other;
            return s.f(this.documentNumber, bacKey.documentNumber) && s.f(this.birthDate, bacKey.birthDate) && s.f(this.expiryDate, bacKey.expiryDate);
        }

        public final Date getBirthDate() {
            return this.birthDate;
        }

        public final String getDocumentNumber() {
            return this.documentNumber;
        }

        public final Date getExpiryDate() {
            return this.expiryDate;
        }

        public int hashCode() {
            return (((this.documentNumber.hashCode() * 31) + this.birthDate.hashCode()) * 31) + this.expiryDate.hashCode();
        }

        public String toString() {
            return "BacKey(documentNumber=" + this.documentNumber + ", birthDate=" + this.birthDate + ", expiryDate=" + this.expiryDate + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/fourthline/nfc/NfcScannerSecurityKey$BapKey;", "Lcom/fourthline/nfc/NfcScannerSecurityKey;", "", "rawMrz", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/fourthline/nfc/NfcScannerSecurityKey$BapKey;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getRawMrz", "fourthline-nfc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BapKey extends NfcScannerSecurityKey {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String rawMrz;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BapKey(String rawMrz) {
            super(null);
            s.k(rawMrz, "rawMrz");
            this.rawMrz = rawMrz;
        }

        public static /* synthetic */ BapKey copy$default(BapKey bapKey, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bapKey.rawMrz;
            }
            return bapKey.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRawMrz() {
            return this.rawMrz;
        }

        public final BapKey copy(String rawMrz) {
            s.k(rawMrz, "rawMrz");
            return new BapKey(rawMrz);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BapKey) && s.f(this.rawMrz, ((BapKey) other).rawMrz);
        }

        public final String getRawMrz() {
            return this.rawMrz;
        }

        public int hashCode() {
            return this.rawMrz.hashCode();
        }

        public String toString() {
            return "BapKey(rawMrz=" + this.rawMrz + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007H\u0007J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H\u0007¨\u0006\u000f"}, d2 = {"Lcom/fourthline/nfc/NfcScannerSecurityKey$Companion;", "", "<init>", "()V", "createWithMrtdData", "Lcom/fourthline/nfc/NfcScannerSecurityKey;", "documentNumber", "", "birthDate", "Ljava/util/Date;", "expiryDate", "createWithMrtdCanNumber", InquiryField.FloatField.TYPE2, "createWithIdlMrz", "mrz", "fourthline-nfc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NfcScannerSecurityKey createWithIdlMrz(String mrz) {
            s.k(mrz, "mrz");
            return new BapKey(mrz);
        }

        public final NfcScannerSecurityKey createWithMrtdCanNumber(String number) {
            s.k(number, "number");
            return new PaceKey(number);
        }

        public final NfcScannerSecurityKey createWithMrtdData(String documentNumber, Date birthDate, Date expiryDate) {
            s.k(documentNumber, "documentNumber");
            s.k(birthDate, "birthDate");
            s.k(expiryDate, "expiryDate");
            return new BacKey(documentNumber, birthDate, expiryDate);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/fourthline/nfc/NfcScannerSecurityKey$PaceKey;", "Lcom/fourthline/nfc/NfcScannerSecurityKey;", "", "canNumber", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/fourthline/nfc/NfcScannerSecurityKey$PaceKey;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCanNumber", "fourthline-nfc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaceKey extends NfcScannerSecurityKey {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String canNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaceKey(String canNumber) {
            super(null);
            s.k(canNumber, "canNumber");
            this.canNumber = canNumber;
        }

        public static /* synthetic */ PaceKey copy$default(PaceKey paceKey, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = paceKey.canNumber;
            }
            return paceKey.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCanNumber() {
            return this.canNumber;
        }

        public final PaceKey copy(String canNumber) {
            s.k(canNumber, "canNumber");
            return new PaceKey(canNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PaceKey) && s.f(this.canNumber, ((PaceKey) other).canNumber);
        }

        public final String getCanNumber() {
            return this.canNumber;
        }

        public int hashCode() {
            return this.canNumber.hashCode();
        }

        public String toString() {
            return "PaceKey(canNumber=" + this.canNumber + ")";
        }
    }

    public /* synthetic */ NfcScannerSecurityKey(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final NfcScannerSecurityKey createWithIdlMrz(String str) {
        return INSTANCE.createWithIdlMrz(str);
    }

    public static final NfcScannerSecurityKey createWithMrtdCanNumber(String str) {
        return INSTANCE.createWithMrtdCanNumber(str);
    }

    public static final NfcScannerSecurityKey createWithMrtdData(String str, Date date, Date date2) {
        return INSTANCE.createWithMrtdData(str, date, date2);
    }

    private NfcScannerSecurityKey() {
    }
}
