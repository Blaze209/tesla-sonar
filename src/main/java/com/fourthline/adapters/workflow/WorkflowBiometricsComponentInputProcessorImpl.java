package com.fourthline.adapters.workflow;

import com.fourthline.adapters.CommonExceptionMapper;
import com.fourthline.adapters.common.ExceptionMapper;
import com.fourthline.adapters.serialization.FlavorDeserializer;
import com.fourthline.adapters.serialization.OrcaFlavorDeserializer;
import com.fourthline.scanners.config.orca.common.CommonJsonError;
import com.fourthline.scanners.config.orca.workflow.BiometricsComponentFlowConfig;
import com.fourthline.scanners.config.orca.workflow.WorkflowCustomization;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/fourthline/adapters/workflow/WorkflowBiometricsComponentInputProcessorImpl;", "Lcom/fourthline/adapters/workflow/WorkflowBiometricsComponentInputProcessor;", "exceptionMapper", "Lcom/fourthline/adapters/common/ExceptionMapper;", "flavorDeserializer", "Lcom/fourthline/adapters/serialization/FlavorDeserializer;", "<init>", "(Lcom/fourthline/adapters/common/ExceptionMapper;Lcom/fourthline/adapters/serialization/FlavorDeserializer;)V", "pathComponents", "", "", "fromJson", "Lcom/fourthline/scanners/config/orca/workflow/BiometricsComponentFlowConfig;", "config", "deserializeCustomization", "Lcom/fourthline/scanners/config/orca/workflow/WorkflowCustomization;", "configuration", "Lorg/json/JSONObject;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WorkflowBiometricsComponentInputProcessorImpl implements WorkflowBiometricsComponentInputProcessor {
    private final ExceptionMapper exceptionMapper;
    private FlavorDeserializer flavorDeserializer;
    private List<String> pathComponents;

    /* JADX WARN: Multi-variable type inference failed */
    public WorkflowBiometricsComponentInputProcessorImpl() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final WorkflowCustomization deserializeCustomization(JSONObject configuration) throws CommonJsonError.DecodingError {
        JSONObject jSONObjectOptJSONObject = configuration.optJSONObject("customization");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        try {
            FlavorDeserializer flavorDeserializer = this.flavorDeserializer;
            this.pathComponents = v.s("customization");
            if (jSONObjectOptJSONObject.has("flavor")) {
                return new WorkflowCustomization(flavorDeserializer.deserializeOrcaFlavor(jSONObjectOptJSONObject, this.pathComponents));
            }
            throw CommonJsonError.DecodingError.INSTANCE.errorMissingValueAtPath("flavor", this.pathComponents);
        } catch (Exception unused) {
            throw CommonJsonError.DecodingError.INSTANCE.errorDecodingValueAtPath("flavor", this.pathComponents);
        }
    }

    @Override // com.fourthline.adapters.workflow.WorkflowBiometricsComponentInputProcessor
    public BiometricsComponentFlowConfig fromJson(String config) {
        s.k(config, "config");
        return new BiometricsComponentFlowConfig(deserializeCustomization(new JSONObject(config)));
    }

    public WorkflowBiometricsComponentInputProcessorImpl(ExceptionMapper exceptionMapper, FlavorDeserializer flavorDeserializer) {
        s.k(exceptionMapper, "exceptionMapper");
        s.k(flavorDeserializer, "flavorDeserializer");
        this.exceptionMapper = exceptionMapper;
        this.flavorDeserializer = flavorDeserializer;
        this.pathComponents = new ArrayList();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WorkflowBiometricsComponentInputProcessorImpl(ExceptionMapper exceptionMapper, FlavorDeserializer flavorDeserializer, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        exceptionMapper = (i11 & 1) != 0 ? new CommonExceptionMapper() : exceptionMapper;
        this(exceptionMapper, (i11 & 2) != 0 ? new OrcaFlavorDeserializer(exceptionMapper) : flavorDeserializer);
    }
}
