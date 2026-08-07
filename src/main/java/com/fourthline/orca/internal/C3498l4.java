package com.fourthline.orca.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import com.fourthline.core.DeviceMetadata;

/* JADX INFO: renamed from: com.fourthline.orca.internal.l4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3498l4 {
    public final EA a(wn0.a resourcesFactory) {
        p013kotlin.jvm.internal.s.k(resourcesFactory, "resourcesFactory");
        return new C3782rp(resourcesFactory);
    }

    public final KD b(wn0.a resourcesFactory) {
        p013kotlin.jvm.internal.s.k(resourcesFactory, "resourcesFactory");
        return new LD(resourcesFactory);
    }

    public final C3954vo a(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        C3954vo.a aVar = C3954vo.f36275b;
        AssetManager assets = context.getAssets();
        p013kotlin.jvm.internal.s.j(assets, "getAssets(...)");
        return aVar.a(assets);
    }

    public final C3497l3 a(ContentResolver contentResolver) {
        p013kotlin.jvm.internal.s.k(contentResolver, "contentResolver");
        return new C3497l3(contentResolver);
    }

    public final C3944vf a(Context context, ContentResolver contentResolver) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(contentResolver, "contentResolver");
        return new C3944vf(context, contentResolver);
    }

    public final DeviceMetadata a() {
        return new DeviceMetadata(null, null, null, null, null, null, null, false, 255, null);
    }
}
