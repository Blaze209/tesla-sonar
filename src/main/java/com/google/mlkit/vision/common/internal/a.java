package com.google.mlkit.vision.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f45105a = new HashMap();

    /* JADX INFO: renamed from: com.google.mlkit.vision.common.internal.a$a, reason: collision with other inner class name */
    @KeepForSdk
    public static class C0706a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f45106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final yv.b f45107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f45108c;

        final int a() {
            return this.f45108c;
        }

        final yv.b b() {
            return this.f45107b;
        }

        final Class c() {
            return this.f45106a;
        }
    }

    a(Set set) {
        HashMap map = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C0706a c0706a = (C0706a) it.next();
            Class clsC = c0706a.c();
            if (!this.f45105a.containsKey(clsC) || c0706a.a() >= ((Integer) Preconditions.checkNotNull((Integer) map.get(clsC))).intValue()) {
                this.f45105a.put(clsC, c0706a.b());
                map.put(clsC, Integer.valueOf(c0706a.a()));
            }
        }
    }
}
