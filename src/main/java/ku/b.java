package ku;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: ku.b$b, reason: collision with other inner class name */
    private static class C1883b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f89390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Class<?> f89391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f89392c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Messenger f89393d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Context f89394e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final HandlerC1884b f89395f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final Messenger f89396g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ServiceConnection f89397h;

        /* JADX INFO: renamed from: ku.b$b$a */
        class a implements ServiceConnection {
            a() {
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                C1883b.this.f89393d = new Messenger(iBinder);
                C1883b.this.f89390a.onServiceConnected(C1883b.this.f89393d);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                C1883b.this.f89393d = null;
            }
        }

        /* JADX INFO: renamed from: ku.b$b$b, reason: collision with other inner class name */
        private static class HandlerC1884b extends Handler {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final WeakReference<C1883b> f89399a;

            public HandlerC1884b(C1883b c1883b) {
                this.f89399a = new WeakReference<>(c1883b);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                C1883b c1883b = this.f89399a.get();
                if (c1883b != null) {
                    c1883b.h(message);
                }
            }
        }

        public C1883b(e eVar, Class<?> cls) {
            this.f89390a = null;
            HandlerC1884b handlerC1884b = new HandlerC1884b(this);
            this.f89395f = handlerC1884b;
            this.f89396g = new Messenger(handlerC1884b);
            this.f89397h = new a();
            this.f89390a = eVar;
            this.f89391b = cls;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(Message message) {
            switch (message.what) {
                case 10:
                    this.f89390a.onDownloadStateChanged(message.getData().getInt("newState"));
                    break;
                case 11:
                    Bundle data = message.getData();
                    Context context = this.f89394e;
                    if (context != null) {
                        data.setClassLoader(context.getClassLoader());
                        this.f89390a.onDownloadProgress((ku.a) message.getData().getParcelable(ReactProgressBarViewManager.PROP_PROGRESS));
                    }
                    break;
                case 12:
                    this.f89390a.onServiceConnected((Messenger) message.getData().getParcelable(DownloaderService.EXTRA_MESSAGE_HANDLER));
                    break;
            }
        }

        @Override // ku.g
        public void a(Context context) {
            this.f89394e = context;
            Intent intent = new Intent(context, this.f89391b);
            intent.putExtra(DownloaderService.EXTRA_MESSAGE_HANDLER, this.f89396g);
            if (context.bindService(intent, this.f89397h, 2)) {
                this.f89392c = true;
            }
        }

        @Override // ku.g
        public Messenger b() {
            return this.f89396g;
        }

        @Override // ku.g
        public void c(Context context) {
            if (this.f89392c) {
                context.unbindService(this.f89397h);
                this.f89392c = false;
            }
            this.f89394e = null;
        }
    }

    public static e a(Messenger messenger) {
        return new a(messenger);
    }

    public static g b(e eVar, Class<?> cls) {
        return new C1883b(eVar, cls);
    }

    public static int c(Context context, PendingIntent pendingIntent, Class<?> cls) {
        return DownloaderService.startDownloadServiceIfRequired(context, pendingIntent, cls);
    }

    public static int d(Context context, Intent intent, Class<?> cls) {
        return DownloaderService.startDownloadServiceIfRequired(context, intent, cls);
    }

    private static class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Messenger f89389a;

        public a(Messenger messenger) {
            this.f89389a = messenger;
        }

        private void a(int i11, Bundle bundle) {
            Message messageObtain = Message.obtain((Handler) null, i11);
            messageObtain.setData(bundle);
            try {
                this.f89389a.send(messageObtain);
            } catch (RemoteException e11) {
                e11.printStackTrace();
            }
        }

        @Override // ku.e
        public void onDownloadProgress(ku.a aVar) {
            Bundle bundle = new Bundle(1);
            bundle.putParcelable(ReactProgressBarViewManager.PROP_PROGRESS, aVar);
            a(11, bundle);
        }

        @Override // ku.e
        public void onDownloadStateChanged(int i11) {
            Bundle bundle = new Bundle(1);
            bundle.putInt("newState", i11);
            a(10, bundle);
        }

        @Override // ku.e
        public void onServiceConnected(Messenger messenger) {
        }
    }
}
