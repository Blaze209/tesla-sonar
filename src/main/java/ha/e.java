package ha;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final boolean f72207b = Log.isLoggable("MediaBrowserCompat", 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f72208a;

    private static class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<g> f72209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<Messenger> f72210b;

        a(g gVar) {
            this.f72209a = new WeakReference<>(gVar);
        }

        void a(Messenger messenger) {
            this.f72210b = new WeakReference<>(messenger);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.f72210b;
            if (weakReference == null) {
                return;
            }
            Messenger messenger = weakReference.get();
            g gVar = this.f72209a.get();
            if (messenger == null || gVar == null) {
                return;
            }
            Bundle data = message.getData();
            l.a(data);
            try {
                if (message.what == 3) {
                    Bundle bundle = data.getBundle("data_options");
                    l.a(bundle);
                    Bundle bundle2 = data.getBundle("data_notify_children_changed_options");
                    l.a(bundle2);
                    gVar.c(messenger, data.getString("data_media_item_id"), ha.d.b(data.getParcelableArrayList("data_media_item_list"), h.CREATOR), bundle, bundle2);
                    return;
                }
                Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
            } catch (BadParcelableException unused) {
                Log.e("MediaBrowserCompat", "Could not unparcel the data.");
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final MediaBrowser.ConnectionCallback f72211a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        InterfaceC1512b f72212b;

        private class a extends MediaBrowser.ConnectionCallback {
            a() {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnected() {
                InterfaceC1512b interfaceC1512b = b.this.f72212b;
                if (interfaceC1512b != null) {
                    interfaceC1512b.a();
                }
                b.this.a();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionFailed() {
                InterfaceC1512b interfaceC1512b = b.this.f72212b;
                if (interfaceC1512b != null) {
                    interfaceC1512b.d();
                }
                b.this.b();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionSuspended() {
                InterfaceC1512b interfaceC1512b = b.this.f72212b;
                if (interfaceC1512b != null) {
                    interfaceC1512b.b();
                }
                b.this.c();
            }
        }

        /* JADX INFO: renamed from: ha.e$b$b, reason: collision with other inner class name */
        interface InterfaceC1512b {
            void a();

            void b();

            void d();
        }

        public void a() {
            throw null;
        }

        public void b() {
            throw null;
        }

        public void c() {
            throw null;
        }

        void d(InterfaceC1512b interfaceC1512b) {
            this.f72212b = interfaceC1512b;
        }
    }

    interface c {
        void connect();

        void disconnect();

        l.j o();
    }

    /* JADX INFO: renamed from: ha.e$e, reason: collision with other inner class name */
    static class C1513e extends d {
        C1513e(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    static class f extends C1513e {
        f(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    interface g {
        void c(Messenger messenger, String str, List<h> list, Bundle bundle, Bundle bundle2);
    }

    private static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Messenger f72226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bundle f72227b;

        public i(IBinder iBinder, Bundle bundle) {
            this.f72226a = new Messenger(iBinder);
            this.f72227b = bundle;
        }

        private void b(int i11, Bundle bundle, Messenger messenger) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i11;
            messageObtain.arg1 = 1;
            if (bundle != null) {
                messageObtain.setData(bundle);
            }
            messageObtain.replyTo = messenger;
            this.f72226a.send(messageObtain);
        }

        void a(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.f72227b);
            b(6, bundle, messenger);
        }

        void c(Messenger messenger) throws RemoteException {
            b(7, null, messenger);
        }
    }

    private static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<k> f72228a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<Bundle> f72229b = new ArrayList();

        public k a(Bundle bundle) {
            for (int i11 = 0; i11 < this.f72229b.size(); i11++) {
                if (ha.f.a(this.f72229b.get(i11), bundle)) {
                    return this.f72228a.get(i11);
                }
            }
            return null;
        }

        public List<k> b() {
            return this.f72228a;
        }

        public List<Bundle> c() {
            return this.f72229b;
        }
    }

    public e(Context context, ComponentName componentName, b bVar, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f72208a = new f(context, componentName, bVar, bundle);
        } else {
            this.f72208a = new C1513e(context, componentName, bVar, bundle);
        }
    }

    public void a() {
        Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        this.f72208a.connect();
    }

    public void b() {
        this.f72208a.disconnect();
    }

    public l.j c() {
        return this.f72208a.o();
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class h implements Parcelable {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f72224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ha.j f72225b;

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

        public h(ha.j jVar, int i11) {
            if (jVar == null) {
                throw new IllegalArgumentException("description cannot be null");
            }
            if (TextUtils.isEmpty(jVar.g())) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            this.f72224a = i11;
            this.f72225b = jVar;
        }

        @SuppressLint({"WrongConstant"})
        public static h a(MediaBrowser.MediaItem mediaItem) {
            if (mediaItem == null) {
                return null;
            }
            return new h(ha.j.a(mediaItem.getDescription()), mediaItem.getFlags());
        }

        public static List<h> b(List<MediaBrowser.MediaItem> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<MediaBrowser.MediaItem> it = list.iterator();
            while (it.hasNext()) {
                h hVarA = a(it.next());
                if (hVarA != null) {
                    arrayList.add(hVarA);
                }
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.f72224a + ", mDescription=" + this.f72225b + CoreConstants.CURLY_RIGHT;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f72224a);
            this.f72225b.writeToParcel(parcel, i11);
        }

        h(Parcel parcel) {
            this.f72224a = parcel.readInt();
            this.f72225b = ha.j.CREATOR.createFromParcel(parcel);
        }
    }

    static class d implements c, g, b.InterfaceC1512b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f72214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final MediaBrowser f72215b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final Bundle f72216c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final a f72217d = new a(this);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final androidx.collection.a<String, j> f72218e = new androidx.collection.a<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        protected int f72219f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        protected i f72220g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        protected Messenger f72221h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private l.j f72222i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Bundle f72223j;

        d(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            this.f72214a = context;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            this.f72216c = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bundle2.putInt("extra_calling_pid", Process.myPid());
            bVar.d(this);
            this.f72215b = new MediaBrowser(context, componentName, (MediaBrowser.ConnectionCallback) s7.a.f(bVar.f72211a), bundle2);
        }

        @Override // ha.e.b.InterfaceC1512b
        public void a() {
            try {
                Bundle extras = this.f72215b.getExtras();
                if (extras == null) {
                    return;
                }
                this.f72219f = extras.getInt("extra_service_version", 0);
                IBinder binder = extras.getBinder("extra_messenger");
                if (binder != null) {
                    i iVar = new i(binder, this.f72216c);
                    this.f72220g = iVar;
                    Messenger messenger = new Messenger(this.f72217d);
                    this.f72221h = messenger;
                    this.f72217d.a(messenger);
                    try {
                        iVar.a(this.f72214a, messenger);
                    } catch (RemoteException unused) {
                        Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                    }
                }
                ha.c cVarR2 = ha.c.a.R2(extras.getBinder("extra_session_binder"));
                if (cVarR2 != null) {
                    this.f72222i = l.j.b(this.f72215b.getSessionToken(), cVarR2);
                }
            } catch (IllegalStateException e11) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e11);
            }
        }

        @Override // ha.e.b.InterfaceC1512b
        public void b() {
            this.f72220g = null;
            this.f72221h = null;
            this.f72222i = null;
            this.f72217d.a(null);
        }

        @Override // ha.e.g
        public void c(Messenger messenger, String str, List<h> list, Bundle bundle, Bundle bundle2) {
            if (this.f72221h != messenger) {
                return;
            }
            j jVar = str == null ? null : this.f72218e.get(str);
            if (jVar == null) {
                if (e.f72207b) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
                    return;
                }
                return;
            }
            k kVarA = jVar.a(bundle);
            if (kVarA != null) {
                if (bundle == null) {
                    if (list == null) {
                        kVarA.c(str);
                        return;
                    }
                    this.f72223j = bundle2;
                    kVarA.a(str, list);
                    this.f72223j = null;
                    return;
                }
                if (list == null) {
                    kVarA.d(str, bundle);
                    return;
                }
                this.f72223j = bundle2;
                kVarA.b(str, list, bundle);
                this.f72223j = null;
            }
        }

        @Override // ha.e.c
        public void connect() {
            this.f72215b.connect();
        }

        @Override // ha.e.c
        public void disconnect() {
            Messenger messenger;
            i iVar = this.f72220g;
            if (iVar != null && (messenger = this.f72221h) != null) {
                try {
                    iVar.c(messenger);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            this.f72215b.disconnect();
        }

        @Override // ha.e.c
        public l.j o() {
            if (this.f72222i == null) {
                this.f72222i = l.j.a(this.f72215b.getSessionToken());
            }
            return this.f72222i;
        }

        @Override // ha.e.b.InterfaceC1512b
        public void d() {
        }
    }

    public static abstract class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final MediaBrowser.SubscriptionCallback f72230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final IBinder f72231b = new Binder();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<j> f72232c;

        private class a extends MediaBrowser.SubscriptionCallback {
            a() {
            }

            List<h> a(List<h> list, Bundle bundle) {
                int i11 = bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i12 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                if (i11 == -1 && i12 == -1) {
                    return list;
                }
                int i13 = i12 * i11;
                int size = i13 + i12;
                if (i11 < 0 || i12 < 1 || i13 >= list.size()) {
                    return Collections.EMPTY_LIST;
                }
                if (size > list.size()) {
                    size = list.size();
                }
                return list.subList(i13, size);
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
                WeakReference<j> weakReference = k.this.f72232c;
                j jVar = weakReference == null ? null : weakReference.get();
                if (jVar == null) {
                    k.this.a(str, h.b(list));
                    return;
                }
                List<h> list2 = (List) s7.a.f(h.b(list));
                List<k> listB = jVar.b();
                List<Bundle> listC = jVar.c();
                for (int i11 = 0; i11 < listB.size(); i11++) {
                    Bundle bundle = listC.get(i11);
                    if (bundle == null) {
                        k.this.a(str, list2);
                    } else {
                        k.this.b(str, a(list2, bundle), bundle);
                    }
                }
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(String str) {
                k.this.c(str);
            }
        }

        private class b extends a {
            b() {
                super();
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
                l.a(bundle);
                k.this.b(str, h.b(list), bundle);
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(String str, Bundle bundle) {
                l.a(bundle);
                k.this.d(str, bundle);
            }
        }

        public k() {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f72230a = new b();
            } else {
                this.f72230a = new a();
            }
        }

        public void c(String str) {
        }

        public void a(String str, List<h> list) {
        }

        public void d(String str, Bundle bundle) {
        }

        public void b(String str, List<h> list, Bundle bundle) {
        }
    }
}
