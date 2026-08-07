package com.fourthline.nfc.internal;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: renamed from: com.fourthline.nfc.internal.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC2830u {

    /* JADX INFO: renamed from: com.fourthline.nfc.internal.u$a */
    public static final class a {
        public static CoroutineDispatcher a(InterfaceC2830u interfaceC2830u) {
            return Dispatchers.getIO();
        }

        public static CoroutineDispatcher b(InterfaceC2830u interfaceC2830u) {
            return Dispatchers.getMain();
        }
    }

    CoroutineDispatcher a();

    CoroutineDispatcher b();
}
