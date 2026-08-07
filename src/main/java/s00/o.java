package s00;

import ch.qos.logback.core.joran.action.Action;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.HashMap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/react/bridge/ReadableMap;", "options", "Ls00/p;", "a", "(Lcom/facebook/react/bridge/ReadableMap;)Ls00/p;", "react-native-compressor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class o {
    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    public static final UploaderOptions a(ReadableMap options) {
        l lVar;
        s.k(options, "options");
        ReadableMap map = options.getMap("headers");
        HashMap<String, Object> hashMap = map != null ? map.toHashMap() : null;
        HashMap<String, Object> map2 = hashMap != null ? hashMap : null;
        String string = options.getString("httpMethod");
        if (string == null) {
            string = "POST";
        }
        h hVarValueOf = h.valueOf(string);
        int i11 = options.getInt("uploadType");
        l lVar2 = l.BINARY_CONTENT;
        if (i11 == lVar2.getValue()) {
            lVar = lVar2;
        } else {
            lVar = l.MULTIPART;
            if (i11 != lVar.getValue()) {
                lVar = lVar2;
            }
        }
        String string2 = options.getString("fieldName");
        if (string2 == null) {
            string2 = Action.FILE_ATTRIBUTE;
        }
        String str = string2;
        String string3 = options.getString("mimeType");
        String str2 = string3 == null ? "" : string3;
        ReadableMap map3 = options.getMap("parameters");
        HashMap<String, Object> hashMap2 = map3 != null ? map3.toHashMap() : null;
        HashMap<String, Object> map4 = hashMap2 != null ? hashMap2 : null;
        String string4 = options.getString("uuid");
        String str3 = string4 == null ? "" : string4;
        String string5 = options.getString(ImagesContract.URL);
        return new UploaderOptions(map2, hVarValueOf, lVar, str, str2, map4, str3, string5 == null ? "" : string5);
    }
}
