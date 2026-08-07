package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c.b f2921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ComponentName f2922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f2923c;

    class a extends c.a.AbstractBinderC0364a {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Handler f2924n = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ androidx.browser.customtabs.b f2925o;

        /* JADX INFO: renamed from: androidx.browser.customtabs.c$a$a, reason: collision with other inner class name */
        class RunnableC0065a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f2927a;

            RunnableC0065a(Bundle bundle) {
                this.f2927a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f2925o.j(this.f2927a);
            }
        }

        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f2929a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f2930b;

            b(int i11, Bundle bundle) {
                this.f2929a = i11;
                this.f2930b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f2925o.g(this.f2929a, this.f2930b);
            }
        }

        /* JADX INFO: renamed from: androidx.browser.customtabs.c$a$c, reason: collision with other inner class name */
        class RunnableC0066c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f2932a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f2933b;

            RunnableC0066c(String str, Bundle bundle) {
                this.f2932a = str;
                this.f2933b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f2925o.a(this.f2932a, this.f2933b);
            }
        }

        class d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f2935a;

            d(Bundle bundle) {
                this.f2935a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f2925o.e(this.f2935a);
            }
        }

        class e implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f2937a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f2938b;

            e(String str, Bundle bundle) {
                this.f2937a = str;
                this.f2938b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f2925o.h(this.f2937a, this.f2938b);
            }
        }

        class f implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f2940a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Uri f2941b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f2942c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Bundle f2943d;

            f(int i11, Uri uri, boolean z11, Bundle bundle) {
                this.f2940a = i11;
                this.f2941b = uri;
                this.f2942c = z11;
                this.f2943d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f2925o.i(this.f2940a, this.f2941b, this.f2942c, this.f2943d);
            }
        }

        class g implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f2945a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f2946b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f2947c;

            g(int i11, int i12, Bundle bundle) {
                this.f2945a = i11;
                this.f2946b = i12;
                this.f2947c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f2925o.d(this.f2945a, this.f2946b, this.f2947c);
            }
        }

        class h implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f2949a;

            h(Bundle bundle) {
                this.f2949a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f2925o.k(this.f2949a);
            }
        }

        class i implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f2951a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f2952b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f2953c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f2954d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f2955e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Bundle f2956f;

            i(int i11, int i12, int i13, int i14, int i15, Bundle bundle) {
                this.f2951a = i11;
                this.f2952b = i12;
                this.f2953c = i13;
                this.f2954d = i14;
                this.f2955e = i15;
                this.f2956f = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f2925o.c(this.f2951a, this.f2952b, this.f2953c, this.f2954d, this.f2955e, this.f2956f);
            }
        }

        class j implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f2958a;

            j(Bundle bundle) {
                this.f2958a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f2925o.f(this.f2958a);
            }
        }

        a(androidx.browser.customtabs.b bVar) {
            this.f2925o = bVar;
        }

        @Override // c.a
        public void H2(String str, Bundle bundle) {
            if (this.f2925o == null) {
                return;
            }
            this.f2924n.post(new e(str, bundle));
        }

        @Override // c.a
        public void J2(Bundle bundle) {
            if (this.f2925o == null) {
                return;
            }
            this.f2924n.post(new d(bundle));
        }

        @Override // c.a
        public void K(int i11, int i12, int i13, int i14, int i15, @NonNull Bundle bundle) {
            if (this.f2925o == null) {
                return;
            }
            this.f2924n.post(new i(i11, i12, i13, i14, i15, bundle));
        }

        @Override // c.a
        public void M2(int i11, Uri uri, boolean z11, Bundle bundle) {
            if (this.f2925o == null) {
                return;
            }
            this.f2924n.post(new f(i11, uri, z11, bundle));
        }

        @Override // c.a
        public void N1(String str, Bundle bundle) {
            if (this.f2925o == null) {
                return;
            }
            this.f2924n.post(new RunnableC0066c(str, bundle));
        }

        @Override // c.a
        public void O0(int i11, int i12, Bundle bundle) {
            if (this.f2925o == null) {
                return;
            }
            this.f2924n.post(new g(i11, i12, bundle));
        }

        @Override // c.a
        public Bundle Q(@NonNull String str, Bundle bundle) {
            androidx.browser.customtabs.b bVar = this.f2925o;
            if (bVar == null) {
                return null;
            }
            return bVar.b(str, bundle);
        }

        @Override // c.a
        public void Q1(@NonNull Bundle bundle) {
            if (this.f2925o == null) {
                return;
            }
            this.f2924n.post(new h(bundle));
        }

        @Override // c.a
        public void Z0(int i11, Bundle bundle) {
            if (this.f2925o == null) {
                return;
            }
            this.f2924n.post(new b(i11, bundle));
        }

        @Override // c.a
        public void w2(@NonNull Bundle bundle) {
            if (this.f2925o == null) {
                return;
            }
            this.f2924n.post(new j(bundle));
        }

        @Override // c.a
        public void y2(@NonNull Bundle bundle) {
            if (this.f2925o == null) {
                return;
            }
            this.f2924n.post(new RunnableC0065a(bundle));
        }
    }

    c(c.b bVar, ComponentName componentName, Context context) {
        this.f2921a = bVar;
        this.f2922b = componentName;
        this.f2923c = context;
    }

    public static boolean a(@NonNull Context context, String str, @NonNull e eVar) {
        eVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    private c.a.AbstractBinderC0364a b(b bVar) {
        return new a(bVar);
    }

    public static String c(@NonNull Context context, List<String> list) {
        return d(context, list, false);
    }

    public static String d(@NonNull Context context, List<String> list, boolean z11) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList<>() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z11 && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    private f f(b bVar, PendingIntent pendingIntent) {
        boolean zU1;
        c.a.AbstractBinderC0364a abstractBinderC0364aB = b(bVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zU1 = this.f2921a.l1(abstractBinderC0364aB, bundle);
            } else {
                zU1 = this.f2921a.u1(abstractBinderC0364aB);
            }
            if (zU1) {
                return new f(this.f2921a, abstractBinderC0364aB, this.f2922b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public f e(b bVar) {
        return f(bVar, null);
    }

    public boolean g(long j11) {
        try {
            return this.f2921a.I0(j11);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
