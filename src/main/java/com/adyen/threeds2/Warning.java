package com.adyen.threeds2;

/* JADX INFO: loaded from: classes3.dex */
public interface Warning {

    public enum Severity {
        LOW,
        MEDIUM,
        HIGH
    }

    String getID();

    String getMessage();

    Severity getSeverity();
}
