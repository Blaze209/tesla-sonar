package expo.modules.filesystem;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@FunctionalInterface
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/filesystem/CountingRequestListener;", "", "", "bytesWritten", "contentLength", "Ljn0/h0;", "onProgress", "(JJ)V", "expo-file-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CountingRequestListener {
    void onProgress(long bytesWritten, long contentLength);
}
