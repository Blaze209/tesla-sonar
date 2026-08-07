package com.fourthline.adapters.workflow;

import com.fourthline.adapters.CommonExceptionMapper;
import com.fourthline.adapters.common.ExceptionMapper;
import com.fourthline.adapters.serialization.FlavorDeserializer;
import com.fourthline.adapters.serialization.JSONExtensionsKt;
import com.fourthline.adapters.serialization.OrcaFlavorDeserializer;
import com.fourthline.core.DocumentType;
import com.fourthline.orca.workflow.DocumentComponentConfig;
import com.fourthline.scanners.config.orca.common.CommonJsonError;
import com.fourthline.scanners.config.orca.workflow.DocumentComponentFlowConfig;
import com.fourthline.scanners.config.orca.workflow.WorkflowCustomization;
import com.fourthline.scanners.config.orca.workflow.WorkflowKeys;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/fourthline/adapters/workflow/WorkflowDocumentComponentInputProcessorImpl;", "Lcom/fourthline/adapters/workflow/WorkflowDocumentComponentInputProcessor;", "exceptionMapper", "Lcom/fourthline/adapters/common/ExceptionMapper;", "flavorDeserializer", "Lcom/fourthline/adapters/serialization/FlavorDeserializer;", "<init>", "(Lcom/fourthline/adapters/common/ExceptionMapper;Lcom/fourthline/adapters/serialization/FlavorDeserializer;)V", "pathComponents", "", "", "fromJson", "Lcom/fourthline/scanners/config/orca/workflow/DocumentComponentFlowConfig;", "config", "deserializeCustomization", "Lcom/fourthline/scanners/config/orca/workflow/WorkflowCustomization;", "configuration", "Lorg/json/JSONObject;", "deserializeConfiguration", "Lcom/fourthline/orca/workflow/DocumentComponentConfig;", "deserializeDocumentType", "Lcom/fourthline/core/DocumentType;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WorkflowDocumentComponentInputProcessorImpl implements WorkflowDocumentComponentInputProcessor {
    private final ExceptionMapper exceptionMapper;
    private FlavorDeserializer flavorDeserializer;
    private List<String> pathComponents;

    /* JADX WARN: Multi-variable type inference failed */
    public WorkflowDocumentComponentInputProcessorImpl() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final DocumentComponentConfig deserializeConfiguration(JSONObject configuration) throws CommonJsonError.DecodingError {
        this.pathComponents = v.s("configuration");
        DocumentType documentTypeDeserializeDocumentType = deserializeDocumentType(configuration);
        String androidOptString = JSONExtensionsKt.getAndroidOptString(configuration, WorkflowKeys.ISSUING_COUNTRY);
        if (androidOptString != null) {
            return new DocumentComponentConfig(documentTypeDeserializeDocumentType, androidOptString);
        }
        throw CommonJsonError.DecodingError.INSTANCE.errorMissingValueAtPath(WorkflowKeys.ISSUING_COUNTRY, this.pathComponents);
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r3.equals("Passport") != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        if (r3.equals("passport") != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        return com.fourthline.core.DocumentType.PASSPORT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (r3.equals("Paper ID") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (r3.equals("residencePermit") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r3.equals("Residence Permit") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        return com.fourthline.core.DocumentType.RESIDENCE_PERMIT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
    
        if (r3.equals("Driving License") != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0075, code lost:
    
        if (r3.equals("National ID Card") != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007e, code lost:
    
        if (r3.equals("paperId") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0082, code lost:
    
        return com.fourthline.core.DocumentType.PAPER_ID;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0089, code lost:
    
        if (r3.equals("driversLicense") != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008d, code lost:
    
        return com.fourthline.core.DocumentType.DRIVERS_LICENSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0094, code lost:
    
        if (r3.equals("idCard") != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0098, code lost:
    
        return com.fourthline.core.DocumentType.ID_CARD;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.fourthline.core.DocumentType deserializeDocumentType(org.json.JSONObject r3) throws com.fourthline.scanners.config.orca.common.CommonJsonError.DecodingError {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.adapters.workflow.WorkflowDocumentComponentInputProcessorImpl.deserializeDocumentType(org.json.JSONObject):com.fourthline.core.DocumentType");
    }

    @Override // com.fourthline.adapters.workflow.WorkflowDocumentComponentInputProcessor
    public DocumentComponentFlowConfig fromJson(String config) throws CommonJsonError.IncorrectConfiguration, CommonJsonError.DecodingError {
        s.k(config, "config");
        JSONObject jSONObject = new JSONObject(config);
        WorkflowCustomization workflowCustomizationDeserializeCustomization = deserializeCustomization(jSONObject);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("configuration");
        if (jSONObjectOptJSONObject != null) {
            return new DocumentComponentFlowConfig(deserializeConfiguration(jSONObjectOptJSONObject), workflowCustomizationDeserializeCustomization);
        }
        throw CommonJsonError.IncorrectConfiguration.INSTANCE;
    }

    public WorkflowDocumentComponentInputProcessorImpl(ExceptionMapper exceptionMapper, FlavorDeserializer flavorDeserializer) {
        s.k(exceptionMapper, "exceptionMapper");
        s.k(flavorDeserializer, "flavorDeserializer");
        this.exceptionMapper = exceptionMapper;
        this.flavorDeserializer = flavorDeserializer;
        this.pathComponents = new ArrayList();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WorkflowDocumentComponentInputProcessorImpl(ExceptionMapper exceptionMapper, FlavorDeserializer flavorDeserializer, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        exceptionMapper = (i11 & 1) != 0 ? new CommonExceptionMapper() : exceptionMapper;
        this(exceptionMapper, (i11 & 2) != 0 ? new OrcaFlavorDeserializer(exceptionMapper) : flavorDeserializer);
    }
}
