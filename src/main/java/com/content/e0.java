package com.content;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "", "Lcom/facebook/react/bridge/ReadableArray;", "a", "(Ljava/util/List;)Lcom/facebook/react/bridge/ReadableArray;", "stripe_stripe-react-native_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class e0 {
    public static final ReadableArray a(List<String> list) {
        s.k(list, "<this>");
        WritableArray writableArrayCreateArray = Arguments.createArray();
        s.j(writableArrayCreateArray, "createArray(...)");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            writableArrayCreateArray.pushString(it.next());
        }
        return writableArrayCreateArray;
    }
}
