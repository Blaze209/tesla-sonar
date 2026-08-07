package z00;

import android.content.Intent;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/bridge/ReadableMap;", "readableMap", "Lz00/g;", "a", "(Lcom/facebook/react/bridge/ReadableMap;)Lz00/g;", "Lcom/facebook/react/bridge/ReadableArray;", "readableArray", "", "", "b", "(Lcom/facebook/react/bridge/ReadableArray;)[Ljava/lang/String;", "react-native-documents_picker_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class h {
    public static final PickOptions a(ReadableMap readableMap) {
        String[] strArrB;
        ReadableArray array;
        s.k(readableMap, "readableMap");
        String string = readableMap.getString("mode");
        boolean z11 = true;
        if (!readableMap.hasKey("type") || readableMap.isNull("type") || (array = readableMap.getArray("type")) == null || (strArrB = b(array)) == null) {
            strArrB = new String[]{"*/*"};
        }
        String[] strArr = strArrB;
        String string2 = readableMap.hasKey("initialDirectoryUrl") ? readableMap.getString("initialDirectoryUrl") : null;
        if (!readableMap.hasKey("localOnly") || !readableMap.getBoolean("localOnly")) {
            z11 = false;
        }
        return new PickOptions(string, strArr, string2, z11, readableMap.hasKey("allowMultiSelection") && readableMap.getBoolean("allowMultiSelection"), (readableMap.hasKey("requestLongTermAccess") && readableMap.getBoolean("requestLongTermAccess")) ? z11 : false, (readableMap.hasKey("allowVirtualFiles") && readableMap.getBoolean("allowVirtualFiles")) ? z11 : false);
    }

    public static final String[] b(ReadableArray readableArray) {
        s.k(readableArray, "readableArray");
        ArrayList<Object> arrayList = readableArray.toArrayList();
        ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            String strNormalizeMimeType = Intent.normalizeMimeType(String.valueOf(it.next()));
            s.h(strNormalizeMimeType);
            arrayList2.add(strNormalizeMimeType);
        }
        return (String[]) arrayList2.toArray(new String[0]);
    }
}
