package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f8250a;

        public a(b bVar) {
            this.f8250a = bVar == null ? e() : bVar;
        }

        private e.c a(@NonNull Context context, r5.e eVar) {
            if (eVar == null) {
                return null;
            }
            return new j(context, eVar);
        }

        @NonNull
        private List<List<byte[]>> b(@NonNull Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        @NonNull
        private r5.e d(@NonNull ProviderInfo providerInfo, @NonNull PackageManager packageManager) {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new r5.e(str, str2, "emojicompat-emoji-font", b(this.f8250a.b(packageManager, str2)));
        }

        @NonNull
        private static b e() {
            return Build.VERSION.SDK_INT >= 28 ? new d() : new C0165c();
        }

        private boolean f(ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }

        private ProviderInfo g(@NonNull PackageManager packageManager) {
            Iterator<ResolveInfo> it = this.f8250a.c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
            while (it.hasNext()) {
                ProviderInfo providerInfoA = this.f8250a.a(it.next());
                if (f(providerInfoA)) {
                    return providerInfoA;
                }
            }
            return null;
        }

        public e.c c(@NonNull Context context) {
            return a(context, h(context));
        }

        r5.e h(@NonNull Context context) {
            PackageManager packageManager = context.getPackageManager();
            u5.h.h(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo providerInfoG = g(packageManager);
            if (providerInfoG == null) {
                return null;
            }
            try {
                return d(providerInfoG, packageManager);
            } catch (PackageManager.NameNotFoundException e11) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e11);
                return null;
            }
        }
    }

    public static class b {
        public ProviderInfo a(@NonNull ResolveInfo resolveInfo) {
            throw null;
        }

        @NonNull
        public Signature[] b(@NonNull PackageManager packageManager, @NonNull String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        @NonNull
        public List<ResolveInfo> c(@NonNull PackageManager packageManager, @NonNull Intent intent, int i11) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$c, reason: collision with other inner class name */
    public static class C0165c extends b {
        @Override // androidx.emoji2.text.c.b
        public ProviderInfo a(@NonNull ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.c.b
        @NonNull
        public List<ResolveInfo> c(@NonNull PackageManager packageManager, @NonNull Intent intent, int i11) {
            return packageManager.queryIntentContentProviders(intent, i11);
        }
    }

    public static class d extends C0165c {
        @Override // androidx.emoji2.text.c.b
        @NonNull
        public Signature[] b(@NonNull PackageManager packageManager, @NonNull String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    public static j a(@NonNull Context context) {
        return (j) new a(null).c(context);
    }
}
