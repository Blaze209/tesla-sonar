package com.facebook.react.uimanager;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\n\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/facebook/react/uimanager/f;", "", "<init>", "()V", "", "f1", "f2", "", "a", "(FF)Z", "b", "(Ljava/lang/Float;Ljava/lang/Float;)Z", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f23212a = new f();

    private f() {
    }

    public static final boolean a(float f11, float f12) {
        if (Float.isNaN(f11) || Float.isNaN(f12)) {
            return Float.isNaN(f11) && Float.isNaN(f12);
        }
        return Math.abs(f12 - f11) < 1.0E-5f;
    }

    public static final boolean b(Float f11, Float f12) {
        if (f11 == null) {
            return f12 == null;
        }
        if (f12 == null) {
            return false;
        }
        return a(f11.floatValue(), f12.floatValue());
    }
}
