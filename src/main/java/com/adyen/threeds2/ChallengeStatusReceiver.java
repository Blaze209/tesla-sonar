package com.adyen.threeds2;

import jn0.e;

/* JADX INFO: loaded from: classes3.dex */
@e
public interface ChallengeStatusReceiver {
    void cancelled();

    void completed(CompletionEvent completionEvent);

    void protocolError(ProtocolErrorEvent protocolErrorEvent);

    void runtimeError(RuntimeErrorEvent runtimeErrorEvent);

    void timedout();
}
