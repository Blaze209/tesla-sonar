package com.nimbusds.jose.shaded.ow2asm;

/* JADX INFO: loaded from: classes6.dex */
public final class ClassTooLargeException extends IndexOutOfBoundsException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f45801b;

    public ClassTooLargeException(String str, int i11) {
        super("Class too large: " + str);
        this.f45800a = str;
        this.f45801b = i11;
    }
}
