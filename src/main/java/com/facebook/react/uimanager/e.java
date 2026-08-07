package com.facebook.react.uimanager;

import android.annotation.TargetApi;
import android.graphics.BlendMode;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\tJ!\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\tJ9\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001b\u0010\tJ!\u0010\u001c\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001c\u0010\tJ!\u0010\u001d\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001d\u0010\tJ!\u0010\u001e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001e\u0010\tJ!\u0010\u001f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001f\u0010\tJ!\u0010 \u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b \u0010\tJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b!\u0010\"J\u001b\u0010%\u001a\u0004\u0018\u00010\u00062\b\u0010$\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0004\b%\u0010&J\u001b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010$\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0004\b(\u0010)J\u0019\u0010+\u001a\u00020*2\b\u0010$\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b-\u0010\u001aJ\u0017\u0010.\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b.\u0010\u001aJ\u0017\u0010/\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b/\u0010\u001aJ\u0017\u00100\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b0\u0010\u001aJ\u0017\u00101\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b1\u0010\u001aJ\u0017\u00102\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b2\u0010\u001aJ\u0017\u00103\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b3\u0010\u001aJ#\u00105\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00182\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b5\u00106¨\u00067"}, d2 = {"Lcom/facebook/react/uimanager/e;", "", "<init>", "()V", "", "sigma", "Landroid/graphics/RenderEffect;", "chainedEffects", "a", "(FLandroid/graphics/RenderEffect;)Landroid/graphics/RenderEffect;", "amount", "c", "o", "offsetX", "offsetY", "blurRadius", "", "color", "g", "(FFFILandroid/graphics/RenderEffect;)Landroid/graphics/RenderEffect;", "Lcom/facebook/react/bridge/ReadableMap;", "filterValues", "u", "(Lcom/facebook/react/bridge/ReadableMap;Landroid/graphics/RenderEffect;)Landroid/graphics/RenderEffect;", "Landroid/graphics/ColorMatrix;", "n", "(F)Landroid/graphics/ColorMatrix;", "f", IntegerTokenConverter.CONVERTER_KEY, "s", "q", "k", "m", "x", "(F)F", "Lcom/facebook/react/bridge/ReadableArray;", "filters", "w", "(Lcom/facebook/react/bridge/ReadableArray;)Landroid/graphics/RenderEffect;", "Landroid/graphics/ColorMatrixColorFilter;", "v", "(Lcom/facebook/react/bridge/ReadableArray;)Landroid/graphics/ColorMatrixColorFilter;", "", "t", "(Lcom/facebook/react/bridge/ReadableArray;)Z", "b", "e", "h", "r", "p", "j", "l", "colorMatrix", DateTokenConverter.CONVERTER_KEY, "(Landroid/graphics/ColorMatrix;Landroid/graphics/RenderEffect;)Landroid/graphics/RenderEffect;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@TargetApi(31)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f23134a = new e();

    private e() {
    }

    private final ColorMatrix b(float amount) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setScale(amount, amount, amount, 1.0f);
        return colorMatrix;
    }

    private final RenderEffect d(ColorMatrix colorMatrix, RenderEffect chainedEffects) {
        if (chainedEffects == null) {
            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
            p013kotlin.jvm.internal.s.h(renderEffectCreateColorFilterEffect);
            return renderEffectCreateColorFilterEffect;
        }
        RenderEffect renderEffectCreateColorFilterEffect2 = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix), chainedEffects);
        p013kotlin.jvm.internal.s.h(renderEffectCreateColorFilterEffect2);
        return renderEffectCreateColorFilterEffect2;
    }

    private final ColorMatrix e(float amount) {
        float f11 = 255 * ((-(amount / 2.0f)) + 0.5f);
        return new ColorMatrix(new float[]{amount, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f11, BitmapDescriptorFactory.HUE_RED, amount, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f11, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, amount, BitmapDescriptorFactory.HUE_RED, f11, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED});
    }

    private final ColorMatrix h(float amount) {
        float f11 = 1 - amount;
        float f12 = 0.7152f - (f11 * 0.7152f);
        float f13 = 0.0722f - (f11 * 0.0722f);
        float f14 = 0.2126f - (f11 * 0.2126f);
        return new ColorMatrix(new float[]{(0.7874f * f11) + 0.2126f, f12, f13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f14, (0.2848f * f11) + 0.7152f, f13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f14, f12, (f11 * 0.9278f) + 0.0722f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED});
    }

    private final ColorMatrix j(float amount) {
        double radians = Math.toRadians(amount);
        float fCos = (float) Math.cos(radians);
        float fSin = (float) Math.sin(radians);
        float f11 = 0.715f - (fCos * 0.715f);
        float f12 = fSin * 0.715f;
        float f13 = 0.072f - (fCos * 0.072f);
        float f14 = 0.213f - (fCos * 0.213f);
        return new ColorMatrix(new float[]{((fCos * 0.787f) + 0.213f) - (fSin * 0.213f), f11 - f12, (fSin * 0.928f) + f13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (0.143f * fSin) + f14, (0.285f * fCos) + 0.715f + (0.14f * fSin), f13 - (0.283f * fSin), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f14 - (0.787f * fSin), f11 + f12, (fCos * 0.928f) + 0.072f + (fSin * 0.072f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED});
    }

    private final ColorMatrix l(float amount) {
        float f11 = 1 - (2 * amount);
        float f12 = amount * 255;
        return new ColorMatrix(new float[]{f11, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f12, BitmapDescriptorFactory.HUE_RED, f11, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f12, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f11, BitmapDescriptorFactory.HUE_RED, f12, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED});
    }

    private final ColorMatrix p(float amount) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(amount);
        return colorMatrix;
    }

    private final ColorMatrix r(float amount) {
        float f11 = 1 - amount;
        return new ColorMatrix(new float[]{(0.607f * f11) + 0.393f, 0.769f - (f11 * 0.769f), 0.189f - (f11 * 0.189f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.349f - (f11 * 0.349f), (0.314f * f11) + 0.686f, 0.168f - (f11 * 0.168f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.272f - (f11 * 0.272f), 0.534f - (f11 * 0.534f), (f11 * 0.869f) + 0.131f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED});
    }

    public static final boolean t(ReadableArray filters) {
        if (filters == null || filters.size() == 0) {
            return false;
        }
        int size = filters.size();
        for (int i11 = 0; i11 < size; i11++) {
            ReadableMap map = filters.getMap(i11);
            p013kotlin.jvm.internal.s.h(map);
            String key = map.getEntryIterator().next().getKey();
            if (p013kotlin.jvm.internal.s.f(key, "blur") || p013kotlin.jvm.internal.s.f(key, "dropShadow")) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final ColorMatrixColorFilter v(ReadableArray filters) {
        ColorMatrix colorMatrixP;
        if (filters == null) {
            return null;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        int size = filters.size();
        for (int i11 = 0; i11 < size; i11++) {
            ReadableMap map = filters.getMap(i11);
            if (map == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Map.Entry<String, Object> next = map.getEntryIterator().next();
            String key = next.getKey();
            Object value = next.getValue();
            p013kotlin.jvm.internal.s.i(value, "null cannot be cast to non-null type kotlin.Double");
            float fDoubleValue = (float) ((Double) value).doubleValue();
            switch (key.hashCode()) {
                case -2114203985:
                    if (!key.equals("saturate")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixP = f23134a.p(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixP);
                    break;
                    break;
                case -1267206133:
                    if (!key.equals("opacity")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixP = f23134a.n(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixP);
                    break;
                    break;
                case -1183703082:
                    if (!key.equals("invert")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixP = f23134a.l(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixP);
                    break;
                    break;
                case -905411385:
                    if (!key.equals("grayscale")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixP = f23134a.h(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixP);
                    break;
                    break;
                case -566947070:
                    if (!key.equals("contrast")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixP = f23134a.e(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixP);
                    break;
                    break;
                case 109324790:
                    if (!key.equals("sepia")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixP = f23134a.r(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixP);
                    break;
                    break;
                case 648162385:
                    if (!key.equals("brightness")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixP = f23134a.b(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixP);
                    break;
                    break;
                case 650888307:
                    if (!key.equals("hueRotate")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixP = f23134a.j(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixP);
                    break;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid color matrix filter: " + key);
            }
        }
        return new ColorMatrixColorFilter(colorMatrix);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final RenderEffect w(ReadableArray filters) {
        RenderEffect renderEffectQ = null;
        if (filters == null) {
            return null;
        }
        int size = filters.size();
        for (int i11 = 0; i11 < size; i11++) {
            ReadableMap map = filters.getMap(i11);
            if (map == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Map.Entry<String, Object> next = map.getEntryIterator().next();
            String key = next.getKey();
            switch (key.hashCode()) {
                case -2114203985:
                    if (!key.equals("saturate")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    e eVar = f23134a;
                    Object value = next.getValue();
                    p013kotlin.jvm.internal.s.i(value, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectQ = eVar.q((float) ((Double) value).doubleValue(), renderEffectQ);
                    break;
                    break;
                case -1267206133:
                    if (!key.equals("opacity")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    e eVar2 = f23134a;
                    Object value2 = next.getValue();
                    p013kotlin.jvm.internal.s.i(value2, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectQ = eVar2.o((float) ((Double) value2).doubleValue(), renderEffectQ);
                    break;
                    break;
                case -1183703082:
                    if (!key.equals("invert")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    e eVar3 = f23134a;
                    Object value3 = next.getValue();
                    p013kotlin.jvm.internal.s.i(value3, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectQ = eVar3.m((float) ((Double) value3).doubleValue(), renderEffectQ);
                    break;
                    break;
                case -905411385:
                    if (!key.equals("grayscale")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    e eVar4 = f23134a;
                    Object value4 = next.getValue();
                    p013kotlin.jvm.internal.s.i(value4, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectQ = eVar4.i((float) ((Double) value4).doubleValue(), renderEffectQ);
                    break;
                    break;
                case -566947070:
                    if (!key.equals("contrast")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    e eVar5 = f23134a;
                    Object value5 = next.getValue();
                    p013kotlin.jvm.internal.s.i(value5, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectQ = eVar5.f((float) ((Double) value5).doubleValue(), renderEffectQ);
                    break;
                    break;
                case 3027047:
                    if (!key.equals("blur")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    e eVar6 = f23134a;
                    Object value6 = next.getValue();
                    p013kotlin.jvm.internal.s.i(value6, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectQ = eVar6.a((float) ((Double) value6).doubleValue(), renderEffectQ);
                    break;
                    break;
                case 109324790:
                    if (!key.equals("sepia")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    e eVar7 = f23134a;
                    Object value7 = next.getValue();
                    p013kotlin.jvm.internal.s.i(value7, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectQ = eVar7.s((float) ((Double) value7).doubleValue(), renderEffectQ);
                    break;
                    break;
                case 648162385:
                    if (!key.equals("brightness")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    e eVar8 = f23134a;
                    Object value8 = next.getValue();
                    p013kotlin.jvm.internal.s.i(value8, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectQ = eVar8.c((float) ((Double) value8).doubleValue(), renderEffectQ);
                    break;
                    break;
                case 650888307:
                    if (!key.equals("hueRotate")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    e eVar9 = f23134a;
                    Object value9 = next.getValue();
                    p013kotlin.jvm.internal.s.i(value9, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectQ = eVar9.k((float) ((Double) value9).doubleValue(), renderEffectQ);
                    break;
                    break;
                case 906978543:
                    if (!key.equals("dropShadow")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    e eVar10 = f23134a;
                    Object value10 = next.getValue();
                    p013kotlin.jvm.internal.s.i(value10, "null cannot be cast to non-null type com.facebook.react.bridge.ReadableMap");
                    renderEffectQ = eVar10.u((ReadableMap) value10, renderEffectQ);
                    break;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid filter name: " + key);
            }
        }
        return renderEffectQ;
    }

    public final RenderEffect a(float sigma, RenderEffect chainedEffects) {
        if (sigma <= 0.5d) {
            return null;
        }
        float fX = x(sigma);
        return chainedEffects == null ? RenderEffect.createBlurEffect(fX, fX, Shader.TileMode.DECAL) : RenderEffect.createBlurEffect(fX, fX, chainedEffects, Shader.TileMode.DECAL);
    }

    public final RenderEffect c(float amount, RenderEffect chainedEffects) {
        return d(b(amount), chainedEffects);
    }

    public final RenderEffect f(float amount, RenderEffect chainedEffects) {
        return d(e(amount), chainedEffects);
    }

    public final RenderEffect g(float offsetX, float offsetY, float blurRadius, int color, RenderEffect chainedEffects) {
        RenderEffect renderEffectCreateOffsetEffect;
        RenderEffect renderEffectCreateOffsetEffect2;
        if (chainedEffects == null) {
            renderEffectCreateOffsetEffect2 = RenderEffect.createOffsetEffect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            renderEffectCreateOffsetEffect = RenderEffect.createOffsetEffect(offsetX, offsetY);
        } else {
            RenderEffect renderEffectCreateOffsetEffect3 = RenderEffect.createOffsetEffect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, chainedEffects);
            renderEffectCreateOffsetEffect = RenderEffect.createOffsetEffect(offsetX, offsetY, chainedEffects);
            renderEffectCreateOffsetEffect2 = renderEffectCreateOffsetEffect3;
        }
        k3.e1.a();
        RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(k3.d1.a(color, BlendMode.SRC_IN), renderEffectCreateOffsetEffect);
        p013kotlin.jvm.internal.s.j(renderEffectCreateColorFilterEffect, "createColorFilterEffect(...)");
        RenderEffect renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(blurRadius, blurRadius, renderEffectCreateColorFilterEffect, Shader.TileMode.DECAL);
        p013kotlin.jvm.internal.s.j(renderEffectCreateBlurEffect, "createBlurEffect(...)");
        RenderEffect renderEffectCreateBlendModeEffect = RenderEffect.createBlendModeEffect(renderEffectCreateBlurEffect, renderEffectCreateOffsetEffect2, BlendMode.SRC_OVER);
        p013kotlin.jvm.internal.s.j(renderEffectCreateBlendModeEffect, "createBlendModeEffect(...)");
        return renderEffectCreateBlendModeEffect;
    }

    public final RenderEffect i(float amount, RenderEffect chainedEffects) {
        return d(h(amount), chainedEffects);
    }

    public final RenderEffect k(float amount, RenderEffect chainedEffects) {
        return d(j(amount), chainedEffects);
    }

    public final RenderEffect m(float amount, RenderEffect chainedEffects) {
        return d(l(amount), chainedEffects);
    }

    public final ColorMatrix n(float amount) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setScale(1.0f, 1.0f, 1.0f, amount);
        return colorMatrix;
    }

    public final RenderEffect o(float amount, RenderEffect chainedEffects) {
        return d(n(amount), chainedEffects);
    }

    public final RenderEffect q(float amount, RenderEffect chainedEffects) {
        return d(p(amount), chainedEffects);
    }

    public final RenderEffect s(float amount, RenderEffect chainedEffects) {
        return d(r(amount), chainedEffects);
    }

    public final RenderEffect u(ReadableMap filterValues, RenderEffect chainedEffects) {
        p013kotlin.jvm.internal.s.k(filterValues, "filterValues");
        w wVar = w.f23413a;
        return g(wVar.a(filterValues.getDouble("offsetX")), wVar.a(filterValues.getDouble("offsetY")), filterValues.hasKey("standardDeviation") ? x((float) filterValues.getDouble("standardDeviation")) : BitmapDescriptorFactory.HUE_RED, filterValues.hasKey("color") ? filterValues.getInt("color") : -16777216, chainedEffects);
    }

    public final float x(float sigma) {
        float fH = w.h(sigma);
        return fH > 0.5f ? (fH - 0.5f) / 0.57735f : BitmapDescriptorFactory.HUE_RED;
    }
}
