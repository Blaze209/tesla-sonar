package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    class a implements h.c {
        a() {
        }

        @Override // androidx.profileinstaller.h.c
        public void a(int i11, Object obj) {
            h.f13079b.a(i11, obj);
            ProfileInstallReceiver.this.setResultCode(i11);
        }

        @Override // androidx.profileinstaller.h.c
        public void b(int i11, Object obj) {
            h.f13079b.b(i11, obj);
        }
    }

    static void a(int i11, @NonNull h.c cVar) {
        Process.sendSignal(i11, 10);
        cVar.a(12, null);
    }

    static void b(@NonNull h.c cVar) {
        a(Process.myPid(), cVar);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            h.j(context, new d6.k(), new a(), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    h.k(context, new d6.k(), new a());
                    return;
                } else {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        h.c(context, new d6.k(), new a());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            b(new a());
            return;
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        a aVar = new a();
        if ("DROP_SHADER_CACHE".equals(string2)) {
            androidx.profileinstaller.a.b(context, aVar);
        } else if ("SAVE_PROFILE".equals(string2)) {
            a(extras.getInt("EXTRA_PID", Process.myPid()), aVar);
        } else {
            aVar.a(16, null);
        }
    }
}
