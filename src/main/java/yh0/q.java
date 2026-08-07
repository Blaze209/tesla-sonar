package yh0;

import android.webkit.MimeTypeMap;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyh0/q;", "Lyh0/i;", "<init>", "()V", "", "path", "a", "(Ljava/lang/String;)Ljava/lang/String;", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q implements i {
    @Override // yh0.i
    public String a(String path) {
        String mimeTypeFromExtension;
        p013kotlin.jvm.internal.s.k(path, "path");
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(path);
        return (fileExtensionFromUrl == null || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl)) == null) ? "image/*" : mimeTypeFromExtension;
    }
}
