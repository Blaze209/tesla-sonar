package com.fourthline.orca.internal;

import android.content.Context;
import android.graphics.Bitmap;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.gs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3315gs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f32080a;

    public C3315gs(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        this.f32080a = context;
    }

    public final Bitmap a(InterfaceC3272fs file) {
        p013kotlin.jvm.internal.s.k(file, "file");
        if (!(file instanceof InterfaceC3272fs.a)) {
            if (file instanceof InterfaceC3272fs.b) {
                return ((InterfaceC3272fs.b) file).a();
            }
            throw new NoWhenBranchMatchedException();
        }
        String path = ((InterfaceC3272fs.a) file).a().getPath();
        Dp dp2 = new Dp(this.f32080a);
        p013kotlin.jvm.internal.s.h(path);
        return (Bitmap) p013kotlin.collections.v.q0(dp2.a(path));
    }
}
