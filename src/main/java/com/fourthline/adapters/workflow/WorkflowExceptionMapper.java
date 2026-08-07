package com.fourthline.adapters.workflow;

import com.fourthline.adapters.common.ExceptionMapper;
import com.fourthline.adapters.serialization.JSONExtensionsKt;
import com.fourthline.scanners.config.orca.common.CommonJsonError;
import com.fourthline.scanners.config.orca.workflow.WorkflowJsonError;
import java.util.List;
import kotlinx.serialization.SerializationException;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/fourthline/adapters/workflow/WorkflowExceptionMapper;", "Lcom/fourthline/adapters/common/ExceptionMapper;", "<init>", "()V", "mapException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "paths", "", "", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WorkflowExceptionMapper implements ExceptionMapper {
    @Override // com.fourthline.adapters.common.ExceptionMapper
    public Exception mapException(Exception exception, List<String> paths) {
        s.k(exception, "exception");
        s.k(paths, "paths");
        String str = "Could not deserialize object at path '" + v.y0(paths, ".", null, null, 0, null, null, 62, null) + "'.";
        if (!(exception instanceof JSONException)) {
            if (!(exception instanceof SerializationException)) {
                return exception instanceof WorkflowJsonError ? exception : CommonJsonError.IncorrectConfiguration.INSTANCE;
            }
            String message = exception.getMessage();
            if (message != null) {
                str = message;
            }
            return new CommonJsonError.DecodingError(str);
        }
        try {
            String message2 = exception.getMessage();
            if (message2 == null) {
                message2 = "";
            }
            return new CommonJsonError.DecodingError(JSONExtensionsKt.getAndroidOptString(new JSONObject(message2), "errorDescription") + " at path '" + v.y0(paths, ".", null, null, 0, null, null, 62, null) + "'.");
        } catch (Exception unused) {
            String message3 = exception.getMessage();
            if (message3 != null) {
                str = message3;
            }
            return new CommonJsonError.DecodingError(str);
        }
    }
}
