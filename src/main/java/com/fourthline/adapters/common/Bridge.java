package com.fourthline.adapters.common;

import android.app.Activity;
import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JH\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006H¦@¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u000f\u001a\u00020\f*\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/fourthline/adapters/common/Bridge;", "", "Landroid/app/Activity;", "activity", "", "configJson", "Lkotlin/Function1;", "Ljn0/h0;", "onSuccess", "onFailure", "launch", "(Landroid/app/Activity;Ljava/lang/String;Lwn0/l;Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "(Landroid/app/Activity;)Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Bridge {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static CoroutineScope getCoroutineScope(Bridge bridge, Activity receiver) {
            s.k(receiver, "$receiver");
            return BridgeKt.getMainCoroutineScope();
        }
    }

    CoroutineScope getCoroutineScope(Activity activity);

    Object launch(Activity activity, String str, l<? super String, h0> lVar, l<? super String, h0> lVar2, Continuation<? super h0> continuation);
}
