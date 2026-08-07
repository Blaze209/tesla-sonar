package com.fourthline.adapters.serialization;

import com.fourthline.adapters.common.ExceptionMapper;
import com.fourthline.scanners.config.orca.common.CommonJsonError;
import com.fourthline.scanners.config.orca.flavor.OrcaFlavorConfig;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wo0.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ'\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ)\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/fourthline/adapters/serialization/OrcaFlavorDeserializer;", "Lcom/fourthline/adapters/serialization/FlavorDeserializer;", "Lcom/fourthline/adapters/common/ExceptionMapper;", "exceptionMapper", "<init>", "(Lcom/fourthline/adapters/common/ExceptionMapper;)V", "Lorg/json/JSONObject;", "configuration", "", "", "pathComponents", "Ljn0/h0;", "requiresCorrectInputFieldsFormat", "(Lorg/json/JSONObject;Ljava/util/List;)V", "requiresCornerRadiusToBeANumber", "requiresFontSizeToBeANumber", "Lcom/fourthline/scanners/config/orca/flavor/OrcaFlavorConfig;", "deserializeOrcaFlavor", "(Lorg/json/JSONObject;Ljava/util/List;)Lcom/fourthline/scanners/config/orca/flavor/OrcaFlavorConfig;", "Lcom/fourthline/adapters/common/ExceptionMapper;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OrcaFlavorDeserializer implements FlavorDeserializer {
    private final ExceptionMapper exceptionMapper;

    public OrcaFlavorDeserializer(ExceptionMapper exceptionMapper) {
        s.k(exceptionMapper, "exceptionMapper");
        this.exceptionMapper = exceptionMapper;
    }

    private final void requiresCornerRadiusToBeANumber(JSONObject configuration, List<String> pathComponents) throws CommonJsonError.DecodingError {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        Object objOpt;
        if (configuration != null && (jSONObjectOptJSONObject = configuration.optJSONObject("flavor")) != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(OrcaFlavourKeys.LAYOUTS)) != null && (objOpt = jSONObjectOptJSONObject2.opt(OrcaFlavourKeys.PRIMARY_BUTTON_CORNER_RADIUS)) != null && !(objOpt instanceof Number)) {
            throw CommonJsonError.DecodingError.INSTANCE.errorDecodingValueAtPath(OrcaFlavourKeys.PRIMARY_BUTTON_CORNER_RADIUS, pathComponents);
        }
    }

    private final void requiresCorrectInputFieldsFormat(JSONObject configuration, List<String> pathComponents) throws CommonJsonError.DecodingError {
        requiresFontSizeToBeANumber(configuration, pathComponents);
        requiresCornerRadiusToBeANumber(configuration, pathComponents);
    }

    private final void requiresFontSizeToBeANumber(JSONObject configuration, List<String> pathComponents) throws CommonJsonError.DecodingError {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (configuration == null || (jSONObjectOptJSONObject = configuration.optJSONObject("flavor")) == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(OrcaFlavourKeys.FONTS)) == null) {
            return;
        }
        Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
        s.j(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            if (!(jSONObjectOptJSONObject2.getJSONObject(itKeys.next()).get(OrcaFlavourKeys.FONT_SIZE) instanceof Number)) {
                throw CommonJsonError.DecodingError.INSTANCE.errorDecodingValueAtPath(OrcaFlavourKeys.FONT_SIZE, pathComponents);
            }
        }
    }

    @Override // com.fourthline.adapters.serialization.FlavorDeserializer
    public OrcaFlavorConfig deserializeOrcaFlavor(JSONObject configuration, List<String> pathComponents) throws Exception {
        s.k(pathComponents, "pathComponents");
        requiresCorrectInputFieldsFormat(configuration, pathComponents);
        if (configuration == null) {
            return null;
        }
        try {
            JSONObject jSONObjectOptJSONObject = configuration.optJSONObject("flavor");
            if (jSONObjectOptJSONObject == null) {
                return null;
            }
            b json = JsonKt.getJson();
            String string = jSONObjectOptJSONObject.toString();
            s.j(string, "toString(...)");
            json.getSerializersModule();
            return (OrcaFlavorConfig) json.d(OrcaFlavorConfig.INSTANCE.serializer(), string);
        } catch (Exception e11) {
            throw this.exceptionMapper.mapException(e11, pathComponents);
        }
    }
}
