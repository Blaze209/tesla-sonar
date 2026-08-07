package ha;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.Rating;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f72369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ha.i f72370b;

    class a extends b {
        a() {
        }
    }

    interface c {
        void a(int i11);

        void b(r rVar);

        void c(String str, Bundle bundle);

        void d(int i11);

        void e(k kVar);

        void f(p pVar);

        p g();

        String h();

        void i(int i11);

        boolean isActive();

        void j(int i11);

        void k(PendingIntent pendingIntent);

        void l(boolean z11);

        void m(b bVar, Handler handler);

        void n(CharSequence charSequence);

        j o();

        void p(List<h> list);

        void q(n.b bVar);

        void r(PendingIntent pendingIntent);

        void release();

        b s();

        void setExtras(Bundle bundle);

        Object t();

        n.b u();

        void v(int i11);
    }

    static class e extends d {
        e(Context context, String str, Bundle bundle) {
            super(context, str, bundle);
        }

        @Override // ha.l.d, ha.l.c
        public void d(int i11) {
            this.f72379a.setRatingType(i11);
        }
    }

    static class g extends f {
        g(Context context, String str, Bundle bundle) {
            super(context, str, bundle);
        }

        @Override // ha.l.d
        public MediaSession w(Context context, String str, Bundle bundle) {
            return m.a(context, str, bundle);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class h implements Parcelable {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ha.j f72396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f72397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private MediaSession.QueueItem f72398c;

        class a implements Parcelable.Creator<h> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i11) {
                return new h[i11];
            }
        }

        public h(ha.j jVar, long j11) {
            this(null, jVar, j11);
        }

        public static h a(MediaSession.QueueItem queueItem) {
            return new h(queueItem, ha.j.a(queueItem.getDescription()), queueItem.getQueueId());
        }

        public static List<h> b(List<MediaSession.QueueItem> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<MediaSession.QueueItem> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
            return arrayList;
        }

        public ha.j c() {
            return this.f72396a;
        }

        public long d() {
            return this.f72397b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public MediaSession.QueueItem e() {
            MediaSession.QueueItem queueItem = this.f72398c;
            if (queueItem != null) {
                return queueItem;
            }
            MediaSession.QueueItem queueItem2 = new MediaSession.QueueItem(this.f72396a.f(), this.f72397b);
            this.f72398c = queueItem2;
            return queueItem2;
        }

        public String toString() {
            return "MediaSession.QueueItem { Description=" + this.f72396a + ", Id=" + this.f72397b + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            this.f72396a.writeToParcel(parcel, i11);
            parcel.writeLong(this.f72397b);
        }

        private h(MediaSession.QueueItem queueItem, ha.j jVar, long j11) {
            if (j11 == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.f72396a = jVar;
            this.f72397b = j11;
            this.f72398c = queueItem;
        }

        h(Parcel parcel) {
            this.f72396a = ha.j.CREATOR.createFromParcel(parcel);
            this.f72397b = parcel.readLong();
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    static final class i implements Parcelable {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ResultReceiver f72399a;

        class a implements Parcelable.Creator<i> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i11) {
                return new i[i11];
            }
        }

        i(Parcel parcel) {
            this.f72399a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            this.f72399a.writeToParcel(parcel, i11);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class j implements Parcelable {
        public static final Parcelable.Creator<j> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f72400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MediaSession.Token f72401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ha.c f72402c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private fb.b f72403d;

        class a implements Parcelable.Creator<j> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public j createFromParcel(Parcel parcel) {
                return new j((MediaSession.Token) s7.a.f((MediaSession.Token) parcel.readParcelable(null)));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public j[] newArray(int i11) {
                return new j[i11];
            }
        }

        j(MediaSession.Token token) {
            this(token, null);
        }

        public static j a(MediaSession.Token token) {
            return b(token, null);
        }

        static j b(MediaSession.Token token, ha.c cVar) {
            return new j(token, cVar);
        }

        ha.c c() {
            ha.c cVar;
            synchronized (this.f72400a) {
                cVar = this.f72402c;
            }
            return cVar;
        }

        public fb.b d() {
            fb.b bVar;
            synchronized (this.f72400a) {
                bVar = this.f72403d;
            }
            return bVar;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public MediaSession.Token e() {
            return this.f72401b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                return this.f72401b.equals(((j) obj).f72401b);
            }
            return false;
        }

        void f(ha.c cVar) {
            synchronized (this.f72400a) {
                this.f72402c = cVar;
            }
        }

        public void g(fb.b bVar) {
            synchronized (this.f72400a) {
                this.f72403d = bVar;
            }
        }

        public int hashCode() {
            return this.f72401b.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeParcelable(this.f72401b, i11);
        }

        j(MediaSession.Token token, ha.c cVar) {
            this(token, cVar, null);
        }

        j(MediaSession.Token token, ha.c cVar, fb.b bVar) {
            this.f72400a = new Object();
            this.f72401b = token;
            this.f72402c = cVar;
            this.f72403d = bVar;
        }
    }

    public l(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        if (componentName == null && (componentName = ha.h.a(context)) == null) {
            Log.i("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
        }
        if (componentName != null && pendingIntent == null) {
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            this.f72369a = new g(context, str, bundle);
        } else if (i11 >= 28) {
            this.f72369a = new f(context, str, bundle);
        } else {
            this.f72369a = new e(context, str, bundle);
        }
        Looper looperMyLooper = Looper.myLooper();
        k(new a(), new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper));
        this.f72369a.k(pendingIntent);
        this.f72370b = new ha.i(context, this);
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) s7.a.f(l.class.getClassLoader()));
        }
    }

    static p f(p pVar, k kVar) {
        long j11;
        if (pVar == null) {
            return pVar;
        }
        long jE = -1;
        if (pVar.m() == -1) {
            return pVar;
        }
        if (pVar.q() != 3 && pVar.q() != 4 && pVar.q() != 5) {
            return pVar;
        }
        long j12 = pVar.j();
        if (j12 <= 0) {
            return pVar;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jK = ((long) (pVar.k() * (jElapsedRealtime - j12))) + pVar.m();
        if (kVar != null && kVar.a("android.media.metadata.DURATION")) {
            jE = kVar.e("android.media.metadata.DURATION");
        }
        if (jE < 0 || jK <= jE) {
            j11 = jK < 0 ? 0L : jK;
        } else {
            j11 = jE;
        }
        return new p.c(pVar).h(pVar.q(), j11, pVar.k(), jElapsedRealtime).b();
    }

    public static Bundle y(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public ha.i b() {
        return this.f72370b;
    }

    public final n.b c() {
        return this.f72369a.u();
    }

    public Object d() {
        return this.f72369a.t();
    }

    public j e() {
        return this.f72369a.o();
    }

    public boolean g() {
        return this.f72369a.isActive();
    }

    public void h() {
        this.f72369a.release();
    }

    public void i(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("event cannot be null or empty");
        }
        this.f72369a.c(str, bundle);
    }

    public void j(boolean z11) {
        this.f72369a.l(z11);
    }

    public void k(b bVar, Handler handler) {
        this.f72369a.m(bVar, handler);
    }

    public void l(Bundle bundle) {
        this.f72369a.setExtras(bundle);
    }

    public void m(int i11) {
        this.f72369a.a(i11);
    }

    public void n(PendingIntent pendingIntent) {
        this.f72369a.k(pendingIntent);
    }

    public void o(k kVar) {
        this.f72369a.e(kVar);
    }

    public void p(p pVar) {
        this.f72369a.f(pVar);
    }

    public void q(int i11) {
        this.f72369a.j(i11);
    }

    public void r(r rVar) {
        this.f72369a.b(rVar);
    }

    public void s(List<h> list) {
        if (list != null) {
            HashSet hashSet = new HashSet();
            for (h hVar : list) {
                if (hashSet.contains(Long.valueOf(hVar.d()))) {
                    Log.e("MediaSessionCompat", "Found duplicate queue id: " + hVar.d(), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(hVar.d()));
            }
        }
        this.f72369a.p(list);
    }

    public void t(CharSequence charSequence) {
        this.f72369a.n(charSequence);
    }

    public void u(int i11) {
        this.f72369a.d(i11);
    }

    public void v(int i11) {
        this.f72369a.i(i11);
    }

    public void w(PendingIntent pendingIntent) {
        this.f72369a.r(pendingIntent);
    }

    public void x(int i11) {
        this.f72369a.v(i11);
    }

    public static abstract class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f72374c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        a f72376e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f72372a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final MediaSession.Callback f72373b = new C1518b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        WeakReference<c> f72375d = new WeakReference<>(null);

        private class a extends Handler {
            a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                c cVar;
                b bVar;
                a aVar;
                if (message.what == 1) {
                    synchronized (b.this.f72372a) {
                        cVar = b.this.f72375d.get();
                        bVar = b.this;
                        aVar = bVar.f72376e;
                    }
                    if (cVar == null || bVar != cVar.s() || aVar == null) {
                        return;
                    }
                    cVar.q((n.b) message.obj);
                    b.this.a(cVar, aVar);
                    cVar.q(null);
                }
            }
        }

        /* JADX INFO: renamed from: ha.l$b$b, reason: collision with other inner class name */
        private class C1518b extends MediaSession.Callback {
            C1518b() {
            }

            private void a(c cVar) {
                cVar.q(null);
            }

            private d b() {
                d dVar;
                synchronized (b.this.f72372a) {
                    dVar = (d) b.this.f72375d.get();
                }
                if (dVar == null || b.this != dVar.s()) {
                    return null;
                }
                return dVar;
            }

            private void c(c cVar) {
                if (Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                String strH = cVar.h();
                if (TextUtils.isEmpty(strH)) {
                    strH = "android.media.session.MediaController";
                }
                cVar.q(new n.b(strH, -1, -1));
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                l.a(bundle);
                c(dVarB);
                try {
                    h hVar = null;
                    IBinder iBinderAsBinder = null;
                    hVar = null;
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        if (resultReceiver != null) {
                            Bundle bundle2 = new Bundle();
                            j jVarO = dVarB.o();
                            ha.c cVarC = jVarO.c();
                            if (cVarC != null) {
                                iBinderAsBinder = cVarC.asBinder();
                            }
                            bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", iBinderAsBinder);
                            fb.a.c(bundle2, "android.support.v4.media.session.SESSION_TOKEN2", jVarO.d());
                            resultReceiver.send(0, bundle2);
                        }
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        if (bundle != null) {
                            b.this.b((ha.j) ha.d.a(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), ha.j.CREATOR));
                        }
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        if (bundle != null) {
                            b.this.c((ha.j) ha.d.a(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), ha.j.CREATOR), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                        }
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                        if (bundle != null) {
                            b.this.q((ha.j) ha.d.a(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), ha.j.CREATOR));
                        }
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                        List<h> list = dVarB.f72387i;
                        if (list != null && bundle != null) {
                            int i11 = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                            if (i11 >= 0 && i11 < list.size()) {
                                hVar = list.get(i11);
                            }
                            if (hVar != null) {
                                b.this.q(hVar.c());
                            }
                        }
                    } else {
                        b.this.d(str, bundle, resultReceiver);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                }
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCustomAction(String str, Bundle bundle) {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                l.a(bundle);
                c(dVarB);
                try {
                    if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                        if (bundle != null) {
                            Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                            Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            l.a(bundle2);
                            b.this.l(uri, bundle2);
                        }
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                        b.this.m();
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        if (bundle != null) {
                            String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                            Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            l.a(bundle3);
                            b.this.n(string, bundle3);
                        }
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        if (bundle != null) {
                            String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                            Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            l.a(bundle4);
                            b.this.o(string2, bundle4);
                        }
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        if (bundle != null) {
                            Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                            Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            l.a(bundle5);
                            b.this.p(uri2, bundle5);
                        }
                    } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        if (bundle != null) {
                            b.this.t(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
                        }
                    } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        if (bundle != null) {
                            b.this.x(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                        }
                    } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        if (bundle != null) {
                            b.this.y(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                        }
                    } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                        if (bundle != null) {
                            q qVar = (q) ha.d.a(bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), q.CREATOR);
                            Bundle bundle6 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            l.a(bundle6);
                            b.this.w(qVar, bundle6);
                        }
                    } else if (!str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                        b.this.e(str, bundle);
                    } else if (bundle != null) {
                        b.this.u(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the data.");
                }
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onFastForward() {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                c(dVarB);
                b.this.f();
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public boolean onMediaButtonEvent(Intent intent) {
                d dVarB = b();
                if (dVarB == null) {
                    return false;
                }
                c(dVarB);
                boolean zG = b.this.g(intent);
                a(dVarB);
                return zG || super.onMediaButtonEvent(intent);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPause() {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                c(dVarB);
                b.this.h();
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlay() {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                c(dVarB);
                b.this.i();
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromMediaId(String str, Bundle bundle) {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                l.a(bundle);
                c(dVarB);
                b.this.j(str, bundle);
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromSearch(String str, Bundle bundle) {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                l.a(bundle);
                c(dVarB);
                b.this.k(str, bundle);
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromUri(Uri uri, Bundle bundle) {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                l.a(bundle);
                c(dVarB);
                b.this.l(uri, bundle);
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepare() {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                c(dVarB);
                b.this.m();
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromMediaId(String str, Bundle bundle) {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                l.a(bundle);
                c(dVarB);
                b.this.n(str, bundle);
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromSearch(String str, Bundle bundle) {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                l.a(bundle);
                c(dVarB);
                b.this.o(str, bundle);
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                l.a(bundle);
                c(dVarB);
                b.this.p(uri, bundle);
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onRewind() {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                c(dVarB);
                b.this.r();
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSeekTo(long j11) {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                c(dVarB);
                b.this.s(j11);
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetPlaybackSpeed(float f11) {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                c(dVarB);
                b.this.u(f11);
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetRating(Rating rating) {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                c(dVarB);
                b.this.v(q.a(rating));
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToNext() {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                c(dVarB);
                b.this.z();
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToPrevious() {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                c(dVarB);
                b.this.A();
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToQueueItem(long j11) {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                c(dVarB);
                b.this.B(j11);
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onStop() {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                c(dVarB);
                b.this.C();
                a(dVarB);
            }
        }

        void D(c cVar, Handler handler) {
            synchronized (this.f72372a) {
                try {
                    this.f72375d = new WeakReference<>(cVar);
                    a aVar = this.f72376e;
                    a aVar2 = null;
                    if (aVar != null) {
                        aVar.removeCallbacksAndMessages(null);
                    }
                    if (handler != null) {
                        aVar2 = new a(handler.getLooper());
                    }
                    this.f72376e = aVar2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void a(c cVar, Handler handler) {
            if (this.f72374c) {
                this.f72374c = false;
                handler.removeMessages(1);
                p pVarG = cVar.g();
                long jB = pVarG == null ? 0L : pVarG.b();
                boolean z11 = pVarG != null && pVarG.q() == 3;
                boolean z12 = (516 & jB) != 0;
                boolean z13 = (jB & 514) != 0;
                if (z11 && z13) {
                    h();
                } else {
                    if (z11 || !z12) {
                        return;
                    }
                    i();
                }
            }
        }

        public boolean g(Intent intent) {
            c cVar;
            a aVar;
            KeyEvent keyEvent;
            if (Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            synchronized (this.f72372a) {
                cVar = this.f72375d.get();
                aVar = this.f72376e;
            }
            if (cVar == null || aVar == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            n.b bVarU = cVar.u();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79 && keyCode != 85) {
                a(cVar, aVar);
                return false;
            }
            if (keyEvent.getRepeatCount() != 0) {
                a(cVar, aVar);
            } else if (this.f72374c) {
                aVar.removeMessages(1);
                this.f72374c = false;
                p pVarG = cVar.g();
                if (((pVarG == null ? 0L : pVarG.b()) & 32) != 0) {
                    z();
                }
            } else {
                this.f72374c = true;
                aVar.sendMessageDelayed(aVar.obtainMessage(1, bVarU), ViewConfiguration.getDoubleTapTimeout());
            }
            return true;
        }

        public void A() {
        }

        public void C() {
        }

        public void f() {
        }

        public void h() {
        }

        public void i() {
        }

        public void m() {
        }

        public void r() {
        }

        public void z() {
        }

        public void B(long j11) {
        }

        public void b(ha.j jVar) {
        }

        public void q(ha.j jVar) {
        }

        public void s(long j11) {
        }

        public void t(boolean z11) {
        }

        public void u(float f11) {
        }

        public void v(q qVar) {
        }

        public void x(int i11) {
        }

        public void y(int i11) {
        }

        public void c(ha.j jVar, int i11) {
        }

        public void e(String str, Bundle bundle) {
        }

        public void j(String str, Bundle bundle) {
        }

        public void k(String str, Bundle bundle) {
        }

        public void l(Uri uri, Bundle bundle) {
        }

        public void n(String str, Bundle bundle) {
        }

        public void o(String str, Bundle bundle) {
        }

        public void p(Uri uri, Bundle bundle) {
        }

        public void w(q qVar, Bundle bundle) {
        }

        public void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }
    }

    static class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final MediaSession f72379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final a f72380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final j f72381c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Bundle f72383e;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        p f72386h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        List<h> f72387i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        k f72388j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f72389k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f72390l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f72391m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72392n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        b f72393o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        n.b f72394p;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Object f72382d = new Object();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f72384f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final RemoteCallbackList<ha.b> f72385g = new RemoteCallbackList<>();

        d(Context context, String str, Bundle bundle) {
            MediaSession mediaSessionW = w(context, str, bundle);
            this.f72379a = mediaSessionW;
            a aVar = new a(this);
            this.f72380b = aVar;
            this.f72381c = new j(mediaSessionW.getSessionToken(), aVar);
            this.f72383e = bundle;
            a(3);
        }

        @Override // ha.l.c
        @SuppressLint({"WrongConstant"})
        public void a(int i11) {
            this.f72379a.setFlags(i11 | 3);
        }

        @Override // ha.l.c
        public void b(r rVar) {
            this.f72379a.setPlaybackToRemote((VolumeProvider) rVar.a());
        }

        @Override // ha.l.c
        public void c(String str, Bundle bundle) {
            this.f72379a.sendSessionEvent(str, bundle);
        }

        @Override // ha.l.c
        public void d(int i11) {
            this.f72389k = i11;
        }

        @Override // ha.l.c
        public void e(k kVar) {
            this.f72388j = kVar;
            this.f72379a.setMetadata(kVar == null ? null : kVar.f());
        }

        @Override // ha.l.c
        public void f(p pVar) {
            this.f72386h = pVar;
            synchronized (this.f72382d) {
                for (int iBeginBroadcast = this.f72385g.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((ha.b) this.f72385g.getBroadcastItem(iBeginBroadcast)).D2(pVar);
                    } catch (RemoteException | SecurityException e11) {
                        Log.e("MediaSessionCompat", "Dead object in setPlaybackState.", e11);
                    }
                }
                this.f72385g.finishBroadcast();
            }
            this.f72379a.setPlaybackState(pVar.l());
        }

        @Override // ha.l.c
        public p g() {
            return this.f72386h;
        }

        @Override // ha.l.c
        public String h() {
            try {
                return (String) this.f72379a.getClass().getMethod("getCallingPackage", null).invoke(this.f72379a, null);
            } catch (Exception e11) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e11);
                return null;
            }
        }

        @Override // ha.l.c
        public void i(int i11) {
            if (this.f72391m != i11) {
                this.f72391m = i11;
                synchronized (this.f72382d) {
                    for (int iBeginBroadcast = this.f72385g.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                        try {
                            ((ha.b) this.f72385g.getBroadcastItem(iBeginBroadcast)).onRepeatModeChanged(i11);
                        } catch (RemoteException | SecurityException e11) {
                            Log.e("MediaSessionCompat", "Dead object in setRepeatMode.", e11);
                        }
                    }
                    this.f72385g.finishBroadcast();
                }
            }
        }

        @Override // ha.l.c
        public boolean isActive() {
            return this.f72379a.isActive();
        }

        @Override // ha.l.c
        public void j(int i11) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i11);
            this.f72379a.setPlaybackToLocal(builder.build());
        }

        @Override // ha.l.c
        public void k(PendingIntent pendingIntent) {
            this.f72379a.setMediaButtonReceiver(pendingIntent);
        }

        @Override // ha.l.c
        public void l(boolean z11) {
            this.f72379a.setActive(z11);
        }

        @Override // ha.l.c
        public void m(b bVar, Handler handler) {
            synchronized (this.f72382d) {
                try {
                    this.f72393o = bVar;
                    this.f72379a.setCallback(bVar == null ? null : bVar.f72373b, handler);
                    if (bVar != null) {
                        bVar.D(this, handler);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // ha.l.c
        public void n(CharSequence charSequence) {
            this.f72379a.setQueueTitle(charSequence);
        }

        @Override // ha.l.c
        public j o() {
            return this.f72381c;
        }

        @Override // ha.l.c
        public void p(List<h> list) {
            this.f72387i = list;
            if (list == null) {
                this.f72379a.setQueue(null);
                return;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<h> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().e());
            }
            this.f72379a.setQueue(arrayList);
        }

        @Override // ha.l.c
        public void q(n.b bVar) {
            synchronized (this.f72382d) {
                this.f72394p = bVar;
            }
        }

        @Override // ha.l.c
        public void r(PendingIntent pendingIntent) {
            this.f72379a.setSessionActivity(pendingIntent);
        }

        @Override // ha.l.c
        public void release() {
            this.f72384f = true;
            this.f72385g.kill();
            if (Build.VERSION.SDK_INT == 27) {
                try {
                    Field declaredField = this.f72379a.getClass().getDeclaredField("mCallback");
                    declaredField.setAccessible(true);
                    Handler handler = (Handler) declaredField.get(this.f72379a);
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                } catch (Exception e11) {
                    Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e11);
                }
            }
            this.f72379a.setCallback(null);
            this.f72380b.T2();
            this.f72379a.release();
        }

        @Override // ha.l.c
        public b s() {
            b bVar;
            synchronized (this.f72382d) {
                bVar = this.f72393o;
            }
            return bVar;
        }

        @Override // ha.l.c
        public void setExtras(Bundle bundle) {
            this.f72379a.setExtras(bundle);
        }

        @Override // ha.l.c
        public Object t() {
            return this.f72379a;
        }

        @Override // ha.l.c
        public n.b u() {
            n.b bVar;
            synchronized (this.f72382d) {
                bVar = this.f72394p;
            }
            return bVar;
        }

        @Override // ha.l.c
        public void v(int i11) {
            if (this.f72392n != i11) {
                this.f72392n = i11;
                synchronized (this.f72382d) {
                    for (int iBeginBroadcast = this.f72385g.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                        try {
                            ((ha.b) this.f72385g.getBroadcastItem(iBeginBroadcast)).u(i11);
                        } catch (RemoteException | SecurityException e11) {
                            Log.e("MediaSessionCompat", "Dead object in setShuffleMode.", e11);
                        }
                    }
                    this.f72385g.finishBroadcast();
                }
            }
        }

        public MediaSession w(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str);
        }

        private static class a extends ha.c.a {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final WeakReference<d> f72395n;

            a(d dVar) {
                this.f72395n = new WeakReference<>(dVar);
            }

            @Override // ha.c
            public List<h> B() {
                return null;
            }

            @Override // ha.c
            public boolean B0() {
                throw new AssertionError();
            }

            @Override // ha.c
            public void B1(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // ha.c
            public void D(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // ha.c
            public boolean G() {
                return false;
            }

            @Override // ha.c
            public boolean G1(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // ha.c
            public void H(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // ha.c
            public PendingIntent J() {
                throw new AssertionError();
            }

            @Override // ha.c
            public void L1(ha.j jVar, int i11) {
                throw new AssertionError();
            }

            @Override // ha.c
            public void Q0(boolean z11) {
                throw new AssertionError();
            }

            @Override // ha.c
            public void R(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // ha.c
            public void T(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // ha.c
            public void T1(q qVar) {
                throw new AssertionError();
            }

            public void T2() {
                this.f72395n.clear();
            }

            @Override // ha.c
            public void V(ha.b bVar) {
                d dVar = this.f72395n.get();
                if (dVar == null || bVar == null) {
                    return;
                }
                dVar.f72385g.register(bVar, new n.b("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
                synchronized (dVar.f72382d) {
                }
            }

            @Override // ha.c
            public void W1(long j11) {
                throw new AssertionError();
            }

            @Override // ha.c
            public void b() {
                throw new AssertionError();
            }

            @Override // ha.c
            public void d() {
                throw new AssertionError();
            }

            @Override // ha.c
            public void d0(int i11) {
                throw new AssertionError();
            }

            @Override // ha.c
            public String e() {
                throw new AssertionError();
            }

            @Override // ha.c
            public void e1(q qVar, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // ha.c
            public void f() {
                throw new AssertionError();
            }

            @Override // ha.c
            public o f1() {
                throw new AssertionError();
            }

            @Override // ha.c
            public p g() {
                d dVar = this.f72395n.get();
                if (dVar != null) {
                    return l.f(dVar.f72386h, dVar.f72388j);
                }
                return null;
            }

            @Override // ha.c
            public Bundle getExtras() {
                throw new AssertionError();
            }

            @Override // ha.c
            public k getMetadata() {
                throw new AssertionError();
            }

            @Override // ha.c
            public String getTag() {
                throw new AssertionError();
            }

            @Override // ha.c
            public int h() {
                d dVar = this.f72395n.get();
                if (dVar != null) {
                    return dVar.f72391m;
                }
                return -1;
            }

            @Override // ha.c
            public void h2(int i11, int i12, String str) {
                throw new AssertionError();
            }

            @Override // ha.c
            public void i(int i11) {
                throw new AssertionError();
            }

            @Override // ha.c
            public long j() {
                throw new AssertionError();
            }

            @Override // ha.c
            public void l(float f11) {
                throw new AssertionError();
            }

            @Override // ha.c
            public void l2(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // ha.c
            public void m() {
                throw new AssertionError();
            }

            @Override // ha.c
            public void next() {
                throw new AssertionError();
            }

            @Override // ha.c
            public void o0(ha.j jVar) {
                throw new AssertionError();
            }

            @Override // ha.c
            public boolean p() {
                d dVar = this.f72395n.get();
                return dVar != null && dVar.f72390l;
            }

            @Override // ha.c
            public void previous() {
                throw new AssertionError();
            }

            @Override // ha.c
            public void q(ha.j jVar) {
                throw new AssertionError();
            }

            @Override // ha.c
            public void q2() {
                throw new AssertionError();
            }

            @Override // ha.c
            public CharSequence r() {
                throw new AssertionError();
            }

            @Override // ha.c
            public int s() {
                d dVar = this.f72395n.get();
                if (dVar != null) {
                    return dVar.f72389k;
                }
                return 0;
            }

            @Override // ha.c
            public void s2(String str, Bundle bundle, i iVar) {
                throw new AssertionError();
            }

            @Override // ha.c
            public void seekTo(long j11) {
                throw new AssertionError();
            }

            @Override // ha.c
            public void stop() {
                throw new AssertionError();
            }

            @Override // ha.c
            public int t() {
                d dVar = this.f72395n.get();
                if (dVar != null) {
                    return dVar.f72392n;
                }
                return -1;
            }

            @Override // ha.c
            public void t1(ha.b bVar) {
                d dVar = this.f72395n.get();
                if (dVar == null || bVar == null) {
                    return;
                }
                dVar.f72385g.unregister(bVar);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (dVar.f72382d) {
                }
            }

            @Override // ha.c
            public void v(int i11) {
                throw new AssertionError();
            }

            @Override // ha.c
            public Bundle w1() {
                d dVar = this.f72395n.get();
                if (dVar == null || dVar.f72383e == null) {
                    return null;
                }
                return new Bundle(dVar.f72383e);
            }

            @Override // ha.c
            public void x1(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // ha.c
            public void z2(int i11, int i12, String str) {
                throw new AssertionError();
            }

            @Override // ha.c
            public void j0(boolean z11) {
            }
        }
    }

    static class f extends e {
        f(Context context, String str, Bundle bundle) {
            super(context, str, bundle);
        }

        @Override // ha.l.d, ha.l.c
        public final n.b u() {
            return new n.b(this.f72379a.getCurrentControllerInfo());
        }

        @Override // ha.l.d, ha.l.c
        public void q(n.b bVar) {
        }
    }
}
