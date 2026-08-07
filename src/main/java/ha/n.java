package ha;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.session.MediaSessionManager;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final boolean f72404b = Log.isLoggable("MediaSessionManager", 3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f72405c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile n f72406d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    a f72407a;

    private static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final boolean f72408c = n.f72404b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Context f72409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ContentResolver f72410b;

        a(Context context) {
            this.f72409a = context;
            this.f72410b = context.getContentResolver();
        }

        private boolean a(c cVar) {
            return this.f72409a.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", cVar.b(), cVar.a()) == 0;
        }

        private boolean c(c cVar, String str) {
            if (cVar.b() < 0) {
                return this.f72409a.getPackageManager().checkPermission(str, cVar.e()) == 0;
            }
            return this.f72409a.checkPermission(str, cVar.b(), cVar.a()) == 0;
        }

        boolean b(c cVar) {
            String string = Settings.Secure.getString(this.f72410b, "enabled_notification_listeners");
            if (string != null) {
                for (String str : string.split(":")) {
                    ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                    if (componentNameUnflattenFromString != null && componentNameUnflattenFromString.getPackageName().equals(cVar.e())) {
                        return true;
                    }
                }
            }
            return false;
        }

        public boolean d(c cVar) {
            if (a(cVar)) {
                return true;
            }
            try {
                if (this.f72409a.getPackageManager().getApplicationInfo(cVar.e(), 0) == null) {
                    return false;
                }
                return c(cVar, "android.permission.STATUS_BAR_SERVICE") || c(cVar, "android.permission.MEDIA_CONTENT_CONTROL") || cVar.a() == 1000 || b(cVar);
            } catch (PackageManager.NameNotFoundException unused) {
                if (f72408c) {
                    Log.d("MediaSessionManager", "Package " + cVar.e() + " doesn't exist");
                }
                return false;
            }
        }
    }

    interface c {
        int a();

        int b();

        String e();
    }

    private static final class d extends e {
        d(String str, int i11, int i12) {
            super(str, i11, i12);
        }

        static String c(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            return remoteUserInfo.getPackageName();
        }

        d(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
        }
    }

    private static class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f72412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f72413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f72414c;

        e(String str, int i11, int i12) {
            this.f72412a = str;
            this.f72413b = i11;
            this.f72414c = i12;
        }

        @Override // ha.n.c
        public int a() {
            return this.f72414c;
        }

        @Override // ha.n.c
        public int b() {
            return this.f72413b;
        }

        @Override // ha.n.c
        public String e() {
            return this.f72412a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f72413b < 0 || eVar.f72413b < 0) {
                return TextUtils.equals(this.f72412a, eVar.f72412a) && this.f72414c == eVar.f72414c;
            }
            return TextUtils.equals(this.f72412a, eVar.f72412a) && this.f72413b == eVar.f72413b && this.f72414c == eVar.f72414c;
        }

        public int hashCode() {
            return u5.c.b(this.f72412a, Integer.valueOf(this.f72414c));
        }
    }

    private n(Context context) {
        this.f72407a = new a(context);
    }

    public static n a(Context context) {
        n nVar;
        synchronized (f72405c) {
            try {
                if (f72406d == null) {
                    f72406d = new n(context.getApplicationContext());
                }
                nVar = f72406d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    public boolean b(b bVar) {
        return this.f72407a.d(bVar.f72411a);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c f72411a;

        public b(String str, int i11, int i12) {
            if (str == null) {
                throw new NullPointerException("package shouldn't be null");
            }
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            if (Build.VERSION.SDK_INT >= 28) {
                this.f72411a = new d(str, i11, i12);
            } else {
                this.f72411a = new e(str, i11, i12);
            }
        }

        public String a() {
            return this.f72411a.e();
        }

        public int b() {
            return this.f72411a.b();
        }

        public int c() {
            return this.f72411a.a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f72411a.equals(((b) obj).f72411a);
            }
            return false;
        }

        public int hashCode() {
            return this.f72411a.hashCode();
        }

        public b(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            String strC = d.c(remoteUserInfo);
            if (strC != null) {
                if (!TextUtils.isEmpty(strC)) {
                    this.f72411a = new d(remoteUserInfo);
                    return;
                }
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            throw new NullPointerException("package shouldn't be null");
        }
    }
}
