package net.time4j.format;

/* JADX INFO: loaded from: classes9.dex */
public enum g {
    STRICT,
    SMART,
    LAX;

    public boolean isLax() {
        return this == LAX;
    }

    public boolean isSmart() {
        return this == SMART;
    }

    public boolean isStrict() {
        return this == STRICT;
    }
}
