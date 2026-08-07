package com.fourthline.vision.internal;

import android.util.Size;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Q3 {

    static final class a implements OnSuccessListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ wn0.l f37902a;

        a(wn0.l function) {
            p013kotlin.jvm.internal.s.k(function, "function");
            this.f37902a = function;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final /* synthetic */ void onSuccess(Object obj) {
            this.f37902a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Size getSize(wx.a aVar) {
        return aVar.l() == 0 ? new Size(aVar.m(), aVar.i()) : new Size(aVar.i(), aVar.m());
    }
}
