package oy;

import com.facebook.react.bridge.Dynamic;

/* JADX INFO: loaded from: classes6.dex */
public class n extends l<String> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // oy.l
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String c(Dynamic dynamic) {
        if (dynamic.isNull()) {
            return null;
        }
        return dynamic.asString();
    }
}
