package ha;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends Service {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final boolean f72235i = Log.isLoggable("MBServiceCompat", 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC1514g f72236a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    f f72241f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ha.l.j f72243h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f72237b = new n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final f f72238c = new f("android.media.session.MediaController", -1, -1, null, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ArrayList<f> f72239d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final androidx.collection.a<IBinder, f> f72240e = new androidx.collection.a<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final q f72242g = new q(this);

    class a extends l<List<ha.e.h>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ f f72244f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f72245g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Bundle f72246h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Bundle f72247i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, f fVar, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f72244f = fVar;
            this.f72245g = str;
            this.f72246h = bundle;
            this.f72247i = bundle2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ha.g.l
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void e(List<ha.e.h> list) {
            if (g.this.f72240e.get(((o) s7.a.f(this.f72244f.f72262f)).asBinder()) != this.f72244f) {
                if (g.f72235i) {
                    Log.d("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + this.f72244f.f72257a + " id=" + this.f72245g);
                    return;
                }
                return;
            }
            if ((b() & 1) != 0) {
                list = g.this.b(list, this.f72246h);
            }
            try {
                this.f72244f.f72262f.a(this.f72245g, list, this.f72246h, this.f72247i);
            } catch (RemoteException unused) {
                Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + this.f72245g + " package=" + this.f72244f.f72257a);
            }
        }
    }

    class b extends l<ha.e.h> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ e.b f72249f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object obj, e.b bVar) {
            super(obj);
            this.f72249f = bVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ha.g.l
        @SuppressLint({"RestrictedApi"})
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void e(ha.e.h hVar) {
            if ((b() & 2) != 0) {
                this.f72249f.b(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("media_item", ha.d.a(hVar, MediaBrowserCompat$MediaItem.CREATOR));
            this.f72249f.b(0, bundle);
        }
    }

    class c extends l<List<ha.e.h>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ e.b f72251f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Object obj, e.b bVar) {
            super(obj);
            this.f72251f = bVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ha.g.l
        @SuppressLint({"RestrictedApi"})
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void e(List<ha.e.h> list) {
            if ((b() & 4) != 0 || list == null) {
                this.f72251f.b(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("search_results", (Parcelable[]) ha.d.b(list, MediaBrowserCompat$MediaItem.CREATOR).toArray(new MediaBrowserCompat$MediaItem[0]));
            this.f72251f.b(0, bundle);
        }
    }

    class d extends l<Bundle> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ e.b f72253f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Object obj, e.b bVar) {
            super(obj);
            this.f72253f = bVar;
        }

        @Override // ha.g.l
        void d(Bundle bundle) {
            this.f72253f.b(-1, bundle);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ha.g.l
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void e(Bundle bundle) {
            this.f72253f.b(0, bundle);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f72255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bundle f72256b;

        public e(String str, Bundle bundle) {
            if (str == null) {
                throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
            }
            this.f72255a = str;
            this.f72256b = bundle;
        }

        public Bundle c() {
            return this.f72256b;
        }

        public String d() {
            return this.f72255a;
        }
    }

    private class f implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f72258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f72259c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ha.n.b f72260d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Bundle f72261e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final o f72262f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final HashMap<String, List<u5.d<IBinder, Bundle>>> f72263g = new HashMap<>();

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = f.this;
                g.this.f72240e.remove(((o) s7.a.f(fVar.f72262f)).asBinder());
            }
        }

        f(String str, int i11, int i12, Bundle bundle, o oVar) {
            this.f72257a = str;
            this.f72258b = i11;
            this.f72259c = i12;
            this.f72260d = new ha.n.b(str, i11, i12);
            this.f72261e = bundle;
            this.f72262f = oVar;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            g.this.f72242g.post(new a());
        }
    }

    /* JADX INFO: renamed from: ha.g$g, reason: collision with other inner class name */
    interface InterfaceC1514g {
        void a(ha.l.j jVar);

        ha.n.b b();

        IBinder c(Intent intent);

        void onCreate();
    }

    class h implements InterfaceC1514g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<Bundle> f72266a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        MediaBrowserService f72267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Messenger f72268c;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ha.l.j f72270a;

            a(ha.l.j jVar) {
                this.f72270a = jVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.f(this.f72270a);
            }
        }

        class b extends l<List<ha.e.h>> {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ m f72272f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Object obj, m mVar) {
                super(obj);
                this.f72272f = mVar;
            }

            @Override // ha.g.l
            public void a() {
                this.f72272f.a();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // ha.g.l
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public void e(List<ha.e.h> list) {
                ArrayList arrayList;
                if (list == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    for (ha.e.h hVar : list) {
                        Parcel parcelObtain = Parcel.obtain();
                        hVar.writeToParcel(parcelObtain, 0);
                        arrayList2.add(parcelObtain);
                    }
                    arrayList = arrayList2;
                }
                this.f72272f.c(arrayList);
            }
        }

        class c extends MediaBrowserService {
            c(Context context) {
                attachBaseContext(context);
            }

            @Override // android.service.media.MediaBrowserService
            public MediaBrowserService.BrowserRoot onGetRoot(String str, int i11, Bundle bundle) {
                ha.l.a(bundle);
                e eVarD = h.this.d(str, i11, bundle == null ? null : new Bundle(bundle));
                if (eVarD == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(eVarD.f72255a, eVarD.f72256b);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                h.this.e(str, new m<>(result));
            }
        }

        h() {
        }

        @Override // ha.g.InterfaceC1514g
        public void a(ha.l.j jVar) {
            g.this.f72242g.a(new a(jVar));
        }

        @Override // ha.g.InterfaceC1514g
        public ha.n.b b() {
            f fVar = g.this.f72241f;
            if (fVar != null) {
                return fVar.f72260d;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        @Override // ha.g.InterfaceC1514g
        public IBinder c(Intent intent) {
            return ((MediaBrowserService) s7.a.f(this.f72267b)).onBind(intent);
        }

        public e d(String str, int i11, Bundle bundle) {
            Bundle bundle2;
            int i12 = -1;
            if (bundle == null || bundle.getInt("extra_client_version", 0) == 0) {
                bundle2 = null;
            } else {
                bundle.remove("extra_client_version");
                this.f72268c = new Messenger(g.this.f72242g);
                bundle2 = new Bundle();
                bundle2.putInt("extra_service_version", 2);
                bundle2.putBinder("extra_messenger", this.f72268c.getBinder());
                ha.l.j jVar = g.this.f72243h;
                if (jVar != null) {
                    ha.c cVarC = jVar.c();
                    bundle2.putBinder("extra_session_binder", cVarC == null ? null : cVarC.asBinder());
                } else {
                    this.f72266a.add(bundle2);
                }
                i12 = bundle.getInt("extra_calling_pid", -1);
                bundle.remove("extra_calling_pid");
            }
            f fVar = g.this.new f(str, i12, i11, bundle, null);
            g gVar = g.this;
            gVar.f72241f = fVar;
            e eVarG = gVar.g(str, i11, bundle);
            g gVar2 = g.this;
            gVar2.f72241f = null;
            if (eVarG == null) {
                return null;
            }
            if (this.f72268c != null) {
                gVar2.f72239d.add(fVar);
            }
            Bundle bundleC = eVarG.c();
            if (bundle2 == null) {
                bundle2 = bundleC;
            } else if (bundleC != null) {
                bundle2.putAll(bundleC);
            }
            return new e(eVarG.d(), bundle2);
        }

        public void e(String str, m<List<Parcel>> mVar) {
            b bVar = new b(str, mVar);
            g gVar = g.this;
            gVar.f72241f = gVar.f72238c;
            gVar.h(str, bVar);
            g.this.f72241f = null;
        }

        void f(ha.l.j jVar) {
            if (!this.f72266a.isEmpty()) {
                ha.c cVarC = jVar.c();
                if (cVarC != null) {
                    Iterator<Bundle> it = this.f72266a.iterator();
                    while (it.hasNext()) {
                        it.next().putBinder("extra_session_binder", cVarC.asBinder());
                    }
                }
                this.f72266a.clear();
            }
            ((MediaBrowserService) s7.a.f(this.f72267b)).setSessionToken(jVar.e());
        }
    }

    class i extends h {

        class a extends l<ha.e.h> {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ m f72276f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, m mVar) {
                super(obj);
                this.f72276f = mVar;
            }

            @Override // ha.g.l
            public void a() {
                this.f72276f.a();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // ha.g.l
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public void e(ha.e.h hVar) {
                if (hVar == null) {
                    this.f72276f.c(null);
                    return;
                }
                Parcel parcelObtain = Parcel.obtain();
                hVar.writeToParcel(parcelObtain, 0);
                this.f72276f.c(parcelObtain);
            }
        }

        class b extends h.c {
            b(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                i.this.g(str, new m<>(result));
            }
        }

        i() {
            super();
        }

        public void g(String str, m<Parcel> mVar) {
            a aVar = new a(str, mVar);
            g gVar = g.this;
            gVar.f72241f = gVar.f72238c;
            gVar.j(str, aVar);
            g.this.f72241f = null;
        }

        @Override // ha.g.InterfaceC1514g
        public void onCreate() {
            b bVar = new b(g.this);
            this.f72267b = bVar;
            bVar.onCreate();
        }
    }

    class j extends i {

        class a extends l<List<ha.e.h>> {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ m f72280f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Bundle f72281g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, m mVar, Bundle bundle) {
                super(obj);
                this.f72280f = mVar;
                this.f72281g = bundle;
            }

            @Override // ha.g.l
            public void a() {
                this.f72280f.a();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // ha.g.l
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public void e(List<ha.e.h> list) {
                if (list == null) {
                    this.f72280f.c(null);
                    return;
                }
                if ((b() & 1) != 0) {
                    list = g.this.b(list, this.f72281g);
                }
                ArrayList arrayList = new ArrayList(list == null ? 0 : list.size());
                if (list != null) {
                    for (ha.e.h hVar : list) {
                        Parcel parcelObtain = Parcel.obtain();
                        hVar.writeToParcel(parcelObtain, 0);
                        arrayList.add(parcelObtain);
                    }
                }
                this.f72280f.c(arrayList);
            }
        }

        class b extends i.b {
            b(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
                ha.l.a(bundle);
                j jVar = j.this;
                g gVar = g.this;
                gVar.f72241f = gVar.f72238c;
                jVar.h(str, new m<>(result), bundle);
                g.this.f72241f = null;
            }
        }

        j() {
            super();
        }

        public void h(String str, m<List<Parcel>> mVar, Bundle bundle) {
            a aVar = new a(str, mVar, bundle);
            g gVar = g.this;
            gVar.f72241f = gVar.f72238c;
            gVar.i(str, aVar, bundle);
            g.this.f72241f = null;
        }

        @Override // ha.g.i, ha.g.InterfaceC1514g
        public void onCreate() {
            b bVar = new b(g.this);
            this.f72267b = bVar;
            bVar.onCreate();
        }
    }

    class k extends j {
        k() {
            super();
        }

        @Override // ha.g.h, ha.g.InterfaceC1514g
        public ha.n.b b() {
            g gVar = g.this;
            f fVar = gVar.f72241f;
            if (fVar != null) {
                return fVar == gVar.f72238c ? new ha.n.b(((MediaBrowserService) s7.a.f(this.f72267b)).getCurrentBrowserInfo()) : fVar.f72260d;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }
    }

    public static class l<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f72285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f72286b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f72287c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f72288d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f72289e;

        l(Object obj) {
            this.f72285a = obj;
        }

        public void a() {
            if (this.f72286b) {
                throw new IllegalStateException("detach() called when detach() had already been called for: " + this.f72285a);
            }
            if (this.f72287c) {
                throw new IllegalStateException("detach() called when sendResult() had already been called for: " + this.f72285a);
            }
            if (!this.f72288d) {
                this.f72286b = true;
                return;
            }
            throw new IllegalStateException("detach() called when sendError() had already been called for: " + this.f72285a);
        }

        int b() {
            return this.f72289e;
        }

        boolean c() {
            return this.f72286b || this.f72287c || this.f72288d;
        }

        void d(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f72285a);
        }

        void e(T t11) {
            throw null;
        }

        public void f(Bundle bundle) {
            if (!this.f72287c && !this.f72288d) {
                this.f72288d = true;
                d(bundle);
            } else {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f72285a);
            }
        }

        public void g(T t11) {
            if (!this.f72287c && !this.f72288d) {
                this.f72287c = true;
                e(t11);
            } else {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f72285a);
            }
        }

        void h(int i11) {
            this.f72289e = i11;
        }
    }

    static class m<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        MediaBrowserService.Result f72290a;

        m(MediaBrowserService.Result result) {
            this.f72290a = result;
        }

        public void a() {
            this.f72290a.detach();
        }

        List<MediaBrowser.MediaItem> b(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Parcel parcel : list) {
                parcel.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void c(T t11) {
            if (t11 instanceof List) {
                this.f72290a.sendResult(b((List) t11));
                return;
            }
            if (!(t11 instanceof Parcel)) {
                this.f72290a.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) t11;
            parcel.setDataPosition(0);
            this.f72290a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
        }
    }

    private class n {

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f72292a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f72293b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ IBinder f72294c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Bundle f72295d;

            a(o oVar, String str, IBinder iBinder, Bundle bundle) {
                this.f72292a = oVar;
                this.f72293b = str;
                this.f72294c = iBinder;
                this.f72295d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = g.this.f72240e.get(this.f72292a.asBinder());
                if (fVar != null) {
                    g.this.a(this.f72293b, fVar, this.f72294c, this.f72295d);
                    return;
                }
                Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + this.f72293b);
            }
        }

        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f72297a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f72298b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ IBinder f72299c;

            b(o oVar, String str, IBinder iBinder) {
                this.f72297a = oVar;
                this.f72298b = str;
                this.f72299c = iBinder;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = g.this.f72240e.get(this.f72297a.asBinder());
                if (fVar == null) {
                    Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + this.f72298b);
                    return;
                }
                if (g.this.r(this.f72298b, fVar, this.f72299c)) {
                    return;
                }
                Log.w("MBServiceCompat", "removeSubscription called for " + this.f72298b + " which is not subscribed");
            }
        }

        class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f72301a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f72302b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e.b f72303c;

            c(o oVar, String str, e.b bVar) {
                this.f72301a = oVar;
                this.f72302b = str;
                this.f72303c = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = g.this.f72240e.get(this.f72301a.asBinder());
                if (fVar != null) {
                    g.this.p(this.f72302b, fVar, this.f72303c);
                    return;
                }
                Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + this.f72302b);
            }
        }

        class d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f72305a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f72306b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f72307c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f72308d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Bundle f72309e;

            d(o oVar, int i11, String str, int i12, Bundle bundle) {
                this.f72305a = oVar;
                this.f72306b = i11;
                this.f72307c = str;
                this.f72308d = i12;
                this.f72309e = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar;
                IBinder iBinderAsBinder = this.f72305a.asBinder();
                g.this.f72240e.remove(iBinderAsBinder);
                Iterator<f> it = g.this.f72239d.iterator();
                while (true) {
                    fVar = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    f next = it.next();
                    if (next.f72259c == this.f72306b) {
                        fVar = (TextUtils.isEmpty(this.f72307c) || this.f72308d <= 0) ? g.this.new f(next.f72257a, next.f72258b, next.f72259c, this.f72309e, this.f72305a) : null;
                        it.remove();
                        break;
                    }
                }
                if (fVar == null) {
                    fVar = g.this.new f(this.f72307c, this.f72308d, this.f72306b, this.f72309e, this.f72305a);
                }
                g.this.f72240e.put(iBinderAsBinder, fVar);
                try {
                    iBinderAsBinder.linkToDeath(fVar, 0);
                } catch (RemoteException unused) {
                    Log.w("MBServiceCompat", "IBinder is already dead.");
                }
            }
        }

        class e implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f72311a;

            e(o oVar) {
                this.f72311a = oVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder iBinderAsBinder = this.f72311a.asBinder();
                f fVarRemove = g.this.f72240e.remove(iBinderAsBinder);
                if (fVarRemove != null) {
                    iBinderAsBinder.unlinkToDeath(fVarRemove, 0);
                }
            }
        }

        class f implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f72313a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f72314b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f72315c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ e.b f72316d;

            f(o oVar, String str, Bundle bundle, e.b bVar) {
                this.f72313a = oVar;
                this.f72314b = str;
                this.f72315c = bundle;
                this.f72316d = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = g.this.f72240e.get(this.f72313a.asBinder());
                if (fVar != null) {
                    g.this.q(this.f72314b, this.f72315c, fVar, this.f72316d);
                    return;
                }
                Log.w("MBServiceCompat", "search for callback that isn't registered query=" + this.f72314b);
            }
        }

        /* JADX INFO: renamed from: ha.g$n$g, reason: collision with other inner class name */
        class RunnableC1515g implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f72318a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f72319b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f72320c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ e.b f72321d;

            RunnableC1515g(o oVar, String str, Bundle bundle, e.b bVar) {
                this.f72318a = oVar;
                this.f72319b = str;
                this.f72320c = bundle;
                this.f72321d = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = g.this.f72240e.get(this.f72318a.asBinder());
                if (fVar != null) {
                    g.this.n(this.f72319b, this.f72320c, fVar, this.f72321d);
                    return;
                }
                Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.f72319b + ", extras=" + this.f72320c);
            }
        }

        n() {
        }

        public void a(String str, IBinder iBinder, Bundle bundle, o oVar) {
            g.this.f72242g.a(new a(oVar, str, iBinder, bundle));
        }

        public void b(String str, e.b bVar, o oVar) {
            if (TextUtils.isEmpty(str) || bVar == null) {
                return;
            }
            g.this.f72242g.a(new c(oVar, str, bVar));
        }

        public void c(o oVar, String str, int i11, int i12, Bundle bundle) {
            g.this.f72242g.a(new d(oVar, i12, str, i11, bundle));
        }

        public void d(String str, IBinder iBinder, o oVar) {
            g.this.f72242g.a(new b(oVar, str, iBinder));
        }

        public void e(String str, Bundle bundle, e.b bVar, o oVar) {
            if (TextUtils.isEmpty(str) || bVar == null) {
                return;
            }
            g.this.f72242g.a(new f(oVar, str, bundle, bVar));
        }

        public void f(String str, Bundle bundle, e.b bVar, o oVar) {
            if (TextUtils.isEmpty(str) || bVar == null) {
                return;
            }
            g.this.f72242g.a(new RunnableC1515g(oVar, str, bundle, bVar));
        }

        public void g(o oVar) {
            g.this.f72242g.a(new e(oVar));
        }
    }

    private interface o {
        void a(String str, List<ha.e.h> list, Bundle bundle, Bundle bundle2);

        IBinder asBinder();
    }

    private static class p implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Messenger f72323a;

        p(Messenger messenger) {
            this.f72323a = messenger;
        }

        private void b(int i11, Bundle bundle) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i11;
            messageObtain.arg1 = 2;
            if (bundle != null) {
                messageObtain.setData(bundle);
            }
            this.f72323a.send(messageObtain);
        }

        @Override // ha.g.o
        public void a(String str, List<ha.e.h> list, Bundle bundle, Bundle bundle2) throws RemoteException {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList("data_media_item_list", ha.d.b(list, MediaBrowserCompat$MediaItem.CREATOR));
            }
            b(3, bundle3);
        }

        @Override // ha.g.o
        public IBinder asBinder() {
            return this.f72323a.getBinder();
        }
    }

    private static final class q extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private g f72324a;

        q(g gVar) {
            this.f72324a = gVar;
        }

        public void a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public void b() {
            this.f72324a = null;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            g gVar = this.f72324a;
            if (gVar != null) {
                gVar.e(message);
            } else {
                removeCallbacksAndMessages(null);
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j11) {
            Bundle data = message.getData();
            data.setClassLoader((ClassLoader) s7.a.f(ha.e.class.getClassLoader()));
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt("data_calling_pid", callingPid);
            } else if (!data.containsKey("data_calling_pid")) {
                data.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message, j11);
        }
    }

    void a(String str, f fVar, IBinder iBinder, Bundle bundle) {
        List<u5.d<IBinder, Bundle>> arrayList = fVar.f72263g.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        for (u5.d<IBinder, Bundle> dVar : arrayList) {
            if (iBinder == dVar.f115407a && ha.f.a(bundle, dVar.f115408b)) {
                return;
            }
        }
        arrayList.add(new u5.d<>(iBinder, bundle));
        fVar.f72263g.put(str, arrayList);
        o(str, fVar, bundle, null);
        this.f72241f = fVar;
        l(str, bundle);
        this.f72241f = null;
    }

    List<ha.e.h> b(List<ha.e.h> list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        if (bundle != null) {
            int i11 = bundle.getInt("android.media.browse.extra.PAGE", -1);
            int i12 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
            if (i11 != -1 || i12 != -1) {
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
        }
        return list;
    }

    public void c(Context context) {
        attachBaseContext(context);
    }

    public final ha.n.b d() {
        return ((InterfaceC1514g) s7.a.f(this.f72236a)).b();
    }

    @SuppressLint({"RestrictedApi"})
    void e(Message message) {
        Bundle data = message.getData();
        switch (message.what) {
            case 3:
                Bundle bundle = data.getBundle("data_options");
                ha.l.a(bundle);
                this.f72237b.a(data.getString("data_media_item_id"), data.getBinder("data_callback_token"), bundle, new p(message.replyTo));
                break;
            case 4:
                this.f72237b.d(data.getString("data_media_item_id"), data.getBinder("data_callback_token"), new p(message.replyTo));
                break;
            case 5:
                this.f72237b.b(data.getString("data_media_item_id"), (e.b) data.getParcelable("data_result_receiver"), new p(message.replyTo));
                break;
            case 6:
                Bundle bundle2 = data.getBundle("data_root_hints");
                ha.l.a(bundle2);
                this.f72237b.c(new p(message.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle2);
                break;
            case 7:
                this.f72237b.g(new p(message.replyTo));
                break;
            case 8:
                Bundle bundle3 = data.getBundle("data_search_extras");
                ha.l.a(bundle3);
                this.f72237b.e(data.getString("data_search_query"), bundle3, (e.b) data.getParcelable("data_result_receiver"), new p(message.replyTo));
                break;
            case 9:
                Bundle bundle4 = data.getBundle("data_custom_action_extras");
                ha.l.a(bundle4);
                this.f72237b.f(data.getString("data_custom_action"), bundle4, (e.b) data.getParcelable("data_result_receiver"), new p(message.replyTo));
                break;
            default:
                Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                break;
        }
    }

    public void f(String str, Bundle bundle, l<Bundle> lVar) {
        lVar.f(null);
    }

    public abstract e g(String str, int i11, Bundle bundle);

    public abstract void h(String str, l<List<ha.e.h>> lVar);

    public void i(String str, l<List<ha.e.h>> lVar, Bundle bundle) {
        lVar.h(1);
        h(str, lVar);
    }

    public void j(String str, l<ha.e.h> lVar) {
        lVar.h(2);
        lVar.g(null);
    }

    public void k(String str, Bundle bundle, l<List<ha.e.h>> lVar) {
        lVar.h(4);
        lVar.g(null);
    }

    void n(String str, Bundle bundle, f fVar, e.b bVar) {
        d dVar = new d(str, bVar);
        this.f72241f = fVar;
        f(str, bundle == null ? Bundle.EMPTY : bundle, dVar);
        this.f72241f = null;
        if (dVar.c()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }

    void o(String str, f fVar, Bundle bundle, Bundle bundle2) {
        a aVar = new a(str, fVar, str, bundle, bundle2);
        this.f72241f = fVar;
        if (bundle == null) {
            h(str, aVar);
        } else {
            i(str, aVar, bundle);
        }
        this.f72241f = null;
        if (aVar.c()) {
            return;
        }
        throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + fVar.f72257a + " id=" + str);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return ((InterfaceC1514g) s7.a.f(this.f72236a)).c(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            this.f72236a = new k();
        } else if (i11 >= 26) {
            this.f72236a = new j();
        } else {
            this.f72236a = new i();
        }
        this.f72236a.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f72242g.b();
    }

    void p(String str, f fVar, e.b bVar) {
        b bVar2 = new b(str, bVar);
        this.f72241f = fVar;
        j(str, bVar2);
        this.f72241f = null;
        if (bVar2.c()) {
            return;
        }
        throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
    }

    void q(String str, Bundle bundle, f fVar, e.b bVar) {
        c cVar = new c(str, bVar);
        this.f72241f = fVar;
        k(str, bundle, cVar);
        this.f72241f = null;
        if (cVar.c()) {
            return;
        }
        throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
    }

    boolean r(String str, f fVar, IBinder iBinder) {
        boolean z11 = false;
        try {
            if (iBinder != null) {
                List<u5.d<IBinder, Bundle>> list = fVar.f72263g.get(str);
                if (list != null) {
                    Iterator<u5.d<IBinder, Bundle>> it = list.iterator();
                    while (it.hasNext()) {
                        if (iBinder == it.next().f115407a) {
                            it.remove();
                            z11 = true;
                        }
                    }
                    if (list.isEmpty()) {
                        fVar.f72263g.remove(str);
                    }
                }
            } else if (fVar.f72263g.remove(str) != null) {
                z11 = true;
            }
            this.f72241f = fVar;
            m(str);
            this.f72241f = null;
            return z11;
        } catch (Throwable th2) {
            this.f72241f = fVar;
            m(str);
            this.f72241f = null;
            throw th2;
        }
    }

    public void s(ha.l.j jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if (this.f72243h != null) {
            throw new IllegalStateException("The session token has already been set");
        }
        this.f72243h = jVar;
        ((InterfaceC1514g) s7.a.f(this.f72236a)).a(jVar);
    }

    public void m(String str) {
    }

    public void l(String str, Bundle bundle) {
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
