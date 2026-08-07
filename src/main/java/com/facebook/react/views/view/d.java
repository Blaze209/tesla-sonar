package com.facebook.react.views.view;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.w;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/facebook/react/views/view/d;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/facebook/react/bridge/ReadableMap;", "drawableDescriptionDict", "Landroid/graphics/drawable/Drawable;", "a", "(Landroid/content/Context;Lcom/facebook/react/bridge/ReadableMap;)Landroid/graphics/drawable/Drawable;", "", "attr", "", "b", "(Landroid/content/Context;Ljava/lang/String;)I", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/RippleDrawable;", "f", "(Landroid/content/Context;Lcom/facebook/react/bridge/ReadableMap;)Landroid/graphics/drawable/RippleDrawable;", "drawable", "g", "(Lcom/facebook/react/bridge/ReadableMap;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;", "c", "(Landroid/content/Context;Lcom/facebook/react/bridge/ReadableMap;)I", "e", "(Lcom/facebook/react/bridge/ReadableMap;)Landroid/graphics/drawable/Drawable;", "Landroid/util/TypedValue;", "Landroid/util/TypedValue;", "resolveOutValue", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f23867a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final TypedValue resolveOutValue = new TypedValue();

    private d() {
    }

    public static final Drawable a(Context context, ReadableMap drawableDescriptionDict) {
        s.k(context, "context");
        s.k(drawableDescriptionDict, "drawableDescriptionDict");
        String string = drawableDescriptionDict.getString("type");
        if (!s.f("ThemeAttrAndroid", string)) {
            if (s.f("RippleAndroid", string)) {
                d dVar = f23867a;
                return dVar.g(drawableDescriptionDict, dVar.f(context, drawableDescriptionDict));
            }
            throw new JSApplicationIllegalArgumentException("Invalid type for android drawable: " + string);
        }
        String string2 = drawableDescriptionDict.getString("attribute");
        if (string2 == null) {
            throw new JSApplicationIllegalArgumentException("JS description missing 'attribute' field");
        }
        d dVar2 = f23867a;
        int iB = dVar2.b(context, string2);
        if (context.getTheme().resolveAttribute(iB, resolveOutValue, true)) {
            return dVar2.g(drawableDescriptionDict, dVar2.d(context));
        }
        throw new JSApplicationIllegalArgumentException("Attribute " + string2 + " with id " + iB + " couldn't be resolved into a drawable");
    }

    @SuppressLint({"DiscouragedApi", "InternalInsetResource"})
    private final int b(Context context, String attr) {
        if (s.f("selectableItemBackground", attr)) {
            return R.attr.selectableItemBackground;
        }
        return s.f("selectableItemBackgroundBorderless", attr) ? R.attr.selectableItemBackgroundBorderless : context.getResources().getIdentifier(attr, "attr", "android");
    }

    private final int c(Context context, ReadableMap drawableDescriptionDict) {
        if (drawableDescriptionDict.hasKey("color") && !drawableDescriptionDict.isNull("color")) {
            return drawableDescriptionDict.getInt("color");
        }
        Resources.Theme theme = context.getTheme();
        TypedValue typedValue = resolveOutValue;
        if (theme.resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
            return context.getResources().getColor(typedValue.resourceId, context.getTheme());
        }
        throw new JSApplicationIllegalArgumentException("Attribute colorControlHighlight couldn't be resolved into a drawable");
    }

    private final Drawable d(Context context) {
        return context.getResources().getDrawable(resolveOutValue.resourceId, context.getTheme());
    }

    private final Drawable e(ReadableMap drawableDescriptionDict) {
        if (drawableDescriptionDict.hasKey("borderless") && !drawableDescriptionDict.isNull("borderless") && drawableDescriptionDict.getBoolean("borderless")) {
            return null;
        }
        return new ColorDrawable(-1);
    }

    private final RippleDrawable f(Context context, ReadableMap drawableDescriptionDict) {
        int iC = c(context, drawableDescriptionDict);
        return new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{iC}), null, e(drawableDescriptionDict));
    }

    private final Drawable g(ReadableMap drawableDescriptionDict, Drawable drawable) {
        if (drawableDescriptionDict.hasKey("rippleRadius") && (drawable instanceof RippleDrawable)) {
            ((RippleDrawable) drawable).setRadius((int) w.g(drawableDescriptionDict.getDouble("rippleRadius")));
        }
        return drawable;
    }
}
