package com.nimbusds.jose;

import java.security.Key;

/* JADX INFO: loaded from: classes6.dex */
public class KeyTypeException extends KeyException {
    public KeyTypeException(Class<? extends Key> cls) {
        super("Invalid key: Must be an instance of " + cls);
    }
}
