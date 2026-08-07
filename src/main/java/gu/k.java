package gu;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReference f69560a = new AtomicReference(null);

    public static void a(j jVar) {
        AtomicReference atomicReference = f69560a;
        while (!androidx.camera.view.i.a(atomicReference, null, jVar) && atomicReference.get() == null) {
        }
    }
}
