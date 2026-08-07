package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class u1 implements c0.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3308b;

    public u1(int i11) {
        this.f3308b = i11;
    }

    @Override // c0.m
    @NonNull
    public List<c0.n> b(@NonNull List<c0.n> list) {
        ArrayList arrayList = new ArrayList();
        for (c0.n nVar : list) {
            u5.h.b(nVar instanceof i0, "The camera info doesn't contain internal implementation.");
            if (nVar.f() == this.f3308b) {
                arrayList.add(nVar);
            }
        }
        return arrayList;
    }

    public int c() {
        return this.f3308b;
    }
}
