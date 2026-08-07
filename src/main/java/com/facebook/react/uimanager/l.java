package com.facebook.react.uimanager;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/uimanager/l;", "", "<init>", "()V", "Lcom/facebook/yoga/h;", "direction", "", "a", "(Lcom/facebook/yoga/h;)I", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f23331a = new l();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23332a;

        static {
            int[] iArr = new int[com.facebook.yoga.h.values().length];
            try {
                iArr[com.facebook.yoga.h.LTR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.facebook.yoga.h.RTL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f23332a = iArr;
        }
    }

    private l() {
    }

    public static final int a(com.facebook.yoga.h direction) {
        p013kotlin.jvm.internal.s.k(direction, "direction");
        int i11 = a.f23332a[direction.ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? 2 : 1;
        }
        return 0;
    }
}
