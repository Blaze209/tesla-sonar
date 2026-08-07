package com.fourthline.core.eid;

import java.util.List;
import jn0.h0;
import jn0.s;
import kotlinx.coroutines.flow.Flow;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\b\u001a\u00020\u0002H¦@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\t2\u0006\u0010\u000e\u001a\u00020\rH¦@¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\tH¦@¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0017\u001a\u00020\rH¦@¢\u0006\u0004\b\u001a\u0010\u0012J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0017\u001a\u00020\rH¦@¢\u0006\u0004\b\u001b\u0010\u0012J\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001c\u001a\u00020\rH¦@¢\u0006\u0004\b\u001d\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/fourthline/core/eid/EidServiceProvider;", "", "", "isAvailable", "()Z", "Ljn0/h0;", "disconnect", "()V", "developerMode", "Ljn0/s;", "startProcess-gIAlu-s", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startProcess", "", "workflowTokenUrl", "", "Lcom/fourthline/core/eid/EidAccessRight;", "fetchAccessRights-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAccessRights", "acceptAccessRights-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acceptAccessRights", "pin", "Lkotlinx/coroutines/flow/Flow;", "Lcom/fourthline/core/eid/EidAuthEvent;", "authenticateWithPin", "retryAuthenticateWithPin", "can", "authenticateWithCan", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface EidServiceProvider {
    /* JADX INFO: renamed from: acceptAccessRights-IoAF18A, reason: not valid java name */
    Object mo82acceptAccessRightsIoAF18A(Continuation<? super s<h0>> continuation);

    Object authenticateWithCan(String str, Continuation<? super Flow<? extends EidAuthEvent>> continuation);

    Object authenticateWithPin(String str, Continuation<? super Flow<? extends EidAuthEvent>> continuation);

    void disconnect();

    /* JADX INFO: renamed from: fetchAccessRights-gIAlu-s, reason: not valid java name */
    Object mo83fetchAccessRightsgIAlus(String str, Continuation<? super s<? extends List<? extends EidAccessRight>>> continuation);

    boolean isAvailable();

    Object retryAuthenticateWithPin(String str, Continuation<? super Flow<? extends EidAuthEvent>> continuation);

    /* JADX INFO: renamed from: startProcess-gIAlu-s, reason: not valid java name */
    Object mo84startProcessgIAlus(boolean z11, Continuation<? super s<h0>> continuation);
}
