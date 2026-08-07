package me0;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import gc0.u0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00060\u000bR\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ=\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001bJ=\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u001bJ=\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u001bJ=\u0010 \u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b \u0010!J=\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\"\u0010\u001bR\u001a\u0010%\u001a\u00060\u000bR\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010&\u001a\u00060\u000bR\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010$¨\u0006'"}, d2 = {"Lme0/z;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "q", "(Landroid/content/Context;)V", "Lgc0/u0$d;", "carType", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "k", "(Landroid/content/Context;Lgc0/u0$d;)Landroid/content/res/Resources$Theme;", "", "l", "(Lgc0/u0$d;)I", "attr", "Landroid/util/TypedValue;", "typedValue", "", "resolveRefs", "", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;Lgc0/u0$d;ILandroid/util/TypedValue;Z)Ljava/lang/String;", "g", "(Landroid/content/Context;Lgc0/u0$d;ILandroid/util/TypedValue;Z)I", "o", "a", "c", "", "e", "(Landroid/content/Context;Lgc0/u0$d;ILandroid/util/TypedValue;Z)F", "m", "b", "Landroid/content/res/Resources$Theme;", "defaultTheme", "cybertruckTheme", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f92041a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static Resources.Theme defaultTheme;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static Resources.Theme cybertruckTheme;

    private z() {
    }

    public static /* synthetic */ int b(z zVar, Context context, u0.d dVar, int i11, TypedValue typedValue, boolean z11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            typedValue = new TypedValue();
        }
        TypedValue typedValue2 = typedValue;
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return zVar.a(context, dVar, i11, typedValue2, z11);
    }

    public static /* synthetic */ int d(z zVar, Context context, u0.d dVar, int i11, TypedValue typedValue, boolean z11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            typedValue = new TypedValue();
        }
        TypedValue typedValue2 = typedValue;
        if ((i12 & 16) != 0) {
            z11 = true;
        }
        return zVar.c(context, dVar, i11, typedValue2, z11);
    }

    public static /* synthetic */ float f(z zVar, Context context, u0.d dVar, int i11, TypedValue typedValue, boolean z11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            typedValue = new TypedValue();
        }
        TypedValue typedValue2 = typedValue;
        if ((i12 & 16) != 0) {
            z11 = true;
        }
        return zVar.e(context, dVar, i11, typedValue2, z11);
    }

    public static /* synthetic */ int h(z zVar, Context context, u0.d dVar, int i11, TypedValue typedValue, boolean z11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            typedValue = new TypedValue();
        }
        TypedValue typedValue2 = typedValue;
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return zVar.g(context, dVar, i11, typedValue2, z11);
    }

    public static /* synthetic */ String j(z zVar, Context context, u0.d dVar, int i11, TypedValue typedValue, boolean z11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            typedValue = new TypedValue();
        }
        TypedValue typedValue2 = typedValue;
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return zVar.i(context, dVar, i11, typedValue2, z11);
    }

    private final Resources.Theme k(Context context, u0.d carType) {
        String str;
        q(context);
        if (wb0.e.k0(carType != null ? carType.getCarTypeCybertruck() : null)) {
            Resources.Theme theme = cybertruckTheme;
            if (theme != null) {
                return theme;
            }
            str = "cybertruckTheme";
        } else {
            Resources.Theme theme2 = defaultTheme;
            if (theme2 != null) {
                return theme2;
            }
            str = "defaultTheme";
        }
        p013kotlin.jvm.internal.s.B(str);
        return null;
    }

    public static /* synthetic */ int n(z zVar, Context context, u0.d dVar, int i11, TypedValue typedValue, boolean z11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            typedValue = new TypedValue();
        }
        TypedValue typedValue2 = typedValue;
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return zVar.m(context, dVar, i11, typedValue2, z11);
    }

    public static /* synthetic */ int p(z zVar, Context context, u0.d dVar, int i11, TypedValue typedValue, boolean z11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            typedValue = new TypedValue();
        }
        TypedValue typedValue2 = typedValue;
        if ((i12 & 16) != 0) {
            z11 = true;
        }
        return zVar.o(context, dVar, i11, typedValue2, z11);
    }

    private final void q(Context context) {
        if (defaultTheme == null || cybertruckTheme == null) {
            defaultTheme = context.getResources().newTheme();
            cybertruckTheme = context.getResources().newTheme();
            Resources.Theme theme = defaultTheme;
            Resources.Theme theme2 = null;
            if (theme == null) {
                p013kotlin.jvm.internal.s.B("defaultTheme");
                theme = null;
            }
            theme.applyStyle(k.f91957b, false);
            Resources.Theme theme3 = cybertruckTheme;
            if (theme3 == null) {
                p013kotlin.jvm.internal.s.B("cybertruckTheme");
            } else {
                theme2 = theme3;
            }
            theme2.applyStyle(k.f91956a, false);
        }
    }

    public final int a(Context context, u0.d carType, int attr, TypedValue typedValue, boolean resolveRefs) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(typedValue, "typedValue");
        k(context, carType).resolveAttribute(attr, typedValue, resolveRefs);
        return typedValue.data;
    }

    public final int c(Context context, u0.d carType, int attr, TypedValue typedValue, boolean resolveRefs) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(typedValue, "typedValue");
        k(context, carType).resolveAttribute(attr, typedValue, resolveRefs);
        return typedValue.data;
    }

    public final float e(Context context, u0.d carType, int attr, TypedValue typedValue, boolean resolveRefs) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(typedValue, "typedValue");
        k(context, carType).resolveAttribute(attr, typedValue, resolveRefs);
        return typedValue.getDimension(k(context, carType).getResources().getDisplayMetrics());
    }

    public final int g(Context context, u0.d carType, int attr, TypedValue typedValue, boolean resolveRefs) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(typedValue, "typedValue");
        k(context, carType).resolveAttribute(attr, typedValue, resolveRefs);
        return typedValue.data;
    }

    public final String i(Context context, u0.d carType, int attr, TypedValue typedValue, boolean resolveRefs) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(typedValue, "typedValue");
        k(context, carType).resolveAttribute(attr, typedValue, resolveRefs);
        return typedValue.string.toString();
    }

    public final int l(u0.d carType) {
        return wb0.e.k0(carType != null ? carType.getCarTypeCybertruck() : null) ? k.f91956a : k.f91957b;
    }

    public final int m(Context context, u0.d carType, int attr, TypedValue typedValue, boolean resolveRefs) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(typedValue, "typedValue");
        k(context, carType).resolveAttribute(attr, typedValue, resolveRefs);
        return typedValue.data;
    }

    public final int o(Context context, u0.d carType, int attr, TypedValue typedValue, boolean resolveRefs) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(typedValue, "typedValue");
        k(context, carType).resolveAttribute(attr, typedValue, resolveRefs);
        int i11 = typedValue.data;
        if (i11 == 0) {
            return 0;
        }
        if (i11 != 1) {
            return i11 != 2 ? 0 : 8;
        }
        return 4;
    }
}
