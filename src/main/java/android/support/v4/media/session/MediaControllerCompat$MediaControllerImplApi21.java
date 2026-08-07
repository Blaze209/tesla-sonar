package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import androidx.core.app.h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f1794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<c> f1795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<c, a> f1796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final MediaSessionCompat.Token f1797d;

    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f1798a;

        @Override // android.os.ResultReceiver
        protected void onReceiveResult(int i11, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f1798a.get();
            if (mediaControllerCompat$MediaControllerImplApi21 == null || bundle == null) {
                return;
            }
            synchronized (mediaControllerCompat$MediaControllerImplApi21.f1794a) {
                mediaControllerCompat$MediaControllerImplApi21.f1797d.b(b.a.R2(h.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                mediaControllerCompat$MediaControllerImplApi21.f1797d.c(fb.a.b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                mediaControllerCompat$MediaControllerImplApi21.a();
            }
        }
    }

    private static class a extends c.b {
        a(c cVar) {
            super(cVar);
        }

        @Override // android.support.v4.media.session.a
        public void A(CharSequence charSequence) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void K1(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void b2(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void n(List<MediaSessionCompat.QueueItem> list) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void o() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void x(Bundle bundle) {
            throw new AssertionError();
        }
    }

    void a() {
        if (this.f1797d.a() == null) {
            return;
        }
        for (c cVar : this.f1795b) {
            a aVar = new a(cVar);
            this.f1796c.put(cVar, aVar);
            cVar.f1831b = aVar;
            try {
                this.f1797d.a().z0(aVar);
                cVar.i(13, null, null);
            } catch (RemoteException e11) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e11);
            }
        }
        this.f1795b.clear();
    }
}
