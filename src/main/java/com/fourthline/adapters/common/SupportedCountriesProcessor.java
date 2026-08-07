package com.fourthline.adapters.common;

import com.fourthline.adapters.serialization.JsonKt;
import com.fourthline.scanners.config.SupportedCountryInfo;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import vo0.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/fourthline/adapters/common/SupportedCountriesProcessor;", "", "<init>", "()V", "getSupportedCountries", "", "Lcom/fourthline/scanners/config/SupportedCountryInfo;", "jsonObject", "Lorg/json/JSONObject;", "SUPPORTED_COUNTRIES", "", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SupportedCountriesProcessor {
    public static final SupportedCountriesProcessor INSTANCE = new SupportedCountriesProcessor();
    public static final String SUPPORTED_COUNTRIES = "supportedCountries";

    private SupportedCountriesProcessor() {
    }

    public final List<SupportedCountryInfo> getSupportedCountries(JSONObject jsonObject) throws JSONException {
        s.k(jsonObject, "jsonObject");
        try {
            wo0.b json = JsonKt.getJson();
            String string = jsonObject.getJSONArray("supportedCountries").toString();
            s.j(string, "toString(...)");
            json.getSerializersModule();
            return (List) json.d(new e(SupportedCountryInfo.INSTANCE.serializer()), string);
        } catch (Exception e11) {
            throw new JSONException("Can't parse the json array for the key: supportedCountries. Please check that json is valid error is: " + e11);
        }
    }
}
