package com.fourthline.adapters.common;

import com.fourthline.core.CountryNetworkModel;
import com.fourthline.scanners.config.SupportedCountryInfo;
import com.fourthline.scanners.config.SupportedCountryInfoKt;
import com.fourthline.scanners.config.orca.common.CommonJsonError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/fourthline/adapters/common/SupportedCountriesDeserializerImpl;", "Lcom/fourthline/adapters/common/SupportedCountriesDeserializer;", "<init>", "()V", "deserialize", "", "Lcom/fourthline/core/CountryNetworkModel;", "pathComponents", "", "", "configuration", "Lorg/json/JSONObject;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SupportedCountriesDeserializerImpl implements SupportedCountriesDeserializer {
    @Override // com.fourthline.adapters.common.SupportedCountriesDeserializer
    public List<CountryNetworkModel> deserialize(List<String> pathComponents, JSONObject configuration) throws Exception {
        s.k(pathComponents, "pathComponents");
        pathComponents.clear();
        pathComponents.add("configuration");
        if (configuration == null || configuration.optJSONArray("supportedCountries") == null) {
            throw CommonJsonError.DecodingError.INSTANCE.errorMissingValueAtPath("supportedCountries", pathComponents);
        }
        try {
            List<SupportedCountryInfo> supportedCountries = SupportedCountriesProcessor.INSTANCE.getSupportedCountries(configuration);
            ArrayList arrayList = new ArrayList(v.y(supportedCountries, 10));
            Iterator<T> it = supportedCountries.iterator();
            while (it.hasNext()) {
                arrayList.add(SupportedCountryInfoKt.toCountryNetworkModel((SupportedCountryInfo) it.next()));
            }
            return arrayList;
        } catch (Exception e11) {
            if (e11 instanceof CommonJsonError) {
                throw e11;
            }
            throw CommonJsonError.DecodingError.INSTANCE.errorDecodingValueAtPath("supportedCountries", pathComponents);
        }
    }
}
