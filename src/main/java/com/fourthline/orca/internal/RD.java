package com.fourthline.orca.internal;

import android.content.Context;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class RD implements Fp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f27612b;

    public RD(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        this.f27611a = context;
        this.f27612b = p013kotlin.collections.v.e("android.permission.CAMERA");
    }

    @Override // com.fourthline.orca.internal.Fp
    public boolean a() {
        List list = this.f27612b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (androidx.core.content.b.checkSelfPermission(this.f27611a, (String) it.next()) != 0) {
                return false;
            }
        }
        return true;
    }
}
