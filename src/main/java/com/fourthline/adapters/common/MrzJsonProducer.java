package com.fourthline.adapters.common;

import com.fourthline.core.mrz.IdlMrzInfo;
import com.fourthline.core.mrz.MrtdMrzInfo;
import com.fourthline.nfc.IdlBasicInfo;
import org.json.JSONObject;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\u001a\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/fourthline/adapters/common/MrzJsonProducer;", "", "produceMrtdMrzInfoJsonObject", "Lorg/json/JSONObject;", "mrzInfo", "Lcom/fourthline/core/mrz/MrtdMrzInfo;", "produceIdlMrzInfoJsonObject", "Lcom/fourthline/core/mrz/IdlMrzInfo;", "produceIdlBasicInfoJsonObject", "rawMrz", "", "idlBasicInfo", "Lcom/fourthline/nfc/IdlBasicInfo;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface MrzJsonProducer {
    JSONObject produceIdlBasicInfoJsonObject(String rawMrz, IdlBasicInfo idlBasicInfo);

    JSONObject produceIdlMrzInfoJsonObject(IdlMrzInfo mrzInfo);

    JSONObject produceMrtdMrzInfoJsonObject(MrtdMrzInfo mrzInfo);
}
