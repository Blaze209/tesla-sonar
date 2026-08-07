package com.plaid.internal;

import android.database.Cursor;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class G4 implements Callable<I4> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.room.l0 f46324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H4 f46325b;

    public G4(H4 h11, androidx.room.l0 l0Var) {
        this.f46325b = h11;
        this.f46324a = l0Var;
    }

    @Override // java.util.concurrent.Callable
    public final I4 call() {
        Cursor cursorG = wa.b.g(this.f46325b.f46333a, this.f46324a, false, null);
        try {
            return cursorG.moveToFirst() ? new I4(cursorG.getString(wa.a.e(cursorG, AnalyticsAttribute.WorkflowId)), cursorG.getString(wa.a.e(cursorG, "id")), cursorG.getBlob(wa.a.e(cursorG, "model"))) : null;
        } finally {
            cursorG.close();
            this.f46324a.release();
        }
    }
}
