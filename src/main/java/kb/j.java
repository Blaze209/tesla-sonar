package kb;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* JADX INFO: loaded from: classes3.dex */
public class j implements WebMessageBoundaryInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f85798a = {"WEB_MESSAGE_ARRAY_BUFFER"};

    private static jb.c[] a(InvocationHandler[] invocationHandlerArr) {
        jb.c[] cVarArr = new jb.c[invocationHandlerArr.length];
        for (int i11 = 0; i11 < invocationHandlerArr.length; i11++) {
            cVarArr[i11] = new l(invocationHandlerArr[i11]);
        }
        return cVarArr;
    }

    public static jb.b b(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        jb.c[] cVarArrA = a(webMessageBoundaryInterface.getPorts());
        if (!o.C.c()) {
            return new jb.b(webMessageBoundaryInterface.getData(), cVarArrA);
        }
        WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) oq0.a.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
        int type = webMessagePayloadBoundaryInterface.getType();
        if (type == 0) {
            return new jb.b(webMessagePayloadBoundaryInterface.getAsString(), cVarArrA);
        }
        if (type != 1) {
            return null;
        }
        return new jb.b(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), cVarArrA);
    }
}
