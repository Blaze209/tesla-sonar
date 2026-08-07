package com.fasterxml.jackson.core;

import gp.c;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class JsonProcessingException extends IOException {
    public c a() {
        return null;
    }

    protected String b() {
        return null;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        a();
        String strB = b();
        if (strB == null) {
            return message;
        }
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append(message);
        if (strB != null) {
            sb2.append(strB);
        }
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }
}
