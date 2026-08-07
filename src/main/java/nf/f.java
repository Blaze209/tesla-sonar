package nf;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\nJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lnf/f;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/net/Uri;", "uri", "", "b", "(Landroid/content/Context;Landroid/net/Uri;)Z", "e", DateTokenConverter.CONVERTER_KEY, "c", "", ImagesContract.URL, "Ljn0/h0;", "a", "(Landroid/content/Context;Ljava/lang/String;)V", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f {
    private final boolean b(Context context, Uri uri) {
        if (Build.VERSION.SDK_INT < 30) {
            return d(context, uri);
        }
        if (e(context, uri)) {
            return true;
        }
        return d(context, uri);
    }

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
            String name = f.class.getName();
            s.h(name);
            String strU1 = t.u1(t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU1.length() != 0) {
                name = t.W0(strU1, "Kt");
            }
            companion.a().b(aVar, "CO." + name, "Successfully opened pdf in browser", null);
            return true;
        } catch (ActivityNotFoundException e11) {
            me.a aVar2 = me.a.DEBUG;
            me.b.Companion companion2 = me.b.INSTANCE;
            if (!companion2.a().a(aVar2)) {
                return false;
            }
            String name2 = f.class.getName();
            s.h(name2);
            String strU2 = t.u1(t.y1(name2, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU2.length() != 0) {
                name2 = t.W0(strU2, "Kt");
            }
            companion2.a().b(aVar2, "CO." + name2, "Couldn't open pdf in browser", e11);
            return false;
        }
    }

    private final boolean d(Context context, Uri uri) {
        boolean zC = a.f94865a.c(context, uri);
        if (zC) {
            me.a aVar = me.a.DEBUG;
            me.b.Companion companion = me.b.INSTANCE;
            if (companion.a().a(aVar)) {
                String name = f.class.getName();
                s.h(name);
                String strU1 = t.u1(t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                if (strU1.length() != 0) {
                    name = t.W0(strU1, "Kt");
                }
                companion.a().b(aVar, "CO." + name, "Successfully opened pdf in custom tab", null);
                return zC;
            }
        } else {
            me.a aVar2 = me.a.DEBUG;
            me.b.Companion companion2 = me.b.INSTANCE;
            if (companion2.a().a(aVar2)) {
                String name2 = f.class.getName();
                s.h(name2);
                String strU2 = t.u1(t.y1(name2, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                if (strU2.length() != 0) {
                    name2 = t.W0(strU2, "Kt");
                }
                companion2.a().b(aVar2, "CO." + name2, "Couldn't open pdf in custom tab", null);
            }
        }
        return zC;
    }

    private final boolean e(Context context, Uri uri) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setDataAndType(uri, "application/pdf");
        try {
            context.startActivity(intent);
            me.a aVar = me.a.DEBUG;
            me.b.Companion companion = me.b.INSTANCE;
            if (!companion.a().a(aVar)) {
                return true;
            }
            String name = f.class.getName();
            s.h(name);
            String strU1 = t.u1(t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU1.length() != 0) {
                name = t.W0(strU1, "Kt");
            }
            companion.a().b(aVar, "CO." + name, "Successfully opened pdf in external app", null);
            return true;
        } catch (ActivityNotFoundException e11) {
            me.a aVar2 = me.a.DEBUG;
            me.b.Companion companion2 = me.b.INSTANCE;
            if (!companion2.a().a(aVar2)) {
                return false;
            }
            String name2 = f.class.getName();
            s.h(name2);
            String strU2 = t.u1(t.y1(name2, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU2.length() != 0) {
                name2 = t.W0(strU2, "Kt");
            }
            companion2.a().b(aVar2, "CO." + name2, "Couldn't open pdf in external app", e11);
            return false;
        }
    }

    public final void a(Context context, String url) {
        s.k(context, "context");
        s.k(url, "url");
        Uri uri = Uri.parse(url);
        s.h(uri);
        if (b(context, uri) || c(context, uri)) {
            return;
        }
        me.a aVar = me.a.ERROR;
        me.b.Companion companion = me.b.INSTANCE;
        if (companion.a().a(aVar)) {
            String name = f.class.getName();
            s.h(name);
            String strU1 = t.u1(t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU1.length() != 0) {
                name = t.W0(strU1, "Kt");
            }
            me.b bVarA = companion.a();
            bVarA.b(aVar, "CO." + name, "Couldn't open pdf with url: " + uri, null);
        }
        throw new IllegalStateException(("Couldn't open pdf with url: " + uri).toString());
    }
}
