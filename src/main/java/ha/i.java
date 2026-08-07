package ha;

import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f72325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l.j f72326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<a> f72327c;

    interface b {
        List<l.h> B();

        void a(String str, Bundle bundle, ResultReceiver resultReceiver);

        void b(int i11, int i12);

        boolean c();

        void d(ha.j jVar, int i11);

        String e();

        e f();

        p g();

        Bundle getExtras();

        k getMetadata();

        int h();

        f i();

        long j();

        void k(int i11, int i12);

        boolean l(KeyEvent keyEvent);

        void m(a aVar, Handler handler);

        void n(a aVar);

        Object o();

        boolean p();

        void q(ha.j jVar);

        CharSequence r();

        int s();

        int t();
    }

    static class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final MediaController f72335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f72336b = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<a> f72337c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final HashMap<a, b> f72338d = new HashMap<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final l.j f72339e;

        private static class a extends ResultReceiver {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final WeakReference<c> f72340a;

            a(c cVar) {
                super(null);
                this.f72340a = new WeakReference<>(cVar);
            }

            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int i11, Bundle bundle) {
                c cVar = this.f72340a.get();
                if (cVar == null || bundle == null) {
                    return;
                }
                synchronized (cVar.f72336b) {
                    cVar.f72339e.f(ha.c.a.R2(bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER")));
                    cVar.f72339e.g(fb.a.b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                    cVar.u();
                }
            }
        }

        private static class b extends a.c {
            b(a aVar) {
                super(aVar);
            }

            @Override // ha.b
            public void A(CharSequence charSequence) {
                throw new AssertionError();
            }

            @Override // ha.b
            public void W0(k kVar) {
                throw new AssertionError();
            }

            @Override // ha.b
            public void n(List<l.h> list) {
                throw new AssertionError();
            }

            @Override // ha.b
            public void o() {
                throw new AssertionError();
            }

            @Override // ha.b
            public void o1(o oVar) {
                throw new AssertionError();
            }

            @Override // ha.b
            public void x(Bundle bundle) {
                throw new AssertionError();
            }
        }

        c(Context context, l.j jVar) {
            this.f72339e = jVar;
            this.f72335a = new MediaController(context, jVar.e());
            if (jVar.c() == null) {
                v();
            }
        }

        private void v() {
            a("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new a(this));
        }

        @Override // ha.i.b
        public List<l.h> B() {
            List<MediaSession.QueueItem> queue = this.f72335a.getQueue();
            if (queue != null) {
                return l.h.b(queue);
            }
            return null;
        }

        @Override // ha.i.b
        public void a(String str, Bundle bundle, ResultReceiver resultReceiver) {
            this.f72335a.sendCommand(str, bundle, resultReceiver);
        }

        @Override // ha.i.b
        public void b(int i11, int i12) {
            this.f72335a.setVolumeTo(i11, i12);
        }

        @Override // ha.i.b
        public boolean c() {
            return this.f72339e.c() != null;
        }

        @Override // ha.i.b
        public void d(ha.j jVar, int i11) {
            if ((j() & 4) == 0) {
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", ha.d.a(jVar, MediaDescriptionCompat.CREATOR));
            bundle.putInt("android.support.v4.media.session.command.ARGUMENT_INDEX", i11);
            a("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT", bundle, null);
        }

        @Override // ha.i.b
        public String e() {
            return this.f72335a.getPackageName();
        }

        @Override // ha.i.b
        public e f() {
            MediaController.PlaybackInfo playbackInfo = this.f72335a.getPlaybackInfo();
            if (playbackInfo != null) {
                return new e(playbackInfo.getPlaybackType(), ha.a.f(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
            }
            return null;
        }

        @Override // ha.i.b
        public p g() {
            ha.c cVarC = this.f72339e.c();
            if (cVarC != null) {
                try {
                    return cVarC.g();
                } catch (RemoteException | SecurityException e11) {
                    Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e11);
                }
            }
            PlaybackState playbackState = this.f72335a.getPlaybackState();
            if (playbackState != null) {
                return p.a(playbackState);
            }
            return null;
        }

        @Override // ha.i.b
        public Bundle getExtras() {
            return this.f72335a.getExtras();
        }

        @Override // ha.i.b
        public k getMetadata() {
            MediaMetadata metadata = this.f72335a.getMetadata();
            if (metadata != null) {
                return k.b(metadata);
            }
            return null;
        }

        @Override // ha.i.b
        public int h() {
            ha.c cVarC = this.f72339e.c();
            if (cVarC == null) {
                return -1;
            }
            try {
                return cVarC.h();
            } catch (RemoteException | SecurityException e11) {
                Log.e("MediaControllerCompat", "Dead object in getRepeatMode.", e11);
                return -1;
            }
        }

        @Override // ha.i.b
        public f i() {
            MediaController.TransportControls transportControls = this.f72335a.getTransportControls();
            return Build.VERSION.SDK_INT >= 29 ? new j(transportControls) : new C1517i(transportControls);
        }

        @Override // ha.i.b
        public long j() {
            return this.f72335a.getFlags();
        }

        @Override // ha.i.b
        public void k(int i11, int i12) {
            this.f72335a.adjustVolume(i11, i12);
        }

        @Override // ha.i.b
        public boolean l(KeyEvent keyEvent) {
            return this.f72335a.dispatchMediaButtonEvent(keyEvent);
        }

        @Override // ha.i.b
        public final void m(a aVar, Handler handler) {
            this.f72335a.registerCallback((MediaController.Callback) s7.a.f(aVar.f72328a), handler);
            synchronized (this.f72336b) {
                ha.c cVarC = this.f72339e.c();
                if (cVarC != null) {
                    b bVar = new b(aVar);
                    this.f72338d.put(aVar, bVar);
                    aVar.f72330c = bVar;
                    try {
                        cVarC.V(bVar);
                        aVar.m(13, null, null);
                    } catch (RemoteException | SecurityException e11) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e11);
                    }
                } else {
                    aVar.f72330c = null;
                    this.f72337c.add(aVar);
                }
            }
        }

        @Override // ha.i.b
        public final void n(a aVar) {
            this.f72335a.unregisterCallback((MediaController.Callback) s7.a.f(aVar.f72328a));
            synchronized (this.f72336b) {
                ha.c cVarC = this.f72339e.c();
                if (cVarC != null) {
                    try {
                        b bVarRemove = this.f72338d.remove(aVar);
                        if (bVarRemove != null) {
                            aVar.f72330c = null;
                            cVarC.t1(bVarRemove);
                        }
                    } catch (RemoteException | SecurityException e11) {
                        Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e11);
                    }
                } else {
                    this.f72337c.remove(aVar);
                }
            }
        }

        @Override // ha.i.b
        public Object o() {
            return this.f72335a;
        }

        @Override // ha.i.b
        public boolean p() {
            ha.c cVarC = this.f72339e.c();
            if (cVarC == null) {
                return false;
            }
            try {
                return cVarC.p();
            } catch (RemoteException | SecurityException e11) {
                Log.e("MediaControllerCompat", "Dead object in isCaptioningEnabled.", e11);
                return false;
            }
        }

        @Override // ha.i.b
        public void q(ha.j jVar) {
            if ((j() & 4) == 0) {
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", ha.d.a(jVar, MediaDescriptionCompat.CREATOR));
            a("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM", bundle, null);
        }

        @Override // ha.i.b
        public CharSequence r() {
            return this.f72335a.getQueueTitle();
        }

        @Override // ha.i.b
        public int s() {
            return this.f72335a.getRatingType();
        }

        @Override // ha.i.b
        public int t() {
            ha.c cVarC = this.f72339e.c();
            if (cVarC == null) {
                return -1;
            }
            try {
                return cVarC.t();
            } catch (RemoteException | SecurityException e11) {
                Log.e("MediaControllerCompat", "Dead object in getShuffleMode.", e11);
                return -1;
            }
        }

        void u() {
            ha.c cVarC = this.f72339e.c();
            if (cVarC == null) {
                return;
            }
            for (a aVar : this.f72337c) {
                b bVar = new b(aVar);
                this.f72338d.put(aVar, bVar);
                aVar.f72330c = bVar;
                try {
                    cVarC.V(bVar);
                    aVar.m(13, null, null);
                } catch (RemoteException | SecurityException e11) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e11);
                }
            }
            this.f72337c.clear();
        }
    }

    static class d extends c {
        d(Context context, l.j jVar) {
            super(context, jVar);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f72341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ha.a f72342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f72343c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f72344d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f72345e;

        e(int i11, ha.a aVar, int i12, int i13, int i14) {
            this.f72341a = i11;
            this.f72342b = aVar;
            this.f72343c = i12;
            this.f72344d = i13;
            this.f72345e = i14;
        }

        public ha.a a() {
            return this.f72342b;
        }

        public int b() {
            return this.f72345e;
        }

        public int c() {
            return this.f72344d;
        }

        public int d() {
            return this.f72341a;
        }

        public int e() {
            return this.f72343c;
        }
    }

    public static abstract class f {
        f() {
        }

        public abstract void a();

        public abstract void b();

        public abstract void c();

        public abstract void d(String str, Bundle bundle);

        public abstract void e(String str, Bundle bundle);

        public abstract void f(Uri uri, Bundle bundle);

        public abstract void g();

        public abstract void h(String str, Bundle bundle);

        public abstract void i(String str, Bundle bundle);

        public abstract void j(Uri uri, Bundle bundle);

        public abstract void k();

        public abstract void l(long j11);

        public abstract void m(String str, Bundle bundle);

        public abstract void n(float f11);

        public abstract void o(int i11);

        public abstract void p(int i11);

        public abstract void q();

        public abstract void r();

        public abstract void s(long j11);

        public abstract void t();
    }

    static class g extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final MediaController.TransportControls f72346a;

        g(MediaController.TransportControls transportControls) {
            this.f72346a = transportControls;
        }

        @Override // ha.i.f
        public void a() {
            this.f72346a.fastForward();
        }

        @Override // ha.i.f
        public void b() {
            this.f72346a.pause();
        }

        @Override // ha.i.f
        public void c() {
            this.f72346a.play();
        }

        @Override // ha.i.f
        public void d(String str, Bundle bundle) {
            this.f72346a.playFromMediaId(str, bundle);
        }

        @Override // ha.i.f
        public void e(String str, Bundle bundle) {
            this.f72346a.playFromSearch(str, bundle);
        }

        @Override // ha.i.f
        public void k() {
            this.f72346a.rewind();
        }

        @Override // ha.i.f
        public void l(long j11) {
            this.f72346a.seekTo(j11);
        }

        @Override // ha.i.f
        public void m(String str, Bundle bundle) {
            i.x(str, bundle);
            this.f72346a.sendCustomAction(str, bundle);
        }

        @Override // ha.i.f
        public void n(float f11) {
            if (f11 == BitmapDescriptorFactory.HUE_RED) {
                throw new IllegalArgumentException("speed must not be zero");
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", f11);
            m("android.support.v4.media.session.action.SET_PLAYBACK_SPEED", bundle);
        }

        @Override // ha.i.f
        public void o(int i11) {
            Bundle bundle = new Bundle();
            bundle.putInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE", i11);
            m("android.support.v4.media.session.action.SET_REPEAT_MODE", bundle);
        }

        @Override // ha.i.f
        public void p(int i11) {
            Bundle bundle = new Bundle();
            bundle.putInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE", i11);
            m("android.support.v4.media.session.action.SET_SHUFFLE_MODE", bundle);
        }

        @Override // ha.i.f
        public void q() {
            this.f72346a.skipToNext();
        }

        @Override // ha.i.f
        public void r() {
            this.f72346a.skipToPrevious();
        }

        @Override // ha.i.f
        public void s(long j11) {
            this.f72346a.skipToQueueItem(j11);
        }

        @Override // ha.i.f
        public void t() {
            this.f72346a.stop();
        }
    }

    static class h extends g {
        h(MediaController.TransportControls transportControls) {
            super(transportControls);
        }

        @Override // ha.i.f
        public void f(Uri uri, Bundle bundle) {
            this.f72346a.playFromUri(uri, bundle);
        }
    }

    /* JADX INFO: renamed from: ha.i$i, reason: collision with other inner class name */
    static class C1517i extends h {
        C1517i(MediaController.TransportControls transportControls) {
            super(transportControls);
        }

        @Override // ha.i.f
        public void g() {
            this.f72346a.prepare();
        }

        @Override // ha.i.f
        public void h(String str, Bundle bundle) {
            this.f72346a.prepareFromMediaId(str, bundle);
        }

        @Override // ha.i.f
        public void i(String str, Bundle bundle) {
            this.f72346a.prepareFromSearch(str, bundle);
        }

        @Override // ha.i.f
        public void j(Uri uri, Bundle bundle) {
            this.f72346a.prepareFromUri(uri, bundle);
        }
    }

    static class j extends C1517i {
        j(MediaController.TransportControls transportControls) {
            super(transportControls);
        }

        @Override // ha.i.g, ha.i.f
        public void n(float f11) {
            if (f11 == BitmapDescriptorFactory.HUE_RED) {
                throw new IllegalArgumentException("speed must not be zero");
            }
            this.f72346a.setPlaybackSpeed(f11);
        }
    }

    public i(Context context, l lVar) {
        this(context, lVar.e());
    }

    static void x(String str, Bundle bundle) {
        if (str == null) {
            return;
        }
        if (str.equals("android.support.v4.media.session.action.FOLLOW") || str.equals("android.support.v4.media.session.action.UNFOLLOW")) {
            if (bundle == null || !bundle.containsKey("android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE")) {
                throw new IllegalArgumentException("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action " + str + ".");
            }
        }
    }

    public void a(ha.j jVar, int i11) {
        this.f72325a.d(jVar, i11);
    }

    public void b(int i11, int i12) {
        this.f72325a.k(i11, i12);
    }

    public boolean c(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f72325a.l(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    public Bundle d() {
        return this.f72325a.getExtras();
    }

    public long e() {
        return this.f72325a.j();
    }

    public Object f() {
        return this.f72325a.o();
    }

    public k g() {
        return this.f72325a.getMetadata();
    }

    public String h() {
        return this.f72325a.e();
    }

    public e i() {
        return this.f72325a.f();
    }

    public p j() {
        return this.f72325a.g();
    }

    public List<l.h> k() {
        return this.f72325a.B();
    }

    public CharSequence l() {
        return this.f72325a.r();
    }

    public int m() {
        return this.f72325a.s();
    }

    public int n() {
        return this.f72325a.h();
    }

    public int o() {
        return this.f72325a.t();
    }

    public f p() {
        return this.f72325a.i();
    }

    public boolean q() {
        return this.f72325a.p();
    }

    public boolean r() {
        return this.f72325a.c();
    }

    public void s(a aVar, Handler handler) {
        if (!this.f72327c.add(aVar)) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        if (handler == null) {
            handler = new Handler();
        }
        aVar.n(handler);
        this.f72325a.m(aVar, handler);
    }

    public void t(ha.j jVar) {
        this.f72325a.q(jVar);
    }

    public void u(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("command must neither be null nor empty");
        }
        this.f72325a.a(str, bundle, resultReceiver);
    }

    public void v(int i11, int i12) {
        this.f72325a.b(i11, i12);
    }

    public void w(a aVar) {
        if (!this.f72327c.remove(aVar)) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
            return;
        }
        try {
            this.f72325a.n(aVar);
        } finally {
            aVar.n(null);
        }
    }

    public i(Context context, l.j jVar) {
        this.f72327c = Collections.synchronizedSet(new HashSet());
        this.f72326b = jVar;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f72325a = new d(context, jVar);
        } else {
            this.f72325a = new c(context, jVar);
        }
    }

    public static abstract class a implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final MediaController.Callback f72328a = new C1516a(this);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        b f72329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ha.b f72330c;

        /* JADX INFO: renamed from: ha.i$a$a, reason: collision with other inner class name */
        private static class C1516a extends MediaController.Callback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final WeakReference<a> f72331a;

            C1516a(a aVar) {
                this.f72331a = new WeakReference<>(aVar);
            }

            @Override // android.media.session.MediaController.Callback
            public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                a aVar = this.f72331a.get();
                if (aVar == null || playbackInfo == null) {
                    return;
                }
                aVar.a(new e(playbackInfo.getPlaybackType(), ha.a.f(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
            }

            @Override // android.media.session.MediaController.Callback
            public void onExtrasChanged(Bundle bundle) {
                l.a(bundle);
                a aVar = this.f72331a.get();
                if (aVar != null) {
                    aVar.c(bundle);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                a aVar = this.f72331a.get();
                if (aVar != null) {
                    aVar.d(k.b(mediaMetadata));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onPlaybackStateChanged(PlaybackState playbackState) {
                a aVar = this.f72331a.get();
                if (aVar == null || aVar.f72330c != null) {
                    return;
                }
                aVar.e(p.a(playbackState));
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueChanged(List<MediaSession.QueueItem> list) {
                a aVar = this.f72331a.get();
                if (aVar != null) {
                    aVar.f(l.h.b(list));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueTitleChanged(CharSequence charSequence) {
                a aVar = this.f72331a.get();
                if (aVar != null) {
                    aVar.g(charSequence);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionDestroyed() {
                a aVar = this.f72331a.get();
                if (aVar != null) {
                    aVar.i();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionEvent(String str, Bundle bundle) {
                l.a(bundle);
                a aVar = this.f72331a.get();
                if (aVar != null) {
                    aVar.j(str, bundle);
                }
            }
        }

        private class b extends Handler {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            boolean f72332a;

            b(Looper looper) {
                super(looper);
                this.f72332a = false;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (this.f72332a) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            l.a(data);
                            a.this.j((String) message.obj, data);
                            break;
                        case 2:
                            a.this.e((p) message.obj);
                            break;
                        case 3:
                            a.this.d((k) message.obj);
                            break;
                        case 4:
                            a.this.a((e) message.obj);
                            break;
                        case 5:
                            a.this.f((List) message.obj);
                            break;
                        case 6:
                            a.this.g((CharSequence) message.obj);
                            break;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            l.a(bundle);
                            a.this.c(bundle);
                            break;
                        case 8:
                            a.this.i();
                            break;
                        case 9:
                            a.this.h(((Integer) message.obj).intValue());
                            break;
                        case 11:
                            a.this.b(((Boolean) message.obj).booleanValue());
                            break;
                        case 12:
                            a.this.l(((Integer) message.obj).intValue());
                            break;
                        case 13:
                            a.this.k();
                            break;
                    }
                }
            }
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            m(8, null, null);
        }

        void m(int i11, Object obj, Bundle bundle) {
            b bVar = this.f72329b;
            if (bVar != null) {
                Message messageObtainMessage = bVar.obtainMessage(i11, obj);
                if (bundle != null) {
                    messageObtainMessage.setData(bundle);
                }
                messageObtainMessage.sendToTarget();
            }
        }

        void n(Handler handler) {
            if (handler != null) {
                b bVar = new b(handler.getLooper());
                this.f72329b = bVar;
                bVar.f72332a = true;
            } else {
                b bVar2 = this.f72329b;
                if (bVar2 != null) {
                    bVar2.f72332a = false;
                    bVar2.removeCallbacksAndMessages(null);
                    this.f72329b = null;
                }
            }
        }

        public void i() {
        }

        public void k() {
        }

        private static class c extends ha.b.a {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final WeakReference<a> f72334n;

            c(a aVar) {
                this.f72334n = new WeakReference<>(aVar);
            }

            @Override // ha.b
            public void D2(p pVar) {
                a aVar = this.f72334n.get();
                if (aVar != null) {
                    aVar.m(2, pVar, null);
                }
            }

            @Override // ha.b
            public void k() {
                a aVar = this.f72334n.get();
                if (aVar != null) {
                    aVar.m(13, null, null);
                }
            }

            @Override // ha.b
            public void onEvent(String str, Bundle bundle) {
                a aVar = this.f72334n.get();
                if (aVar != null) {
                    aVar.m(1, str, bundle);
                }
            }

            @Override // ha.b
            public void onRepeatModeChanged(int i11) {
                a aVar = this.f72334n.get();
                if (aVar != null) {
                    aVar.m(9, Integer.valueOf(i11), null);
                }
            }

            @Override // ha.b
            public void u(int i11) {
                a aVar = this.f72334n.get();
                if (aVar != null) {
                    aVar.m(12, Integer.valueOf(i11), null);
                }
            }

            @Override // ha.b
            public void y(boolean z11) {
                a aVar = this.f72334n.get();
                if (aVar != null) {
                    aVar.m(11, Boolean.valueOf(z11), null);
                }
            }

            @Override // ha.b
            public void z(boolean z11) {
            }
        }

        public void a(e eVar) {
        }

        public void b(boolean z11) {
        }

        public void c(Bundle bundle) {
        }

        public void d(k kVar) {
        }

        public void e(p pVar) {
        }

        public void f(List<l.h> list) {
        }

        public void g(CharSequence charSequence) {
        }

        public void h(int i11) {
        }

        public void l(int i11) {
        }

        public void j(String str, Bundle bundle) {
        }
    }
}
