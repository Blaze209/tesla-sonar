package yh0;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import java.util.Locale;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a9\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\f\u001a3\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\b\u0001\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroid/content/Context;", "", "attrColor", "Landroid/util/TypedValue;", "typedValue", "", "resolveRefs", "c", "(Landroid/content/Context;ILandroid/util/TypedValue;Z)I", "attrBool", "defaultValue", "a", "(Landroid/content/Context;ILandroid/util/TypedValue;ZZ)Z", "attrImage", "e", "(Landroid/content/Context;ILandroid/util/TypedValue;Z)Ljava/lang/Integer;", "", "resourceName", "Lyh0/t;", "resourceType", "g", "(Landroid/content/Context;Ljava/lang/String;Lyh0/t;)Ljava/lang/Integer;", "shared_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class s {
    public static final boolean a(Context context, int i11, TypedValue typedValue, boolean z11, boolean z12) {
        p013kotlin.jvm.internal.s.k(context, "<this>");
        p013kotlin.jvm.internal.s.k(typedValue, "typedValue");
        if (context.getTheme().resolveAttribute(i11, typedValue, z11) && typedValue.type == 18) {
            return typedValue.data != 0;
        }
        return z12;
    }

    public static /* synthetic */ boolean b(Context context, int i11, TypedValue typedValue, boolean z11, boolean z12, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i12 & 4) != 0) {
            z11 = true;
        }
        if ((i12 & 8) != 0) {
            z12 = false;
        }
        return a(context, i11, typedValue, z11, z12);
    }

    public static final int c(Context context, int i11, TypedValue typedValue, boolean z11) {
        p013kotlin.jvm.internal.s.k(context, "<this>");
        p013kotlin.jvm.internal.s.k(typedValue, "typedValue");
        context.getTheme().resolveAttribute(i11, typedValue, z11);
        return typedValue.data;
    }

    public static /* synthetic */ int d(Context context, int i11, TypedValue typedValue, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i12 & 4) != 0) {
            z11 = true;
        }
        return c(context, i11, typedValue, z11);
    }

    public static final Integer e(Context context, int i11, TypedValue typedValue, boolean z11) {
        p013kotlin.jvm.internal.s.k(context, "<this>");
        p013kotlin.jvm.internal.s.k(typedValue, "typedValue");
        context.getTheme().resolveAttribute(i11, typedValue, z11);
        if (typedValue.type == 0) {
            return null;
        }
        return Integer.valueOf(typedValue.resourceId);
    }

    public static /* synthetic */ Integer f(Context context, int i11, TypedValue typedValue, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i12 & 4) != 0) {
            z11 = true;
        }
        return e(context, i11, typedValue, z11);
    }

    public static final Integer g(Context context, String resourceName, t resourceType) {
        p013kotlin.jvm.internal.s.k(context, "<this>");
        p013kotlin.jvm.internal.s.k(resourceName, "resourceName");
        p013kotlin.jvm.internal.s.k(resourceType, "resourceType");
        String strB = h.b(resourceName);
        String resourcePackageName = context.getResources().getResourcePackageName(m.f125544j);
        int identifier = context.getResources().getIdentifier(strB, resourceType.name(), resourcePackageName);
        if (identifier <= 0) {
            Resources resources = context.getResources();
            String lowerCase = resourceType.name().toLowerCase(Locale.ROOT);
            p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
            identifier = resources.getIdentifier(strB, lowerCase, resourcePackageName);
        }
        if (identifier > 0) {
            return Integer.valueOf(identifier);
        }
        return null;
    }
}
