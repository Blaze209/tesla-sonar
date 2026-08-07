package com.fourthline.adapters.workflow;

import com.fourthline.adapters.common.ExceptionMapper;
import com.fourthline.adapters.serialization.FlavorDeserializer;
import com.fourthline.adapters.serialization.JSONExtensionsKt;
import com.fourthline.adapters.serialization.OrcaFlavorDeserializer;
import com.fourthline.networking.NetworkEnvironment;
import com.fourthline.scanners.config.orca.common.CommonJsonError;
import com.fourthline.scanners.config.orca.workflow.WorkflowConfig;
import com.fourthline.scanners.config.orca.workflow.WorkflowCustomization;
import com.fourthline.scanners.config.orca.workflow.WorkflowFlowConfig;
import com.fourthline.scanners.config.orca.workflow.WorkflowKeys;
import java.util.List;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/fourthline/adapters/workflow/WorkflowInputProcessorImpl;", "Lcom/fourthline/adapters/workflow/WorkflowInputProcessor;", "<init>", "()V", "exceptionMapper", "Lcom/fourthline/adapters/common/ExceptionMapper;", "flavorDeserializer", "Lcom/fourthline/adapters/serialization/FlavorDeserializer;", "pathComponents", "", "", "fromJson", "Lcom/fourthline/scanners/config/orca/workflow/WorkflowFlowConfig;", "config", "deserializeCustomization", "Lcom/fourthline/scanners/config/orca/workflow/WorkflowCustomization;", "configuration", "Lorg/json/JSONObject;", "deserializeConfiguration", "Lcom/fourthline/scanners/config/orca/workflow/WorkflowConfig;", "getValidationCode", "getNetworkConfiguration", "Lcom/fourthline/networking/NetworkEnvironment;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WorkflowInputProcessorImpl implements WorkflowInputProcessor {
    private final ExceptionMapper exceptionMapper;
    private FlavorDeserializer flavorDeserializer;
    private List<String> pathComponents;

    public WorkflowInputProcessorImpl() {
        WorkflowExceptionMapper workflowExceptionMapper = new WorkflowExceptionMapper();
        this.exceptionMapper = workflowExceptionMapper;
        this.flavorDeserializer = new OrcaFlavorDeserializer(workflowExceptionMapper);
        this.pathComponents = v.m();
    }

    private final WorkflowConfig deserializeConfiguration(JSONObject configuration) {
        this.pathComponents = v.e("configuration");
        return new WorkflowConfig(getValidationCode(configuration), getNetworkConfiguration(configuration));
    }

    private final WorkflowCustomization deserializeCustomization(JSONObject configuration) throws CommonJsonError.DecodingError {
        JSONObject jSONObjectOptJSONObject = configuration.optJSONObject("customization");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        try {
            FlavorDeserializer flavorDeserializer = this.flavorDeserializer;
            this.pathComponents = v.e("customization");
            if (jSONObjectOptJSONObject.has("flavor")) {
                return new WorkflowCustomization(flavorDeserializer.deserializeOrcaFlavor(jSONObjectOptJSONObject, this.pathComponents));
            }
            throw CommonJsonError.DecodingError.INSTANCE.errorMissingValueAtPath("flavor", this.pathComponents);
        } catch (Exception unused) {
            throw CommonJsonError.DecodingError.INSTANCE.errorDecodingValueAtPath("flavor", this.pathComponents);
        }
    }

    private final NetworkEnvironment getNetworkConfiguration(JSONObject configuration) throws CommonJsonError.DecodingError {
        this.pathComponents = v.e("configuration");
        String androidOptString = JSONExtensionsKt.getAndroidOptString(configuration, WorkflowKeys.NETWORK_ENVIRONMENT);
        if (androidOptString == null) {
            throw CommonJsonError.DecodingError.INSTANCE.errorMissingValueAtPath(WorkflowKeys.NETWORK_ENVIRONMENT, this.pathComponents);
        }
        int iHashCode = androidOptString.hashCode();
        if (iHashCode != 3357066) {
            if (iHashCode != 1753018553) {
                if (iHashCode == 1865400007 && androidOptString.equals("sandbox")) {
                    return NetworkEnvironment.Sandbox.INSTANCE;
                }
            } else if (androidOptString.equals("production")) {
                return NetworkEnvironment.Production.INSTANCE;
            }
        } else if (androidOptString.equals("mock")) {
            return NetworkEnvironment.Mock.INSTANCE;
        }
        throw CommonJsonError.DecodingError.INSTANCE.errorDecodingValueAtPath(WorkflowKeys.NETWORK_ENVIRONMENT, this.pathComponents);
    }

    private final String getValidationCode(JSONObject configuration) throws CommonJsonError.DecodingError {
        String androidOptString = JSONExtensionsKt.getAndroidOptString(configuration, WorkflowKeys.VALIDATION_CODE);
        if (androidOptString != null) {
            return androidOptString;
        }
        throw CommonJsonError.DecodingError.INSTANCE.errorMissingValueAtPath(WorkflowKeys.VALIDATION_CODE, this.pathComponents);
    }

    @Override // com.fourthline.adapters.workflow.WorkflowInputProcessor
    public WorkflowFlowConfig fromJson(String config) throws CommonJsonError.IncorrectConfiguration, CommonJsonError.DecodingError {
        s.k(config, "config");
        JSONObject jSONObject = new JSONObject(config);
        WorkflowCustomization workflowCustomizationDeserializeCustomization = deserializeCustomization(jSONObject);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("configuration");
        if (jSONObjectOptJSONObject != null) {
            return new WorkflowFlowConfig(deserializeConfiguration(jSONObjectOptJSONObject), workflowCustomizationDeserializeCustomization);
        }
        throw CommonJsonError.IncorrectConfiguration.INSTANCE;
    }
}
