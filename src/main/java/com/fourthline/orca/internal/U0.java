package com.fourthline.orca.internal;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class U0 implements InterfaceC3886u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f27989a = new ArrayList();

    @Override // com.fourthline.orca.internal.InterfaceC3886u6
    public void a(Uri deepLink) {
        p013kotlin.jvm.internal.s.k(deepLink, "deepLink");
        Iterator it = this.f27989a.iterator();
        while (it.hasNext()) {
            ((InterfaceC3800s6) it.next()).a(deepLink);
        }
    }

    @Override // com.fourthline.orca.internal.InterfaceC3886u6
    public void a(InterfaceC3800s6 handler) {
        p013kotlin.jvm.internal.s.k(handler, "handler");
        this.f27989a.add(handler);
    }
}
