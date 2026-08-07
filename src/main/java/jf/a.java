package jf;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.core.exception.ComponentException;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ!\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\nJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0003R$\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0014\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001a¨\u0006\u001c"}, d2 = {"Ljf/a;", "Ljf/b;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/net/Uri;", "uri", "", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;Landroid/net/Uri;)Z", "g", "e", "h", "c", "", ImagesContract.URL, "Ljn0/h0;", "a", "(Landroid/content/Context;Ljava/lang/String;)V", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "f", "(Lwn0/a;)V", "b", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "onRedirectListener", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private WeakReference<wn0.a<h0>> onRedirectListener;

    private final boolean c(Context context, Uri uri) {
        try {
            Intent data = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").addFlags(268435456).setData(uri);
            s.j(data, "setData(...)");
            context.startActivity(data);
            me.a aVar = me.a.DEBUG;
            me.b.Companion companion = me.b.INSTANCE;
            if (!companion.a().a(aVar)) {
                return true;
            }
            String name = a.class.getName();
            s.h(name);
            String strU1 = t.u1(t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU1.length() != 0) {
                name = t.W0(strU1, "Kt");
            }
            companion.a().b(aVar, "CO." + name, "launchBrowser - redirect successful with browser", null);
            return true;
        } catch (ActivityNotFoundException unused) {
            me.a aVar2 = me.a.DEBUG;
            me.b.Companion companion2 = me.b.INSTANCE;
            if (!companion2.a().a(aVar2)) {
                return false;
            }
            String name2 = a.class.getName();
            s.h(name2);
            String strU2 = t.u1(t.y1(name2, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU2.length() != 0) {
                name2 = t.W0(strU2, "Kt");
            }
            companion2.a().b(aVar2, "CO." + name2, "launchBrowser - could not do redirect on browser or there's no browser", null);
            return false;
        }
    }

    private final boolean d(Context context, Uri uri) {
        return Build.VERSION.SDK_INT >= 30 ? e(context, uri) : g(context, uri);
    }

    private final boolean e(Context context, Uri uri) {
        Intent intentAddFlags = new Intent("android.intent.action.VIEW", uri).addCategory("android.intent.category.BROWSABLE").addFlags(268436480);
        s.j(intentAddFlags, "addFlags(...)");
        try {
            context.startActivity(intentAddFlags);
            me.a aVar = me.a.DEBUG;
            me.b.Companion companion = me.b.INSTANCE;
            if (!companion.a().a(aVar)) {
                return true;
            }
            String name = a.class.getName();
            s.h(name);
            String strU1 = t.u1(t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU1.length() != 0) {
                name = t.W0(strU1, "Kt");
            }
            companion.a().b(aVar, "CO." + name, "launchNativeApi30 - redirect successful with native app", null);
            return true;
        } catch (ActivityNotFoundException unused) {
            me.a aVar2 = me.a.DEBUG;
            me.b.Companion companion2 = me.b.INSTANCE;
            if (!companion2.a().a(aVar2)) {
                return false;
            }
            String name2 = a.class.getName();
            s.h(name2);
            String strU2 = t.u1(t.y1(name2, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU2.length() != 0) {
                name2 = t.W0(strU2, "Kt");
            }
            companion2.a().b(aVar2, "CO." + name2, "launchNativeApi30 - could not find native app to redirect with", null);
            return false;
        }
    }

    private final boolean g(Context context, Uri uri) {
        PackageManager packageManager = context.getPackageManager();
        Intent data = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", "", null));
        s.j(data, "setData(...)");
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(data, 0);
        s.j(listQueryIntentActivities, "queryIntentActivities(...)");
        List<ResolveInfo> list = listQueryIntentActivities;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ResolveInfo) it.next()).resolvePackageName);
        }
        Set setR1 = v.r1(arrayList);
        Intent intentAddCategory = new Intent("android.intent.action.VIEW", uri).addCategory("android.intent.category.BROWSABLE");
        s.j(intentAddCategory, "addCategory(...)");
        List<ResolveInfo> listQueryIntentActivities2 = packageManager.queryIntentActivities(intentAddCategory, 0);
        s.j(listQueryIntentActivities2, "queryIntentActivities(...)");
        List<ResolveInfo> list2 = listQueryIntentActivities2;
        ArrayList arrayList2 = new ArrayList(v.y(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ResolveInfo) it2.next()).resolvePackageName);
        }
        Set setQ1 = v.q1(arrayList2);
        setQ1.removeAll(setR1);
        if (setQ1.isEmpty()) {
            me.a aVar = me.a.DEBUG;
            me.b.Companion companion = me.b.INSTANCE;
            if (companion.a().a(aVar)) {
                String name = a.class.getName();
                s.h(name);
                String strU1 = t.u1(t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                if (strU1.length() != 0) {
                    name = t.W0(strU1, "Kt");
                }
                companion.a().b(aVar, "CO." + name, "launchNativeBeforeApi30 - could not find native app to redirect with", null);
            }
            return false;
        }
        intentAddCategory.addFlags(268435456);
        try {
            context.startActivity(intentAddCategory);
            me.a aVar2 = me.a.DEBUG;
            me.b.Companion companion2 = me.b.INSTANCE;
            if (!companion2.a().a(aVar2)) {
                return true;
            }
            String name2 = a.class.getName();
            s.h(name2);
            String strU2 = t.u1(t.y1(name2, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU2.length() != 0) {
                name2 = t.W0(strU2, "Kt");
            }
            companion2.a().b(aVar2, "CO." + name2, "launchNativeBeforeApi30 - redirect successful with native app", null);
            return true;
        } catch (ActivityNotFoundException unused) {
            me.a aVar3 = me.a.DEBUG;
            me.b.Companion companion3 = me.b.INSTANCE;
            if (companion3.a().a(aVar3)) {
                String name3 = a.class.getName();
                s.h(name3);
                String strU3 = t.u1(t.y1(name3, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                if (strU3.length() != 0) {
                    name3 = t.W0(strU3, "Kt");
                }
                companion3.a().b(aVar3, "CO." + name3, "launchNativeBeforeApi30 - could not find native app to redirect with", null);
            }
            return false;
        }
    }

    private final boolean h(Context context, Uri uri) {
        boolean zC = nf.a.f94865a.c(context, uri);
        if (zC) {
            me.a aVar = me.a.DEBUG;
            me.b.Companion companion = me.b.INSTANCE;
            if (companion.a().a(aVar)) {
                String name = a.class.getName();
                s.h(name);
                String strU1 = t.u1(t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                if (strU1.length() != 0) {
                    name = t.W0(strU1, "Kt");
                }
                companion.a().b(aVar, "CO." + name, "launchWithCustomTabs - redirect successful with custom tabs", null);
                return zC;
            }
        } else {
            me.a aVar2 = me.a.DEBUG;
            me.b.Companion companion2 = me.b.INSTANCE;
            if (companion2.a().a(aVar2)) {
                String name2 = a.class.getName();
                s.h(name2);
                String strU2 = t.u1(t.y1(name2, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                if (strU2.length() != 0) {
                    name2 = t.W0(strU2, "Kt");
                }
                companion2.a().b(aVar2, "CO." + name2, "launchWithCustomTabs - device doesn't support custom tabs or chrome is disabled", null);
            }
        }
        return zC;
    }

    @Override // jf.b
    public void a(Context context, String url) {
        wn0.a<h0> aVar;
        s.k(context, "context");
        if (url == null || url.length() == 0) {
            throw new ComponentException("Redirect URL is empty.", null, 2, null);
        }
        Uri uri = Uri.parse(url);
        s.h(uri);
        if (d(context, uri) || h(context, uri) || c(context, uri)) {
            WeakReference<wn0.a<h0>> weakReference = this.onRedirectListener;
            if (weakReference == null || (aVar = weakReference.get()) == null) {
                return;
            }
            aVar.invoke();
            return;
        }
        me.a aVar2 = me.a.ERROR;
        me.b.Companion companion = me.b.INSTANCE;
        if (companion.a().a(aVar2)) {
            String name = a.class.getName();
            s.h(name);
            String strU1 = t.u1(t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU1.length() != 0) {
                name = t.W0(strU1, "Kt");
            }
            companion.a().b(aVar2, "CO." + name, "Could not launch url", null);
        }
        throw new ComponentException("Launching redirect failed.", null, 2, null);
    }

    @Override // jf.b
    public void b() {
        WeakReference<wn0.a<h0>> weakReference = this.onRedirectListener;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.onRedirectListener = null;
    }

    @Override // jf.b
    public void f(wn0.a<h0> listener) {
        s.k(listener, "listener");
        this.onRedirectListener = new WeakReference<>(listener);
    }
}
