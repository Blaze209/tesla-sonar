package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes3.dex */
class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f20751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f20752b = new Handler(Looper.getMainLooper(), new a());

    private static final class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((fj.c) message.obj).recycle();
            return true;
        }
    }

    u() {
    }

    synchronized void a(fj.c<?> cVar, boolean z11) {
        try {
            if (this.f20751a || z11) {
                this.f20752b.obtainMessage(1, cVar).sendToTarget();
            } else {
                this.f20751a = true;
                cVar.recycle();
                this.f20751a = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
