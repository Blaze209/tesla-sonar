package com.nimbusds.jose.shaded.ow2asm;

/* JADX INFO: loaded from: classes6.dex */
public final class MethodTooLargeException extends IndexOutOfBoundsException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f45804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f45805d;

    public MethodTooLargeException(String str, String str2, String str3, int i11) {
        super("Method too large: " + str + "." + str2 + " " + str3);
        this.f45802a = str;
        this.f45803b = str2;
        this.f45804c = str3;
        this.f45805d = i11;
    }
}
