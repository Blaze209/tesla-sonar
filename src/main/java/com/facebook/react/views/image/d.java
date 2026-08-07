package com.facebook.react.views.image;

import android.graphics.Shader;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ll.s;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/views/image/d;", "", "<init>", "()V", "", "resizeModeValue", "Lll/s;", "c", "(Ljava/lang/String;)Lll/s;", "Landroid/graphics/Shader$TileMode;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Landroid/graphics/Shader$TileMode;", "b", "()Lll/s;", "a", "()Landroid/graphics/Shader$TileMode;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f23459a = new d();

    private d() {
    }

    public static final Shader.TileMode a() {
        return Shader.TileMode.CLAMP;
    }

    public static final s b() {
        s CENTER_CROP = s.f90221i;
        p013kotlin.jvm.internal.s.j(CENTER_CROP, "CENTER_CROP");
        return CENTER_CROP;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final s c(String resizeModeValue) {
        if (resizeModeValue != null) {
            switch (resizeModeValue.hashCode()) {
                case -1881872635:
                    if (resizeModeValue.equals("stretch")) {
                        s FIT_XY = s.f90213a;
                        p013kotlin.jvm.internal.s.j(FIT_XY, "FIT_XY");
                        return FIT_XY;
                    }
                    break;
                case -1364013995:
                    if (resizeModeValue.equals("center")) {
                        s CENTER_INSIDE = s.f90220h;
                        p013kotlin.jvm.internal.s.j(CENTER_INSIDE, "CENTER_INSIDE");
                        return CENTER_INSIDE;
                    }
                    break;
                case -934531685:
                    if (resizeModeValue.equals("repeat")) {
                        return i.INSTANCE.a();
                    }
                    break;
                case 3387192:
                    if (resizeModeValue.equals("none")) {
                        return i.INSTANCE.a();
                    }
                    break;
                case 94852023:
                    if (resizeModeValue.equals("cover")) {
                        s CENTER_CROP = s.f90221i;
                        p013kotlin.jvm.internal.s.j(CENTER_CROP, "CENTER_CROP");
                        return CENTER_CROP;
                    }
                    break;
                case 951526612:
                    if (resizeModeValue.equals("contain")) {
                        s FIT_CENTER = s.f90217e;
                        p013kotlin.jvm.internal.s.j(FIT_CENTER, "FIT_CENTER");
                        return FIT_CENTER;
                    }
                    break;
            }
        }
        if (resizeModeValue != null) {
            qk.a.I("ReactNative", "Invalid resize mode: '" + resizeModeValue + "'");
        }
        return b();
    }

    public static final Shader.TileMode d(String resizeModeValue) {
        if (p013kotlin.jvm.internal.s.f("contain", resizeModeValue) || p013kotlin.jvm.internal.s.f("cover", resizeModeValue) || p013kotlin.jvm.internal.s.f("stretch", resizeModeValue) || p013kotlin.jvm.internal.s.f("center", resizeModeValue) || p013kotlin.jvm.internal.s.f("none", resizeModeValue)) {
            return Shader.TileMode.CLAMP;
        }
        if (p013kotlin.jvm.internal.s.f("repeat", resizeModeValue)) {
            return Shader.TileMode.REPEAT;
        }
        if (resizeModeValue != null) {
            qk.a.I("ReactNative", "Invalid resize mode: '" + resizeModeValue + "'");
        }
        return a();
    }
}
