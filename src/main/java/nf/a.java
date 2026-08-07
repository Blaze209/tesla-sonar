package nf;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u0004\u0018\u00010\t*\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lnf/a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/browser/customtabs/a;", "b", "(Landroid/content/Context;)Landroidx/browser/customtabs/a;", "", "attribute", "a", "(Landroid/content/Context;I)Ljava/lang/Integer;", "Landroid/net/Uri;", "uri", "", "c", "(Landroid/content/Context;Landroid/net/Uri;)Z", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f94865a = new a();

    private a() {
    }

    private final Integer a(Context context, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(gf.i.f68834a, new int[]{i11});
        s.j(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(0, -1));
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        typedArrayObtainStyledAttributes.recycle();
        return numValueOf;
    }

    private final androidx.browser.customtabs.a b(Context context) {
        Integer numA = a(context, gf.b.f68795d);
        Integer numA2 = a(context, gf.b.f68794c);
        Integer numA3 = a(context, gf.b.f68792a);
        Integer numA4 = a(context, gf.b.f68793b);
        androidx.browser.customtabs.a.C0064a c0064a = new androidx.browser.customtabs.a.C0064a();
        if (numA != null) {
            c0064a.e(numA.intValue());
        }
        if (numA2 != null) {
            c0064a.d(numA2.intValue());
        }
        if (numA3 != null) {
            c0064a.b(numA3.intValue());
        }
        if (numA4 != null) {
            c0064a.c(numA4.intValue());
        }
        androidx.browser.customtabs.a aVarA = c0064a.a();
        s.j(aVarA, "build(...)");
        return aVarA;
    }

    public final boolean c(Context context, Uri uri) {
        s.k(context, "context");
        s.k(uri, "uri");
        try {
            new androidx.browser.customtabs.d.C0067d().k(true).e(b(context)).b().a(context, uri);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }
}
