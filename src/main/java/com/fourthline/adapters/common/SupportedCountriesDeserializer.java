package com.fourthline.adapters.common;

import com.fourthline.core.CountryNetworkModel;
import java.util.List;
import org.json.JSONObject;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\n"}, d2 = {"Lcom/fourthline/adapters/common/SupportedCountriesDeserializer;", "", "deserialize", "", "Lcom/fourthline/core/CountryNetworkModel;", "pathComponents", "", "", "configuration", "Lorg/json/JSONObject;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SupportedCountriesDeserializer {
    List<CountryNetworkModel> deserialize(List<String> pathComponents, JSONObject configuration);
}
