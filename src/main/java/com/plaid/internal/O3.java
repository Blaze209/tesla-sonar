package com.plaid.internal;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class O3 implements Callable<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.room.l0 f46549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P3 f46550b;

    public O3(P3 p11, androidx.room.l0 l0Var) {
        this.f46550b = p11;
        this.f46549a = l0Var;
    }

    @Override // java.util.concurrent.Callable
    public final String call() {
        String string = null;
        Cursor cursorG = wa.b.g(this.f46550b.f46582a, this.f46549a, false, null);
        try {
            if (cursorG.moveToFirst() && !cursorG.isNull(0)) {
                string = cursorG.getString(0);
            }
            return string;
        } finally {
            cursorG.close();
            this.f46549a.release();
        }
    }
}
