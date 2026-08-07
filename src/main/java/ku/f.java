package ku;

import android.os.Messenger;

/* JADX INFO: loaded from: classes5.dex */
public interface f {
    void onClientUpdated(Messenger messenger);

    void requestAbortDownload();

    void requestContinueDownload();

    void requestDownloadStatus();

    void requestPauseDownload();

    void setDownloadFlags(int i11);
}
