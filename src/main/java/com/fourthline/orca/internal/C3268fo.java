package com.fourthline.orca.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.fo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3268fo implements InterfaceC3997wo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ts f31805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wn0.a f31806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f31807c;

    public C3268fo(Ts resultRepository, wn0.a finishOrcaActivity) {
        p013kotlin.jvm.internal.s.k(resultRepository, "resultRepository");
        p013kotlin.jvm.internal.s.k(finishOrcaActivity, "finishOrcaActivity");
        this.f31805a = resultRepository;
        this.f31806b = finishOrcaActivity;
        this.f31807c = new ArrayList();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3997wo
    public void a(Object obj) throws Exception {
        List list = this.f31807c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z6.b.a((AutoCloseable) it.next());
        }
        list.clear();
        this.f31806b.invoke();
        this.f31805a.a(obj);
        AbstractC3794s0.b();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3997wo
    public void a(AutoCloseable objectToClose) {
        p013kotlin.jvm.internal.s.k(objectToClose, "objectToClose");
        this.f31807c.add(objectToClose);
    }
}
