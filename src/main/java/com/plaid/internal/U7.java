package com.plaid.internal;

import android.database.Cursor;
import androidx.annotation.NonNull;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class U7 implements Callable<List<c8>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.room.l0 f46754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b8 f46755b;

    public U7(b8 b8Var, androidx.room.l0 l0Var) {
        this.f46755b = b8Var;
        this.f46754a = l0Var;
    }

    @Override // java.util.concurrent.Callable
    @NonNull
    public final List<c8> call() {
        Cursor cursorG = wa.b.g(this.f46755b.f46893a, this.f46754a, false, null);
        try {
            int iE = wa.a.e(cursorG, AnalyticsAttribute.WorkflowId);
            int iE2 = wa.a.e(cursorG, "id");
            int iE3 = wa.a.e(cursorG, "analytics_model");
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(new c8(cursorG.getString(iE), cursorG.getString(iE2), cursorG.getBlob(iE3)));
            }
            cursorG.close();
            this.f46754a.release();
            return arrayList;
        } catch (Throwable th2) {
            cursorG.close();
            this.f46754a.release();
            throw th2;
        }
    }
}
