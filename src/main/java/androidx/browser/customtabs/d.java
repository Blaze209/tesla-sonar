package androidx.browser.customtabs;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Intent f2960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f2961b;

    private static class a {
        static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    private static class b {
        static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    private static class c {
        static void a(ActivityOptions activityOptions, boolean z11) {
            activityOptions.setShareIdentityEnabled(z11);
        }
    }

    /* JADX INFO: renamed from: androidx.browser.customtabs.d$d, reason: collision with other inner class name */
    public static final class C0067d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ArrayList<Bundle> f2964c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ActivityOptions f2965d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ArrayList<Bundle> f2966e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private SparseArray<Bundle> f2967f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Bundle f2968g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f2971j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Intent f2962a = new Intent("android.intent.action.VIEW");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.browser.customtabs.a.C0064a f2963b = new androidx.browser.customtabs.a.C0064a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f2969h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f2970i = true;

        private void d() {
            String strA = b.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundleExtra = this.f2962a.hasExtra("com.android.browser.headers") ? this.f2962a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", strA);
            this.f2962a.putExtra("com.android.browser.headers", bundleExtra);
        }

        private void h(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f2962a.putExtras(bundle);
        }

        private void i() {
            if (this.f2965d == null) {
                this.f2965d = a.a();
            }
            c.a(this.f2965d, this.f2971j);
        }

        @NonNull
        @Deprecated
        public C0067d a() {
            j(1);
            return this;
        }

        @NonNull
        public d b() {
            if (!this.f2962a.hasExtra("android.support.customtabs.extra.SESSION")) {
                h(null, null);
            }
            ArrayList<Bundle> arrayList = this.f2964c;
            if (arrayList != null) {
                this.f2962a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f2966e;
            if (arrayList2 != null) {
                this.f2962a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f2962a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f2970i);
            this.f2962a.putExtras(this.f2963b.a().a());
            Bundle bundle = this.f2968g;
            if (bundle != null) {
                this.f2962a.putExtras(bundle);
            }
            if (this.f2967f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f2967f);
                this.f2962a.putExtras(bundle2);
            }
            this.f2962a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f2969h);
            int i11 = Build.VERSION.SDK_INT;
            d();
            if (i11 >= 34) {
                i();
            }
            ActivityOptions activityOptions = this.f2965d;
            return new d(this.f2962a, activityOptions != null ? activityOptions.toBundle() : null);
        }

        @NonNull
        public C0067d c(@NonNull Bitmap bitmap) {
            this.f2962a.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", bitmap);
            return this;
        }

        @NonNull
        public C0067d e(@NonNull androidx.browser.customtabs.a aVar) {
            this.f2968g = aVar.a();
            return this;
        }

        @NonNull
        public C0067d f(@NonNull Context context, int i11, int i12) {
            this.f2962a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", androidx.core.app.d.a(context, i11, i12).b());
            return this;
        }

        @NonNull
        public C0067d g(int i11, int i12) {
            if (i11 <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            if (i12 < 0 || i12 > 2) {
                throw new IllegalArgumentException("Invalid value for the activityHeightResizeBehavior argument");
            }
            this.f2962a.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i11);
            this.f2962a.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", i12);
            return this;
        }

        @NonNull
        public C0067d j(int i11) {
            if (i11 < 0 || i11 > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.f2969h = i11;
            if (i11 == 1) {
                this.f2962a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
                return this;
            }
            if (i11 == 2) {
                this.f2962a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
                return this;
            }
            this.f2962a.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
            return this;
        }

        @NonNull
        public C0067d k(boolean z11) {
            this.f2962a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z11 ? 1 : 0);
            return this;
        }

        @NonNull
        public C0067d l(@NonNull Context context, int i11, int i12) {
            this.f2965d = ActivityOptions.makeCustomAnimation(context, i11, i12);
            return this;
        }
    }

    d(@NonNull Intent intent, Bundle bundle) {
        this.f2960a = intent;
        this.f2961b = bundle;
    }

    public void a(@NonNull Context context, @NonNull Uri uri) {
        this.f2960a.setData(uri);
        androidx.core.content.b.startActivity(context, this.f2960a, this.f2961b);
    }
}
