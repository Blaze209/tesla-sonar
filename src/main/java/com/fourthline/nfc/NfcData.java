package com.fourthline.nfc;

import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0017\u0018\u00002\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/fourthline/nfc/NfcData;", "", "Lcom/fourthline/nfc/NfcData$NfcDataType;", "type", "data", "<init>", "(Lcom/fourthline/nfc/NfcData$NfcDataType;Ljava/lang/Object;)V", "a", "Lcom/fourthline/nfc/NfcData$NfcDataType;", "getType", "()Lcom/fourthline/nfc/NfcData$NfcDataType;", "b", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "NfcDataType", "fourthline-nfc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class NfcData {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final NfcDataType type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object data;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/fourthline/nfc/NfcData$NfcDataType;", "", "<init>", "(Ljava/lang/String;I)V", "MRZ_INFO", "IDL_BASIC_INFO", "PHOTO", "SECURITY_OBJECT", "PERSONAL_DETAILS", "DOCUMENT_DETAILS", "fourthline-nfc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum NfcDataType {
        MRZ_INFO,
        IDL_BASIC_INFO,
        PHOTO,
        SECURITY_OBJECT,
        PERSONAL_DETAILS,
        DOCUMENT_DETAILS;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f24451b = on0.a.a(a());

        public static EnumEntries<NfcDataType> getEntries() {
            return f24451b;
        }
    }

    public NfcData(NfcDataType type, Object data) {
        s.k(type, "type");
        s.k(data, "data");
        this.type = type;
        this.data = data;
    }

    public Object getData() {
        return this.data;
    }

    public NfcDataType getType() {
        return this.type;
    }
}
