package kh;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends BroadcastReceiver {
    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a aVar;
        if (context == null || intent == null) {
            return;
        }
        boolean zContains = false;
        int intExtra = intent.getIntExtra("openIdNotifyFlag", 0);
        f.e("shouldUpdateId, notifyFlag : ".concat(String.valueOf(intExtra)));
        if (intExtra == 1) {
            if (TextUtils.equals(intent.getStringExtra("openIdPackage"), context.getPackageName())) {
                zContains = true;
            }
        } else if (intExtra == 2) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("openIdPackageList");
            if (stringArrayListExtra != null) {
                zContains = stringArrayListExtra.contains(context.getPackageName());
            }
        } else if (intExtra == 0) {
            zContains = true;
        }
        if (zContains) {
            String stringExtra = intent.getStringExtra("openIdType");
            f fVarD = f.d();
            if ("oaid".equals(stringExtra)) {
                aVar = fVarD.f86092b;
            } else if ("vaid".equals(stringExtra)) {
                aVar = fVarD.f86094d;
            } else if ("aaid".equals(stringExtra)) {
                aVar = fVarD.f86093c;
            } else {
                aVar = "udid".equals(stringExtra) ? fVarD.f86091a : null;
            }
            if (aVar == null) {
                return;
            }
            aVar.e();
        }
    }
}
