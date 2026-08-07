package ku;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    private static class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Messenger f89400a;

        public a(Messenger messenger) {
            this.f89400a = messenger;
        }

        private void a(int i11, Bundle bundle) {
            Message messageObtain = Message.obtain((Handler) null, i11);
            messageObtain.setData(bundle);
            try {
                this.f89400a.send(messageObtain);
            } catch (RemoteException e11) {
                e11.printStackTrace();
            }
        }

        @Override // ku.f
        public void onClientUpdated(Messenger messenger) {
            Bundle bundle = new Bundle(1);
            bundle.putParcelable(DownloaderService.EXTRA_MESSAGE_HANDLER, messenger);
            a(6, bundle);
        }

        @Override // ku.f
        public void requestAbortDownload() {
            a(1, new Bundle());
        }

        @Override // ku.f
        public void requestContinueDownload() {
            a(4, new Bundle());
        }

        @Override // ku.f
        public void requestDownloadStatus() {
            a(5, new Bundle());
        }

        @Override // ku.f
        public void requestPauseDownload() {
            a(2, new Bundle());
        }

        @Override // ku.f
        public void setDownloadFlags(int i11) {
            Bundle bundle = new Bundle();
            bundle.putInt("flags", i11);
            a(3, bundle);
        }
    }

    public static f a(Messenger messenger) {
        return new a(messenger);
    }

    public static g b(f fVar) {
        return new b(fVar);
    }

    private static class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f f89401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f89402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Messenger f89403c;

        private static class a extends Handler {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final WeakReference<b> f89404a;

            public a(b bVar) {
                this.f89404a = new WeakReference<>(bVar);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                b bVar = this.f89404a.get();
                if (bVar != null) {
                    bVar.e(message);
                }
            }
        }

        public b(f fVar) {
            this.f89401a = null;
            a aVar = new a(this);
            this.f89402b = aVar;
            this.f89403c = new Messenger(aVar);
            this.f89401a = fVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(Message message) {
            switch (message.what) {
                case 1:
                    this.f89401a.requestAbortDownload();
                    break;
                case 2:
                    this.f89401a.requestPauseDownload();
                    break;
                case 3:
                    this.f89401a.setDownloadFlags(message.getData().getInt("flags"));
                    break;
                case 4:
                    this.f89401a.requestContinueDownload();
                    break;
                case 5:
                    this.f89401a.requestDownloadStatus();
                    break;
                case 6:
                    this.f89401a.onClientUpdated((Messenger) message.getData().getParcelable(DownloaderService.EXTRA_MESSAGE_HANDLER));
                    break;
            }
        }

        @Override // ku.g
        public Messenger b() {
            return this.f89403c;
        }

        @Override // ku.g
        public void a(Context context) {
        }

        @Override // ku.g
        public void c(Context context) {
        }
    }
}
