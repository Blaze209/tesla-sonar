package com.stripe.android.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0011\u001a\u00020\u00102\n\u0010\r\u001a\u00060\u000bR\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u001c\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001b\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001d\u0010\u0017R\u0017\u0010\u001f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017¨\u0006 "}, d2 = {"Lcom/stripe/android/view/s2;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "idRes", "Landroid/util/TypedValue;", "g", "(I)Landroid/util/TypedValue;", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", "attributeResource", "iconResourceId", "Landroid/graphics/drawable/Drawable;", "f", "(Landroid/content/res/Resources$Theme;II)Landroid/graphics/drawable/Drawable;", "a", "Landroid/content/Context;", "b", "I", "()I", "colorAccent", "c", "colorControlNormal", DateTokenConverter.CONVERTER_KEY, "textColorPrimary", "e", "textColorSecondary", "colorPrimary", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class s2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f55166h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int colorAccent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int colorControlNormal;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int textColorPrimary;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int textColorSecondary;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int colorPrimary;

    /* JADX INFO: renamed from: com.stripe.android.view.s2$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/stripe/android/view/s2$a;", "", "<init>", "()V", "", "color", "", "b", "(I)Z", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(int color) {
            return (((((double) Color.red(color)) * 0.299d) + (((double) Color.green(color)) * 0.587d)) + (((double) Color.blue(color)) * 0.114d)) / ((double) 255) <= 0.5d;
        }

        public final boolean b(int color) {
            return Color.alpha(color) < 16;
        }

        private Companion() {
        }
    }

    public s2(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        this.context = context;
        this.colorAccent = g(R.attr.colorAccent).data;
        this.colorControlNormal = g(R.attr.colorControlNormal).data;
        this.textColorPrimary = g(R.attr.textColorPrimary).data;
        this.textColorSecondary = g(R.attr.textColorSecondary).data;
        this.colorPrimary = g(R.attr.colorPrimary).data;
    }

    private final TypedValue g(int idRes) {
        TypedValue typedValue = new TypedValue();
        this.context.getTheme().resolveAttribute(idRes, typedValue, true);
        return typedValue;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getColorAccent() {
        return this.colorAccent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getColorControlNormal() {
        return this.colorControlNormal;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getColorPrimary() {
        return this.colorPrimary;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getTextColorPrimary() {
        return this.textColorPrimary;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getTextColorSecondary() {
        return this.textColorSecondary;
    }

    public final Drawable f(Resources.Theme theme, int attributeResource, int iconResourceId) {
        p013kotlin.jvm.internal.s.k(theme, "theme");
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(attributeResource, typedValue, true);
        int i11 = typedValue.data;
        Drawable drawable = androidx.core.content.b.getDrawable(this.context, iconResourceId);
        p013kotlin.jvm.internal.s.h(drawable);
        Drawable drawableR = l5.a.r(drawable);
        p013kotlin.jvm.internal.s.j(drawableR, "wrap(...)");
        l5.a.n(drawableR.mutate(), i11);
        return drawableR;
    }
}
