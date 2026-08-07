package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f7580d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static e f7583g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NotificationManager f7585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f7579c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Set<String> f7581e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f7582f = new Object();

    static class a {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }
    }

    static class b {
        static void a(NotificationManager notificationManager, List<NotificationChannel> list) {
            notificationManager.createNotificationChannels(list);
        }
    }

    private static class c implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f7586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f7587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f7588c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Notification f7589d;

        c(String str, int i11, String str2, Notification notification) {
            this.f7586a = str;
            this.f7587b = i11;
            this.f7588c = str2;
            this.f7589d = notification;
        }

        @Override // androidx.core.app.r.f
        public void a(d.a aVar) {
            aVar.h1(this.f7586a, this.f7587b, this.f7588c, this.f7589d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f7586a + ", id:" + this.f7587b + ", tag:" + this.f7588c + "]";
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ComponentName f7590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final IBinder f7591b;

        d(ComponentName componentName, IBinder iBinder) {
            this.f7590a = componentName;
            this.f7591b = iBinder;
        }
    }

    private static class e implements Handler.Callback, ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f7592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HandlerThread f7593b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f7594c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map<ComponentName, a> f7595d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Set<String> f7596e = new HashSet();

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final ComponentName f7597a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            d.a f7599c;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            boolean f7598b = false;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            ArrayDeque<f> f7600d = new ArrayDeque<>();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f7601e = 0;

            a(ComponentName componentName) {
                this.f7597a = componentName;
            }
        }

        e(Context context) {
            this.f7592a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f7593b = handlerThread;
            handlerThread.start();
            this.f7594c = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.f7598b) {
                return true;
            }
            boolean zBindService = this.f7592a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f7597a), this, 33);
            aVar.f7598b = zBindService;
            if (zBindService) {
                aVar.f7601e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f7597a);
                this.f7592a.unbindService(this);
            }
            return aVar.f7598b;
        }

        private void b(a aVar) {
            if (aVar.f7598b) {
                this.f7592a.unbindService(this);
                aVar.f7598b = false;
            }
            aVar.f7599c = null;
        }

        private void c(f fVar) {
            j();
            for (a aVar : this.f7595d.values()) {
                aVar.f7600d.add(fVar);
                g(aVar);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = this.f7595d.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f7595d.get(componentName);
            if (aVar != null) {
                aVar.f7599c = d.a.AbstractBinderC1208a.R2(iBinder);
                aVar.f7601e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = this.f7595d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f7597a + ", " + aVar.f7600d.size() + " queued tasks");
            }
            if (aVar.f7600d.isEmpty()) {
                return;
            }
            if (!a(aVar) || aVar.f7599c == null) {
                i(aVar);
                return;
            }
            while (true) {
                f fVarPeek = aVar.f7600d.peek();
                if (fVarPeek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + fVarPeek);
                    }
                    fVarPeek.a(aVar.f7599c);
                    aVar.f7600d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + aVar.f7597a);
                    }
                } catch (RemoteException e11) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f7597a, e11);
                }
            }
            if (aVar.f7600d.isEmpty()) {
                return;
            }
            i(aVar);
        }

        private void i(a aVar) {
            if (this.f7594c.hasMessages(3, aVar.f7597a)) {
                return;
            }
            int i11 = aVar.f7601e;
            int i12 = i11 + 1;
            aVar.f7601e = i12;
            if (i12 <= 6) {
                int i13 = (1 << i11) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i13 + " ms");
                }
                this.f7594c.sendMessageDelayed(this.f7594c.obtainMessage(3, aVar.f7597a), i13);
                return;
            }
            Log.w("NotifManCompat", "Giving up on delivering " + aVar.f7600d.size() + " tasks to " + aVar.f7597a + " after " + aVar.f7601e + " retries");
            aVar.f7600d.clear();
        }

        private void j() {
            Set<String> setF = r.f(this.f7592a);
            if (setF.equals(this.f7596e)) {
                return;
            }
            this.f7596e = setF;
            List<ResolveInfo> listQueryIntentServices = this.f7592a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (setF.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f7595d.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f7595d.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it = this.f7595d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, a> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + next.getKey());
                    }
                    b(next.getValue());
                    it.remove();
                }
            }
        }

        public void h(f fVar) {
            this.f7594c.obtainMessage(0, fVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == 0) {
                c((f) message.obj);
                return true;
            }
            if (i11 == 1) {
                d dVar = (d) message.obj;
                e(dVar.f7590a, dVar.f7591b);
                return true;
            }
            if (i11 == 2) {
                f((ComponentName) message.obj);
                return true;
            }
            if (i11 != 3) {
                return false;
            }
            d((ComponentName) message.obj);
            return true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f7594c.obtainMessage(1, new d(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f7594c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    private interface f {
        void a(d.a aVar);
    }

    private r(Context context) {
        this.f7584a = context;
        this.f7585b = (NotificationManager) context.getSystemService("notification");
    }

    public static r e(Context context) {
        return new r(context);
    }

    public static Set<String> f(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f7579c) {
            if (string != null) {
                try {
                    if (!string.equals(f7580d)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        f7581e = hashSet;
                        f7580d = string;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            set = f7581e;
        }
        return set;
    }

    private void i(f fVar) {
        synchronized (f7582f) {
            try {
                if (f7583g == null) {
                    f7583g = new e(this.f7584a.getApplicationContext());
                }
                f7583g.h(fVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean j(Notification notification) {
        Bundle bundleA = o.a(notification);
        return bundleA != null && bundleA.getBoolean("android.support.useSideChannel");
    }

    public boolean a() {
        return a.a(this.f7585b);
    }

    public void b(int i11) {
        c(null, i11);
    }

    public void c(String str, int i11) {
        this.f7585b.cancel(str, i11);
    }

    public void d(List<NotificationChannel> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.a(this.f7585b, list);
        }
    }

    public void g(int i11, Notification notification) {
        h(null, i11, notification);
    }

    public void h(String str, int i11, Notification notification) {
        if (!j(notification)) {
            this.f7585b.notify(str, i11, notification);
        } else {
            i(new c(this.f7584a.getPackageName(), i11, str, notification));
            this.f7585b.cancel(str, i11);
        }
    }
}
