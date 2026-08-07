package com.fourthline.nfc;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/fourthline/nfc/NfcDataGroup;", "Lcom/fourthline/nfc/NfcData;", "", "groupNumber", "", "rawData", "Lcom/fourthline/nfc/NfcData$NfcDataType;", "type", "", "data", "<init>", "(I[BLcom/fourthline/nfc/NfcData$NfcDataType;Ljava/lang/Object;)V", "c", "I", "getGroupNumber", "()I", DateTokenConverter.CONVERTER_KEY, "[B", "getRawData", "()[B", "e", "Lcom/fourthline/nfc/NfcData$NfcDataType;", "getType", "()Lcom/fourthline/nfc/NfcData$NfcDataType;", "f", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "fourthline-nfc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NfcDataGroup extends NfcData {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int groupNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final byte[] rawData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final NfcData.NfcDataType type;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Object data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NfcDataGroup(int i11, byte[] rawData, NfcData.NfcDataType type, Object data) {
        super(type, data);
        s.k(rawData, "rawData");
        s.k(type, "type");
        s.k(data, "data");
        this.groupNumber = i11;
        this.rawData = rawData;
        this.type = type;
        this.data = data;
    }

    @Override // com.fourthline.nfc.NfcData
    public Object getData() {
        return this.data;
    }

    public final int getGroupNumber() {
        return this.groupNumber;
    }

    public final byte[] getRawData() {
        return this.rawData;
    }

    @Override // com.fourthline.nfc.NfcData
    public NfcData.NfcDataType getType() {
        return this.type;
    }
}
