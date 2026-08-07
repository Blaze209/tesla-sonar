package yc;

import android.webkit.MimeTypeMap;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "extension", "a", "(Ljava/lang/String;)Ljava/lang/String;", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class x {
    public static final String a(String str) {
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
    }
}
