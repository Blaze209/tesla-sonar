package com.facebook.react.devsupport;

import android.os.Build;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\u0003¨\u0006\t"}, d2 = {"Lcom/facebook/react/devsupport/k1;", "", "<init>", "()V", "", "b", "I", "getTYPE_SYSTEM_OVERLAY$annotations", "TYPE_SYSTEM_OVERLAY", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k1 f22538a = new k1();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final int TYPE_SYSTEM_OVERLAY;

    static {
        TYPE_SYSTEM_OVERLAY = Build.VERSION.SDK_INT < 26 ? 2006 : 2038;
    }

    private k1() {
    }
}
